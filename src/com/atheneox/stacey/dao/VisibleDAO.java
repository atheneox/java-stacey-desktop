package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.interfaces.ImplementVisible;
import com.atheneox.stacey.models.Visible;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VisibleDAO implements ImplementVisible {
    private List<Visible> list;
    
    @Override
    public List<Visible> getVisible(String name) {
        list = new ArrayList<Visible>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM visible WHERE name LIKE '%" + name + "%'");
            while (result.next()) { 
                Visible visible = new Visible(0, "");
                visible.setId(result.getInt("id"));
                visible.setName(result.getString("name"));
                visible.setDescription(result.getString("description"));
                list.add(visible);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(VisibleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public void input(Visible visible) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                + "INSERT INTO visible (id, name, description) VALUES (null, ?, ?)");
            statement.setString(1, visible.getName());
            statement.setString(2, visible.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(VisibleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Visible visible) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                + "UPDATE visible SET name=?, description=? WHERE id=?");
            statement.setString(1, visible.getName());
            statement.setString(2, visible.getDescription());
            statement.setInt(3, visible.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(VisibleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                + "DELETE FROM visible WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(VisibleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Visible> getAllVisible() {
        list = new ArrayList<Visible>();
         try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM visible");
            while (result.next()) { 
                Visible visible = new Visible(0,"");
                visible.setId(result.getInt("id"));
                visible.setName(result.getString("name"));
                visible.setDescription(result.getString("description"));
                list.add(visible);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(VisibleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}