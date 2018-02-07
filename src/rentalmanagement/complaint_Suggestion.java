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
public class complaint_Suggestion extends javax.swing.JFrame {

    /**
     * Creates new form complaint_Suggestion
     */
    public complaint_Suggestion() {
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

        panel1 = new java.awt.Panel();
        Home = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        userHome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        suggestionLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complaints and Suggestions");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(null);

        Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Home.setText("< Back");
        Home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        panel1.add(Home);
        Home.setBounds(40, 30, 110, 50);

        logo.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Home.png"))); // NOI18N
        logo.setText("R.M.S");
        panel1.add(logo);
        logo.setBounds(1130, 0, 149, 90);

        userHome.setBackground(new java.awt.Color(0, 102, 153));
        userHome.setOpaque(true);
        panel1.add(userHome);
        userHome.setBounds(0, 0, 1300, 100);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 310, 480, 260);

        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setText("Submit");
        panel1.add(submit);
        submit.setBounds(750, 558, 77, 50);

        suggestionLabel.setBackground(new java.awt.Color(204, 204, 204));
        suggestionLabel.setOpaque(true);
        panel1.add(suggestionLabel);
        suggestionLabel.setBounds(90, 180, 770, 450);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Base.png"))); // NOI18N
        panel1.add(background);
        background.setBounds(0, 100, 1300, 600);

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        new clientHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(complaint_Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(complaint_Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(complaint_Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(complaint_Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new complaint_Suggestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo;
    private java.awt.Panel panel1;
    private javax.swing.JButton submit;
    private javax.swing.JLabel suggestionLabel;
    private javax.swing.JLabel userHome;
    // End of variables declaration//GEN-END:variables
}
