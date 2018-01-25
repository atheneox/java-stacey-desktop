package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.ActiveDAO;
import com.atheneox.stacey.dao.DestroyedDAO;
import com.atheneox.stacey.dao.RolDAO;
import com.atheneox.stacey.dao.VisibleDAO;
import com.atheneox.stacey.interfaces.ImplementActive;
import com.atheneox.stacey.interfaces.ImplementDestroyed;
import com.atheneox.stacey.interfaces.ImplementRol;
import com.atheneox.stacey.interfaces.ImplementVisible;
import com.atheneox.stacey.models.Active;
import com.atheneox.stacey.models.Destroyed;
import com.atheneox.stacey.models.Rol;
import com.atheneox.stacey.models.Visible;
import com.atheneox.stacey.tables.TableModelRol;
import com.atheneox.stacey.views.Jif_Rol;
import com.atheneox.utils.Utils;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class RolController  {

    private final Jif_Rol internalFrame_Rol;
    private List<Rol> list_rol;
    private final ImplementRol implementRol;
    
    private List<Active> list_active;
    private List<Visible> list_visible;
    private List<Destroyed> list_destroyed;
    
    private final ImplementActive implementActive;
    private final ImplementDestroyed implementDestroyed;
    private final ImplementVisible implementVisible;
    
    public RolController(Jif_Rol _internalFrame_rol) {
        this.internalFrame_Rol = _internalFrame_rol;
        implementRol = new RolDAO();
        list_rol = implementRol.getAllRol();
        implementActive = new ActiveDAO();
        implementVisible = new VisibleDAO();
        implementDestroyed = new DestroyedDAO();
        list_active = implementActive.getAllActive();
        list_visible = implementVisible.getAllVisible();
        list_destroyed = implementDestroyed.getAllDestroyed();
    }
    
    public void reset(){
        ActiveController activeController = new ActiveController(internalFrame_Rol); 
        VisibleController visibleController = new VisibleController(internalFrame_Rol); 
        DestroyedController destroyedController = new DestroyedController(internalFrame_Rol);
        internalFrame_Rol.getJcbo_Active().removeAllItems();
        internalFrame_Rol.getJcbo_Visible().removeAllItems();
        internalFrame_Rol.getJcbo_Destroyed().removeAllItems();
        activeController.LoadJcb_Active_Rol();
        destroyedController.LoadJcb_Destroyed_Rol();
        visibleController.LoadJcb_Visible_Rol();
        internalFrame_Rol.getJtxf_Id().setText("");
        internalFrame_Rol.getJtxf_Name().setText("");
        internalFrame_Rol.getJtxf_displayName().setText("");
        internalFrame_Rol.getJtxf_Description().setText("");
        internalFrame_Rol.getJtbl_Rol().clearSelection();
    }
    
    public void isiTable(){
        list_rol = implementRol.getAllRol();
        internalFrame_Rol.getJtbl_Rol().setModel(new TableModelRol(list_rol));
    }
    
    public  void getDataField(){ 
        int row = internalFrame_Rol.getJtbl_Rol().getSelectedRow();
        if (row != -1){
            internalFrame_Rol.getJtxf_Id().setText(String.valueOf(list_rol.get(row).getId()));
            internalFrame_Rol.getJtxf_Name().setText(list_rol.get(row).getName());
            internalFrame_Rol.getJtxf_Description().setText(list_rol.get(row).getDescription());
            internalFrame_Rol.getJtxf_displayName().setText(list_rol.get(row).getDisplayName());
            internalFrame_Rol.getJcbo_Active().removeAllItems();  
            internalFrame_Rol.getJcbo_Destroyed().removeAllItems();  
            internalFrame_Rol.getJcbo_Visible().removeAllItems();
            LoadCB_Active(list_rol.get(row).getActive_Id(),list_rol.get(row).getActive_Name());
            LoadCB_Destroyed(list_rol.get(row).getDestroyed_Id(),list_rol.get(row).getDestroyed_Name());
            LoadCB_Visible(list_rol.get(row).getVisible_Id(),list_rol.get(row).getVisible_Name());
        }
    }
    
    public void insert(){
        Rol rol = new Rol();
        ActiveController activeController       = new ActiveController(internalFrame_Rol);
        VisibleController visibleController     = new VisibleController(internalFrame_Rol);
        DestroyedController destroyedController = new DestroyedController(internalFrame_Rol);
        
        rol.setName(internalFrame_Rol.getJtxf_Name().getText());
        rol.setDescription(internalFrame_Rol.getJtxf_Description().getText());
        rol.setDisplayName(internalFrame_Rol.getJtxf_displayName().getText());
        rol.setActive_Id(activeController.getActiveId_Rol());
        rol.setVisible_Id(visibleController.getVisibleId_Rol());
        rol.setDestroyed_Id(destroyedController.getDestroyedId_Rol());
        rol.setCreated_at(Utils.getLocalTimestamp());
        
        implementRol.input(rol);
    }

    public void update(){
        Rol rol = new Rol();
 
        ActiveController activeController       = new ActiveController(internalFrame_Rol);
        VisibleController visibleController     = new VisibleController(internalFrame_Rol);
        DestroyedController destroyedController = new DestroyedController(internalFrame_Rol);
                
        rol.setId(Integer.parseInt(internalFrame_Rol.getJtxf_Id().getText()));
        rol.setName(internalFrame_Rol.getJtxf_Name().getText());
        rol.setDisplayName(internalFrame_Rol.getJtxf_displayName().getText());
        rol.setDescription(internalFrame_Rol.getJtxf_Description().getText());
        rol.setUpdated_at(Utils.getLocalTimestamp());
        rol.setActive_Id(activeController.getActiveId_Rol());
        rol.setVisible_Id(visibleController.getVisibleId_Rol());
        rol.setDestroyed_Id(destroyedController.getDestroyedId_Rol());
        
        implementRol.update(rol);
    }
    
    public void delete(){
        if (internalFrame_Rol.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Rol, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame_Rol.getJtxf_Id().getText());
        implementRol.delete(row);
    }
    
    public void getData(){
        if (internalFrame_Rol.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_Rol, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame_Rol.getJtxf_Name().getText();
        implementRol.getRol(name);
        isiTableFind(name);
    }

    public void isiTableFind(String name){
        list_rol = implementRol.getRol(name);
        internalFrame_Rol.getJtbl_Rol().setModel(new TableModelRol(list_rol));
    }   
    
    private void LoadCB_Active(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_active = implementActive.getAllActive();
        Iterator<Active> dt = list_active.iterator();
        internalFrame_Rol.getJcbo_Active().setModel(value);
        value.addElement(new Active(id,name));
        while (dt.hasNext()) {
            Active active = dt.next();
           if(active.getId()!=id){
               value.addElement(new Active(active.getId(),active.getName()));
           } 
        }
    }
    
    private void LoadCB_Visible(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_visible = implementVisible.getAllVisible();
        Iterator<Visible> v = list_visible.iterator();
        internalFrame_Rol.getJcbo_Visible().setModel(value);
        value.addElement(new Visible(id,name));
        while (v.hasNext()) {
            Visible visible = v.next();
           if(visible.getId()!=id){
               value.addElement(new Visible(visible.getId(),visible.getName()));
           } 
        }
    }
    
    private void LoadCB_Destroyed(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_destroyed = implementDestroyed.getAllDestroyed();
        Iterator<Destroyed> d = list_destroyed.iterator();
        internalFrame_Rol.getJcbo_Destroyed().setModel(value);
        value.addElement(new Destroyed(id,name));
        while (d.hasNext()) {
            Destroyed destroyed = d.next();
           if(destroyed.getId()!=id){
               value.addElement(new Destroyed(destroyed.getId(),destroyed.getName()));
           } 
        }
    }

}