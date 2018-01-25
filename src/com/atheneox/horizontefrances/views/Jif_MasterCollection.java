package com.atheneox.horizontefrances.views;

import com.atheneox.utils.Utils;
import com.atheneox.horizontefrances.controllers.CollectionController;
import com.atheneox.horizontefrances.controllers.ModelController;
import com.atheneox.horizontefrances.controllers.SubModelController;
import com.atheneox.horizontefrances.models.Model;
import com.atheneox.horizontefrances.models.Submodel;
import com.atheneox.stacey.views.Stacey;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Jif_MasterCollection extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    private CollectionController collectionController;
    private ModelController modelController;
    private SubModelController submodelController;
  
    public Jif_MasterCollection() {
        initComponents();
   
        collectionController = new CollectionController(this);
        collectionController.isiTable();
        
        modelController = new ModelController(this);
        modelController.LoadCbo_Model();
        
        submodelController = new SubModelController(this);
        submodelController.LoadCbo_SubModel();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_Id = new javax.swing.JLabel();
        Jlbl_Hight = new javax.swing.JLabel();
        Jlbl_Width = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_Collection = new javax.swing.JTable();
        Jlbl_Price = new javax.swing.JLabel();
        Jtxf_Id = new javax.swing.JTextField();
        Jtxf_Hight_cm = new javax.swing.JTextField();
        Jtxf_Width_cm = new javax.swing.JTextField();
        Jtxf_Price = new javax.swing.JTextField();
        Jlbl_hight_cm = new javax.swing.JLabel();
        Jlbl_width_cm = new javax.swing.JLabel();
        Jtxf_Hight_in = new javax.swing.JTextField();
        Jtxf_Width_in = new javax.swing.JTextField();
        Jlbl_hight_in = new javax.swing.JLabel();
        Jlbl_width_in = new javax.swing.JLabel();
        Jlbl_dolar_simbol = new javax.swing.JLabel();
        Jbtn_New = new javax.swing.JButton();
        Jbtn_Add = new javax.swing.JButton();
        Jbtn_Update = new javax.swing.JButton();
        Jbtn_Delete = new javax.swing.JButton();
        Jbtn_Search_x_cm = new javax.swing.JButton();
        Jlbl_copyright = new javax.swing.JLabel();
        Jlbl_Model = new javax.swing.JLabel();
        Jcbo_Model = new javax.swing.JComboBox<>();
        Jlbl_Submodel = new javax.swing.JLabel();
        Jcbo_Submodel = new javax.swing.JComboBox<>();
        Jbtn_Refresh = new javax.swing.JButton();
        Jbtn_Model = new javax.swing.JButton();
        Jbtn_submodel = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Maestro de colecciones");
        setToolTipText("Maestro de colecciones");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/horizontefrances/images/logo_horizonte.png"))); // NOI18N

        Jlbl_Id.setText("ID:");

        Jlbl_Hight.setText("Alto:");

        Jlbl_Width.setText("Ancho:");

        Jtbl_Collection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Jtbl_Collection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtbl_CollectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtbl_Collection);

        Jlbl_Price.setText("Precio:");

        Jtxf_Id.setEditable(false);

        Jtxf_Hight_cm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jtxf_Hight_cmFocusLost(evt);
            }
        });
        Jtxf_Hight_cm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtxf_Hight_cmKeyTyped(evt);
            }
        });

        Jtxf_Width_cm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jtxf_Width_cmFocusLost(evt);
            }
        });
        Jtxf_Width_cm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtxf_Width_cmKeyTyped(evt);
            }
        });

        Jtxf_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtxf_PriceKeyTyped(evt);
            }
        });

        Jlbl_hight_cm.setText("cm");

        Jlbl_width_cm.setText("cm");

        Jtxf_Hight_in.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jtxf_Hight_inFocusLost(evt);
            }
        });
        Jtxf_Hight_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtxf_Hight_inKeyTyped(evt);
            }
        });

        Jtxf_Width_in.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jtxf_Width_inFocusLost(evt);
            }
        });
        Jtxf_Width_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtxf_Width_inKeyTyped(evt);
            }
        });

        Jlbl_hight_in.setText("in");

        Jlbl_width_in.setText("in");

        Jlbl_dolar_simbol.setText("$");

        Jbtn_New.setText("Nuevo");
        Jbtn_New.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Jbtn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_NewActionPerformed(evt);
            }
        });

        Jbtn_Add.setText("Agregar");
        Jbtn_Add.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Jbtn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_AddActionPerformed(evt);
            }
        });

        Jbtn_Update.setText("Actualizar");
        Jbtn_Update.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Jbtn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_UpdateActionPerformed(evt);
            }
        });

        Jbtn_Delete.setText("Eliminar");
        Jbtn_Delete.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Jbtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_DeleteActionPerformed(evt);
            }
        });

        Jbtn_Search_x_cm.setText("Buscar");
        Jbtn_Search_x_cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Search_x_cmActionPerformed(evt);
            }
        });

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");
        Jlbl_copyright.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Jlbl_Model.setText("Modelo:");

        Jlbl_Submodel.setText("Submodelo:");

        Jbtn_Refresh.setText("Refrescar");
        Jbtn_Refresh.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Jbtn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_RefreshActionPerformed(evt);
            }
        });

        Jbtn_Model.setBackground(new java.awt.Color(204, 204, 255));
        Jbtn_Model.setText("Modelo");
        Jbtn_Model.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Jbtn_Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_ModelActionPerformed(evt);
            }
        });

        Jbtn_submodel.setBackground(new java.awt.Color(204, 204, 255));
        Jbtn_submodel.setText("Submodelo");
        Jbtn_submodel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Jbtn_submodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_submodelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Jlbl_Hight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(172, 172, 172))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jlbl_copyright, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlbl_Width, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jlbl_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jlbl_Model)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jcbo_Model, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jlbl_Submodel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jcbo_Submodel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jlbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jtxf_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jlbl_dolar_simbol))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jbtn_New)
                                    .addComponent(Jbtn_Search_x_cm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jtxf_Width_cm, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jlbl_width_cm)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jtxf_Width_in, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jlbl_width_in))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Jbtn_Add)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jbtn_Update)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jbtn_Refresh)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jbtn_Delete)
                                                .addGap(18, 18, 18)
                                                .addComponent(Jbtn_Model, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Jtxf_Hight_cm, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jlbl_hight_cm)
                                                .addGap(18, 18, 18)
                                                .addComponent(Jtxf_Hight_in, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jlbl_hight_in)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jbtn_submodel)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Id)
                    .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_Price)
                    .addComponent(Jlbl_Model)
                    .addComponent(Jcbo_Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_Submodel)
                    .addComponent(Jcbo_Submodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtxf_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_dolar_simbol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Width)
                    .addComponent(Jtxf_Width_cm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_width_cm)
                    .addComponent(Jtxf_Width_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_width_in))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Hight)
                    .addComponent(Jtxf_Hight_cm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_hight_cm)
                    .addComponent(Jtxf_Hight_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_hight_in))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn_Search_x_cm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_New)
                    .addComponent(Jbtn_Add)
                    .addComponent(Jbtn_Update)
                    .addComponent(Jbtn_Refresh)
                    .addComponent(Jbtn_Delete)
                    .addComponent(Jbtn_Model)
                    .addComponent(Jbtn_submodel))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtbl_CollectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtbl_CollectionMouseClicked
         collectionController.getDataField();
    }//GEN-LAST:event_Jtbl_CollectionMouseClicked

    private void Jbtn_Search_x_cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Search_x_cmActionPerformed
        collectionController.getData();    
    }//GEN-LAST:event_Jbtn_Search_x_cmActionPerformed

    private void Jbtn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_NewActionPerformed
        collectionController.isiTable();
        collectionController.reset();
    }//GEN-LAST:event_Jbtn_NewActionPerformed

    private void Jbtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AddActionPerformed
        if(!Jtxf_Price.getText().isEmpty()    &&
           !Jtxf_Hight_cm.getText().isEmpty() &&
           !Jtxf_Hight_in.getText().isEmpty() &&
           !Jtxf_Width_cm.getText().isEmpty() &&
           !Jtxf_Width_in.getText().isEmpty())  {
            
            collectionController.insert();
            collectionController.isiTable();
            collectionController.reset();
        }
        else{
            if(Jtxf_Price.getText().isEmpty())  {
                JOptionPane.showMessageDialog(null, "Defina un precio", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Hight_cm.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina una altura en cm!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Hight_in.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina una altura en in!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Width_cm.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina ancho en cm!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Width_in.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina ancho en in!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_Jbtn_AddActionPerformed

    private void Jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdateActionPerformed
         if(!Jtxf_Price.getText().isEmpty()   &&
           !Jtxf_Hight_cm.getText().isEmpty() &&
           !Jtxf_Hight_in.getText().isEmpty() &&
           !Jtxf_Width_cm.getText().isEmpty() &&
           !Jtxf_Width_in.getText().isEmpty())  {
  
            collectionController.update();
            collectionController.isiTable();
            collectionController.reset();
        
         }
        else{
            if(Jtxf_Price.getText().isEmpty())  {
                JOptionPane.showMessageDialog(null, "Defina un precio", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Hight_cm.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina una altura en cm!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Hight_in.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina una altura en in!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Width_cm.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina ancho en cm!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Width_in.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina ancho en in!!!", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_Jbtn_UpdateActionPerformed

    private void Jbtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_DeleteActionPerformed
        collectionController.delete();
        collectionController.isiTable();
        collectionController.reset();
    }//GEN-LAST:event_Jbtn_DeleteActionPerformed

    private void Jbtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshActionPerformed
       collectionController.isiTable();
       collectionController.reset();
    }//GEN-LAST:event_Jbtn_RefreshActionPerformed

    private void Jtxf_Hight_cmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtxf_Hight_cmKeyTyped
        Utils.validateDouble(evt);
    }//GEN-LAST:event_Jtxf_Hight_cmKeyTyped

    private void Jtxf_Width_cmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtxf_Width_cmKeyTyped
        Utils.validateDouble(evt);
    }//GEN-LAST:event_Jtxf_Width_cmKeyTyped

    private void Jtxf_Width_cmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jtxf_Width_cmFocusLost
        if(!Jtxf_Width_cm.getText().isEmpty()){
            Jtxf_Width_in.setText(""+Utils.cmToin(Double.valueOf(Jtxf_Width_cm.getText())));
        }
        else{
            Jtxf_Width_in.setText("");
        }
    }//GEN-LAST:event_Jtxf_Width_cmFocusLost

    private void Jtxf_Hight_inFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jtxf_Hight_inFocusLost
        if(!Jtxf_Hight_in.getText().isEmpty()){
            Jtxf_Hight_cm.setText(""+Utils.inTocm(Double.valueOf(Jtxf_Hight_in.getText())));
        }
        else{
            Jtxf_Hight_in.setText("");
        }
    }//GEN-LAST:event_Jtxf_Hight_inFocusLost

    private void Jtxf_Width_inFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jtxf_Width_inFocusLost
       if(!Jtxf_Width_in.getText().isEmpty()){
            Jtxf_Width_cm.setText(""+Utils.inTocm(Double.valueOf(Jtxf_Width_in.getText())));
        }
        else{
            Jtxf_Width_in.setText("");
        }
    }//GEN-LAST:event_Jtxf_Width_inFocusLost

    private void Jtxf_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtxf_PriceKeyTyped
        Utils.validateDouble(evt);
    }//GEN-LAST:event_Jtxf_PriceKeyTyped

    private void Jtxf_Hight_inKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtxf_Hight_inKeyTyped
        Utils.validateDouble(evt);
    }//GEN-LAST:event_Jtxf_Hight_inKeyTyped

    private void Jtxf_Width_inKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtxf_Width_inKeyTyped
        Utils.validateDouble(evt);
    }//GEN-LAST:event_Jtxf_Width_inKeyTyped

    private void Jtxf_Hight_cmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jtxf_Hight_cmFocusLost
      if(!Jtxf_Hight_cm.getText().isEmpty()){
            Jtxf_Hight_in.setText(""+Utils.cmToin(Double.valueOf(Jtxf_Hight_cm.getText())));
        }
        else{
            Jtxf_Hight_in.setText("");
        }
    }//GEN-LAST:event_Jtxf_Hight_cmFocusLost

    private void Jbtn_ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_ModelActionPerformed
        Jif_Model jif_Model = new Jif_Model();
        Stacey.jdp_Main.add(jif_Model);
        Dimension desktopSize = Stacey.jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_Model.getSize();
        jif_Model.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jif_Model.toFront();
        jif_Model.setVisible(true);
    }//GEN-LAST:event_Jbtn_ModelActionPerformed

    private void Jbtn_submodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_submodelActionPerformed
        Jif_SubModel jif_SubModel = new Jif_SubModel();
        Stacey.jdp_Main.add(jif_SubModel);
        Dimension desktopSize = Stacey.jdp_Main.getSize();
        Dimension jInternalFrameSize = jif_SubModel.getSize();
        jif_SubModel.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                             (desktopSize.height - jInternalFrameSize.height)/2);
        jif_SubModel.toFront();
        jif_SubModel.setVisible(true);
    }//GEN-LAST:event_Jbtn_submodelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Add;
    private javax.swing.JButton Jbtn_Delete;
    private javax.swing.JButton Jbtn_Model;
    private javax.swing.JButton Jbtn_New;
    private javax.swing.JButton Jbtn_Refresh;
    private javax.swing.JButton Jbtn_Search_x_cm;
    private javax.swing.JButton Jbtn_Update;
    private javax.swing.JButton Jbtn_submodel;
    private javax.swing.JComboBox<Model> Jcbo_Model;
    private javax.swing.JComboBox<Submodel> Jcbo_Submodel;
    private javax.swing.JLabel Jlbl_Hight;
    private javax.swing.JLabel Jlbl_Id;
    private javax.swing.JLabel Jlbl_Model;
    private javax.swing.JLabel Jlbl_Price;
    private javax.swing.JLabel Jlbl_Submodel;
    private javax.swing.JLabel Jlbl_Width;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JLabel Jlbl_dolar_simbol;
    private javax.swing.JLabel Jlbl_hight_cm;
    private javax.swing.JLabel Jlbl_hight_in;
    private javax.swing.JLabel Jlbl_width_cm;
    private javax.swing.JLabel Jlbl_width_in;
    private javax.swing.JTable Jtbl_Collection;
    private javax.swing.JTextField Jtxf_Hight_cm;
    private javax.swing.JTextField Jtxf_Hight_in;
    private javax.swing.JTextField Jtxf_Id;
    private javax.swing.JTextField Jtxf_Price;
    private javax.swing.JTextField Jtxf_Width_cm;
    private javax.swing.JTextField Jtxf_Width_in;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getJbtn_Add() {
        return Jbtn_Add;
    }

    public javax.swing.JButton getJbtn_Delete() {
        return Jbtn_Delete;
    }

    public javax.swing.JButton getJbtn_New() {
        return Jbtn_New;
    }

    public javax.swing.JButton getJbtn_Search_x_cm() {
        return Jbtn_Search_x_cm;
    }

    public javax.swing.JButton getJbtn_Update() {
        return Jbtn_Update;
    }

    public javax.swing.JComboBox<Model> getJcbo_Model() {
        return Jcbo_Model;
    }

    public javax.swing.JComboBox<Submodel> getJcbo_Submodel() {
        return Jcbo_Submodel;
    }

    public javax.swing.JTextField getJtxf_Hight_cm() {
        return Jtxf_Hight_cm;
    }

    public javax.swing.JTextField getJtxf_Hight_in() {
        return Jtxf_Hight_in;
    }

    public javax.swing.JTextField getJtxf_Id() {
        return Jtxf_Id;
    }

    public javax.swing.JTextField getJtxf_Price() {
        return Jtxf_Price;
    }

    public javax.swing.JTextField getJtxf_Width_cm() {
        return Jtxf_Width_cm;
    }

    public javax.swing.JTextField getJtxf_Width_in() {
        return Jtxf_Width_in;
    }

    public javax.swing.JTable getJtbl_Collection() {
        return Jtbl_Collection;
    }

    public javax.swing.JButton getJbtn_Refresh() {
        return Jbtn_Refresh;
    }
    
}
