package com.atheneox.stacey.views;

public class Jif_Login extends javax.swing.JInternalFrame {
    
    public Jif_Login() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_username = new javax.swing.JLabel();
        Jlbl_password = new javax.swing.JLabel();
        Jbtn_Login = new javax.swing.JButton();
        Jtxf_username = new javax.swing.JTextField();
        Jpf_password = new javax.swing.JPasswordField();
        Jlbl_copyright = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Iniciar sesión");
        setToolTipText("Inicio de sesión");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png"))); // NOI18N

        Jlbl_username.setText("Usuario:");

        Jlbl_password.setText("Clave:");

        Jbtn_Login.setText("Entrar");
        Jbtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_LoginActionPerformed(evt);
            }
        });

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jlbl_username)
                        .addGap(18, 18, 18)
                        .addComponent(Jtxf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jlbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Jbtn_Login))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Jpf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlbl_copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlbl_username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jtxf_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jpf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_password))
                .addGap(18, 18, 18)
                .addComponent(Jbtn_Login)
                .addGap(35, 35, 35)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_LoginActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Login;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JLabel Jlbl_password;
    private javax.swing.JLabel Jlbl_username;
    private javax.swing.JPasswordField Jpf_password;
    private javax.swing.JTextField Jtxf_username;
    // End of variables declaration//GEN-END:variables
}
