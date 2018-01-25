package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.ActiveDAO;
import com.atheneox.stacey.interfaces.ImplementActive;
import com.atheneox.stacey.models.Active;
import com.atheneox.stacey.views.Jif_DocType;
import com.atheneox.stacey.tables.TableModelActive;
import com.atheneox.stacey.views.Jif_Rol;
import com.atheneox.stacey.views.Jif_StatusActive;
import com.atheneox.stacey.views.Jif_User;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ActiveController {
    
    private final ImplementActive implementActive;
    
    private final Jif_StatusActive internalFrame_Active;
    private final Jif_User internalFrame_User;
    private final Jif_Rol internalFrame_Rol;
    private final Jif_DocType internalFrame_docType;
    
    private List<Active> list_active;
    
    public ActiveController(Jif_StatusActive _internalFrame_active) {
        this.internalFrame_User = null;
        this.internalFrame_Rol = null;
        this.internalFrame_docType = null;
        this.internalFrame_Active = _internalFrame_active;
        implementActive = new ActiveDAO();
        list_active = implementActive.getAllActive();
    }
    
    public ActiveController(Jif_User _internalFrame_user) {
        this.internalFrame_Active = null;
        this.internalFrame_Rol = null;
        this.internalFrame_docType = null;
        this.internalFrame_User = _internalFrame_user;
        implementActive = new ActiveDAO();
        list_active = implementActive.getAllActive();
    }
    
    public ActiveController(Jif_Rol _internalFrame_rol) {
        this.internalFrame_Active = null;
        this.internalFrame_User = null;
        this.internalFrame_docType = null;
        this.internalFrame_Rol = _internalFrame_rol;
        implementActive = new ActiveDAO();
        list_active = implementActive.getAllActive();
    }
    
    public ActiveController(Jif_DocType _internalFrame_docType) {
        this.internalFrame_Active = null;
        this.internalFrame_User = null;
        this.internalFrame_Rol = null;
        this.internalFrame_docType = _internalFrame_docType;
        implementActive = new ActiveDAO();
        list_active = implementActive.getAllActive();
    }
    
    public void reset(){
        internalFrame_Active.getJtxf_Id().setText("");
        internalFrame_Active.getJtxf_Name().setText("");
        internalFrame_Active.getJta_Description().setText("");
        internalFrame_Active.getJtbl_Active().clearSelection();
    }
    
    public void isiTable(){
        list_active = implementActive.getAllActive();
        internalFrame_Active.getJtbl_Active().setModel(new TableModelActive(list_active));
    }
    
    public  void getDataField(){ 
        int row = internalFrame_Active.getJtbl_Active().getSelectedRow();
        if (row != -1){ 
            internalFrame_Active.getJtxf_Id().setText(String.valueOf(list_active.get(row).getId()));
            internalFrame_Active.getJtxf_Name().setText(list_active.get(row).getName());
            internalFrame_Active.getJta_Description().setText(list_active.get(row).getDescription());

        }
    }
    
    public void insert(){
        Active active = new Active();
        active.setName(internalFrame_Active.getJtxf_Name().getText());
        active.setDescription(internalFrame_Active.getJta_Description().getText());
        implementActive.input(active);
    }

    public void update(){
        Active active = new Active();
        active.setId(Integer.parseInt(internalFrame_Active.getJtxf_Id().getText()));
        active.setName(internalFrame_Active.getJtxf_Name().getText());
        active.setDescription(internalFrame_Active.getJta_Description().getText());
        implementActive.update(active);
    }
    
    public void delete(){
        if (internalFrame_Active.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Active, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame_Active.getJtxf_Id().getText());
        implementActive.delete(row);
    }
    
    public void getData(){
        if (internalFrame_Active.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Active, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame_Active.getJtxf_Name().getText();
        implementActive.getActive(name);
        isiTableFind(name);
    }

    public void isiTableFind(String name){
        list_active = implementActive.getActive(name);
        internalFrame_Active.getJtbl_Active().setModel(new TableModelActive(list_active));
    }
    
    public int getActiveId_User(){
        Active active = (Active)internalFrame_User.getJcbo_active().getSelectedItem();
        return active.getId();
    }
    
    public int getActiveId_Rol(){
        Active active = (Active)internalFrame_Rol.getJcbo_Active().getSelectedItem();
        return active.getId();
    }
    
    public int getActiveId_docType(){
        Active active = (Active)internalFrame_docType.getJcbo_Active().getSelectedItem();
        return active.getId();
    }
    
    public void LoadJcb_Active_User(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_active = implementActive.getAllActive();
        Iterator<Active> dt = list_active.iterator();
        internalFrame_User.getJcbo_active().setModel(value);
        while (dt.hasNext()) {
            Active active = dt.next();
               value.addElement(new Active(active.getId(),active.getName()));
        }
    }
    
    public void LoadJcb_Active_Rol(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_active = implementActive.getAllActive();
        Iterator<Active> a = list_active.iterator();
        internalFrame_Rol.getJcbo_Active().setModel(value);
        while (a.hasNext()) {
            Active active = a.next();
               value.addElement(new Active(active.getId(),active.getName()));
        }
    }
    
    public void LoadJcb_Active_docType(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_active = implementActive.getAllActive();
        Iterator<Active> a = list_active.iterator();
        internalFrame_docType.getJcbo_Active().setModel(value);
        while (a.hasNext()) {
            Active active = a.next();
               value.addElement(new Active(active.getId(),active.getName()));
        }
    }

}
