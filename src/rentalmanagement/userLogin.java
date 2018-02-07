//
package rentalmanagement;

//
public class userLogin extends javax.swing.JFrame {

    //
    public userLogin() {
        initComponents();
    }
//
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new java.awt.Panel();
        userPasswordField = new javax.swing.JPasswordField();
        userTextField = new javax.swing.JTextField();
        user_id = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        userComboBox = new javax.swing.JComboBox<>();
        loginButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("R.M.S:Login");
        setBounds(new java.awt.Rectangle(0, 0, 600, 500));
        setLocation(new java.awt.Point(370, 70));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setPreferredSize(new java.awt.Dimension(600, 500));
        login_panel.setLayout(null);

        userPasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userPasswordField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_panel.add(userPasswordField);
        userPasswordField.setBounds(410, 290, 140, 30);

        userTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        login_panel.add(userTextField);
        userTextField.setBounds(410, 230, 140, 30);

        user_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_id.setForeground(new java.awt.Color(255, 255, 255));
        user_id.setText("User ID:");
        login_panel.add(user_id);
        user_id.setBounds(340, 240, 70, 17);

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");
        login_panel.add(password);
        password.setBounds(330, 300, 80, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        login_panel.add(jButton1);
        jButton1.setBounds(320, 370, 120, 40);

        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("User:");
        login_panel.add(user);
        user.setBounds(360, 180, 40, 17);

        userComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client", "Supervisor", "Manager" }));
        userComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });
        login_panel.add(userComboBox);
        userComboBox.setBounds(410, 170, 130, 30);

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        login_panel.add(loginButton);
        loginButton.setBounds(500, 370, 100, 40);

        logo.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Home.png"))); // NOI18N
        logo.setText("R.M.S");
        login_panel.add(logo);
        logo.setBounds(440, 0, 149, 90);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Base.png"))); // NOI18N
        login_panel.add(background);
        background.setBounds(-10, 0, 320, 500);

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setOpaque(true);
        login_panel.add(jLabel1);
        jLabel1.setBounds(304, 0, 300, 500);

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if("Client".equals(userComboBox.getSelectedItem().toString())){
         new clientHome().setVisible(true);
        this.dispose();
        }
     else if("Supervisor".equals(userComboBox.getSelectedItem().toString())){
         new supervisorHome().setVisible(true);
        this.dispose();
        }
       else if("Manager".equals(userComboBox.getSelectedItem().toString())){
         new clientHome().setVisible(true);
        this.dispose();
        }
       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboBoxActionPerformed

    }//GEN-LAST:event_userComboBoxActionPerformed

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new signUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
//
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
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private java.awt.Panel login_panel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel password;
    private javax.swing.JLabel user;
    private javax.swing.JComboBox<String> userComboBox;
    private javax.swing.JPasswordField userPasswordField;
    private javax.swing.JTextField userTextField;
    private javax.swing.JLabel user_id;
    // End of variables declaration//GEN-END:variables
}
