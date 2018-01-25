package com.atheneox.stacey.views;

import com.atheneox.stacey.controllers.ClientController;
import com.atheneox.stacey.controllers.DocumentTypeController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Jif_Client extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;
    private ClientController clientController;
    private DocumentTypeController documentTypeController;
    
    public Jif_Client() {
        initComponents();

        clientController = new ClientController(this);
        clientController.isiTable();
        
        documentTypeController = new DocumentTypeController(this);
        documentTypeController.LoadCB_documentType_Client();
    }
    
    public JButton getTxtFind() {
        return Jbtn_Search;
    }

    public JTable getTableClient() {
        return Jtbl_Client;
    }

    public JButton getBtnDelete() {
        return Jbtn_Delete;
    }

    public JButton getBtnRefresh() {
        return Jbtn_Refresh;
    }

    public JButton getBtnAdd() {
        return Jbtn_Add;
    }

    public JButton getBtnEdit() {
        return Jbtn_Update;
    }

    public JTextField getTxtId() {
        return Jtxf_id;
    }

    public JTextField getTxtName() {
        return Jtxf_Name;
    }
    
    public JTextField getTxtLastname() {
        return Jtxf_Lastname;
    }
    
    public JTextField getTxtCellphone() {
        return Jtxf_Cellphone;
    }
    
    public JTextField getTxtdocumentNumber() {
        return Jtxf_documentNumber;
    }
    
    public JComboBox getCbodocumentType() {
        return Jcb_documentType;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_Id = new javax.swing.JLabel();
        Jtxf_id = new javax.swing.JTextField();
        Jlbl_documentType = new javax.swing.JLabel();
        Jlbl_documentNumber = new javax.swing.JLabel();
        Jtxf_documentNumber = new javax.swing.JTextField();
        Jlbl_Name = new javax.swing.JLabel();
        Jlbl_Lastname = new javax.swing.JLabel();
        Jtxf_Name = new javax.swing.JTextField();
        Jlbl_Cellphone = new javax.swing.JLabel();
        Jtxf_Lastname = new javax.swing.JTextField();
        Jtxf_Cellphone = new javax.swing.JTextField();
        Jbtn_Search = new javax.swing.JButton();
        Jbtn_Add = new javax.swing.JButton();
        Jbtn_Update = new javax.swing.JButton();
        Jbtn_Delete = new javax.swing.JButton();
        Jbtn_Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_Client = new javax.swing.JTable();
        Jcb_documentType = new javax.swing.JComboBox<>();
        Jlbl_copyright = new javax.swing.JLabel();
        Jbtn_New = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administración de clientes");
        setToolTipText("Panel de administración de clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png"))); // NOI18N

        Jlbl_Id.setText("ID:");

        Jtxf_id.setEditable(false);

        Jlbl_documentType.setText("Tipo Documento:");

        Jlbl_documentNumber.setText("# Documento:");

        Jlbl_Name.setText("Nombre:");

        Jlbl_Lastname.setText("Apellido:");

        Jlbl_Cellphone.setText("Celular:");

        Jbtn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/control/icons8-search.png"))); // NOI18N
        Jbtn_Search.setText("Buscar");
        Jbtn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_SearchActionPerformed(evt);
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
        Jbtn_Update.setText("Actualizar");
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

        Jtbl_Client.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtbl_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtbl_ClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtbl_Client);

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");
        Jlbl_copyright.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jlbl_Id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jtxf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jlbl_documentType)
                        .addGap(0, 0, 0)
                        .addComponent(Jcb_documentType, 0, 97, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Jlbl_documentNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jtxf_documentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Jlbl_Name)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Jlbl_Lastname)
                                            .addComponent(Jlbl_Cellphone))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Jtxf_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jtxf_Cellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(Jbtn_Search)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Id)
                    .addComponent(Jtxf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_documentType)
                    .addComponent(Jlbl_documentNumber)
                    .addComponent(Jcb_documentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtxf_documentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Name)
                    .addComponent(Jbtn_Search)
                    .addComponent(Jtxf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jtxf_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jlbl_Lastname)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jtxf_Cellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlbl_Cellphone))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_Add)
                    .addComponent(Jbtn_Update)
                    .addComponent(Jbtn_Delete)
                    .addComponent(Jbtn_Refresh)
                    .addComponent(Jbtn_New))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AddActionPerformed
        clientController.insert();
        clientController.isiTable();
        clientController.reset();
    }//GEN-LAST:event_Jbtn_AddActionPerformed

    private void Jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdateActionPerformed
        clientController.update();
        clientController.isiTable();
        clientController.reset();
    }//GEN-LAST:event_Jbtn_UpdateActionPerformed

    private void Jbtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_DeleteActionPerformed
        clientController.delete();
        clientController.isiTable();
        clientController.reset();
    }//GEN-LAST:event_Jbtn_DeleteActionPerformed

    private void Jbtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshActionPerformed
        clientController.isiTable();
        clientController.reset();
    }//GEN-LAST:event_Jbtn_RefreshActionPerformed

    private void Jtbl_ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtbl_ClientMouseClicked
       clientController.getDataField();
    }//GEN-LAST:event_Jtbl_ClientMouseClicked

    private void Jbtn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_SearchActionPerformed
        clientController.getData();    
    }//GEN-LAST:event_Jbtn_SearchActionPerformed

    private void Jbtn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_NewActionPerformed
        clientController.isiTable();
        clientController.reset();
    }//GEN-LAST:event_Jbtn_NewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Add;
    private javax.swing.JButton Jbtn_Delete;
    private javax.swing.JButton Jbtn_New;
    private javax.swing.JButton Jbtn_Refresh;
    private javax.swing.JButton Jbtn_Search;
    private javax.swing.JButton Jbtn_Update;
    private javax.swing.JComboBox<com.atheneox.stacey.models.DocType> Jcb_documentType;
    private javax.swing.JLabel Jlbl_Cellphone;
    private javax.swing.JLabel Jlbl_Id;
    private javax.swing.JLabel Jlbl_Lastname;
    private javax.swing.JLabel Jlbl_Name;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JLabel Jlbl_documentNumber;
    private javax.swing.JLabel Jlbl_documentType;
    private javax.swing.JTable Jtbl_Client;
    private javax.swing.JTextField Jtxf_Cellphone;
    private javax.swing.JTextField Jtxf_Lastname;
    private javax.swing.JTextField Jtxf_Name;
    private javax.swing.JTextField Jtxf_documentNumber;
    private javax.swing.JTextField Jtxf_id;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
