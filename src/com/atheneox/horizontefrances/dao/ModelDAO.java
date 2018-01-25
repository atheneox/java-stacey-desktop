package com.atheneox.horizontefrances.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.horizontefrances.models.Model;
import com.atheneox.horizontefrances.interfaces.ImplementModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;   
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelDAO implements ImplementModel {
    
    private List<Model> list;
            
    @Override
    public void input(Model model) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO model (id"
                                        + ",name"
                                        + ",description)"
                                + "VALUES (null, ?, ?)");
            statement.setString(1, model.getName());
            statement.setString(2, model.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Model model) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE model "
                    + "SET  name        =   ?"
                        +",description  =   ?"
                        +" WHERE id     =   ?");
            statement.setString(1, model.getName());
            statement.setString(2, model.getDescription());
            statement.setInt(3, model.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
   
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM model WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    @Override
    public List<Model> getModel(String name) {
        list = new ArrayList<Model>();
        
        try {
            
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT id            AS id"
                                                        + "  ,name          AS name"
                                                        + "  ,description   AS description"
                                                    + " FROM model"
                                                    + " WHERE name LIKE '%" + name + "%'");
            while (result.next()) { 
                Model model = new Model(0,"");
                    model.setId(result.getInt("id"));
                    model.setName(result.getString("name"));
                    model.setDescription(result.getString("description"));
                list.add(model);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public List<Model> getAllModel() {
    list = new ArrayList<Model>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT id            AS id"
                                                        + "  ,name          AS name"
                                                        + "  ,description   AS description"
                                                    + " FROM model");
            while (result.next()) { 
                Model model = new Model(0,"");
                    model.setId(result.getInt("id"));
                    model.setName(result.getString("name"));
                    model.setDescription(result.getString("description"));
                list.add(model);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}