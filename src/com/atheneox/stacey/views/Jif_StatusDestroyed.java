package com.atheneox.stacey.views;

import com.atheneox.stacey.controllers.DestroyedController;

public class Jif_StatusDestroyed extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;
    private DestroyedController destroyedController;

    public Jif_StatusDestroyed() {
        initComponents();
        
        destroyedController = new DestroyedController(this);
        destroyedController.isiTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_copyright = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_Destroyed = new javax.swing.JTable();
        Jbtn_Add = new javax.swing.JButton();
        Jbtn_Update = new javax.swing.JButton();
        Jbtn_Delete = new javax.swing.JButton();
        Jbtn_Refresh = new javax.swing.JButton();
        Jlbl_Id = new javax.swing.JLabel();
        Jtxf_Name = new javax.swing.JTextField();
        Jtxf_Id = new javax.swing.JTextField();
        Jlbl_Name = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jta_Description = new javax.swing.JTextArea();
        Jlbl_Description = new javax.swing.JLabel();
        Jbtn_Search = new javax.swing.JButton();
        Jbtn_New = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Estado Eliminado");
        setToolTipText("Estado Eliminado");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png"))); // NOI18N

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");

        Jtbl_Destroyed.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtbl_Destroyed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtbl_DestroyedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtbl_Destroyed);

        Jbtn_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-plus.png"))); // NOI18N
        Jbtn_Add.setText("Agregar");
        Jbtn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_AddActionPerformed(evt);
            }
        });

        Jbtn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-available_updates.png"))); // NOI18N
        Jbtn_Update.setText("Editar");
        Jbtn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_UpdateActionPerformed(evt);
            }
        });

        Jbtn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-delete_sign.png"))); // NOI18N
        Jbtn_Delete.setText("Eliminar");
        Jbtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_DeleteActionPerformed(evt);
            }
        });

        Jbtn_Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-refresh.png"))); // NOI18N
        Jbtn_Refresh.setText("Refrescar");
        Jbtn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_RefreshActionPerformed(evt);
            }
        });

        Jlbl_Id.setText("ID:");

        Jtxf_Id.setEditable(false);

        Jlbl_Name.setText("Name:");

        Jta_Description.setColumns(20);
        Jta_Description.setRows(5);
        jScrollPane2.setViewportView(Jta_Description);

        Jlbl_Description.setText("Descripción:");

        Jbtn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-search.png"))); // NOI18N
        Jbtn_Search.setText("Buscar");
        Jbtn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_SearchActionPerformed(evt);
            }
        });

        Jbtn_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-new.png"))); // NOI18N
        Jbtn_New.setText("Nuevo");
        Jbtn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_NewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlbl_copyright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jbtn_New)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Refresh))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jlbl_Description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jlbl_Name)
                                    .addComponent(Jlbl_Id))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Jbtn_Search)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Id)
                    .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Name)
                    .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlbl_Description)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_New)
                    .addComponent(Jbtn_Add)
                    .addComponent(Jbtn_Update)
                    .addComponent(Jbtn_Delete)
                    .addComponent(Jbtn_Refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_SearchActionPerformed
        destroyedController.getData();
    }//GEN-LAST:event_Jbtn_SearchActionPerformed

    private void Jbtn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_NewActionPerformed
        destroyedController.isiTable();
        destroyedController.reset();
    }//GEN-LAST:event_Jbtn_NewActionPerformed

    private void Jbtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AddActionPerformed
        destroyedController.insert();
        destroyedController.isiTable();
        destroyedController.reset();
    }//GEN-LAST:event_Jbtn_AddActionPerformed

    private void Jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdateActionPerformed
        destroyedController.update();
        destroyedController.isiTable();
        destroyedController.reset();
    }//GEN-LAST:event_Jbtn_UpdateActionPerformed

    private void Jbtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_DeleteActionPerformed
        destroyedController.delete();
        destroyedController.isiTable();
        destroyedController.reset();
    }//GEN-LAST:event_Jbtn_DeleteActionPerformed

    private void Jbtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshActionPerformed
       destroyedController.isiTable();
       destroyedController.reset();
    }//GEN-LAST:event_Jbtn_RefreshActionPerformed

    private void Jtbl_DestroyedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtbl_DestroyedMouseClicked
        destroyedController.getDataField();
    }//GEN-LAST:event_Jtbl_DestroyedMouseClicked


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
    private javax.swing.JTextArea Jta_Description;
    private javax.swing.JTable Jtbl_Destroyed;
    private javax.swing.JTextField Jtxf_Id;
    private javax.swing.JTextField Jtxf_Name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextArea getJta_Description() {
        return Jta_Description;
    }

    public javax.swing.JTable getJtbl_Destroyed() {
        return Jtbl_Destroyed;
    }

    public javax.swing.JTextField getJtxf_Id() {
        return Jtxf_Id;
    }

    public javax.swing.JTextField getJtxf_Name() {
        return Jtxf_Name;
    }
}
