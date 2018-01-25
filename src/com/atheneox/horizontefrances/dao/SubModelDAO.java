package com.atheneox.horizontefrances.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.horizontefrances.models.Submodel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;   
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.atheneox.horizontefrances.interfaces.ImplementsubModel;

public class SubModelDAO implements ImplementsubModel{
    private List<Submodel> list;
            
    @Override
    public void input(Submodel submodel) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO submodel (id"
                                        + ",name"
                                        + ",description)"
                                + "VALUES (null, ?, ?)");
            statement.setString(1, submodel.getName());
            statement.setString(2, submodel.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(SubModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Submodel submodel) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE submodel "
                    + "SET  name        =   ?"
                        +",description  =   ?"
                        +" WHERE id     =   ?");
            statement.setString(1, submodel.getName());
            statement.setString(2, submodel.getDescription());
            statement.setInt(3, submodel.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(SubModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
   
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM submodel WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(SubModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    @Override
    public List<Submodel> getSubModel(String name) {
        list = new ArrayList<Submodel>();
        
        try {
            
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT id            AS id"
                                                        + "  ,name          AS name"
                                                        + "  ,description   AS name"
                                                    + " FROM submodel"
                                                    + " WHERE name =  '"  + name + "'");
            while (result.next()) { 
                Submodel submodel = new Submodel(0,"");
                    submodel.setId(result.getInt("id"));
                    submodel.setName(result.getString("name"));
                    submodel.setDescription(result.getString("description"));
                list.add(submodel);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SubModelDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public List<Submodel> getAllSubModel() {
    list = new ArrayList<Submodel>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT id            AS id"
                                                        + "  ,name          AS name"
                                                        + "  ,description   AS description"
                                                    + " FROM submodel");
            while (result.next()) { 
                Submodel submodel = new Submodel(0,"");
                    submodel.setId(result.getInt("id"));
                    submodel.setName(result.getString("name"));
                    submodel.setDescription(result.getString("description"));
                list.add(submodel);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SubModelDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
