package com.atheneox.morenos.views;

import com.atheneox.horizontefrances.controllers.ModelController;
import javax.swing.JOptionPane;

public class Jif_TradeMarkTires extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    private ModelController modelController;
    
    public Jif_TradeMarkTires() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jtxf_Description = new javax.swing.JTextField();
        Jbtn_New = new javax.swing.JButton();
        Jlbl_copyright = new javax.swing.JLabel();
        Jlbl_Id = new javax.swing.JLabel();
        Jbtn_Add = new javax.swing.JButton();
        Jlbl_Name = new javax.swing.JLabel();
        Jbtn_Update = new javax.swing.JButton();
        Jbtn_Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_Model = new javax.swing.JTable();
        Jbtn_Refresh = new javax.swing.JButton();
        Jlbl_Description = new javax.swing.JLabel();
        Jbtn_Search = new javax.swing.JButton();
        Jtxf_Id = new javax.swing.JTextField();
        Jtxf_Name = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administración de marcas");
        setToolTipText("Administración de marcas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/horizontefrances/images/logo_horizonte.png"))); // NOI18N
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(614, 392));

        Jbtn_New.setText("Nuevo");
        Jbtn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_NewActionPerformed(evt);
            }
        });

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");
        Jlbl_copyright.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Jlbl_Id.setText("ID:");

        Jbtn_Add.setText("Agregar");
        Jbtn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_AddActionPerformed(evt);
            }
        });

        Jlbl_Name.setText("Nombre:");

        Jbtn_Update.setText("Actualizar");
        Jbtn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_UpdateActionPerformed(evt);
            }
        });

        Jbtn_Delete.setText("Eliminar");
        Jbtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_DeleteActionPerformed(evt);
            }
        });

        Jtbl_Model.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtbl_Model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtbl_ModelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtbl_Model);

        Jbtn_Refresh.setText("Refrescar");
        Jbtn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_RefreshActionPerformed(evt);
            }
        });

        Jlbl_Description.setText("Descripción:");

        Jbtn_Search.setText("Buscar");
        Jbtn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_SearchActionPerformed(evt);
            }
        });

        Jtxf_Id.setEditable(false);

        Jtxf_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxf_NameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlbl_Id)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jlbl_Description)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Jtxf_Name)
                                            .addComponent(Jtxf_Id)
                                            .addComponent(Jtxf_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Jlbl_Name))
                                .addGap(18, 18, 18)
                                .addComponent(Jbtn_Search))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jbtn_New)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Refresh)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_Id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Name)
                    .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_Search))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Description)
                    .addComponent(Jtxf_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_New)
                    .addComponent(Jbtn_Add)
                    .addComponent(Jbtn_Update)
                    .addComponent(Jbtn_Delete)
                    .addComponent(Jbtn_Refresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtxf_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxf_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxf_NameActionPerformed

    private void Jtbl_ModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtbl_ModelMouseClicked
        modelController.getDataField();
    }//GEN-LAST:event_Jtbl_ModelMouseClicked

    private void Jbtn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_SearchActionPerformed
       modelController.getData(); 
    }//GEN-LAST:event_Jbtn_SearchActionPerformed

    private void Jbtn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_NewActionPerformed
       modelController.isiTable();
       modelController.reset();
    }//GEN-LAST:event_Jbtn_NewActionPerformed

    private void Jbtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AddActionPerformed
       if(!Jtxf_Name.getText().isEmpty()    &&
          !Jtxf_Description.getText().isEmpty())  {
            
            modelController.insert();
            modelController.isiTable();
            modelController.reset();
        }
        else{
            if(Jtxf_Name.getText().isEmpty())  {
                JOptionPane.showMessageDialog(null, "Defina un nombre", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Description.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina una pequeña descripción", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_Jbtn_AddActionPerformed

    private void Jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdateActionPerformed
        if(!Jtxf_Name.getText().isEmpty()    &&
          !Jtxf_Description.getText().isEmpty())  {   
            modelController.update();
            modelController.isiTable();
            modelController.reset();
        }
        else{
            if(Jtxf_Name.getText().isEmpty())  {
                JOptionPane.showMessageDialog(null, "Defina un nombre", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
            else if(Jtxf_Description.getText().isEmpty())   {
                JOptionPane.showMessageDialog(null, "Defina una pequeña descripción", "Stacey", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_Jbtn_UpdateActionPerformed

    private void Jbtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_DeleteActionPerformed
        modelController.delete();
        modelController.isiTable();
        modelController.reset();
    }//GEN-LAST:event_Jbtn_DeleteActionPerformed

    private void Jbtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshActionPerformed
        modelController.isiTable();
        modelController.reset();
    }//GEN-LAST:event_Jbtn_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Add;
    private javax.swing.JButton Jbtn_Delete;
    private javax.swing.JButton Jbtn_New;
    private javax.swing.JButton Jbtn_Refresh;
    private javax.swing.JButton Jbtn_Search;
    private javax.swing.JButton Jbtn_Update;
    private javax.swing.JLabel Jlbl_Description;
    private javax.swing.JLabel Jlbl_Id;
    private javax.swing.JLabel Jlbl_Name;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JTable Jtbl_Model;
    private javax.swing.JTextField Jtxf_Description;
    private javax.swing.JTextField Jtxf_Id;
    private javax.swing.JTextField Jtxf_Name;
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

    public javax.swing.JButton getJbtn_Refresh() {
        return Jbtn_Refresh;
    }

    public javax.swing.JButton getJbtn_Search() {
        return Jbtn_Search;
    }

    public javax.swing.JButton getJbtn_Update() {
        return Jbtn_Update;
    }

    public javax.swing.JTextField getJtxf_Description() {
        return Jtxf_Description;
    }

    public javax.swing.JTextField getJtxf_Id() {
        return Jtxf_Id;
    }

    public javax.swing.JTextField getJtxf_Name() {
        return Jtxf_Name;
    }

    public javax.swing.JTable getJtbl_Model() {
        return Jtbl_Model;
    }
    
    
}
