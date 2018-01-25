package com.atheneox.horizontefrances.controllers;

import com.atheneox.horizontefrances.models.Submodel;
import com.atheneox.horizontefrances.dao.SubModelDAO;
import com.atheneox.horizontefrances.views.Jif_MasterCollection;
import com.atheneox.horizontefrances.views.Jif_SubModel;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import com.atheneox.horizontefrances.interfaces.ImplementsubModel;
import com.atheneox.horizontefrances.tables.TableModelSubmodel;
import javax.swing.JOptionPane;

public class SubModelController {
    
    private final Jif_MasterCollection internalFrame;
    private final Jif_SubModel internalFrameSubmodel;
    private List<Submodel> list;
    private final ImplementsubModel implementsubModel;
    
    public SubModelController(Jif_MasterCollection _internalFrame) {
        this.internalFrame = _internalFrame;
        this.internalFrameSubmodel = null;
        implementsubModel = new SubModelDAO();
        list = implementsubModel.getAllSubModel();
    }
    
    public SubModelController(Jif_SubModel _internalFrame) {
        this.internalFrame = null;
        this.internalFrameSubmodel = _internalFrame;
        implementsubModel = new SubModelDAO();
        list = implementsubModel.getAllSubModel();
    }
    
    public void reset(){        
        internalFrameSubmodel.getJtxf_Id().setText("");
        internalFrameSubmodel.getJtxf_Name().setText("");
        internalFrameSubmodel.getJtxf_Description().setText("");
    }
    
    public void isiTable(){
        list = implementsubModel.getAllSubModel();
        internalFrameSubmodel.getJtbl_Submodel().setModel(new TableModelSubmodel(list));
    }
    
    public  void getDataField(){ 
        int row = internalFrameSubmodel.getJtbl_Submodel().getSelectedRow();
        if (row != -1){
            internalFrameSubmodel.getJtxf_Id().setText(String.valueOf(list.get(row).getId()));
            internalFrameSubmodel.getJtxf_Name().setText(String.valueOf(list.get(row).getName()));
            internalFrameSubmodel.getJtxf_Description().setText(String.valueOf(list.get(row).getDescription()));
        }
       
    }
    
    public void insert(){
        Submodel submodel = new Submodel();
        submodel.setName(internalFrameSubmodel.getJtxf_Name().getText());
        submodel.setDescription(internalFrameSubmodel.getJtxf_Description().getText());
        implementsubModel.input(submodel);
    }

    public void update(){
        Submodel submodel = new Submodel();
        submodel.setId(Integer.parseInt(internalFrameSubmodel.getJtxf_Id().getText()));
        submodel.setName(internalFrameSubmodel.getJtxf_Name().getText());
        submodel.setDescription(internalFrameSubmodel.getJtxf_Description().getText());
        implementsubModel.update(submodel);
    }
    
    public void delete(){
        if (internalFrameSubmodel.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrameSubmodel, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrameSubmodel.getJtxf_Id().getText());
        implementsubModel.delete(row);
    }
    
    public void getData(){
        if (internalFrameSubmodel.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrameSubmodel, "Introduzca nombre de submodelo", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name =internalFrameSubmodel.getJtxf_Name().getText();

        implementsubModel.getSubModel(name);
        isiTableFind(name);
    }

    public void isiTableFind(String name){
        list = implementsubModel.getSubModel(name);
        internalFrameSubmodel.getJtbl_Submodel().setModel(new TableModelSubmodel(list));
    }
    
    public void LoadCbo_SubModel(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list = implementsubModel.getAllSubModel();
        Iterator<Submodel> dt = list.iterator();
        internalFrame.getJcbo_Submodel().setModel(value);
        while (dt.hasNext()) {
            Submodel submodel = dt.next();
            value.addElement(new Submodel(submodel.getId(),submodel.getName()));
        }
    }
                
    public int getSubModelId(){
        Submodel submodel = (Submodel)internalFrame.getJcbo_Submodel().getSelectedItem();
        return submodel.getId();
    }
    
}
