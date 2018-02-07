/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmanagement;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author EDALIA. M
 */
public class addHouse extends javax.swing.JFrame {

    /**
     * Creates new form addHouse
     */
    public addHouse() {
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
        confirm_upload = new javax.swing.JButton();
        upload_picture = new javax.swing.JLabel();
        userHome = new javax.swing.JLabel();
        houseType = new javax.swing.JTextField();
        houseID = new javax.swing.JTextField();
        houseId = new javax.swing.JLabel();
        confirm_upload1 = new javax.swing.JButton();
        userDetail1 = new javax.swing.JLabel();
        house_picture = new javax.swing.JLabel();
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

        confirm_upload.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm_upload.setText("Complete");
        confirm_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_uploadActionPerformed(evt);
            }
        });
        panel1.add(confirm_upload);
        confirm_upload.setBounds(470, 400, 190, 40);

        upload_picture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upload_picture.setText("Property Picture:");
        panel1.add(upload_picture);
        upload_picture.setBounds(40, 390, 120, 30);

        userHome.setBackground(new java.awt.Color(0, 102, 153));
        userHome.setOpaque(true);
        panel1.add(userHome);
        userHome.setBounds(0, 0, 1300, 100);

        houseType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(houseType);
        houseType.setBounds(150, 200, 150, 29);

        houseID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(houseID);
        houseID.setBounds(150, 150, 140, 29);

        houseId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseId.setText("House ID:");
        panel1.add(houseId);
        houseId.setBounds(60, 160, 110, 17);

        confirm_upload1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm_upload1.setText("Upload");
        confirm_upload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_upload1ActionPerformed(evt);
            }
        });
        panel1.add(confirm_upload1);
        confirm_upload1.setBounds(160, 390, 180, 30);

        userDetail1.setBackground(new java.awt.Color(153, 153, 153));
        userDetail1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userDetail1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userDetail1.setOpaque(true);
        panel1.add(userDetail1);
        userDetail1.setBounds(30, 390, 370, 60);

        house_picture.setBackground(new java.awt.Color(204, 204, 204));
        house_picture.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 153)));
        house_picture.setOpaque(true);
        panel1.add(house_picture);
        house_picture.setBounds(20, 390, 440, 290);

        houseType1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseType1.setText("House Type:");
        panel1.add(houseType1);
        houseType1.setBounds(50, 200, 110, 17);

        houseNum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        houseNum1.setText("House Number:");
        panel1.add(houseNum1);
        houseNum1.setBounds(40, 240, 110, 17);

        maxRent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxRent.setText("Max Rent:");
        panel1.add(maxRent);
        maxRent.setBounds(70, 280, 90, 17);

        rentMax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(rentMax);
        rentMax.setBounds(160, 280, 130, 29);

        numberHouse1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberHouse1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        numberHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberHouse1ActionPerformed(evt);
            }
        });
        panel1.add(numberHouse1);
        numberHouse1.setBounds(160, 240, 70, 30);

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
        housePane.setBounds(586, 120, 560, 250);

        userDetail.setBackground(new java.awt.Color(204, 204, 204));
        userDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userDetail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userDetail.setOpaque(true);
        panel1.add(userDetail);
        userDetail.setBounds(20, 130, 420, 230);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_numberHouse1ActionPerformed

    private void confirm_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_uploadActionPerformed
        DefaultTableModel model=(DefaultTableModel)houseTable.getModel();
        model.addRow(new Object[]{houseID.getText(),houseType.getText(),numberHouse1.getText(),rentMax.getText()});
    }//GEN-LAST:event_confirm_uploadActionPerformed

    private void confirm_upload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_upload1ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images","jpg","png");
        File f=chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        chooser.addChoosableFileFilter(filter);
        ImageIcon icon=new ImageIcon(filename);
        house_picture.setIcon(icon);
        
    }//GEN-LAST:event_confirm_upload1ActionPerformed

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
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JTextField houseID;
    private javax.swing.JLabel houseId;
    private javax.swing.JLabel houseNum1;
    private javax.swing.JScrollPane housePane;
    private javax.swing.JTable houseTable;
    private javax.swing.JTextField houseType;
    private javax.swing.JLabel houseType1;
    private javax.swing.JLabel house_picture;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel maxRent;
    private javax.swing.JTextField numberHouse1;
    private java.awt.Panel panel1;
    private javax.swing.JTextField rentMax;
    private javax.swing.JLabel upload_picture;
    private javax.swing.JLabel userDetail;
    private javax.swing.JLabel userDetail1;
    private javax.swing.JLabel userHome;
    // End of variables declaration//GEN-END:variables
}