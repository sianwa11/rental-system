//
package rentalmanagement;

import rentalmanagement.*;
public class supervisorHome extends javax.swing.JFrame {

    //
    public supervisorHome() {
        initComponents();
    }

    //
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        add_house = new javax.swing.JLabel();
        update_account = new javax.swing.JLabel();
        load_complaint = new javax.swing.JLabel();
        viewtenant = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        greetingLabel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        userHome = new javax.swing.JLabel();
        AssignHouse = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supervisor: Home");
        setResizable(false);

        panel2.setPreferredSize(new java.awt.Dimension(1300, 700));
        panel2.setLayout(null);

        add_house.setBackground(new java.awt.Color(204, 204, 204));
        add_house.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_house.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/home-add-512.png"))); // NOI18N
        add_house.setText("Add House and View Vacancies");
        add_house.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add_house.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_house.setOpaque(true);
        add_house.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_houseMouseClicked(evt);
            }
        });
        panel2.add(add_house);
        add_house.setBounds(30, 260, 330, 160);

        update_account.setBackground(new java.awt.Color(204, 204, 204));
        update_account.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/details.png"))); // NOI18N
        update_account.setText("Update account");
        update_account.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_account.setOpaque(true);
        update_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_accountMouseClicked(evt);
            }
        });
        panel2.add(update_account);
        update_account.setBounds(30, 110, 240, 130);

        load_complaint.setBackground(new java.awt.Color(204, 204, 204));
        load_complaint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        load_complaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/complaint.png"))); // NOI18N
        load_complaint.setText("Load Complaints");
        load_complaint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        load_complaint.setOpaque(true);
        load_complaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                load_complaintMouseClicked(evt);
            }
        });
        panel2.add(load_complaint);
        load_complaint.setBounds(30, 460, 240, 130);

        viewtenant.setBackground(new java.awt.Color(204, 204, 204));
        viewtenant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewtenant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/tenantStatus.png"))); // NOI18N
        viewtenant.setText("View Tenant Status");
        viewtenant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewtenant.setOpaque(true);
        viewtenant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtenantMouseClicked(evt);
            }
        });
        panel2.add(viewtenant);
        viewtenant.setBounds(900, 120, 260, 150);

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        panel2.add(logout);
        logout.setBounds(40, 30, 110, 50);

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome, ");
        panel2.add(welcomeLabel);
        welcomeLabel.setBounds(210, -40, 190, 160);

        greetingLabel.setEditable(false);
        greetingLabel.setBackground(new java.awt.Color(0, 102, 153));
        greetingLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        greetingLabel.setForeground(new java.awt.Color(255, 255, 255));
        greetingLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        greetingLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greetingLabelActionPerformed(evt);
            }
        });
        panel2.add(greetingLabel);
        greetingLabel.setBounds(410, 10, 260, 60);
        panel2.add(jSeparator1);
        jSeparator1.setBounds(190, 80, 560, 20);

        logo.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Home.png"))); // NOI18N
        logo.setText("R.M.S");
        panel2.add(logo);
        logo.setBounds(1130, 0, 149, 90);

        userHome.setBackground(new java.awt.Color(0, 102, 153));
        userHome.setOpaque(true);
        panel2.add(userHome);
        userHome.setBounds(0, 0, 1300, 100);

        AssignHouse.setBackground(new java.awt.Color(204, 204, 204));
        AssignHouse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AssignHouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/vacancy.png"))); // NOI18N
        AssignHouse.setText("Assign House");
        AssignHouse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AssignHouse.setOpaque(true);
        AssignHouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignHouseMouseClicked(evt);
            }
        });
        panel2.add(AssignHouse);
        AssignHouse.setBounds(900, 320, 260, 140);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Base.png"))); // NOI18N
        panel2.add(background);
        background.setBounds(0, 100, 1300, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       new userLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void greetingLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greetingLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greetingLabelActionPerformed

    private void update_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_accountMouseClicked
       new supervisorAccount().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_update_accountMouseClicked

    private void add_houseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_houseMouseClicked
        new addHouse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_houseMouseClicked

    private void viewtenantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtenantMouseClicked
        new tenantStatus().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewtenantMouseClicked

    private void AssignHouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignHouseMouseClicked
     new assignHouse().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_AssignHouseMouseClicked

    private void load_complaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_load_complaintMouseClicked
        new loadSuggestions().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_load_complaintMouseClicked
        //
    public static void main(String args[]) {
       //
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
            java.util.logging.Logger.getLogger(supervisorHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supervisorHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supervisorHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supervisorHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supervisorHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssignHouse;
    private javax.swing.JLabel add_house;
    private javax.swing.JLabel background;
    private javax.swing.JTextField greetingLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel load_complaint;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private java.awt.Panel panel2;
    private javax.swing.JLabel update_account;
    private javax.swing.JLabel userHome;
    private javax.swing.JLabel viewtenant;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
