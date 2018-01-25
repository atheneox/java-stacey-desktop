package com.atheneox.stacey.views;

import com.atheneox.stacey.controllers.ActiveController;
import com.atheneox.stacey.controllers.DestroyedController;
import com.atheneox.stacey.controllers.RolController;
import com.atheneox.stacey.controllers.VisibleController;
import javax.swing.JOptionPane;

public class Jif_Rol extends javax.swing.JInternalFrame {
    
    private static final long serialVersionUID = 1L;
    private RolController rolController;
    private ActiveController activeController;
    private VisibleController visibleController;
    private DestroyedController destroyedController;
    
    public Jif_Rol() {
        initComponents();
        
        rolController = new RolController(this);
        rolController.isiTable();

        activeController = new ActiveController(this);
        activeController.LoadJcb_Active_Rol();
        
        visibleController = new VisibleController(this);
        visibleController.LoadJcb_Visible_Rol();
        
        destroyedController = new DestroyedController(this);
        destroyedController.LoadJcb_Destroyed_Rol();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_Id = new javax.swing.JLabel();
        Jlbl_Name = new javax.swing.JLabel();
        Jlbl_Description = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_Rol = new javax.swing.JTable();
        Jbtn_New = new javax.swing.JButton();
        Jbtn_Add = new javax.swing.JButton();
        Jbtn_Update = new javax.swing.JButton();
        Jbtn_Refresh = new javax.swing.JButton();
        Jbtn_Delete = new javax.swing.JButton();
        Jbtn_Search = new javax.swing.JButton();
        Jtxf_Id = new javax.swing.JTextField();
        Jtxf_Description = new javax.swing.JTextField();
        Jtxf_Name = new javax.swing.JTextField();
        Jlbl_copyright = new javax.swing.JLabel();
        Jlbl_displayName = new javax.swing.JLabel();
        Jtxf_displayName = new javax.swing.JTextField();
        Jcbo_Visible = new javax.swing.JComboBox<>();
        Jlbl_Visible = new javax.swing.JLabel();
        Jlbl_Destroyed = new javax.swing.JLabel();
        Jlbl_Active = new javax.swing.JLabel();
        Jcbo_Active = new javax.swing.JComboBox<>();
        Jcbo_Destroyed = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Administración de roles");
        setToolTipText("Administración de roles");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png"))); // NOI18N

        Jlbl_Id.setText("ID:");

        Jlbl_Name.setText("Nombre:");

        Jlbl_Description.setText("Descripción:");

        Jtbl_Rol.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtbl_Rol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtbl_RolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtbl_Rol);

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

        Jbtn_Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-refresh.png"))); // NOI18N
        Jbtn_Refresh.setText("Refrescar");
        Jbtn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_RefreshActionPerformed(evt);
            }
        });

        Jbtn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-delete_sign.png"))); // NOI18N
        Jbtn_Delete.setText("Eliminar");
        Jbtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_DeleteActionPerformed(evt);
            }
        });

        Jbtn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-search.png"))); // NOI18N
        Jbtn_Search.setText("Buscar");
        Jbtn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_SearchActionPerformed(evt);
            }
        });

        Jtxf_Id.setEditable(false);

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");
        Jlbl_copyright.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Jlbl_displayName.setText("Alias:");

        Jlbl_Visible.setText("Visible:");

        Jlbl_Destroyed.setText("Eliminado:");

        Jlbl_Active.setText("Activo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jlbl_Id)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Jlbl_Name)
                                                .addGap(31, 31, 31)
                                                .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Jlbl_Description)
                                                    .addComponent(Jlbl_Visible))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Jtxf_Description)
                                                    .addComponent(Jcbo_Visible, 0, 100, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Jlbl_Destroyed)
                                                .addGap(18, 18, 18)
                                                .addComponent(Jcbo_Destroyed, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Jlbl_Active)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jcbo_Active, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Jbtn_Search)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Jlbl_displayName)
                                                .addGap(18, 18, 18)
                                                .addComponent(Jtxf_displayName)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Id)
                    .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Name)
                    .addComponent(Jbtn_Search)
                    .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Description)
                    .addComponent(Jtxf_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_displayName)
                    .addComponent(Jtxf_displayName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Visible)
                    .addComponent(Jlbl_Active)
                    .addComponent(Jcbo_Visible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcbo_Active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Destroyed)
                    .addComponent(Jcbo_Destroyed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_New)
                    .addComponent(Jbtn_Add)
                    .addComponent(Jbtn_Update)
                    .addComponent(Jbtn_Delete)
                    .addComponent(Jbtn_Refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshActionPerformed
        rolController.isiTable();
        rolController.reset();
    }//GEN-LAST:event_Jbtn_RefreshActionPerformed

    private void Jbtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_DeleteActionPerformed
        rolController.delete();
        rolController.isiTable();
        rolController.reset();
    }//GEN-LAST:event_Jbtn_DeleteActionPerformed

    private void Jbtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AddActionPerformed
       if(!Jtxf_Name.getText().isEmpty()          && 
          !Jtxf_Description.getText().isEmpty()   && 
          !Jtxf_displayName.getText().isEmpty()   ) {
            rolController.insert();
            rolController.isiTable();
            rolController.reset();
        }
        else if(Jtxf_Name.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un nombre", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_Description.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Defina una pequeña desripción", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_displayName.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Defina un alias", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Jbtn_AddActionPerformed

    private void Jbtn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_SearchActionPerformed
        rolController.getData();    
    }//GEN-LAST:event_Jbtn_SearchActionPerformed

    private void Jbtn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_NewActionPerformed
        rolController.isiTable();
        rolController.reset();
    }//GEN-LAST:event_Jbtn_NewActionPerformed

    private void Jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdateActionPerformed
        if(!Jtxf_Name.getText().isEmpty()          && 
          !Jtxf_Description.getText().isEmpty()   && 
          !Jtxf_displayName.getText().isEmpty()   ) {
            rolController.update();
            rolController.isiTable();
            rolController.reset();
        }
        else if(Jtxf_Name.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un nombre", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_Description.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Defina una pequeña desripción", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_displayName.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Defina un alias", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Jbtn_UpdateActionPerformed

    private void Jtbl_RolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtbl_RolMouseClicked
        rolController.getDataField();
    }//GEN-LAST:event_Jtbl_RolMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Add;
    private javax.swing.JButton Jbtn_Delete;
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
    private javax.swing.JLabel Jlbl_displayName;
    private javax.swing.JTable Jtbl_Rol;
    private javax.swing.JTextField Jtxf_Description;
    private javax.swing.JTextField Jtxf_Id;
    private javax.swing.JTextField Jtxf_Name;
    private javax.swing.JTextField Jtxf_displayName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
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

    public javax.swing.JTable getJtbl_Rol() {
        return Jtbl_Rol;
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

    public javax.swing.JTextField getJtxf_displayName() {
        return Jtxf_displayName;
    }

    
}
