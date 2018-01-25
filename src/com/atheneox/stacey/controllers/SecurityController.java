
package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.SecurityDAO;
import com.atheneox.stacey.interfaces.ImplementSecurity;
import com.atheneox.stacey.models.Security;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SecurityController {
    private List<Security> list;
    private final ImplementSecurity implementSecurity;
    
    public SecurityController() {
        implementSecurity = new SecurityDAO();
        list = implementSecurity.getAllSecurity();
    }
    
    public String LicenseDate(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String license="0";
        list = implementSecurity.getAllSecurity();
        Iterator<Security> m = list.iterator();
            while (m.hasNext()) {
                Security security = m.next();
                license = security.getLicense_expire();
            }
            
        return  license;
    }
}
