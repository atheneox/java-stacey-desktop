package com.atheneox.stacey.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.models.Client;
import com.atheneox.stacey.interfaces.ImplementClient;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;   
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientDAO implements ImplementClient{
    
    private List<Client> list;
            
    @Override
    public void input(Client client) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO client (id, name, lastname, cellphone, documentnumber,  documenttype_id) VALUES (null, ?, ?, ?, ?, ?)");
            statement.setString(1, client.getName());
            statement.setString(2, client.getLastname());
            statement.setString(3, client.getCellphone());
            statement.setString(4, client.getDocumentNumber());
            statement.setInt(5, client.getId_documenttype());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Client client) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE client SET name=?, lastname=?, cellphone=?, documenttype_id=?, documentnumber=? WHERE id=?");
            statement.setString(1, client.getName());
            statement.setString(2, client.getLastname());
            statement.setString(3, client.getCellphone());
            statement.setInt(4, client.getId_documenttype());
            statement.setString(5, client.getDocumentNumber());
            statement.setInt(6, client.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(int id) {
   
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "DELETE FROM client WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    @Override
    public List<Client> getClient(String name) {
        list = new ArrayList<Client>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT c.id              AS id"
                                                        + "  ,c.name            AS name"
                                                        + "  ,c.lastname        AS lastname"
                                                        + "  ,c.cellphone       AS cellphone"
                                                        + "  ,dt.name           AS documenttype "
                                                        + "  ,c.documentnumber  AS documentnumber"
                                                        + "  ,c.documenttype_id AS documenttype_id"
                                                    + " FROM client c"
                                                    + " INNER JOIN documenttype dt"
                                                    + " ON c.documenttype = dt.id"
                                                    + " WHERE c.name LIKE '%" + name + "%'");
            while (result.next()) { 
                Client client = new Client();
                client.setId(result.getInt("id"));
                client.setName(result.getString("name"));
                client.setLastname(result.getString("lastname"));
                client.setCellphone(result.getString("cellphone"));
                client.setDocumentType(result.getString("documenttype"));
                client.setDocumentNumber(result.getString("documentnumber"));
                client.setId_documenttype(result.getInt("documenttype_id"));
                list.add(client);
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
    public List<Client> getAllClient() {
    list = new ArrayList<Client>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT   c.id              AS id"
                                                            + ",c.name            AS name"
                                                            + ",c.lastname        AS lastname"
                                                            + ",c.cellphone       AS cellphone"
                                                            + ",dt.name           AS documenttype"
                                                            + ",c.documentnumber  AS documentnumber"
                                                            + ",c.documenttype_id AS documenttype_id"
                                                      + " FROM client c"
                                                      + " INNER JOIN documenttype dt ON c.documenttype_id = dt.id");
            while (result.next()) { 
                Client client = new Client();
                client.setId(result.getInt("id"));
                client.setName(result.getString("name"));
                client.setLastname(result.getString("lastname"));
                client.setCellphone(result.getString("cellphone"));
                client.setDocumentType(result.getString("documenttype"));
                client.setDocumentNumber(result.getString("documentnumber"));
                client.setId_documenttype(result.getInt("documenttype_id"));
                list.add(client);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
