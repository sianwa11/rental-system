/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmanagement;

/**
 *
 * @author EDALIA. M
 */
public class managerHome extends javax.swing.JFrame {

    /**
     * Creates new form managerHome
     */
    public managerHome() {
        initComponents();
    }

    //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        logout = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        greetingLabel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        userHome = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        viewComments = new javax.swing.JLabel();
        password_change = new javax.swing.JLabel();
        confirm_password = new javax.swing.JLabel();
        changePasswordField = new javax.swing.JPasswordField();
        confirmPasswordField1 = new javax.swing.JPasswordField();
        password_label1 = new javax.swing.JLabel();
        assignLandlord1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager:Home");
        setBounds(new java.awt.Rectangle(0, 0, 1300, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(null);

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        panel1.add(logout);
        logout.setBounds(40, 30, 110, 50);

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome, ");
        panel1.add(welcomeLabel);
        welcomeLabel.setBounds(210, -40, 190, 160);

        greetingLabel.setEditable(false);
        greetingLabel.setBackground(new java.awt.Color(0, 51, 102));
        greetingLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        greetingLabel.setForeground(new java.awt.Color(255, 255, 255));
        greetingLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        greetingLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greetingLabelActionPerformed(evt);
            }
        });
        panel1.add(greetingLabel);
        greetingLabel.setBounds(410, 10, 260, 60);
        panel1.add(jSeparator1);
        jSeparator1.setBounds(190, 80, 560, 20);

        logo.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(204, 204, 204));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Home.png"))); // NOI18N
        logo.setText("R.M.S");
        panel1.add(logo);
        logo.setBounds(1130, 0, 149, 90);

        userHome.setBackground(new java.awt.Color(0, 51, 102));
        userHome.setOpaque(true);
        panel1.add(userHome);
        userHome.setBounds(0, 0, 1300, 100);

        confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm.setText("Confirm Change");
        panel1.add(confirm);
        confirm.setBounds(950, 310, 150, 40);

        viewComments.setBackground(new java.awt.Color(204, 204, 204));
        viewComments.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewComments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/staff-png-image-58876.png"))); // NOI18N
        viewComments.setText("View Comments");
        viewComments.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewComments.setOpaque(true);
        panel1.add(viewComments);
        viewComments.setBounds(40, 420, 240, 130);

        password_change.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password_change.setText("Change Password:");
        panel1.add(password_change);
        password_change.setBounds(880, 180, 150, 30);

        confirm_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm_password.setText("Confirm Password:");
        panel1.add(confirm_password);
        confirm_password.setBounds(880, 220, 160, 40);
        panel1.add(changePasswordField);
        changePasswordField.setBounds(1010, 180, 160, 28);
        panel1.add(confirmPasswordField1);
        confirmPasswordField1.setBounds(1010, 230, 160, 28);

        password_label1.setBackground(new java.awt.Color(204, 204, 204));
        password_label1.setOpaque(true);
        panel1.add(password_label1);
        password_label1.setBounds(830, 120, 380, 260);

        assignLandlord1.setBackground(new java.awt.Color(204, 204, 204));
        assignLandlord1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignLandlord1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/staff-png-image-58876.png"))); // NOI18N
        assignLandlord1.setText("Assign Supervisor");
        assignLandlord1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignLandlord1.setOpaque(true);
        panel1.add(assignLandlord1);
        assignLandlord1.setBounds(30, 180, 240, 130);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Base.png"))); // NOI18N
        panel1.add(background);
        background.setBounds(0, 20, 1300, 680);

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new userLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void greetingLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greetingLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greetingLabelActionPerformed

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
            java.util.logging.Logger.getLogger(managerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignLandlord1;
    private javax.swing.JLabel background;
    private javax.swing.JPasswordField changePasswordField;
    private javax.swing.JButton confirm;
    private javax.swing.JPasswordField confirmPasswordField1;
    private javax.swing.JLabel confirm_password;
    private javax.swing.JTextField greetingLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private java.awt.Panel panel1;
    private javax.swing.JLabel password_change;
    private javax.swing.JLabel password_label1;
    private javax.swing.JLabel userHome;
    private javax.swing.JLabel viewComments;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
