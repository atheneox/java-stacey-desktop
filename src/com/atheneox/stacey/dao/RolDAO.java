package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.interfaces.ImplementRol;
import com.atheneox.stacey.models.Rol;
import com.atheneox.utils.Utils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RolDAO implements ImplementRol {
    private List<Rol> list;
   
    @Override
    public List<Rol> getRol(String name) {
        list = new ArrayList<Rol>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT r.id      AS id"
                                                    + ",r.name          AS name"
                                                    + ",r.display_name  AS display_name"
                                                    + ",r.description   AS description"
                                                    + ",r.created_at    AS created_at"
                                                    + ",r.updated_at    AS updated_at"
                                                    + ",r.active_id     AS active_id"
                                                    + ",a.name          AS active_name"
                                                    + ",r.destroyed_id  AS destroyed_id"
                                                    + ",d.name          AS destroyed_name"
                                                    + ",r.visible_id    AS visible_id"
                                                    + ",v.name          AS visible_name"
                                                    + " FROM roles r "
                                                    + " INNER JOIN active a      ON r.active_id      = a.id"
                                                    + " INNER JOIN destroyed d   ON r.destroyed_id   = d.id"
                                                    + " INNER JOIN visible v     ON r.visible_id     = v.id"
                                                    + " WHERE r.name LIKE '%" + name + "%'");
            while (result.next()) {
                Rol rol = new Rol();
                rol.setId(result.getInt("id"));
                rol.setName(result.getString("name"));
                rol.setDescription(result.getString("description"));
                rol.setDisplayName(result.getString("display_name"));
                rol.setCreated_at(result.getTimestamp("created_at"));
                rol.setUpdated_at(result.getTimestamp("updated_at"));
                rol.setActive_Id(result.getInt("active_id"));
                rol.setActive_Name(result.getString("active_name"));
                rol.setDestroyed_Id(result.getInt("destroyed_id"));
                rol.setDestroyed_Name(result.getString("destroyed_name"));
                rol.setVisible_Id(result.getInt("visible_id"));
                rol.setVisible_Name(result.getString("visible_name"));
                list.add(rol);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void input(Rol rol) {
        try {

            
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO roles (id, "
                                        + "name, "
                                        + "display_name, "
                                        + "description, "
                                        + "created_at, "
                                        + "visible_id, "
                                        + "destroyed_id, "
                                        + "active_id) VALUES (null,?,?,?,?,?,?,?)");
            statement.setString(1, rol.getName());
            statement.setString(2, rol.getDisplayName());
            statement.setString(3, rol.getDescription());
            statement.setTimestamp(4, Utils.getLocalTimestamp());
            statement.setInt(5, rol.getVisible_Id());
            statement.setInt(6, rol.getDestroyed_Id());
            statement.setInt(7, rol.getActive_Id());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Rol rol) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE roles SET name=?"
                                    + ",display_name=?"
                                    + ",description =?"
                                    + ",updated_at  =?"
                                    + ",visible_id  =?"
                                    + ",destroyed_id=?"
                                    + ",active_id   =?"
                                    + " WHERE id=?");
            statement.setString(1, rol.getName());
            statement.setString(2, rol.getDisplayName());
            statement.setString(3, rol.getDescription());
            statement.setTimestamp(4, Utils.getLocalTimestamp());
            statement.setInt(5, rol.getVisible_Id());
            statement.setInt(6, rol.getDestroyed_Id());
            statement.setInt(7, rol.getActive_Id());
            statement.setInt(8, rol.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM roles WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Rol> getAllRol() {
        list = new ArrayList<Rol>();
         try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT r.id      AS id"
                                                    + ",r.name          AS name"
                                                    + ",r.display_name  AS display_name"
                                                    + ",r.description   AS description"
                                                    + ",r.created_at    AS created_at"
                                                    + ",r.updated_at    AS updated_at"
                                                    + ",r.active_id     AS active_id"
                                                    + ",a.name          AS active_name"
                                                    + ",r.destroyed_id  AS destroyed_id"
                                                    + ",d.name          AS destroyed_name"
                                                    + ",r.visible_id    AS visible_id"
                                                    + ",v.name          AS visible_name"
                                                    + " FROM roles r "
                                                    + " INNER JOIN active a      ON r.active_id      = a.id"
                                                    + " INNER JOIN destroyed d   ON r.destroyed_id   = d.id"
                                                    + " INNER JOIN visible v     ON r.visible_id     = v.id");
            while (result.next()) { 
                Rol rol = new Rol(0,"");
                rol.setId(result.getInt("id"));
                rol.setName(result.getString("name"));
                rol.setDisplayName(result.getString("display_name"));
                rol.setDescription(result.getString("description"));
                rol.setCreated_at(result.getTimestamp("created_at"));
                rol.setUpdated_at(result.getTimestamp("updated_at"));
                rol.setActive_Id(result.getInt("active_id"));
                rol.setActive_Name(result.getString("active_name"));
                rol.setDestroyed_Id(result.getInt("destroyed_id"));
                rol.setDestroyed_Name(result.getString("destroyed_name"));
                rol.setVisible_Id(result.getInt("visible_id"));
                rol.setVisible_Name(result.getString("visible_name"));
                list.add(rol);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}