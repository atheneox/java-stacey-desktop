package com.atheneox.stacey.dao;
import com.atheneox.stacey.database.DBConnection;
import com.atheneox.stacey.interfaces.ImplementSecurity;
import com.atheneox.stacey.models.Security;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecurityDAO implements ImplementSecurity{
       private List<Security> list;
    
    @Override
    public  List<Security> getAllSecurity() {
        list = new ArrayList<Security>();
        try {
            
            Statement statement = DBConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM security");
            
            while (result.next()) { 
                Security security = new Security();
                
                security.setId(result.getInt("id"));
                security.setKey_general(result.getString("key_general"));
                security.setKey_update(result.getString("key_update"));
                security.setKey_upgrade(result.getString("key_upgrade"));
                security.setLicense_expire(result.getString("license_expire"));

                list.add(security);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SecurityDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}
}
