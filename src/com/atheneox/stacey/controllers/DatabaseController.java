
package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.DatabaseDAO;
import com.atheneox.stacey.models.Datatabase;
import com.atheneox.stacey.views.Jif_Setup;
import com.atheneox.stacey.interfaces.ImplementdataBase;
import java.util.Iterator;
import java.util.List;

public class DatabaseController {
    
    private final Jif_Setup internalFrame; //No tiene Internal Frame Propio por eso va aqui
    private List<Datatabase> list;
    private final ImplementdataBase implementdatabase;
    
     public DatabaseController(Jif_Setup _internalFrame) {
        this.internalFrame = _internalFrame;
        implementdatabase = new DatabaseDAO();
        list = implementdatabase.getAlldataBase();
    }
    
    public void LoadCB_dataBase(){
        list = implementdatabase.getAlldataBase();
        Iterator<Datatabase> it = list.iterator();
        while (it.hasNext()) {
             internalFrame.getCbodataBase().addItem(it.next().getName());
        }
    }
    
    public void createdataBase(){
        implementdatabase.createdataBase();
    }
    
      public void alterTbl(){
        implementdatabase.alterTbl();
    }
    
}
