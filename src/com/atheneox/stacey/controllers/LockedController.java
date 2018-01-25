package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.LockedDAO;
import com.atheneox.stacey.interfaces.ImplementLocked;
import com.atheneox.stacey.models.Locked;
import com.atheneox.stacey.tables.TableModelLocked;
import com.atheneox.stacey.views.Jif_StatusLocked;
import com.atheneox.stacey.views.Jif_User;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class LockedController  {
    
    private final Jif_StatusLocked internalFrame_Locked;
    private final Jif_User internalFrame_User;
    private List<Locked> list_locked;
    private final ImplementLocked implementLocked;
    
    public LockedController(Jif_StatusLocked _internalFrame_locked) {
        this.internalFrame_User = null;
        this.internalFrame_Locked = _internalFrame_locked;
        implementLocked = new LockedDAO();
        list_locked = implementLocked.getAllLocked();
    }
    
    public LockedController(Jif_User _internalFrame_user) {
        this.internalFrame_Locked = null;
        this.internalFrame_User = _internalFrame_user;
        implementLocked = new LockedDAO();
        list_locked = implementLocked.getAllLocked();
    }
    
    public void reset(){
        internalFrame_Locked.getJtxf_Id().setText("");
        internalFrame_Locked.getJtxf_Name().setText("");
        internalFrame_Locked.getJta_Description().setText("");
        internalFrame_Locked.getJtbl_Locked().clearSelection();
    }
    
    public void isiTable(){
        list_locked = implementLocked.getAllLocked();
        internalFrame_Locked.getJtbl_Locked().setModel(new TableModelLocked(list_locked));
    }
    
    public  void getDataField(){ 
        int row = internalFrame_Locked.getJtbl_Locked().getSelectedRow();
        if (row != -1){ 
            internalFrame_Locked.getJtxf_Id().setText(String.valueOf(list_locked.get(row).getId()));
            internalFrame_Locked.getJtxf_Name().setText(list_locked.get(row).getName());
            internalFrame_Locked.getJta_Description().setText(list_locked.get(row).getDescription());
        }
       
    }
    
    public void LoadJcb_Locked_User(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_locked = implementLocked.getAllLocked();
        Iterator<Locked> dt = list_locked.iterator();
        internalFrame_User.getJcbo_locked().setModel(value);
        while (dt.hasNext()) {
            Locked locked = dt.next();
            value.addElement(new Locked(locked.getId(),locked.getName()));
        }
    }
    
    public void insert(){
        Locked locked = new Locked();
        locked.setName(internalFrame_Locked.getJtxf_Name().getText());
        locked.setDescription(internalFrame_Locked.getJta_Description().getText());
        implementLocked.input(locked);
    }

    public void update(){
        Locked locked = new Locked();
        locked.setId(Integer.parseInt(internalFrame_Locked.getJtxf_Id().getText()));
        locked.setName(internalFrame_Locked.getJtxf_Name().getText());
        locked.setDescription(internalFrame_Locked.getJta_Description().getText());
        implementLocked.update(locked);
    }
    
    public void delete(){
        if (internalFrame_Locked.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Locked, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame_Locked.getJtxf_Id().getText());
        implementLocked.delete(row);
    }
    
    public void getData(){
        if (internalFrame_Locked.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Locked, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame_Locked.getJtxf_Name().getText();
        implementLocked.getLocked(name);
        isiTableFind(name);
    }

    public void isiTableFind(String name){
        list_locked = implementLocked.getLocked(name);
        internalFrame_Locked.getJtbl_Locked().setModel(new TableModelLocked(list_locked));
    }
    
    public int getLockedId(){
        Locked locked = (Locked)internalFrame_User.getJcbo_locked().getSelectedItem();
        return locked.getId();
    }    
    
}
