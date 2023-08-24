/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

public class RegisterDoctorsFrame extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcEmployeeId = new javax.swing.JComboBox<>();
        txtDoctorName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        repwd = new javax.swing.JPasswordField();
        jcGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtSpecilist = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Doctor Frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(234, 243, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor's Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(0, 102, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Employee ID");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 25));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Doctor Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Login ID");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 23));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Password");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 20));

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Retype Password");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 23));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Gender");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 23));

        jcEmployeeId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmployeeIdActionPerformed(evt);
            }
        });
        jPanel4.add(jcEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 121, -1));

        txtDoctorName.setEditable(false);
        txtDoctorName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 121, -1));

        txtLoginId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 121, -1));

        pw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 121, -1));

        repwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(repwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 121, -1));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        jPanel4.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 121, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Doctor Id");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 139, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Contact no.");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 148, 23));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Qualification");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 109, 23));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Specialist");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 109, 21));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Email ID");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 109, 23));

        txtDoctorId.setEditable(false);
        txtDoctorId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 121, -1));

        txtContactNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 121, -1));

        txtQualification.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 121, -1));

        txtSpecilist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtSpecilist, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 121, -1));

        txtEmailId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 121, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 711, 320));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 220, 243));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Add Patient Frame");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 237, 35));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 153, 153));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 210, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 100, -1));

        btnLogout1.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout1.setText("Logout");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 100, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1010, 380));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel27.setText("Sanjeevani  Application ");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 590, 12));

        jSeparator1.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 620, 70));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1010, 560));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
    
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
     
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void jcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmployeeIdActionPerformed
        
    }//GEN-LAST:event_jcEmployeeIdActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcEmployeeId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField repwd;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSpecilist;
    // End of variables declaration//GEN-END:variables
 
  
}
