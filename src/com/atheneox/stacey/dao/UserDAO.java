package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.models.User;
import com.atheneox.stacey.interfaces.ImplementUser;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;   
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO implements ImplementUser{
    
    private List<User> list;
            
    @Override
    public void input(User user) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO user (id"
                                    + ", name"
                                    + ", lastname"
                                    + ", cellphone"
                                    + ", email"
                                    + ", documenttype_id"
                                    + ", documentnumber"
                                    + ", description"
                                    + ", active_id"
                                    + ", visible_id"
                                    + ", locked_id"
                                    + ", destroyed_id"
                                    + ", created_at"
                                    + ", updated_at)"
                                    + " VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                statement.setString(1, user.getName());
                statement.setString(2, user.getLastname());
                statement.setString(3, user.getCellphone());
                statement.setString(4, user.getEmail());
                statement.setInt(5   , user.getDocumenttype_id());
                statement.setString(6, user.getDocumentNumber());
                statement.setString(7, user.getDescription());
                statement.setInt(8, user.getActive_Id());
                statement.setInt(9, user.getVisible_Id());
                statement.setInt(10, user.getLocked_Id());
                statement.setInt(11, user.getDestroyed_Id());
                statement.setTimestamp(12, user.getCreated_at());
                statement.setTimestamp(13, user.getCreated_at());//TODO: Mejorar
           
                statement.executeUpdate();
                statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(User user) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE user SET name = ?"
                    + ", lastname       =?"
                    + ", cellphone      =?"
                    + ", email          =?"
                    + ", documenttype_id=?"
                    + ", documentnumber =?"
                    + ", description    =?"
                    + ", active_id      =?"
                    + ", visible_id     =?"
                    + ", locked_id      =?"
                    + ", destroyed_id   =?"
                    + ", updated_at     =?"
                    + " WHERE id        =?");
                statement.setString(1, user.getName());
                statement.setString(2, user.getLastname());
                statement.setString(3, user.getCellphone());
                statement.setString(4, user.getEmail());
                statement.setInt(5   , user.getDocumenttype_id());
                statement.setString(6, user.getDocumentNumber());
                statement.setString(7, user.getDescription());
                statement.setInt(8, user.getActive_Id());
                statement.setInt(9, user.getVisible_Id());
                statement.setInt(10, user.getLocked_Id());
                statement.setInt(11, user.getDestroyed_Id());
                statement.setTimestamp(12, user.getUpdated_at());
                statement.setInt(13, user.getId());
               
                statement.executeUpdate();
                statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM user WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> getUser(String name) {
        list = new ArrayList<User>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT u.id              AS id"
                                                        + "  ,u.name            AS name"
                                                        + "  ,u.lastname        AS lastname"
                                                        + "  ,u.description     AS description"
                                                        + "  ,u.cellphone       AS cellphone"
                                                        + "  ,u.documenttype_id AS documenttype_id"
                                                        + "  ,dt.name           AS documenttype "
                                                        + "  ,u.documentnumber  AS documentnumber"
                                                        + "  ,u.active_id       AS active_id"
                                                        + "  ,a.name            AS active"
                                                        + "  ,u.visible_id      AS visible_id"
                                                        + "  ,v.name            AS visible"
                                                        + "  ,u.destroyed_id    AS destroyed_id"
                                                        + "  ,d.name            AS destroyed"
                                                        + "  ,u.locked_id       AS locked_id"
                                                        + "  ,l.name            AS locked"
                                                        + "  ,u.created_at      AS created_at"
                                                        + "  ,u.updated_at      AS updated_at"
                                                    + " FROM user u"
                                                    + " INNER JOIN documenttype dt"
                                                    + " ON u.documenttype_id = dt.id"
                                                    + " INNER JOIN active a"
                                                    + " ON u.active_id = a.id"
                                                    + " INNER JOIN visible v"
                                                    + " ON u.visible_id = v.id"
                                                    + " INNER JOIN destroyed d"
                                                    + " ON u.destroyed_id = d.id"
                                                    + " INNER JOIN locked l"
                                                    + " ON u.locked_id = l.id"
                    
                                                    + " WHERE u.name LIKE '%" + name + "%'");
            while (result.next()) { 
                User user = new User();
                    user.setId(result.getInt("id"));
                    user.setName(result.getString("name"));
                    user.setLastname(result.getString("lastname"));
                    user.setDescription(result.getString("description"));
                    user.setCellphone(result.getString("cellphone"));
                    user.setDocumenttype_id(result.getInt("documenttype_id"));
                    user.setDocumenttype_name(result.getString("documenttype"));
                    user.setDocumentNumber(result.getString("documentnumber"));
                    user.setActive_Id(result.getInt("active_id"));
                    user.setActive_Name(result.getString("active"));
                    user.setVisible_Id(result.getInt("visible_id"));
                    user.setVisible_Name(result.getString("visible"));
                    user.setDestroyed_Id(result.getInt("destroyed_id"));
                    user.setDestroyed_Name(result.getString("destroyed"));
                    user.setLocked_Id(result.getInt("locked_id"));
                    user.setLocked_Name(result.getString("locked"));
                    user.setCreated_at(result.getTimestamp("created_at"));
                    user.setUpdated_at(result.getTimestamp("updated_at"));
                list.add(user);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public List<User> getAllUser() {
    list = new ArrayList<User>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT u.id              AS id"
                                                        + "  ,u.name            AS name"
                                                        + "  ,u.lastname        AS lastname"
                                                        + "  ,u.email           AS email"
                                                        + "  ,u.description     AS description"
                                                        + "  ,u.cellphone       AS cellphone"
                                                        + "  ,u.documenttype_id AS documenttype_id"
                                                        + "  ,dt.name           AS documenttype"
                                                        + "  ,u.documentnumber  AS documentnumber"
                                                        + "  ,u.active_id       AS active_id"
                                                        + "  ,a.name            AS active"
                                                        + "  ,u.visible_id      AS visible_id"
                                                        + "  ,v.name            AS visible"
                                                        + "  ,u.destroyed_id    AS destroyed_id"
                                                        + "  ,d.name            AS destroyed"
                                                        + "  ,u.locked_id       AS locked_id"
                                                        + "  ,l.name            AS locked"
                                                        + "  ,u.created_at      AS created_at"
                                                        + "  ,u.updated_at      AS updated_at"
                                                    + " FROM user u"
                                                    + " INNER JOIN documenttype dt"
                                                    + " ON u.documenttype_id = dt.id"
                                                    + " INNER JOIN active a"
                                                    + " ON u.active_id = a.id"
                                                    + " INNER JOIN visible v"
                                                    + " ON u.visible_id = v.id"
                                                    + " INNER JOIN destroyed d"
                                                    + " ON u.destroyed_id = d.id"
                                                    + " INNER JOIN locked l"
                                                    + " ON u.locked_id = l.id");
            while (result.next()) { 
                User user = new User();
                    user.setId(result.getInt("id"));
                    user.setName(result.getString("name"));
                    user.setLastname(result.getString("lastname"));
                    user.setDescription(result.getString("description"));
                    user.setEmail(result.getString("email"));
                    user.setCellphone(result.getString("cellphone"));
                    user.setDocumenttype_id(result.getInt("documenttype_id"));
                    user.setDocumenttype_name(result.getString("documenttype"));
                    user.setDocumentNumber(result.getString("documentnumber"));
                    user.setActive_Id(result.getInt("active_id"));
                    user.setActive_Name(result.getString("active"));
                    user.setVisible_Id(result.getInt("visible_id"));
                    user.setVisible_Name(result.getString("visible"));
                    user.setDestroyed_Id(result.getInt("destroyed_id"));
                    user.setDestroyed_Name(result.getString("destroyed"));
                    user.setLocked_Id(result.getInt("locked_id"));
                    user.setLocked_Name(result.getString("locked"));
                    user.setCreated_at(result.getTimestamp("created_at"));
                    user.setUpdated_at(result.getTimestamp("updated_at"));
                list.add(user);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}