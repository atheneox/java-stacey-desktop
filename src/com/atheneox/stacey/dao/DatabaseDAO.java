package com.atheneox.stacey.dao;

import java.util.ArrayList;
import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.models.Datatabase;
import com.atheneox.stacey.interfaces.ImplementdataBase;
import com.atheneox.utils.ReadTxt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseDAO implements ImplementdataBase   {
    private List<Datatabase> list;
    
    @Override
    public List<Datatabase> getAlldataBase() {
           list = new ArrayList<Datatabase>();
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("show databases;");
            
            while (result.next()) { 
                Datatabase database = new Datatabase();
                database.setName(result.getString(1));
                list.add(database);
            }
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void DB_Drop(){
        try {
            Statement statement = DBConnection.getConnection().createStatement();
           // ResultSet result = 
                    statement.executeQuery("drop database stacey;");
            statement.close();
           // result.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void DB_Create(){
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("create database stacey;");
            statement.close();
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //AMComments: Culminar creación de DB desde txt
    public void createdataBase(){
        try {
            ReadTxt readTxt = new ReadTxt();
            String sql = readTxt.DBSQL().substring(1);
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery(sql);
            statement.close();
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void alterTbl(){
        try {
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("ALTER TABLE active          AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE binnacle        AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE client          AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE collection      AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE destroyed       AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE documenttype    AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE locked          AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE model           AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE module          AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE permissions     AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE permission_role AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE roles           AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE roles_user      AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE security        AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE stock           AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE submodel        AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE trademark       AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE user            AUTO_INCREMENT = 0;"
                                                    + "ALTER TABLE visible         AUTO_INCREMENT = 0;");
            statement.close();
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
