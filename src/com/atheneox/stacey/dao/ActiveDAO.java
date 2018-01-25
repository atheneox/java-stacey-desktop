package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.interfaces.ImplementActive;
import com.atheneox.stacey.models.Active;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActiveDAO implements ImplementActive {
    private List<Active> list;
     
    @Override
    public List<Active> getActive(String name) {
        list = new ArrayList<Active>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM active WHERE name LIKE '%" + name + "%'");
            
            while (result.next()) { 
                Active active = new Active(0, "");
                active.setId(result.getInt("id"));
                active.setName(result.getString("name"));
                active.setDescription(result.getString("description"));
                list.add(active);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ActiveDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void input(Active active) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO active (id, name, description) VALUES (null, ?, ?)");
            statement.setString(1, active.getName());
            statement.setString(2, active.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ActiveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Active active) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE active SET name=?, description=? WHERE id=?");
            statement.setString(1, active.getName());
            statement.setString(2, active.getDescription());
            statement.setInt(3, active.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ActiveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM active WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ActiveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Active> getAllActive() {
        list = new ArrayList<Active>();
         try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM active");
            while (result.next()) { 
                Active active = new Active(0,"");
                active.setId(result.getInt("id"));
                active.setName(result.getString("name"));
                active.setDescription(result.getString("description"));
                list.add(active);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ActiveDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
