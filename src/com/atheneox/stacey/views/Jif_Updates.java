package com.atheneox.stacey.views;

public class Jif_Updates extends javax.swing.JInternalFrame {

    public Jif_Updates() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jbtn_Updates = new javax.swing.JButton();
        Jpbar_updates = new javax.swing.JProgressBar();
        Jlbl_copyright = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Actualización de software");
        setToolTipText("Actualización de software");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atheneox/stacey/images/logo.png"))); // NOI18N

        Jbtn_Updates.setText("Buscar actualización");
        Jbtn_Updates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_UpdatesActionPerformed(evt);
            }
        });

        Jlbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlbl_copyright.setText("Stacey | Copyright © Todos los Derechos Reservados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Jbtn_Updates)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlbl_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(Jpbar_updates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(Jpbar_updates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Jbtn_Updates)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbl_copyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_UpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_UpdatesActionPerformed
      
    }//GEN-LAST:event_Jbtn_UpdatesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Updates;
    private javax.swing.JLabel Jlbl_copyright;
    private javax.swing.JProgressBar Jpbar_updates;
    // End of variables declaration//GEN-END:variables
}
