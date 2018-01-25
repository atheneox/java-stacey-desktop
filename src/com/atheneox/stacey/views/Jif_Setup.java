package com.atheneox.stacey.views;

import com.atheneox.stacey.controllers.DatabaseController;
import javax.swing.JComboBox;

public class Jif_Setup extends javax.swing.JInternalFrame {

 private static final long serialVersionUID = 1L;
    private DatabaseController databaseController;
   
    public Jif_Setup() {
        initComponents();
        databaseController = new DatabaseController(this);
        databaseController.LoadCB_dataBase();
    }
   
    public JComboBox getCbodataBase() {
        return Jcb_dataBase;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_name_database = new javax.swing.JLabel();
        Jlbl_port_database = new javax.swing.JLabel();
        Jlbl_copyright = new javax.swing.JLabel();
        Jtxf_username_database = new javax.swing.JTextField();
        Jtxf_password_database = new javax.swing.JTextField();
        Jbtn_Save = new javax.swing.JButton();
        Jlbl_username_database = new javax.swing.JLabel();
        Jlbl_password_database = new javax.swing.JLabel();
        Jtxf_port_database = new javax.swing.JTextField();
        Jcb_dataBase = new javax.swing.JComboBox<>();
        Jbtn_CreateDB = new javax.swing.JButton();
        Jbtn_autoIncrement = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Configuración de BD");
        setToolTipText("Configuración de BD");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png"))); // NOI18N

        Jlbl_name_database.setText("BD:");

        Jlbl_port_database.setText("Puerto:");

        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");

        Jbtn_Save.setText("Guardar");

        Jlbl_username_database.setText("Usuario BD:");

        Jlbl_password_database.setText("Password:");

        Jbtn_CreateDB.setText("Crear BD");
        Jbtn_CreateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_CreateDBActionPerformed(evt);
            }
        });

        Jbtn_autoIncrement.setText("AI = 0");
        Jbtn_autoIncrement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_autoIncrementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jbtn_Save)
                    .addComponent(Jlbl_port_database, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jlbl_name_database)
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jtxf_username_database)
                                    .addComponent(Jtxf_password_database, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(Jtxf_port_database)
                                    .addComponent(Jcb_dataBase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Jlbl_password_database, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jlbl_username_database, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jbtn_CreateDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jbtn_autoIncrement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jcb_dataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_name_database)
                    .addComponent(Jbtn_CreateDB))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_username_database)
                    .addComponent(Jtxf_username_database, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_autoIncrement))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_password_database)
                    .addComponent(Jtxf_password_database, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_port_database)
                    .addComponent(Jtxf_port_database, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(Jbtn_Save)
                .addGap(18, 18, 18)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_CreateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_CreateDBActionPerformed
      databaseController.createdataBase();
    }//GEN-LAST:event_Jbtn_CreateDBActionPerformed

    private void Jbtn_autoIncrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_autoIncrementActionPerformed
      databaseController.alterTbl();
    }//GEN-LAST:event_Jbtn_autoIncrementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_CreateDB;
    private javax.swing.JButton Jbtn_Save;
    private javax.swing.JButton Jbtn_autoIncrement;
    private javax.swing.JComboBox<String> Jcb_dataBase;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JLabel Jlbl_name_database;
    private javax.swing.JLabel Jlbl_password_database;
    private javax.swing.JLabel Jlbl_port_database;
    private javax.swing.JLabel Jlbl_username_database;
    private javax.swing.JTextField Jtxf_password_database;
    private javax.swing.JTextField Jtxf_port_database;
    private javax.swing.JTextField Jtxf_username_database;
    // End of variables declaration//GEN-END:variables
}
