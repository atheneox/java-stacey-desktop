package com.atheneox.stacey.controllers;

import com.atheneox.stacey.dao.ActiveDAO;
import com.atheneox.stacey.dao.DestroyedDAO;
import com.atheneox.stacey.models.DocType;
import com.atheneox.stacey.dao.DocumentTypeDAO;
import com.atheneox.stacey.dao.VisibleDAO;
import com.atheneox.stacey.interfaces.ImplementActive;
import com.atheneox.stacey.interfaces.ImplementDestroyed;
import com.atheneox.stacey.interfaces.ImplementVisible;
import com.atheneox.stacey.interfaces.ImplementdocumentType;
import com.atheneox.stacey.models.Active;
import com.atheneox.stacey.models.Destroyed;
import com.atheneox.stacey.models.Visible;
import com.atheneox.stacey.tables.TableModelDocType;
import com.atheneox.stacey.views.Jif_Client;
import com.atheneox.stacey.views.Jif_DocType;
import com.atheneox.stacey.views.Jif_User;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DocumentTypeController {
    
    private final Jif_DocType internalFrame_docType;
    private final Jif_Client internalFrame_Client;
    private final Jif_User internalFrame_User;
    
    private List<DocType> list_doctype;
    private List<Active> list_active;
    private List<Visible> list_visible;
    private List<Destroyed> list_destroyed;
    
    private final ImplementdocumentType implementdocumentType;
    private final ImplementActive implementActive;
    private final ImplementDestroyed implementDestroyed;
    private final ImplementVisible implementVisible;
    
    public DocumentTypeController(Jif_DocType _internalFrame_docType) {
        this.internalFrame_User     = null;
        this.internalFrame_Client   = null;
        this.internalFrame_docType  = _internalFrame_docType;
        implementdocumentType       = new DocumentTypeDAO();
        list_doctype                = implementdocumentType.getAlldocumentType();
        
        implementActive     = new ActiveDAO();
        implementVisible    = new VisibleDAO();
        implementDestroyed  = new DestroyedDAO();

        list_active     = implementActive.getAllActive();
        list_visible    = implementVisible.getAllVisible();
        list_destroyed  = implementDestroyed.getAllDestroyed();
    }
    
    public DocumentTypeController(Jif_Client _internalFrame_Client) {
        this.internalFrame_Client   = _internalFrame_Client;
        this.internalFrame_User     = null;
        this.internalFrame_docType  = null;
        
        implementActive     = null;
        implementVisible    = null;
        implementDestroyed  = null;
        
        implementdocumentType = new DocumentTypeDAO();
        list_doctype = implementdocumentType.getAlldocumentType();
    }
    
    public DocumentTypeController(Jif_User _internalFrame_User) {
        this.internalFrame_User     = _internalFrame_User;
        this.internalFrame_Client   = null;
        this.internalFrame_docType  = null;
        
        implementActive     = null;
        implementVisible    = null;
        implementDestroyed  = null;
        
        implementdocumentType = new DocumentTypeDAO();
        list_doctype = implementdocumentType.getAlldocumentType();
    }
    
    public void reset(){
        ActiveController activeController = new ActiveController(internalFrame_docType);
        VisibleController visibleController = new VisibleController(internalFrame_docType);
        DestroyedController destroyedController = new DestroyedController(internalFrame_docType);
        internalFrame_docType.getJcbo_Active().removeAllItems();
        internalFrame_docType.getJcbo_Visible().removeAllItems();
        internalFrame_docType.getJcbo_Destroyed().removeAllItems();
        activeController.LoadJcb_Active_docType();
        visibleController.LoadJcb_Visible_DocType();
        destroyedController.LoadJcb_Destroyed_docType();
        internalFrame_docType.getJtxf_Id().setText("");
        internalFrame_docType.getJtxf_Name().setText("");
        internalFrame_docType.getJtxa_Description().setText("");
        internalFrame_docType.getJtbl_Doctype().clearSelection();
    }
    
    public void isiTable(){
        list_doctype = implementdocumentType.getAlldocumentType();
        internalFrame_docType.getJtbl_Doctype().setModel(new TableModelDocType(list_doctype));
    }
    
    public  void getDataField(){ 
        int row = internalFrame_docType.getJtbl_Doctype().getSelectedRow();
        if (row != -1){ 
            internalFrame_docType.getJtxf_Id().setText(String.valueOf(list_doctype.get(row).getId()));
            internalFrame_docType.getJtxf_Name().setText(list_doctype.get(row).getName());
            internalFrame_docType.getJtxa_Description().setText(list_doctype.get(row).getDescription());
            
            internalFrame_docType.getJcbo_Active().removeAllItems();
            internalFrame_docType.getJcbo_Visible().removeAllItems();
            internalFrame_docType.getJcbo_Destroyed().removeAllItems();
            
            LoadCB_Active(list_doctype.get(row).getActive_Id(),list_doctype.get(row).getActive_Name());
            LoadCB_Destroyed(list_doctype.get(row).getDestroyed_Id(),list_doctype.get(row).getDestroyed_Name());
            LoadCB_Visible(list_doctype.get(row).getVisible_Id(),list_doctype.get(row).getVisible_Name());
        }
    }
    
    public void insert(){
        DocType doctype = new DocType();
        ActiveController    activeController    = new ActiveController(internalFrame_docType);
        VisibleController   visibleController   = new VisibleController(internalFrame_docType);
        DestroyedController destroyedController = new DestroyedController(internalFrame_docType);
        
        doctype.setActive_Id(activeController.getActiveId_docType());
        doctype.setVisible_Id(visibleController.getVisibleId_docType());
        doctype.setDestroyed_Id(destroyedController.getDestroyedId_docType());
 
        doctype.setName(internalFrame_docType.getJtxf_Name().getText());
        doctype.setDescription(internalFrame_docType.getJtxa_Description().getText());
        
        implementdocumentType.input(doctype);
    }

    public void update(){
        DocType doctype = new DocType();
        
        doctype.setId(Integer.parseInt(internalFrame_docType.getJtxf_Id().getText()));
        doctype.setName(internalFrame_docType.getJtxf_Name().getText());
        doctype.setDescription(internalFrame_docType.getJtxa_Description().getText());
       
        Active active       = (Active)internalFrame_docType.getJcbo_Active().getSelectedItem();
        Visible visible     = (Visible)internalFrame_docType.getJcbo_Visible().getSelectedItem();
        Destroyed destroyed = (Destroyed)internalFrame_docType.getJcbo_Destroyed().getSelectedItem();

        doctype.setActive_Id(active.getId());
        doctype.setVisible_Id(visible.getId());
        doctype.setDestroyed_Id(destroyed.getId());
        
        implementdocumentType.update(doctype);
    }
    
    public void delete(){
        if (internalFrame_docType.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_docType, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame_docType.getJtxf_Id().getText());
        implementdocumentType.delete(row);
    }
    
    public void getData(){
        if (internalFrame_docType.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame_docType, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame_docType.getJtxf_Name().getText();
        implementdocumentType.getdocumentType(name);
        isiTableFind(name);
    }

    public void isiTableFind(String nombre){
        list_doctype = implementdocumentType.getdocumentType(nombre);
        internalFrame_docType.getJtbl_Doctype().setModel(new TableModelDocType(list_doctype));
    }
    
    //Para uso local
    private void LoadCB_Active(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_active = implementActive.getAllActive();
        Iterator<Active> dt = list_active.iterator();
        internalFrame_docType.getJcbo_Active().setModel(value);
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
        internalFrame_docType.getJcbo_Visible().setModel(value);
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
        internalFrame_docType.getJcbo_Destroyed().setModel(value);
        value.addElement(new Destroyed(id,name));
        while (d.hasNext()) {
            Destroyed destroyed = d.next();
           if(destroyed.getId()!=id){
               value.addElement(new Destroyed(destroyed.getId(),destroyed.getName()));
           } 
        }
    }
    
    //Para uso en JIF externos
    public int getdocumentTypeId_Client(){
        DocType documenttype = (DocType)internalFrame_Client.getCbodocumentType().getSelectedItem();
        return documenttype.getId();
    }
    
    public int getdocumentTypeId_User(){
        DocType documenttype = (DocType)internalFrame_User.getJcbo_documentType().getSelectedItem();
        return documenttype.getId();
    }
    
    public void LoadCB_documentType_Client(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_doctype = implementdocumentType.getAlldocumentType();
        Iterator<DocType> dt = list_doctype.iterator();
        internalFrame_Client.getCbodocumentType().setModel(value);
        while (dt.hasNext()) {
            DocType documenttype = dt.next();
            value.addElement(new DocType(documenttype.getId(),documenttype.getName()));
        }
    }
    
    public void LoadCB_documentType_User(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_doctype = implementdocumentType.getAlldocumentType();
        Iterator<DocType> dt = list_doctype.iterator();
        internalFrame_User.getJcbo_documentType().setModel(value);
        while (dt.hasNext()) {
            DocType documenttype = dt.next();
            value.addElement(new DocType(documenttype.getId(),documenttype.getName()));
        }
    }
   
}
