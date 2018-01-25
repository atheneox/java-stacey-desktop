package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.interfaces.ImplementLocked;
import com.atheneox.stacey.models.Locked;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LockedDAO implements ImplementLocked{
    
    private List<Locked> list;
    @Override
    public List<Locked> getLocked(String name) {
        list = new ArrayList<Locked>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM locked WHERE name LIKE '%" + name + "%'");
            while (result.next()) { 
                Locked locked = new Locked(0, "");
                locked.setId(result.getInt("id"));
                locked.setName(result.getString("name"));
                locked.setDescription(result.getString("description"));
                list.add(locked);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(LockedDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public void input(Locked locked) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO locked (id, name, description) VALUES (null, ?, ?)");
            statement.setString(1, locked.getName());
            statement.setString(2, locked.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(LockedDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Locked locked) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE locked SET name=?, description=? WHERE id=?");
            statement.setString(1, locked.getName());
            statement.setString(2, locked.getDescription());
            statement.setInt(3, locked.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(LockedDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM locked WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(LockedDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Locked> getAllLocked() {
        list = new ArrayList<Locked>();
         try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM locked");
            while (result.next()) { 
                Locked locked = new Locked(0,"");
                locked.setId(result.getInt("id"));
                locked.setName(result.getString("name"));
                locked.setDescription(result.getString("description"));
                list.add(locked);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(LockedDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
