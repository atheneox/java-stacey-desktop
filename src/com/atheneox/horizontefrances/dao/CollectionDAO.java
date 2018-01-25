package com.atheneox.horizontefrances.dao;

import com.atheneox.stacey.database.DBConnection;
import com.atheneox.horizontefrances.models.Collection;
import com.atheneox.horizontefrances.interfaces.ImplementCollection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;   
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollectionDAO implements ImplementCollection {
    
    private List<Collection> list;
            
    @Override
    public void input(Collection collection) {
        try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "INSERT INTO collection ( id"
                                            + ",hight_cm"
                                            + ",hight_in"
                                            + ",width_cm"
                                            + ",width_in"
                                            + ",price"
                                            + ",model_id"
                                            + ",submodel_id)"
                                + "VALUES (null, ?, ?, ?, ?, ?, ?, ?)");
            statement.setDouble(1, collection.getHight_cm());
            statement.setDouble(2, collection.getHight_in());
            statement.setDouble(3, collection.getWidth_cm());
            statement.setDouble(4, collection.getWidth_in());
            statement.setDouble(5, collection.getPrice());
            statement.setInt(6, collection.getModel_Id());
            statement.setInt(7, collection.getSubmodel_Id());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(SubModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Collection collection) {
          try {
            PreparedStatement statement = DBConnection.getConnection().prepareStatement(""
                    + "UPDATE collection "
                    + "SET  hight_cm    =   ?"
                        +",width_cm    =   ?"
                        +",hight_in    =   ?"
                        +",width_in    =   ?"
                        +",price       =   ?"
                        +",model_id    =   ?"
                        +",submodel_id =   ?"
                        +" WHERE id    =   ?");
            statement.setDouble(1, collection.getHight_cm());
            statement.setDouble(2, collection.getWidth_cm());
            statement.setDouble(3, collection.getHight_in());
            statement.setDouble(4, collection.getWidth_in());
            statement.setDouble(5, collection.getPrice());
            statement.setInt(6, collection.getModel_Id());
            statement.setInt(7, collection.getSubmodel_Id());
            statement.setInt(8, collection.getId());
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
                    + "DELETE FROM collection WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(CollectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    @Override
    public List<Collection> getCollection(double hight, double width) {
        list = new ArrayList<Collection>();
        
        try {
            
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT c.id          AS id"
                                                        + "  ,c.hight_cm    AS hight_cm"
                                                        + "  ,c.width_cm    AS width_cm"
                                                        + "  ,c.hight_in    AS hight_in"
                                                        + "  ,c.width_in    AS width_in"
                                                        + "  ,c.price       AS price"
                                                        + "  ,c.model_id    AS model_id"
                                                        + "  ,c.submodel_id AS submodel_id"
                                                        + "  ,m.name       AS model"
                                                        + "  ,sm.name   AS submodel"
                                                    + " FROM collection c"
                                                    + " INNER JOIN model m"
                                                    + " ON c.model_id = m.id"
                                                    + " INNER JOIN submodel sm"
                                                    + " ON c.submodel_id = sm.id"
                                                    + " WHERE c.hight_cm =  '"  + hight + "'"
                                                    + " AND   c.width_cm =  '"  + width + "'");
            
            while (result.next()) { 
                Collection collection = new Collection();
                    collection.setId(result.getInt("id"));
                    collection.setHight_cm(result.getDouble("hight_cm"));
                    collection.setWidth_cm(result.getDouble("width_cm"));
                    collection.setHight_in(result.getDouble("hight_in"));
                    collection.setWidth_in(result.getDouble("width_in"));
                    collection.setPrice(result.getDouble("price"));
                    collection.setModel_Id(result.getInt("model_id"));
                    collection.setSubmodel_Id(result.getInt("submodel_id"));
                    collection.setModel(result.getString("model"));
                    collection.setSubModel(result.getString("submodel"));
                list.add(collection);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CollectionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public List<Collection> getAllCollection() {
    list = new ArrayList<Collection>();
        
        try {
            
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT c.id          AS id"
                                                        + "  ,c.hight_cm    AS hight_cm"
                                                        + "  ,c.width_cm    AS width_cm"
                                                        + "  ,c.hight_in    AS hight_in"
                                                        + "  ,c.width_in    AS width_in"
                                                        + "  ,c.price       AS price"
                                                        + "  ,c.model_id    AS model_id"
                                                        + "  ,c.submodel_id AS submodel_id"
                                                        + "  ,m.name       AS model"
                                                        + "  ,sm.name   AS submodel"
                                                    + " FROM collection c"
                                                    + " INNER JOIN model m"
                                                    + " ON c.model_id = m.id"
                                                    + " INNER JOIN submodel sm"
                                                    + " ON c.submodel_id = sm.id");
            
            while (result.next()) { 
                Collection collection = new Collection();
                    collection.setId(result.getInt("id"));
                    collection.setHight_cm(result.getDouble("hight_cm"));
                    collection.setWidth_cm(result.getDouble("width_cm"));
                    collection.setHight_in(result.getDouble("hight_in"));
                    collection.setWidth_in(result.getDouble("width_in"));
                    collection.setPrice(result.getDouble("price"));
                    collection.setModel_Id(result.getInt("model_id"));
                    collection.setSubmodel_Id(result.getInt("submodel_id"));
                    collection.setModel(result.getString("model"));
                    collection.setSubModel(result.getString("submodel"));
                list.add(collection);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CollectionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
