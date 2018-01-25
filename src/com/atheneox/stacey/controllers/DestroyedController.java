package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.DestroyedDAO;
import com.atheneox.stacey.interfaces.ImplementDestroyed;
import com.atheneox.stacey.models.Destroyed;
import com.atheneox.stacey.tables.TableModelDestroyed;
import com.atheneox.stacey.views.Jif_Rol;
import com.atheneox.stacey.views.Jif_StatusDestroyed;
import com.atheneox.stacey.views.Jif_User;
import com.atheneox.stacey.views.Jif_DocType;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DestroyedController {

    private final Jif_StatusDestroyed internalFrame_Destroyed;
    private final Jif_User internalFrame_User;
    private final Jif_Rol internalFrame_Rol;
    private final Jif_DocType internalFrame_docType;
    private List<Destroyed> list_destroyed;
    private final ImplementDestroyed implementDestroyed;
    
    public DestroyedController(Jif_StatusDestroyed _internalFrame_destroyed) {
        this.internalFrame_User         = null;
        this.internalFrame_Rol          =  null;
        this.internalFrame_docType      =  null;
        this.internalFrame_Destroyed    = _internalFrame_destroyed;
        implementDestroyed              = new DestroyedDAO();
        list_destroyed                  = implementDestroyed.getAllDestroyed();
    }
    
    public DestroyedController(Jif_User _internalFrame_user) {
        this.internalFrame_Destroyed    = null;
        this.internalFrame_Rol          = null;
        this.internalFrame_docType      =  null;
        this.internalFrame_User         = _internalFrame_user;
        implementDestroyed              = new DestroyedDAO();
        list_destroyed = implementDestroyed.getAllDestroyed();
    }
    
    public DestroyedController(Jif_Rol _internalFrame_rol) {
        this.internalFrame_Destroyed    = null;
        this.internalFrame_User         = null;
        this.internalFrame_docType      =  null;
        this.internalFrame_Rol          = _internalFrame_rol;
        implementDestroyed              = new DestroyedDAO();
        list_destroyed                  = implementDestroyed.getAllDestroyed();
    }
    
    public DestroyedController(Jif_DocType _internalFrame_docType) {
        this.internalFrame_Destroyed    = null;
        this.internalFrame_User         = null;
        this.internalFrame_Rol          = null;
        this.internalFrame_docType      = _internalFrame_docType;
        implementDestroyed              = new DestroyedDAO();
        list_destroyed                  = implementDestroyed.getAllDestroyed();
    }
    
    public void reset(){
        internalFrame_Destroyed.getJtxf_Id().setText("");
        internalFrame_Destroyed.getJtxf_Name().setText("");
        internalFrame_Destroyed.getJta_Description().setText("");
        internalFrame_Destroyed.getJtbl_Destroyed().clearSelection();
    }
    
    public void isiTable(){
        list_destroyed = implementDestroyed.getAllDestroyed();
        internalFrame_Destroyed.getJtbl_Destroyed().setModel(new TableModelDestroyed(list_destroyed));
    }
    
    public  void getDataField(){ 
        int row = internalFrame_Destroyed.getJtbl_Destroyed().getSelectedRow();
        if (row != -1){ 
            internalFrame_Destroyed.getJtxf_Id().setText(String.valueOf(list_destroyed.get(row).getId()));
            internalFrame_Destroyed.getJtxf_Name().setText(list_destroyed.get(row).getName());
            internalFrame_Destroyed.getJta_Description().setText(list_destroyed.get(row).getDescription());
        }
    }
    
    public void insert(){
        Destroyed destroyed = new Destroyed();
        destroyed.setName(internalFrame_Destroyed.getJtxf_Name().getText());
        destroyed.setDescription(internalFrame_Destroyed.getJta_Description().getText());
        implementDestroyed.input(destroyed);
    }

    public void update(){
        Destroyed destroyed = new Destroyed();
        destroyed.setId(Integer.parseInt(internalFrame_Destroyed.getJtxf_Id().getText()));
        destroyed.setName(internalFrame_Destroyed.getJtxf_Name().getText());
        destroyed.setDescription(internalFrame_Destroyed.getJta_Description().getText());
        implementDestroyed.update(destroyed);
    }
    
    public void delete(){
        if (internalFrame_Destroyed.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Destroyed, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame_Destroyed.getJtxf_Id().getText());
        implementDestroyed.delete(row);
    }
    
    public void getData(){
        if (internalFrame_Destroyed.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Destroyed, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame_Destroyed.getJtxf_Name().getText();
        implementDestroyed.getDestroyed(name);
        isiTableFind(name);
    }

    public void isiTableFind(String name){
        list_destroyed = implementDestroyed.getDestroyed(name);
        internalFrame_Destroyed.getJtbl_Destroyed().setModel(new TableModelDestroyed(list_destroyed));
    }
    
    public int getDestroyedId_User(){
        Destroyed destroyed = (Destroyed)internalFrame_User.getJcbo_destroyed().getSelectedItem();
        return destroyed.getId();
    }
    
    public int getDestroyedId_Rol(){
        Destroyed destroyed = (Destroyed)internalFrame_Rol.getJcbo_Destroyed().getSelectedItem();
        return destroyed.getId();
    }
    
    public int getDestroyedId_docType(){
        Destroyed destroyed = (Destroyed)internalFrame_docType.getJcbo_Destroyed().getSelectedItem();
        return destroyed.getId();
    }
    
    public void LoadJcb_Destroyed_User(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_destroyed = implementDestroyed.getAllDestroyed();
        Iterator<Destroyed> d = list_destroyed.iterator();
        internalFrame_User.getJcbo_destroyed().setModel(value);
        while (d.hasNext()) {
            Destroyed destroyed = d.next();
               value.addElement(new Destroyed(destroyed.getId(),destroyed.getName()));
        }
    }
    
    public void LoadJcb_Destroyed_Rol(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_destroyed = implementDestroyed.getAllDestroyed();
        Iterator<Destroyed> d = list_destroyed.iterator();
        internalFrame_Rol.getJcbo_Destroyed().setModel(value);
        while (d.hasNext()) {
            Destroyed destroyed = d.next();
               value.addElement(new Destroyed(destroyed.getId(),destroyed.getName()));
        }
    }
    
    public void LoadJcb_Destroyed_docType(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_destroyed = implementDestroyed.getAllDestroyed();
        Iterator<Destroyed> d = list_destroyed.iterator();
        internalFrame_docType.getJcbo_Destroyed().setModel(value);
        while (d.hasNext()) {
            Destroyed destroyed = d.next();
               value.addElement(new Destroyed(destroyed.getId(),destroyed.getName()));
        }
    }

}
