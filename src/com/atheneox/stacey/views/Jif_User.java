package com.atheneox.stacey.views;

import com.atheneox.stacey.controllers.ActiveController;
import com.atheneox.stacey.controllers.DestroyedController;
import com.atheneox.stacey.controllers.DocumentTypeController;
import com.atheneox.stacey.controllers.LockedController;
import com.atheneox.stacey.controllers.UserController;
import com.atheneox.stacey.controllers.VisibleController;
import javax.swing.JOptionPane;

public class Jif_User extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;
    private UserController userController;
    private DocumentTypeController documentTypeController;
    private ActiveController activeController;
    private VisibleController visibleController;
    private DestroyedController destroyedController;
    private LockedController lockedController;
    public Jif_User() {
        initComponents();
        
        
        userController = new UserController(this);
        userController.isiTable();
        
        documentTypeController = new DocumentTypeController(this);
        documentTypeController.LoadCB_documentType_User();
        
        activeController = new ActiveController(this);
        activeController.LoadJcb_Active_User();
        
        visibleController = new VisibleController(this);
        visibleController.LoadJcb_Visible_User();
        
        lockedController = new LockedController(this);
        lockedController.LoadJcb_Locked_User();
        
        destroyedController = new DestroyedController(this);
        destroyedController.LoadJcb_Destroyed_User();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_Id = new javax.swing.JLabel();
        Jbtn_new = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_User = new javax.swing.JTable();
        Jlbl_Name = new javax.swing.JLabel();
        Jlbl_lastName = new javax.swing.JLabel();
        Jlbl_documentType = new javax.swing.JLabel();
        Jlbl_documentNumber = new javax.swing.JLabel();
        Jlbl_Cellphone = new javax.swing.JLabel();
        Jlbl_Email = new javax.swing.JLabel();
        Jlbl_Description = new javax.swing.JLabel();
        Jtxf_Id = new javax.swing.JTextField();
        Jtxf_Name = new javax.swing.JTextField();
        Jtxf_lastName = new javax.swing.JTextField();
        Jtxf_documentNumber = new javax.swing.JTextField();
        Jtxf_Cellphone = new javax.swing.JTextField();
        Jtxf_Email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtxa_Description = new javax.swing.JTextArea();
        Jcbo_documentType = new javax.swing.JComboBox<>();
        Jlbl_copyright = new javax.swing.JLabel();
        Jbtn_add = new javax.swing.JButton();
        Jbtn_Update = new javax.swing.JButton();
        Jbtn_Delete = new javax.swing.JButton();
        Jbtn_Refresh = new javax.swing.JButton();
        Jbtn_Search = new javax.swing.JButton();
        Jlbl_active = new javax.swing.JLabel();
        Jlbl_visible = new javax.swing.JLabel();
        Jlbl_locked = new javax.swing.JLabel();
        Jlbl_destroyed = new javax.swing.JLabel();
        Jcbo_active = new javax.swing.JComboBox<>();
        Jcbo_visible = new javax.swing.JComboBox<>();
        Jcbo_locked = new javax.swing.JComboBox<>();
        Jcbo_destroyed = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administración de usuarios");
        setToolTipText("Administración de usuarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png"))); // NOI18N

        Jlbl_Id.setText("ID:");

        Jbtn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-new.png"))); // NOI18N
        Jbtn_new.setText("Nuevo");
        Jbtn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_newActionPerformed(evt);
            }
        });

        Jtbl_User.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtbl_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtbl_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtbl_User);

        Jlbl_Name.setText("Nombre:");

        Jlbl_lastName.setText("Apellido:");

        Jlbl_documentType.setText("Tipo Documento:");

        Jlbl_documentNumber.setText("# Doc:");

        Jlbl_Cellphone.setText("Celular:");

        Jlbl_Email.setText("E-Mail:");

        Jlbl_Description.setText("Descripción:");

        Jtxf_Id.setEditable(false);

        Jtxa_Description.setColumns(20);
        Jtxa_Description.setRows(5);
        jScrollPane2.setViewportView(Jtxa_Description);

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");

        Jbtn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-plus.png"))); // NOI18N
        Jbtn_add.setText("Agregar");
        Jbtn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_addActionPerformed(evt);
            }
        });

        Jbtn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-available_updates.png"))); // NOI18N
        Jbtn_Update.setText("Editar");
        Jbtn_Update.setToolTipText("");
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

        Jbtn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-search.png"))); // NOI18N
        Jbtn_Search.setText("Buscar");
        Jbtn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_SearchActionPerformed(evt);
            }
        });

        Jlbl_active.setText("Activo:");

        Jlbl_visible.setText("Visible:");

        Jlbl_locked.setText("Bloqueado:");

        Jlbl_destroyed.setText("Eliminado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(Jtxf_Email)
                        .addGap(411, 411, 411))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Jlbl_Id)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jtxf_Id))
                                    .addComponent(Jlbl_Name))
                                .addGap(18, 18, 18)
                                .addComponent(Jlbl_documentType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jcbo_documentType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jlbl_documentNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jbtn_new)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_Refresh))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Jlbl_lastName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jtxf_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jlbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Jlbl_Description)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Jbtn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jlbl_Cellphone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Jtxf_documentNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(Jtxf_Cellphone)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Jlbl_visible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jlbl_locked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jlbl_active, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jlbl_destroyed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Jcbo_destroyed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jcbo_active, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jcbo_visible, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Jcbo_locked, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(279, 279, 279))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Id)
                    .addComponent(Jtxf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_documentType)
                    .addComponent(Jcbo_documentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_documentNumber)
                    .addComponent(Jtxf_documentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Name)
                    .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_Search)
                    .addComponent(Jlbl_Cellphone)
                    .addComponent(Jtxf_Cellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Email)
                    .addComponent(Jtxf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_lastName)
                    .addComponent(Jtxf_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jlbl_Description)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jlbl_active)
                            .addComponent(Jcbo_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Jlbl_visible)
                                .addComponent(Jcbo_visible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Jlbl_locked)
                                .addComponent(Jcbo_locked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Jcbo_destroyed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jlbl_destroyed)))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_new)
                    .addComponent(Jbtn_add)
                    .addComponent(Jbtn_Update)
                    .addComponent(Jbtn_Delete)
                    .addComponent(Jbtn_Refresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_SearchActionPerformed
        if(!Jtxf_Name.getText().isEmpty())   {
              userController.getData();    
        }
        else{
           JOptionPane.showMessageDialog(null, "Défina un nombre a buscar", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
      
    }//GEN-LAST:event_Jbtn_SearchActionPerformed

    private void Jbtn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_newActionPerformed
        userController.isiTable();
        userController.reset();
    }//GEN-LAST:event_Jbtn_newActionPerformed

    private void Jbtn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_addActionPerformed
        
        if(!Jtxf_Name.getText().isEmpty()           && 
           !Jtxf_lastName.getText().isEmpty()       && 
           !Jtxf_documentNumber.getText().isEmpty() && 
           !Jtxf_Cellphone.getText().isEmpty()      && 
           !Jtxf_Email.getText().isEmpty()          &&
           !Jtxa_Description.getText().isEmpty()) {
                        
            userController.insert();
            userController.isiTable();
            userController.reset();
        }
        else if(Jtxf_Name.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un nombre", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_lastName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un apellido", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_documentNumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un número de documento", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_Cellphone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un número celular", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_Email.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un correo electrónico", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxa_Description.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina una pequeña descripción", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
   
    }//GEN-LAST:event_Jbtn_addActionPerformed

    private void Jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdateActionPerformed
        if(!Jtxf_Name.getText().isEmpty()           && 
           !Jtxf_lastName.getText().isEmpty()       && 
           !Jtxf_documentNumber.getText().isEmpty() && 
           !Jtxf_Cellphone.getText().isEmpty()      && 
           !Jtxf_Email.getText().isEmpty()          &&
           !Jtxa_Description.getText().isEmpty()) {
        
                userController.update();
                userController.isiTable();
                userController.reset();
                
        }
        else if(Jtxf_Name.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un nombre", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_lastName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un apellido", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_documentNumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un número de documento", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_Cellphone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un número celular", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxf_Email.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina un correo electrónico", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
        else if(Jtxa_Description.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Defina una pequeña descripción", "Stacey", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Jbtn_UpdateActionPerformed

    private void Jbtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_DeleteActionPerformed
        userController.delete();
        userController.isiTable();
        userController.reset();
    }//GEN-LAST:event_Jbtn_DeleteActionPerformed

    private void Jbtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshActionPerformed
        userController.isiTable();
        userController.reset();
    }//GEN-LAST:event_Jbtn_RefreshActionPerformed

    private void Jtbl_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtbl_UserMouseClicked
       userController.getDataField();
    }//GEN-LAST:event_Jtbl_UserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Delete;
    private javax.swing.JButton Jbtn_Refresh;
    private javax.swing.JButton Jbtn_Search;
    private javax.swing.JButton Jbtn_Update;
    private javax.swing.JButton Jbtn_add;
    private javax.swing.JButton Jbtn_new;
    private javax.swing.JComboBox<String> Jcbo_active;
    private javax.swing.JComboBox<String> Jcbo_destroyed;
    private javax.swing.JComboBox<String> Jcbo_documentType;
    private javax.swing.JComboBox<String> Jcbo_locked;
    private javax.swing.JComboBox<String> Jcbo_visible;
    private javax.swing.JLabel Jlbl_Cellphone;
    private javax.swing.JLabel Jlbl_Description;
    private javax.swing.JLabel Jlbl_Email;
    private javax.swing.JLabel Jlbl_Id;
    private javax.swing.JLabel Jlbl_Name;
    private javax.swing.JLabel Jlbl_active;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JLabel Jlbl_destroyed;
    private javax.swing.JLabel Jlbl_documentNumber;
    private javax.swing.JLabel Jlbl_documentType;
    private javax.swing.JLabel Jlbl_lastName;
    private javax.swing.JLabel Jlbl_locked;
    private javax.swing.JLabel Jlbl_visible;
    private javax.swing.JTable Jtbl_User;
    private javax.swing.JTextArea Jtxa_Description;
    private javax.swing.JTextField Jtxf_Cellphone;
    private javax.swing.JTextField Jtxf_Email;
    private javax.swing.JTextField Jtxf_Id;
    private javax.swing.JTextField Jtxf_Name;
    private javax.swing.JTextField Jtxf_documentNumber;
    private javax.swing.JTextField Jtxf_lastName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JComboBox<String> getJcbo_documentType() {
        return Jcbo_documentType;
    }

    public javax.swing.JTable getJtbl_User() {
        return Jtbl_User;
    }

    public javax.swing.JTextArea getJtxa_Description() {
        return Jtxa_Description;
    }

    public javax.swing.JTextField getJtxf_Cellphone() {
        return Jtxf_Cellphone;
    }

    public javax.swing.JTextField getJtxf_Email() {
        return Jtxf_Email;
    }

    public javax.swing.JTextField getJtxf_Id() {
        return Jtxf_Id;
    }

    public javax.swing.JTextField getJtxf_Name() {
        return Jtxf_Name;
    }

    public javax.swing.JTextField getJtxf_documentNumber() {
        return Jtxf_documentNumber;
    }

    public javax.swing.JTextField getJtxf_lastName() {
        return Jtxf_lastName;
    }

    public javax.swing.JComboBox<String> getJcbo_active() {
        return Jcbo_active;
    }

    public javax.swing.JComboBox<String> getJcbo_destroyed() {
        return Jcbo_destroyed;
    }

    public javax.swing.JComboBox<String> getJcbo_locked() {
        return Jcbo_locked;
    }

    public javax.swing.JComboBox<String> getJcbo_visible() {
        return Jcbo_visible;
    }
    
    
}
