/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package log_in;

/**
 *
 * @author m1gue
 */
public class LogIn extends javax.swing.JFrame {
    String UAdmin="Admin";
    String UClient="Client";
    String UGuest="Guest";
    String PAdmin="Admin";
    String PClient="Client";
    String PGuest="Guest";
    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbGUser = new javax.swing.ButtonGroup();
        txtUser = new javax.swing.JTextField();
        txtPasword = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        rdbAdministrator = new javax.swing.JRadioButton();
        rdbClient = new javax.swing.JRadioButton();
        rdbGuest = new javax.swing.JRadioButton();
        log = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaswordActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usurio");

        lblContraseña.setText("Contraseña");

        rdbGUser.add(rdbAdministrator);
        rdbAdministrator.setText("Admin");
        rdbAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAdministratorActionPerformed(evt);
            }
        });

        rdbGUser.add(rdbClient);
        rdbClient.setText("Client");
        rdbClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbClientActionPerformed(evt);
            }
        });

        rdbGUser.add(rdbGuest);
        rdbGuest.setText("Guest");
        rdbGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbGuestActionPerformed(evt);
            }
        });

        log.setText("Log in");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(log))
                    .addComponent(rdbGuest)
                    .addComponent(rdbClient)
                    .addComponent(rdbAdministrator)
                    .addComponent(lblContraseña)
                    .addComponent(lblUsuario)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPasword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdbAdministrator)
                .addGap(18, 18, 18)
                .addComponent(rdbClient)
                .addGap(18, 18, 18)
                .addComponent(rdbGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(log)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaswordActionPerformed
        
    }//GEN-LAST:event_txtPaswordActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        if(rdbAdministrator.isSelected()){
            if(UAdmin.equalsIgnoreCase(txtUser.getText())){
                if(PAdmin.equals(txtPasword.getText())){
                    System.out.println("Welcome Admin");
                }
                else{
                    System.out.println("Wrong user or password. Check the Selected user");
                }
            }
            else{
                System.out.println("Wrong user or password. Check the Selected user");
            }
        }
        if(rdbClient.isSelected()){
            if(UClient.equalsIgnoreCase(txtUser.getText())){
                if(PClient.equals(txtPasword.getText())){
                    System.out.println("Welcome Client");
                }
                else{
                    System.out.println("Wrong user or password. Check the Selected user");
                }
            }
            else{
                System.out.println("Wrong user or password. Check the Selected user");
            }
        }
        if(rdbGuest.isSelected()){
            if(UGuest.equalsIgnoreCase(txtUser.getText())){
                if(PGuest.equals(txtPasword.getText())){
                    System.out.println("Welcome Guest");
                }
                else{
                    System.out.println("Wrong user or password. Check the Selected user");
                }
            }
            else{
                System.out.println("Wrong user or password. Check the Selected user");
            }
        }
    }//GEN-LAST:event_logActionPerformed

    private void rdbAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAdministratorActionPerformed
        
    }//GEN-LAST:event_rdbAdministratorActionPerformed

    private void rdbClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbClientActionPerformed
        
    }//GEN-LAST:event_rdbClientActionPerformed

    private void rdbGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbGuestActionPerformed
        
    }//GEN-LAST:event_rdbGuestActionPerformed

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JButton log;
    private javax.swing.JRadioButton rdbAdministrator;
    private javax.swing.JRadioButton rdbClient;
    private javax.swing.ButtonGroup rdbGUser;
    private javax.swing.JRadioButton rdbGuest;
    private javax.swing.JTextField txtPasword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

