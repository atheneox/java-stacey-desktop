package com.atheneox.horizontefrances.controllers;

import com.atheneox.horizontefrances.models.Collection;
import com.atheneox.horizontefrances.models.Model;
import com.atheneox.horizontefrances.models.Submodel;
import com.atheneox.horizontefrances.dao.CollectionDAO;
import com.atheneox.horizontefrances.dao.ModelDAO;
import com.atheneox.horizontefrances.dao.SubModelDAO;
import com.atheneox.horizontefrances.interfaces.ImplementCollection;
import com.atheneox.horizontefrances.interfaces.ImplementModel;
import com.atheneox.horizontefrances.tables.TableModelCollection;
import com.atheneox.horizontefrances.views.Jif_MasterCollection;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import com.atheneox.horizontefrances.interfaces.ImplementsubModel;

public class CollectionController {
    
    private final Jif_MasterCollection internalFrame;
    private List<Collection> list_collection;
    private List<Model>      list_model;
    private List<Submodel>  list_submodel;
    private final ImplementCollection implementCollection;
    private final ImplementModel implementModel;
    private final ImplementsubModel implementesubModel;
    
    public CollectionController(Jif_MasterCollection _internalFrame) {
        this.internalFrame = _internalFrame;
        
        implementCollection = new CollectionDAO();
        implementModel = new ModelDAO();
        implementesubModel = new SubModelDAO();
        
        list_collection = implementCollection.getAllCollection();
        list_model = implementModel.getAllModel();
        list_submodel = implementesubModel.getAllSubModel();
    }
    
    public void reset(){
        ModelController modelController = new ModelController(internalFrame);   
        SubModelController submodelController = new SubModelController(internalFrame);
        
        internalFrame.getJcbo_Model().removeAllItems();
        internalFrame.getJcbo_Submodel().removeAllItems();
        modelController.LoadCbo_Model();
        submodelController.LoadCbo_SubModel();
        
        internalFrame.getJtxf_Hight_cm().setText("");
        internalFrame.getJtxf_Hight_in().setText("");
        internalFrame.getJtxf_Id().setText("");
        internalFrame.getJtxf_Price().setText("");
        internalFrame.getJtxf_Width_cm().setText("");
        internalFrame.getJtxf_Width_in().setText("");
        
        internalFrame.getJtbl_Collection().clearSelection();
    }
    
    public void isiTable(){
        list_collection = implementCollection.getAllCollection();
        internalFrame.getJtbl_Collection().setModel(new TableModelCollection(list_collection));
    }
    
    public  void getDataField(){ 
        int row = internalFrame.getJtbl_Collection().getSelectedRow();
        if (row != -1){
            internalFrame.getJtxf_Id().setText(String.valueOf(list_collection.get(row).getId()));
            internalFrame.getJtxf_Hight_cm().setText(String.valueOf(list_collection.get(row).getHight_cm()));
            internalFrame.getJtxf_Hight_in().setText(String.valueOf(list_collection.get(row).getHight_in()));
            internalFrame.getJtxf_Width_cm().setText(String.valueOf(list_collection.get(row).getWidth_cm()));
            internalFrame.getJtxf_Width_in().setText(String.valueOf(list_collection.get(row).getWidth_in()));
            internalFrame.getJtxf_Price().setText(String.valueOf(list_collection.get(row).getPrice()));
            
            internalFrame.getJcbo_Model().removeAllItems(); 
            internalFrame.getJcbo_Submodel().removeAllItems(); 
            
            LoadCbo_Model(list_collection.get(row).getModel_Id(),list_collection.get(row).getModel());
            LoadCbo_SubModel(list_collection.get(row).getSubmodel_Id(),list_collection.get(row).getSubModel());
        }
    }
    
    public void insert(){
        ModelController modelcontroller = new ModelController(internalFrame);
        SubModelController submodelcontroller = new SubModelController(internalFrame);
        Collection collection = new Collection();
        collection.setHight_cm(Double.valueOf(internalFrame.getJtxf_Hight_cm().getText()));
        collection.setHight_in(Double.valueOf(internalFrame.getJtxf_Hight_in().getText()));
        collection.setWidth_cm(Double.valueOf(internalFrame.getJtxf_Width_cm().getText()));
        collection.setWidth_in(Double.valueOf(internalFrame.getJtxf_Width_in().getText()));
        collection.setModel_Id(modelcontroller.getModelId());
        collection.setSubmodel_Id(submodelcontroller.getSubModelId());
        collection.setPrice(Double.valueOf(internalFrame.getJtxf_Price().getText()));
        implementCollection.input(collection);
    }

    public void update(){
        Collection collection = new Collection();
        
        collection.setId(Integer.parseInt(internalFrame.getJtxf_Id().getText()));
        collection.setHight_cm(Double.valueOf(internalFrame.getJtxf_Hight_cm().getText()));
        collection.setHight_in(Double.valueOf(internalFrame.getJtxf_Hight_in().getText()));
        collection.setWidth_cm(Double.valueOf(internalFrame.getJtxf_Width_cm().getText()));
        collection.setWidth_in(Double.valueOf(internalFrame.getJtxf_Width_in().getText()));
        collection.setPrice(Double.valueOf(internalFrame.getJtxf_Price().getText()));
       
        Model model = (Model)internalFrame.getJcbo_Model().getSelectedItem();
        collection.setModel_Id(model.getId());
        
        Submodel submodel = (Submodel)internalFrame.getJcbo_Submodel().getSelectedItem();
        collection.setSubmodel_Id(submodel.getId());
         
        implementCollection.update(collection);
    }
    
    public void delete(){
        if (internalFrame.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame.getJtxf_Id().getText());
        implementCollection.delete(row);
    }
    
    public void getData(){
        if (internalFrame.getJtxf_Hight_cm().getText().trim().isEmpty() || internalFrame.getJtxf_Width_cm().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame, "Introduzca el largo y ancho en cm", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        Double hight = Double.parseDouble(internalFrame.getJtxf_Hight_cm().getText());
        Double width = Double.parseDouble(internalFrame.getJtxf_Width_cm().getText());
        implementCollection.getCollection(hight,width);
        isiTableFind(hight,width);
    }

    public void isiTableFind(double hight,double width){
        list_collection = implementCollection.getCollection(hight,width);
        internalFrame.getJtbl_Collection().setModel(new TableModelCollection(list_collection));
    }
    
    public void LoadCbo_Model(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_model = implementModel.getAllModel();
        Iterator<Model> m = list_model.iterator();
        internalFrame.getJcbo_Model().setModel(value);
        value.addElement(new Model(id,name));
        while (m.hasNext()) {
            Model model = m.next();
           if(model.getId()!=id){
               value.addElement(new Model(model.getId(),model.getName()));
           } 
        }
    }
    
    public void LoadCbo_SubModel(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list_submodel = implementesubModel.getAllSubModel();
        Iterator<Submodel> sm = list_submodel.iterator();
        internalFrame.getJcbo_Submodel().setModel(value);
        value.addElement(new Submodel(id,name));
        while (sm.hasNext()) {
            Submodel submodel = sm.next();
           if(submodel.getId()!=id){
               value.addElement(new Submodel(submodel.getId(),submodel.getName()));
           } 
        }
    }
    
    
}
