
package VIEW;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class DashBoard extends javax.swing.JFrame
            {

    public DashBoard() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("DASHBOARD1.png")));
        Image img1=  myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btndeposit1 = new javax.swing.JButton();
        btnwithdraw1 = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btncrtacc1 = new javax.swing.JButton();
        btncrtacc = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK MANAGEMENT SYSYTEM");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(42, 144, 174));
        jButton7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("MORE....");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 240, 70));

        jButton5.setBackground(new java.awt.Color(42, 144, 174));
        jButton5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("DELETE  ACCOUNT");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 70));

        jButton4.setBackground(new java.awt.Color(42, 144, 174));
        jButton4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ACCOUNT DETAILS");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 60));

        btndeposit1.setBackground(new java.awt.Color(42, 144, 174));
        btndeposit1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btndeposit1.setForeground(new java.awt.Color(255, 255, 255));
        btndeposit1.setText("DEPOSIT MONEY");
        btndeposit1.setBorder(null);
        btndeposit1.setBorderPainted(false);
        btndeposit1.setContentAreaFilled(false);
        btndeposit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeposit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btndeposit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 70));

        btnwithdraw1.setBackground(new java.awt.Color(42, 144, 174));
        btnwithdraw1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btnwithdraw1.setForeground(new java.awt.Color(255, 255, 255));
        btnwithdraw1.setText("WITHDRAW MONEY");
        btnwithdraw1.setBorder(null);
        btnwithdraw1.setBorderPainted(false);
        btnwithdraw1.setContentAreaFilled(false);
        btnwithdraw1.setFocusPainted(false);
        btnwithdraw1.setFocusable(false);
        btnwithdraw1.setName(""); // NOI18N
        getContentPane().add(btnwithdraw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 60));

        btnlogout.setBackground(new java.awt.Color(179, 219, 231));
        btnlogout.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/logout_icon_151219.png"))); // NOI18N
        btnlogout.setText("LOG OUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        btncrtacc1.setBackground(new java.awt.Color(42, 144, 174));
        btncrtacc1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btncrtacc1.setForeground(new java.awt.Color(255, 255, 255));
        btncrtacc1.setText("CREATE ACCOUNT");
        btncrtacc1.setBorder(null);
        btncrtacc1.setBorderPainted(false);
        btncrtacc1.setContentAreaFilled(false);
        btncrtacc1.setFocusable(false);
        btncrtacc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrtacc1ActionPerformed(evt);
            }
        });
        getContentPane().add(btncrtacc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 70));

        btncrtacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/createaccountt.jpg"))); // NOI18N
        btncrtacc.setBorder(null);
        btncrtacc.setBorderPainted(false);
        btncrtacc.setContentAreaFilled(false);
        btncrtacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrtaccActionPerformed(evt);
            }
        });
        getContentPane().add(btncrtacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/depositcash.jpg"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/withdraw.jpg"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/accountdetails.jpg"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/transactionhistory.jpg"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/transfercash.jpg"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/calculator.jpg"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/currencyexchange.jpg"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/deleteaccount.jpg"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1222, 665));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeposit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeposit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeposit1ActionPerformed

    private void btncrtacc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrtacc1ActionPerformed
        this.setVisible(true);
        CreateAccount CA=new CreateAccount();
        CA.setVisible(true);
        //             this.hide();
    }//GEN-LAST:event_btncrtacc1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
AccountDetails Ad= new AccountDetails();
Ad.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        this.setVisible(false);
        new LoginView().setVisible(true);
        //System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btncrtaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrtaccActionPerformed
        this.setVisible(true);
        CreateAccount CA=new CreateAccount();
    }//GEN-LAST:event_btncrtaccActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncrtacc;
    private javax.swing.JButton btncrtacc1;
    private javax.swing.JButton btndeposit1;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnwithdraw1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
