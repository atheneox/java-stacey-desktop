package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.interfaces.ImplementdocumentType;
import com.atheneox.stacey.models.DocType;
import com.atheneox.utils.Utils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;   
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocumentTypeDAO implements ImplementdocumentType {
     private List<DocType> list;
    @Override
    public List<DocType> getdocumentType(String name) {
        list = new ArrayList<DocType>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT dt.id         AS id"
                                                        + ",dt.name         AS name"
                                                        + ",dt.description  AS description"
                                                        + ",dt.visible_id   AS visible_id"
                                                        + ",dt.active_id    AS active_id"
                                                        + ",dt.destroyed_id AS destroyed_id"
                                                        + ",v.name          AS visible_name"
                                                        + ",a.name          AS active_name"
                                                        + ",d.name          AS destroyed_name"                                                        
                                                        + " FROM documenttype   dt"
                                                        + " INNER JOIN visible   v ON dt.visible_id      = v.id"
                                                        + " INNER JOIN active    a ON dt.active_id       = a.id"
                                                        + " INNER JOIN destroyed d ON dt.destroyed_id    = d.id"
                                                        + " WHERE name LIKE '%" + name + "%'");
            
            while (result.next()) { 
                DocType documenttype = new DocType(0, "");
                documenttype.setId(result.getInt("id"));
                documenttype.setName(result.getString("name"));
                documenttype.setDescription(result.getString("description"));

                list.add(documenttype);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void input(DocType doctype) {
       try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO documenttype (id, "
                                        + "name, "
                                        + "description, "
                                        + "created_at, "
                                        + "visible_id, "
                                        + "destroyed_id, "
                                        + "active_id) VALUES (null,?,?,?,?,?,?)");
            statement.setString(1, doctype.getName());
            statement.setString(2, doctype.getDescription());
            statement.setTimestamp(3,  Utils.getLocalTimestamp());
            statement.setInt(4, doctype.getVisible_Id());
            statement.setInt(5, doctype.getDestroyed_Id());
            statement.setInt(6, doctype.getActive_Id());
            statement.executeUpdate();
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(DocumentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(DocType doctype) {
    try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE documenttype SET name=?"
                                    + ",description =?"
                                    + ",updated_at  =?"
                                    + ",visible_id  =?"
                                    + ",destroyed_id=?"
                                    + ",active_id   =?"
                                    + " WHERE id=?");
            statement.setString(1, doctype.getName());
            statement.setString(2, doctype.getDescription());
            statement.setTimestamp(3, Utils.getLocalTimestamp());
            statement.setInt(4, doctype.getVisible_Id());
            statement.setInt(5, doctype.getDestroyed_Id());
            statement.setInt(6, doctype.getActive_Id());
            statement.setInt(7, doctype.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DocumentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
    
    }

    @Override
    public void delete(int id) {
       try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM documenttype WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<DocType> getAlldocumentType() {
        list = new ArrayList<DocType>();
         try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT dt.id         AS id"
                                                        + ",dt.name         AS name"
                                                        + ",dt.description  AS description"
                                                        + ",dt.visible_id   AS visible_id"
                                                        + ",dt.active_id    AS active_id"
                                                        + ",dt.destroyed_id AS destroyed_id"
                                                        + ",v.name          AS visible_name"
                                                        + ",a.name          AS active_name"
                                                        + ",d.name          AS destroyed_name"                                                        
                                                        + " FROM documenttype   dt"
                                                        + " INNER JOIN visible   v ON dt.visible_id      = v.id"
                                                        + " INNER JOIN active    a ON dt.active_id       = a.id"
                                                        + " INNER JOIN destroyed d ON dt.destroyed_id    = d.id");
            while (result.next()) { 
                DocType documenttype = new DocType(0,"");
                documenttype.setId(result.getInt("id"));
                documenttype.setName(result.getString("name"));
                documenttype.setDescription(result.getString("description"));
                
                documenttype.setActive_Id(result.getInt("active_id"));
                documenttype.setVisible_Id(result.getInt("visible_id"));
                documenttype.setDestroyed_Id(result.getInt("destroyed_id"));
                
                documenttype.setActive_Name(result.getString("active_name"));
                documenttype.setVisible_Name(result.getString("visible_name"));
                documenttype.setDestroyed_Name(result.getString("destroyed_name"));
               
                list.add(documenttype);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DocumentTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
