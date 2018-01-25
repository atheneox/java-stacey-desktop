package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.VisibleDAO;
import com.atheneox.stacey.interfaces.ImplementVisible;
import com.atheneox.stacey.models.Visible;
import com.atheneox.stacey.tables.TableModelVisible;
import com.atheneox.stacey.views.Jif_DocType;
import com.atheneox.stacey.views.Jif_Rol;
import com.atheneox.stacey.views.Jif_StatusVisible;
import com.atheneox.stacey.views.Jif_User;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class VisibleController {
    
    private final Jif_StatusVisible internalFrame_Visible;
    private final Jif_User internalFrame_User;
    private final Jif_Rol internalFrame_Rol;
    private final Jif_DocType internalFrame_docType;
    private List<Visible> list_visible;
    private final ImplementVisible implementVisible;
    
    public VisibleController(Jif_StatusVisible _internalFrame_visible) {
        this.internalFrame_User     = null;
        this.internalFrame_Rol      = null;
        this.internalFrame_docType  = null;
        this.internalFrame_Visible  = _internalFrame_visible;
        implementVisible            = new VisibleDAO();
        list_visible                = implementVisible.getAllVisible();
    }
    
    public VisibleController(Jif_User _internalFrame_user) {
        this.internalFrame_Visible  = null;
        this.internalFrame_Rol      = null;
        this.internalFrame_docType  = null;
        this.internalFrame_User     = _internalFrame_user;
        implementVisible            = new VisibleDAO();
        list_visible                = implementVisible.getAllVisible();
    }
    
    public VisibleController(Jif_Rol _internalFrame_rol) {
        this.internalFrame_Visible  = null;
        this.internalFrame_User     = null;
        this.internalFrame_docType  = null;
        this.internalFrame_Rol      = _internalFrame_rol;
        implementVisible            = new VisibleDAO();
        list_visible                = implementVisible.getAllVisible();
    }
    
    public VisibleController(Jif_DocType _internalFrame_docType) {
        this.internalFrame_Visible  = null;
        this.internalFrame_User     = null;
        this.internalFrame_Rol      = null;
        this.internalFrame_docType  = _internalFrame_docType;
        implementVisible            = new VisibleDAO();
        list_visible                = implementVisible.getAllVisible();
    }
    
    public void reset(){
        internalFrame_Visible.getJtxf_Id().setText("");
        internalFrame_Visible.getJtxf_Name().setText("");
        internalFrame_Visible.getJta_Description().setText("");
        internalFrame_Visible.getJtbl_Visible().clearSelection();
    }
    
    public void isiTable(){
        list_visible = implementVisible.getAllVisible();
        internalFrame_Visible.getJtbl_Visible().setModel(new TableModelVisible(list_visible));
    }
    
    public  void getDataField(){ 
        int row = internalFrame_Visible.getJtbl_Visible().getSelectedRow();
        if (row != -1){ 
            internalFrame_Visible.getJtxf_Id().setText(String.valueOf(list_visible.get(row).getId()));
            internalFrame_Visible.getJtxf_Name().setText(list_visible.get(row).getName());
            internalFrame_Visible.getJta_Description().setText(list_visible.get(row).getDescription());
        }
    }
    
    public void insert(){
        Visible visible = new Visible();
        visible.setName(internalFrame_Visible.getJtxf_Name().getText());
        visible.setDescription(internalFrame_Visible.getJta_Description().getText());
        implementVisible.input(visible);
    }

    public void update(){
        Visible visible = new Visible();
        visible.setId(Integer.parseInt(internalFrame_Visible.getJtxf_Id().getText()));
        visible.setName(internalFrame_Visible.getJtxf_Name().getText());
        visible.setDescription(internalFrame_Visible.getJta_Description().getText());
        implementVisible.update(visible);
    }
    
    public void delete(){
        if (internalFrame_Visible.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Visible, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame_Visible.getJtxf_Id().getText());
        implementVisible.delete(row);
    }
    
    public void getData(){
        if (internalFrame_Visible.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Visible, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame_Visible.getJtxf_Name().getText();
        implementVisible.getVisible(name);
        isiTableFind(name);
    }

    public void isiTableFind(String name){
        list_visible = implementVisible.getVisible(name);
        internalFrame_Visible.getJtbl_Visible().setModel(new TableModelVisible(list_visible));
    }
    
    public int getVisibleId_User(){
        Visible visible = (Visible)internalFrame_User.getJcbo_visible().getSelectedItem();
        return visible.getId();
    }
    
     public int getVisibleId_Rol(){
        Visible visible = (Visible)internalFrame_Rol.getJcbo_Visible().getSelectedItem();
        return visible.getId();
    } 
     
    public int getVisibleId_docType(){
        Visible visible = (Visible)internalFrame_docType.getJcbo_Visible().getSelectedItem();
        return visible.getId();
    } 
    
    public void LoadJcb_Visible_User(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_visible = implementVisible.getAllVisible();
        Iterator<Visible> dt = list_visible.iterator();
        internalFrame_User.getJcbo_visible().setModel(value);
        while (dt.hasNext()) {
            Visible visible = dt.next();
               value.addElement(new Visible(visible.getId(),visible.getName()));
        }
    }
    
    public void LoadJcb_Visible_Rol(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_visible = implementVisible.getAllVisible();
        Iterator<Visible> dt = list_visible.iterator();
        internalFrame_Rol.getJcbo_Visible().setModel(value);
        while (dt.hasNext()) {
            Visible visible = dt.next();
               value.addElement(new Visible(visible.getId(),visible.getName()));
        }
    }
    
    public void LoadJcb_Visible_DocType(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_visible = implementVisible.getAllVisible();
        Iterator<Visible> dt = list_visible.iterator();
        internalFrame_docType.getJcbo_Visible().setModel(value);
        while (dt.hasNext()) {
            Visible visible = dt.next();
               value.addElement(new Visible(visible.getId(),visible.getName()));
        }
    }
}
