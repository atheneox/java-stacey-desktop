package com.atheneox.stacey.views;

import com.atheneox.stacey.controllers.ActiveController;
import com.atheneox.stacey.controllers.DestroyedController;
import com.atheneox.stacey.controllers.DocumentTypeController;
import com.atheneox.stacey.controllers.VisibleController;

public class Jif_DocType extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    
    private DocumentTypeController documentTypeController;
    private ActiveController activeController;
    private VisibleController visibleController;
    private DestroyedController destroyedController;

    public Jif_DocType() {
        initComponents();
        
        documentTypeController = new DocumentTypeController(this);
        documentTypeController.isiTable();

        activeController = new ActiveController(this);
        activeController.LoadJcb_Active_docType();
        
        visibleController = new VisibleController(this);
        visibleController.LoadJcb_Visible_DocType();
        
        destroyedController = new DestroyedController(this);
        destroyedController.LoadJcb_Destroyed_docType();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_Id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_Doctype = new javax.swing.JTable();
        Jbtn_New = new javax.swing.JButton();
        Jbtn_Add = new javax.swing.JButton();
        Jbtn_Update = new javax.swing.JButton();
        Jbtn_Destroyed = new javax.swing.JButton();
        Jbtn_Refresh = new javax.swing.JButton();
        Jlbl_Name = new javax.swing.JLabel();
        Jcbo_Active = new javax.swing.JComboBox<>();
        Jcbo_Visible = new javax.swing.JComboBox<>();
        Jcbo_Destroyed = new javax.swing.JComboBox<>();
        Jlbl_Description = new javax.swing.JLabel();
        Jlbl_Active = new javax.swing.JLabel();
        Jtxf_Id = new javax.swing.JTextField();
        Jlbl_Visible = new javax.swing.JLabel();
        Jlbl_Destroyed = new javax.swing.JLabel();
        Jtxf_Name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtxa_Description = new javax.swing.JTextArea();
        Jlbl_copyright = new javax.swing.JLabel();
        Jbtn_Search = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administración de tipo de documento");
        setToolTipText("Administración de tipo de documento");

        Jlbl_Id.setText("ID:");

        Jtbl_Doctype.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtbl_Doctype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtbl_DoctypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtbl_Doctype);

        Jbtn_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-new.png"))); // NOI18N
        Jbtn_New.setText("Nuevo");
        Jbtn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_NewActionPerformed(evt);
            }
        });

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

        Jbtn_Destroyed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-delete_sign.png"))); // NOI18N
        Jbtn_Destroyed.setText("Eliminar");
        Jbtn_Destroyed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_DestroyedActionPerformed(evt);
            }
        });

        Jbtn_Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-refresh.png"))); // NOI18N
        Jbtn_Refresh.setText("Refrescar");
        Jbtn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_RefreshActionPerformed(evt);
            }
        });

        Jlbl_Name.setText("Nombre:");

        Jlbl_Description.setText("Descripción:");

        Jlbl_Active.setText("Activo:");

        Jtxf_Id.setEditable(false);

        Jlbl_Visible.setText("Visible:");

        Jlbl_Destroyed.setText("Eliminado:");

        Jtxa_Description.setColumns(20);
        Jtxa_Description.setRows(5);
        jScrollPane2.setViewportView(Jtxa_Description);

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");
        Jlbl_copyright.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Jbtn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-search.png"))); // NOI18N
        Jbtn_Search.setText("Buscar");
        Jbtn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jlbl_Description)
                                    .addComponent(Jlbl_Id)
                                    .addComponent(Jlbl_Name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Jtxf_Id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(Jtxf_Name, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jbtn_Search))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jlbl_Destroyed)
                                    .addComponent(Jlbl_Active)
                                    .addComponent(Jlbl_Visible))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Jcbo_Visible, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jcbo_Destroyed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(Jcbo_Active, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jbtn_New)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Destroyed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Refresh)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Jlbl_Destroyed))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jcbo_Active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlbl_Active))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jcbo_Visible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlbl_Visible))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jcbo_Destroyed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_New)
                    .addComponent(Jbtn_Add)
                    .addComponent(Jbtn_Update)
                    .addComponent(Jbtn_Destroyed)
                    .addComponent(Jbtn_Refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_NewActionPerformed
        documentTypeController.isiTable();
        documentTypeController.reset();
    }//GEN-LAST:event_Jbtn_NewActionPerformed

    private void Jbtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AddActionPerformed
        documentTypeController.insert();
        documentTypeController.isiTable();
        documentTypeController.reset(); 
    }//GEN-LAST:event_Jbtn_AddActionPerformed

    private void Jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdateActionPerformed
        documentTypeController.update();
        documentTypeController.isiTable();
        documentTypeController.reset();
    }//GEN-LAST:event_Jbtn_UpdateActionPerformed

    private void Jbtn_DestroyedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_DestroyedActionPerformed
        documentTypeController.delete();
        documentTypeController.isiTable();
        documentTypeController.reset();
    }//GEN-LAST:event_Jbtn_DestroyedActionPerformed

    private void Jbtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshActionPerformed
        documentTypeController.isiTable();
        documentTypeController.reset();
    }//GEN-LAST:event_Jbtn_RefreshActionPerformed

    private void Jtbl_DoctypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtbl_DoctypeMouseClicked
        documentTypeController.getDataField();
    }//GEN-LAST:event_Jtbl_DoctypeMouseClicked

    private void Jbtn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_SearchActionPerformed
        documentTypeController.getData();    
    }//GEN-LAST:event_Jbtn_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Add;
    private javax.swing.JButton Jbtn_Destroyed;
    private javax.swing.JButton Jbtn_New;
    private javax.swing.JButton Jbtn_Refresh;
    private javax.swing.JButton Jbtn_Search;
    private javax.swing.JButton Jbtn_Update;
    private javax.swing.JComboBox<String> Jcbo_Active;
    private javax.swing.JComboBox<String> Jcbo_Destroyed;
    private javax.swing.JComboBox<String> Jcbo_Visible;
    private javax.swing.JLabel Jlbl_Active;
    private javax.swing.JLabel Jlbl_Description;
    private javax.swing.JLabel Jlbl_Destroyed;
    private javax.swing.JLabel Jlbl_Id;
    private javax.swing.JLabel Jlbl_Name;
    private javax.swing.JLabel Jlbl_Visible;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JTable Jtbl_Doctype;
    private javax.swing.JTextArea Jtxa_Description;
    private javax.swing.JTextField Jtxf_Id;
    private javax.swing.JTextField Jtxf_Name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JComboBox<String> getJcbo_Active() {
        return Jcbo_Active;
    }

    public javax.swing.JComboBox<String> getJcbo_Destroyed() {
        return Jcbo_Destroyed;
    }

    public javax.swing.JComboBox<String> getJcbo_Visible() {
        return Jcbo_Visible;
    }

    public javax.swing.JTable getJtbl_Doctype() {
        return Jtbl_Doctype;
    }

    public javax.swing.JTextArea getJtxa_Description() {
        return Jtxa_Description;
    }

    public javax.swing.JTextField getJtxf_Id() {
        return Jtxf_Id;
    }

    public javax.swing.JTextField getJtxf_Name() {
        return Jtxf_Name;
    }
}
