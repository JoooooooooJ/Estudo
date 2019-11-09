package FlinstonTrans.Media.Views;

import java.awt.Color;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
        painelOverlay.setBackground(new Color(0,85,66,200));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLogin = new javax.swing.JPanel();
        DETAILS = new javax.swing.JLabel();
        LoginIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelPassword = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        EMAILADDRESS = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        loginIcon = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnSignin = new javax.swing.JButton();
        PASSWORD = new javax.swing.JLabel();
        painelOverlay = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 223, 223));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(250, 250));
        setLocationByPlatform(true);
        setName("LoginScreen"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLogin.setBackground(new java.awt.Color(255, 211, 105));
        painelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DETAILS.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        DETAILS.setForeground(new java.awt.Color(109, 109, 109));
        DETAILS.setText("Digite suas credenciais abaixo.");
        painelLogin.add(DETAILS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, -1));

        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_icon.png"))); // NOI18N
        painelLogin.add(LoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Faça seu login");
        painelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 200, 40));

        panelPassword.setBackground(new java.awt.Color(255, 255, 255));
        panelPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(63, 197, 240), 1, true));
        panelPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password_icon.png"))); // NOI18N
        panelPassword.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPasswordField1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPasswordField1.setBorder(null);
        panelPassword.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 10));

        painelLogin.add(panelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 193, 28));

        EMAILADDRESS.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        EMAILADDRESS.setForeground(new java.awt.Color(109, 109, 109));
        EMAILADDRESS.setText("LOGIN");
        painelLogin.add(EMAILADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(63, 197, 240), 1, true));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_contacts_filled_15px.png"))); // NOI18N
        panelLogin.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 20, 20));

        txtLogin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLogin.setToolTipText("");
        txtLogin.setBorder(null);
        panelLogin.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 10));

        painelLogin.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 193, 28));

        btnSignin.setBackground(new java.awt.Color(255, 255, 255));
        btnSignin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSignin.setText("ENTRAR");
        btnSignin.setActionCommand("ENTRAR");
        btnSignin.setAlignmentY(0.0F);
        btnSignin.setBorder(null);
        btnSignin.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSignin.setDefaultCapable(false);
        painelLogin.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 40));

        PASSWORD.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        PASSWORD.setForeground(new java.awt.Color(109, 109, 109));
        PASSWORD.setText("SENHA");
        painelLogin.add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        getContentPane().add(painelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 300, 440));

        painelOverlay.setBackground(new java.awt.Color(0, 85, 66));
        painelOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit_icon.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        painelOverlay.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        getContentPane().add(painelOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backGroundLogin_image.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 1000, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DETAILS;
    private javax.swing.JLabel EMAILADDRESS;
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JLabel PASSWORD;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnSignin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelOverlay;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
