package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.ActiveDAO;
import com.atheneox.stacey.dao.DestroyedDAO;
import com.atheneox.stacey.dao.DocumentTypeDAO;
import com.atheneox.stacey.dao.LockedDAO;
import com.atheneox.stacey.dao.UserDAO;
import com.atheneox.stacey.dao.VisibleDAO;
import com.atheneox.stacey.interfaces.ImplementActive;
import com.atheneox.stacey.interfaces.ImplementDestroyed;
import com.atheneox.stacey.interfaces.ImplementLocked;
import com.atheneox.stacey.interfaces.ImplementUser;
import com.atheneox.stacey.interfaces.ImplementVisible;
import com.atheneox.stacey.interfaces.ImplementdocumentType;
import com.atheneox.stacey.models.Active;
import com.atheneox.stacey.models.Destroyed;
import com.atheneox.stacey.models.DocType;
import com.atheneox.stacey.models.Locked;
import com.atheneox.stacey.models.User;
import com.atheneox.stacey.models.Visible;
import com.atheneox.stacey.tables.TableModelUser;
import com.atheneox.stacey.views.Jif_User;
import com.atheneox.utils.Utils;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class UserController {
    
    private final Jif_User              internalFrame;
    private List<User>                  list;
    private List<Active>                list_active;
    private List<Visible>               list_visible;
    private List<Destroyed>             list_destroyed;
    private List<Locked>                list_locked;
    private List<DocType>               list_documenttype;
    private final ImplementUser         implementUser;
    private final ImplementActive       implementActive;
    private final ImplementDestroyed    implementDestroyed;
    private final ImplementLocked       implementLocked;
    private final ImplementVisible      implementVisible;
    private final ImplementdocumentType implementdocumentType;
    
    public UserController(Jif_User _internalFrame) {
        this.internalFrame      = _internalFrame;
        implementUser           = new UserDAO();
        implementdocumentType   = new DocumentTypeDAO();
        implementActive         = new ActiveDAO();
        implementVisible        = new VisibleDAO();
        implementDestroyed      = new DestroyedDAO();
        implementLocked         = new LockedDAO();
        
        list                    = implementUser.getAllUser();
        list_documenttype       = implementdocumentType.getAlldocumentType();
        list_active             = implementActive.getAllActive();
        list_visible            = implementVisible.getAllVisible();
        list_destroyed          = implementDestroyed.getAllDestroyed();
        list_locked             = implementLocked.getAllLocked();
        
    }
    
    public void reset(){
        DocumentTypeController documentTypeController   = new DocumentTypeController(internalFrame); 
        ActiveController activeController               = new ActiveController(internalFrame); 
        VisibleController visibleController             = new VisibleController(internalFrame); 
        DestroyedController destroyedController         = new DestroyedController(internalFrame);
        LockedController lockedController               = new LockedController(internalFrame); 
        
        internalFrame.getJtxf_Id().setText("");
        internalFrame.getJtxf_Name().setText("");
        internalFrame.getJtxf_lastName().setText("");
        internalFrame.getJtxa_Description().setText("");
        internalFrame.getJtxf_Cellphone().setText("");
        internalFrame.getJtxf_Email().setText("");
        internalFrame.getJtxf_documentNumber().setText("");
        internalFrame.getJtbl_User().clearSelection();
        internalFrame.getJcbo_documentType().removeAllItems();
        internalFrame.getJcbo_active().removeAllItems();
        internalFrame.getJcbo_destroyed().removeAllItems();
        internalFrame.getJcbo_visible().removeAllItems();
        internalFrame.getJcbo_locked().removeAllItems();
        documentTypeController.LoadCB_documentType_User();
        activeController.LoadJcb_Active_User();
        destroyedController.LoadJcb_Destroyed_User();
        visibleController.LoadJcb_Visible_User();
        lockedController.LoadJcb_Locked_User();
        
    }
    
    public void isiTable(){
        list = implementUser.getAllUser();
        internalFrame.getJtbl_User().setModel(new TableModelUser(list));
    }
    
    public  void getDataField(){ 
        int row = internalFrame.getJtbl_User().getSelectedRow();
        if (row != -1){ 
            internalFrame.getJtxf_Id().setText(String.valueOf(list.get(row).getId()));
            internalFrame.getJtxf_Name().setText(list.get(row).getName());
            internalFrame.getJtxf_lastName().setText(list.get(row).getLastname());
            internalFrame.getJtxa_Description().setText(list.get(row).getDescription());
            internalFrame.getJtxf_Cellphone().setText(list.get(row).getCellphone());
            internalFrame.getJtxf_documentNumber().setText(list.get(row).getDocumentNumber());
            internalFrame.getJtxf_Email().setText(list.get(row).getEmail());
            
            internalFrame.getJcbo_documentType().removeAllItems();
            internalFrame.getJcbo_active().removeAllItems();  
            internalFrame.getJcbo_destroyed().removeAllItems();  
            internalFrame.getJcbo_visible().removeAllItems();
            internalFrame.getJcbo_locked().removeAllItems();
            
            LoadCB_documentType(list.get(row).getDocumenttype_id(),list.get(row).getDocumenttype_name());
            LoadCB_Active(list.get(row).getActive_Id(),list.get(row).getActive_Name());
            LoadCB_Destroyed(list.get(row).getDestroyed_Id(),list.get(row).getDestroyed_Name());
            LoadCB_Visible(list.get(row).getVisible_Id(),list.get(row).getVisible_Name());
            LoadCB_Locked(list.get(row).getLocked_Id(),list.get(row).getLocked_Name());
        }
    }

    public void insert(){
        ActiveController activeController = new ActiveController(internalFrame);
        VisibleController visibleController = new VisibleController(internalFrame);
        DestroyedController destroyedController = new DestroyedController(internalFrame);
        LockedController lockedController = new LockedController(internalFrame);
        DocumentTypeController documenttypecontroller = new DocumentTypeController(internalFrame);
        
        User user = new User();
        user.setName(internalFrame.getJtxf_Name().getText());
        user.setLastname(internalFrame.getJtxf_lastName().getText());
        user.setDescription(internalFrame.getJtxa_Description().getText());
        user.setCellphone(internalFrame.getJtxf_Cellphone().getText());
        user.setEmail(internalFrame.getJtxf_Email().getText());
        user.setDocumenttype_id(documenttypecontroller.getdocumentTypeId_User());
        user.setDocumentNumber(internalFrame.getJtxf_documentNumber().getText());
        user.setActive_Id(activeController.getActiveId_User());
        user.setVisible_Id(visibleController.getVisibleId_User());
        user.setDestroyed_Id(destroyedController.getDestroyedId_User());
        user.setLocked_Id(lockedController.getLockedId());
        user.setCreated_at(Utils.getLocalTimestamp());
        user.setUpdated_at(Utils.getLocalTimestamp());
        
        implementUser.input(user);
    }

    public void update(){
        User user = new User();
        DocType documentType    = (DocType)internalFrame.getJcbo_documentType().getSelectedItem();
        Active active           = (Active)internalFrame.getJcbo_active().getSelectedItem();
        Visible visible         = (Visible)internalFrame.getJcbo_visible().getSelectedItem();
        Destroyed destroyed     = (Destroyed)internalFrame.getJcbo_destroyed().getSelectedItem();
        Locked locked           = (Locked)internalFrame.getJcbo_locked().getSelectedItem();
        
        user.setDocumenttype_id(documentType.getId());
        user.setActive_Id(active.getId());
        user.setDestroyed_Id(destroyed.getId());
        user.setLocked_Id(locked.getId());
        user.setVisible_Id(visible.getId());
         
        user.setId(Integer.parseInt(internalFrame.getJtxf_Id().getText()));
        user.setName(internalFrame.getJtxf_Name().getText());
        user.setLastname(internalFrame.getJtxf_lastName().getText());
        user.setEmail(internalFrame.getJtxf_Email().getText());
        user.setCellphone(internalFrame.getJtxf_Cellphone().getText());
        user.setDocumentNumber(internalFrame.getJtxf_documentNumber().getText());
        user.setDescription(internalFrame.getJtxa_Description().getText());
        user.setUpdated_at(Utils.getLocalTimestamp());
  
        implementUser.update(user);
    }
    
    public void delete(){
        if (internalFrame.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame.getJtxf_Id().getText());
        implementUser.delete(row);
    }
    
    public void getData(){
        if (internalFrame.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame.getJtxf_Name().getText();
        implementUser.getUser(name);
        isiTableFind(name);
    }
    public void isiTableFind(String name){
        list = implementUser.getUser(name);     
        Iterator<User> u = list.iterator();
        int contador =0;
            while (u.hasNext()) {
                contador =1;
            }
   
            if(contador==0){
                JOptionPane.showMessageDialog(internalFrame, "No se encontró registro con éste nombre: "+name, null, JOptionPane.WARNING_MESSAGE);
            }
            else{
                internalFrame.getJtbl_User().setModel(new TableModelUser(list));
            }
    }
    
    public void LoadCB_Active(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_active = implementActive.getAllActive();
        Iterator<Active> dt = list_active.iterator();
        internalFrame.getJcbo_active().setModel(value);
        value.addElement(new Active(id,name));
        while (dt.hasNext()) {
            Active active = dt.next();
           if(active.getId()!=id){
               value.addElement(new Active(active.getId(),active.getName()));
           } 
        }
    }
    
    public void LoadCB_Visible(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_visible = implementVisible.getAllVisible();
        Iterator<Visible> v = list_visible.iterator();
        internalFrame.getJcbo_visible().setModel(value);
        value.addElement(new Visible(id,name));
        while (v.hasNext()) {
            Visible visible = v.next();
           if(visible.getId()!=id){
               value.addElement(new Visible(visible.getId(),visible.getName()));
           } 
        }
    }
    
    public void LoadCB_Destroyed(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_destroyed = implementDestroyed.getAllDestroyed();
        Iterator<Destroyed> d = list_destroyed.iterator();
        internalFrame.getJcbo_destroyed().setModel(value);
        value.addElement(new Destroyed(id,name));
        while (d.hasNext()) {
            Destroyed destroyed = d.next();
           if(destroyed.getId()!=id){
               value.addElement(new Destroyed(destroyed.getId(),destroyed.getName()));
           } 
        }
    }
    
    public void LoadCB_Locked(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_locked = implementLocked.getAllLocked();
        Iterator<Locked> l = list_locked.iterator();
        internalFrame.getJcbo_locked().setModel(value);
        value.addElement(new Locked(id,name));
        while (l.hasNext()) {
            Locked locked = l.next();
           if(locked.getId()!=id){
               value.addElement(new Locked(locked.getId(),locked.getName()));
           } 
        }
    }
    
    public void LoadCB_documentType(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_documenttype = implementdocumentType.getAlldocumentType();
        Iterator<DocType> dt = list_documenttype.iterator();
        internalFrame.getJcbo_documentType().setModel(value);
        value.addElement(new DocType(id,name));
        while (dt.hasNext()) {
            DocType documenttype = dt.next();
           if(documenttype.getId()!=id){
               value.addElement(new DocType(documenttype.getId(),documenttype.getName()));
           } 
        }
    }
    
}
