package com.atheneox.stacey.controllers;

import com.atheneox.stacey.models.Client;
import com.atheneox.stacey.models.DocType;
import com.atheneox.stacey.controllers.DocumentTypeController;
import com.atheneox.stacey.dao.ClientDAO;
import com.atheneox.stacey.dao.DocumentTypeDAO;
import com.atheneox.stacey.interfaces.ImplementClient;
import com.atheneox.stacey.interfaces.ImplementdocumentType;
import com.atheneox.stacey.tables.TableModelClient;
import com.atheneox.stacey.views.Jif_Client;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ClientController {

    private final Jif_Client internalFrame;
    private List<Client> list;
    private List<DocType> listdT;
    private final ImplementClient implementClient;
    private final ImplementdocumentType implementdocumentType;
    
    public ClientController(Jif_Client _internalFrame) {
        this.internalFrame = _internalFrame;
        implementClient = new ClientDAO();
        implementdocumentType = new DocumentTypeDAO();
        listdT = implementdocumentType.getAlldocumentType();
        list = implementClient.getAllClient();
    }
    
    public void reset(){
        DocumentTypeController documentTypeController = new DocumentTypeController(internalFrame);    
        internalFrame.getTxtId().setText("");
        internalFrame.getTxtName().setText("");
        internalFrame.getTxtLastname().setText("");
        internalFrame.getTxtCellphone().setText("");
        internalFrame.getCbodocumentType().removeAllItems();
        documentTypeController.LoadCB_documentType_Client();
        internalFrame.getTxtdocumentNumber().setText("");
        internalFrame.getTableClient().clearSelection();
    }
    
    public void isiTable(){
        list = implementClient.getAllClient();
        internalFrame.getTableClient().setModel(new TableModelClient(list));
    }
    
    public  void getDataField(){ 
        int row = internalFrame.getTableClient().getSelectedRow();
        if (row != -1){ 
            internalFrame.getTxtId().setText(String.valueOf(list.get(row).getId()));
            internalFrame.getTxtName().setText(list.get(row).getName());
            internalFrame.getTxtLastname().setText(list.get(row).getLastname());
            internalFrame.getTxtCellphone().setText(list.get(row).getCellphone());
            internalFrame.getCbodocumentType().removeAllItems();
            internalFrame.getTxtdocumentNumber().setText(list.get(row).getDocumentNumber());
            LoadCB_documentType(list.get(row).getId_documenttype(),list.get(row).getDocumentType());
            
        }
       
    }

    public void insert(){
        DocumentTypeController documenttypecontroller = new DocumentTypeController(internalFrame);
        Client client = new Client();
        client.setName(internalFrame.getTxtName().getText());
        client.setLastname(internalFrame.getTxtLastname().getText());
        client.setCellphone(internalFrame.getTxtCellphone().getText());
        client.setId_documenttype(documenttypecontroller.getdocumentTypeId_Client());
        client.setDocumentNumber(internalFrame.getTxtdocumentNumber().getText());
        implementClient.input(client);
    }

    public void update(){
        Client client = new Client();
        client.setId(Integer.parseInt(internalFrame.getTxtId().getText()));
        client.setName(internalFrame.getTxtName().getText());
        client.setLastname(internalFrame.getTxtLastname().getText());
        client.setCellphone(internalFrame.getTxtCellphone().getText());
        DocType documentType = (DocType)internalFrame.getCbodocumentType().getSelectedItem();
        client.setId_documenttype(documentType.getId());
        client.setDocumentNumber(internalFrame.getTxtdocumentNumber().getText());
        implementClient.update(client);
    }
    
    public void delete(){
        if (internalFrame.getTxtId().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame, "No hay registro seleccionado? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        int row = Integer.parseInt(internalFrame.getTxtId().getText());
        implementClient.delete(row);
    }
    
    public void getData(){
        if (internalFrame.getTxtName().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(internalFrame, "Introduzca el nombre que desea buscar ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = internalFrame.getTxtName().getText();
        implementClient.getClient(name);
        isiTableFind(name);
    }

    public void isiTableFind(String nombre){
        list = implementClient.getClient(nombre);
        internalFrame.getTableClient().setModel(new TableModelClient(list));
    }
    
    private void LoadCB_documentType(int id, String name){
        DefaultComboBoxModel value;
        value = new DefaultComboBoxModel();
        listdT = implementdocumentType.getAlldocumentType();
        Iterator<DocType> dt = listdT.iterator();
        internalFrame.getCbodocumentType().setModel(value);
        value.addElement(new DocType(id,name));
        while (dt.hasNext()) {
            DocType documenttype = dt.next();
           if(documenttype.getId()!=id){
               value.addElement(new DocType(documenttype.getId(),documenttype.getName()));
           } 
        }
    }
}
    

