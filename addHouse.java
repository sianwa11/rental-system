/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmanagement;

import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class addHouse extends javax.swing.JFrame {

    //Creates new form addHouse

    public addHouse() {
        initComponents();
    }

    /**
     *
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * PASTE DATABASE CONNECTION CODE
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        Home = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        confirm_upload = new javax.swing.JButton();
        upload_picture = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        userHome = new javax.swing.JLabel();
        houseID = new javax.swing.JTextField();
        houseId = new javax.swing.JLabel();
        confirm_upload1 = new javax.swing.JButton();
        userDetail1 = new javax.swing.JLabel();
        house_picture = new javax.swing.JLabel();
        houseType = new javax.swing.JComboBox<>();
        houseType1 = new javax.swing.JLabel();
        houseNum1 = new javax.swing.JLabel();
        maxRent = new javax.swing.JLabel();
        rentMax = new javax.swing.JTextField();
        numberHouse1 = new javax.swing.JTextField();
        housePane = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        userDetail = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Property records");
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

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 0, 0));
        delete.setText("Delete record");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        panel1.add(delete);
        delete.setBounds(480, 520, 120, 60);

        confirm_upload.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm_upload.setText("Complete");
        confirm_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_uploadActionPerformed(evt);
            }
        });
        panel1.add(confirm_upload);
        confirm_upload.setBounds(480, 360, 110, 60);

        upload_picture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upload_picture.setText("Property Picture:");
        panel1.add(upload_picture);
        upload_picture.setBounds(720, 120, 120, 30);

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        panel1.add(update);
        update.setBounds(480, 440, 90, 60);

        userHome.setBackground(new java.awt.Color(0, 102, 153));
        userHome.setOpaque(true);
        panel1.add(userHome);
        userHome.setBounds(0, 0, 1300, 100);

        houseID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(houseID);
        houseID.setBounds(150, 130, 140, 29);

        houseId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseId.setText("House ID:");
        panel1.add(houseId);
        houseId.setBounds(60, 140, 110, 17);

        confirm_upload1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm_upload1.setText("Upload");
        confirm_upload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_upload1ActionPerformed(evt);
            }
        });
        panel1.add(confirm_upload1);
        confirm_upload1.setBounds(840, 120, 180, 30);

        userDetail1.setBackground(new java.awt.Color(153, 153, 153));
        userDetail1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userDetail1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userDetail1.setOpaque(true);
        panel1.add(userDetail1);
        userDetail1.setBounds(710, 110, 580, 50);

        house_picture.setBackground(new java.awt.Color(204, 204, 204));
        house_picture.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 153)));
        house_picture.setOpaque(true);
        panel1.add(house_picture);
        house_picture.setBounds(710, 110, 580, 370);

        houseType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flat", "Masionette", "Bungalow" }));
        houseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseTypeActionPerformed(evt);
            }
        });
        panel1.add(houseType);
        houseType.setBounds(160, 180, 130, 27);

        houseType1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseType1.setText("House Type:");
        panel1.add(houseType1);
        houseType1.setBounds(50, 180, 110, 17);

        houseNum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseNum1.setText("House Number:");
        panel1.add(houseNum1);
        houseNum1.setBounds(40, 220, 110, 17);

        maxRent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxRent.setText("Max Rent:");
        panel1.add(maxRent);
        maxRent.setBounds(70, 260, 90, 17);

        rentMax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(rentMax);
        rentMax.setBounds(160, 260, 130, 29);

        numberHouse1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberHouse1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        numberHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberHouse1ActionPerformed(evt);
            }
        });
        panel1.add(numberHouse1);
        numberHouse1.setBounds(160, 220, 70, 30);

        houseTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House ID", "House Type", "House Number", "Max Rent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        housePane.setViewportView(houseTable);
        if (houseTable.getColumnModel().getColumnCount() > 0) {
            houseTable.getColumnModel().getColumn(0).setResizable(false);
            houseTable.getColumnModel().getColumn(1).setResizable(false);
            houseTable.getColumnModel().getColumn(2).setResizable(false);
            houseTable.getColumnModel().getColumn(3).setResizable(false);
        }

        panel1.add(housePane);
        housePane.setBounds(10, 310, 460, 340);

        userDetail.setBackground(new java.awt.Color(204, 204, 204));
        userDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userDetail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userDetail.setOpaque(true);
        panel1.add(userDetail);
        userDetail.setBounds(20, 110, 420, 190);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalmanagement/Base.png"))); // NOI18N
        panel1.add(background);
        background.setBounds(0, 100, 1300, 600);

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        new supervisorHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void numberHouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberHouse1ActionPerformed

    }//GEN-LAST:event_numberHouse1ActionPerformed
//NEW CONFIRM,DELETE button
    private void confirm_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_uploadActionPerformed
        DefaultTableModel model=(DefaultTableModel)houseTable.getModel();
        //checks whether there is input in respective textfields
        if(!houseID.getText().trim().equals("")&& !houseType.getSelectedItem().equals("")&&!numberHouse1.getText().trim().equals("")&&!rentMax.getText().trim().equals(""))
        {model.addRow(new String[]{houseID.getText(),houseType.getSelectedItem().toString(),numberHouse1.getText(),rentMax.getText()});
    }                                       
        else{//displays error message if textfields are left empty
            JOptionPane.showMessageDialog(null,"Fields cannot be left empty");
        }
    }//GEN-LAST:event_confirm_uploadActionPerformed

    private void confirm_upload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_upload1ActionPerformed
        //runs filechooser
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images","jpg","png");
        File f=chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        chooser.addChoosableFileFilter(filter);
        //adds new background 
        ImageIcon icon=new ImageIcon(filename);
        house_picture.setIcon(icon);
        
    }//GEN-LAST:event_confirm_upload1ActionPerformed

    private void houseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseTypeActionPerformed

    }//GEN-LAST:event_houseTypeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel model=(DefaultTableModel)houseTable.getModel();
        //deletes selected row containing records
        model.removeRow(houseTable.getSelectedRow());
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addHouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JLabel background;
    private javax.swing.JButton confirm_upload;
    private javax.swing.JButton confirm_upload1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField houseID;
    private javax.swing.JLabel houseId;
    private javax.swing.JLabel houseNum1;
    private javax.swing.JScrollPane housePane;
    private javax.swing.JTable houseTable;
    private javax.swing.JComboBox<String> houseType;
    private javax.swing.JLabel houseType1;
    private javax.swing.JLabel house_picture;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel maxRent;
    private javax.swing.JTextField numberHouse1;
    private java.awt.Panel panel1;
    private javax.swing.JTextField rentMax;
    private javax.swing.JButton update;
    private javax.swing.JLabel upload_picture;
    private javax.swing.JLabel userDetail;
    private javax.swing.JLabel userDetail1;
    private javax.swing.JLabel userHome;
    // End of variables declaration//GEN-END:variables
}
