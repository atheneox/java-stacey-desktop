package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.interfaces.ImplementDestroyed;
import com.atheneox.stacey.models.Destroyed;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DestroyedDAO implements ImplementDestroyed{
    
    private List<Destroyed> list;
    
    @Override
    public List<Destroyed> getDestroyed(String name) {
        list = new ArrayList<Destroyed>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM destroyed WHERE name LIKE '%" + name + "%'");
            while (result.next()) { 
                Destroyed destroyed = new Destroyed(0, "");
                destroyed.setId(result.getInt("id"));
                destroyed.setName(result.getString("name"));
                destroyed.setDescription(result.getString("description"));
                list.add(destroyed);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DestroyedDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void input(Destroyed destroyed) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO destroyed (id, name, description) VALUES (null, ?, ?)");
            statement.setString(1, destroyed.getName());
            statement.setString(2, destroyed.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DestroyedDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Destroyed destroyed) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE destroyed SET name=?, description=? WHERE id=?");
            statement.setString(1, destroyed.getName());
            statement.setString(2, destroyed.getDescription());
            statement.setInt(3, destroyed.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DestroyedDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM destroyed WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DestroyedDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Destroyed> getAllDestroyed() {
        list = new ArrayList<Destroyed>();
         try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM destroyed");
            while (result.next()) { 
                Destroyed destroyed = new Destroyed(0,"");
                destroyed.setId(result.getInt("id"));
                destroyed.setName(result.getString("name"));
                destroyed.setDescription(result.getString("description"));
                list.add(destroyed);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DestroyedDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
