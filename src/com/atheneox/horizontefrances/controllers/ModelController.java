package com.atheneox.horizontefrances.controllers;

import com.atheneox.horizontefrances.models.Model;
import com.atheneox.horizontefrances.dao.ModelDAO;
import com.atheneox.horizontefrances.interfaces.ImplementModel;
import com.atheneox.horizontefrances.tables.TableModelModel;
import com.atheneox.horizontefrances.views.Jif_MasterCollection;
import com.atheneox.horizontefrances.views.Jif_Model;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ModelController {

    private final Jif_MasterCollection internalFrame;
    private final Jif_Model internalFrameModel;
    
    private List<Model> list;
    private final ImplementModel implementModel;
    
    public ModelController(Jif_MasterCollection _internalFrame) {
        this.internalFrameModel = null;
        this.internalFrame = _internalFrame;
        implementModel = new ModelDAO();
        list = implementModel.getAllModel();
    }
    
    public ModelController(Jif_Model _internalFrame) {
        this.internalFrame = null;
        this.internalFrameModel = _internalFrame;
        implementModel = new ModelDAO();
        list = implementModel.getAllModel();
    }
    
    public void reset(){        
        internalFrameModel.getJtxf_Id().setText("");
        internalFrameModel.getJtxf_Name().setText("");
        internalFrameModel.getJtxf_Description().setText("");
    }
    
    public void isiTable(){
        list = implementModel.getAllModel();
        internalFrameModel.getJtbl_Model().setModel(new TableModelModel(list));
    }
    
    public  void getDataField(){ 
        int row = internalFrameModel.getJtbl_Model().getSelectedRow();
        if (row != -1){
            internalFrameModel.getJtxf_Id().setText(String.valueOf(list.get(row).getId()));
            internalFrameModel.getJtxf_Name().setText(String.valueOf(list.get(row).getName()));
            internalFrameModel.getJtxf_Description().setText(String.valueOf(list.get(row).getDescription()));
        }
       
    }
    
    public void insert(){
        Model model = new Model();
        model.setName(internalFrameModel.getJtxf_Name().getText());
        model.setDescription(internalFrameModel.getJtxf_Description().getText());
        implementModel.input(model);
    }

    public void update(){
        Model model = new Model();
        model.setId(Integer.parseInt(internalFrameModel.getJtxf_Id().getText()));
        model.setName(internalFrameModel.getJtxf_Name().getText());
        model.setDescription(internalFrameModel.getJtxf_Description().getText());
        implementModel.update(model);
    }
    
    public void delete(){
        if (internalFrameModel.getJtxf_Id().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrameModel, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrameModel.getJtxf_Id().getText());
        implementModel.delete(row);
    }
    
    public void getData(){
        if (internalFrameModel.getJtxf_Name().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrameModel, "Introduzca nombre de modelo", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name =internalFrameModel.getJtxf_Name().getText();

        implementModel.getModel(name);
        isiTableFind(name);
    }

    public void isiTableFind(String name){
        list = implementModel.getModel(name);
        internalFrameModel.getJtbl_Model().setModel(new TableModelModel(list));
    }
    
    public void LoadCbo_Model(){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        list = implementModel.getAllModel();
        Iterator<Model> dt = list.iterator();
        internalFrame.getJcbo_Model().setModel(value);
        while (dt.hasNext()) {
            Model model = dt.next();
            value.addElement(new Model(model.getId(),model.getName()));
        }
    }
                
    public int getModelId(){
        Model model = (Model)internalFrame.getJcbo_Model().getSelectedItem();
        return model.getId();
    }
}
