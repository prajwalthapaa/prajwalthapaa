/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;
import MODEL.DataConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class AccountDetails extends javax.swing.JFrame {

    public AccountDetails() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FIRST NAME", "LAST NAME", "ADDRESS", "DOB", "CITIZENSHIP", "COUNTRY", "EMAIL", "PHONE", "ACCOUNT TYP", "INTREST FOR", "INTREST PERCENT", "CREATED DATE", "DEPOSIT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("GET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(531, 531, 531)
                .addComponent(jButton1)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
        Connection conn= DataConnection.dbconnect();
           DefaultTableModel tblmodel1=(DefaultTableModel)jTable1.getModel();

            tblmodel1.setRowCount(0);

        try {
            Statement stmt =conn.createStatement();
            String sql= "select * from info";
             ResultSet rs= stmt.executeQuery(sql);
            while(rs.next()){
            String id = String.valueOf(rs.getInt("id"));
            String fname = String.valueOf(rs.getString("fname"));
            String lname = String.valueOf(rs.getString("lname"));
            String address = String.valueOf(rs.getString("address"));
            String dob = String.valueOf(rs.getString("dob"));
            String citizenship = String.valueOf(rs.getString("citizenship"));
            String nationality = String.valueOf(rs.getString("nationality"));
            String email = String.valueOf(rs.getString("email"));
            String phone = String.valueOf(rs.getString("phone"));
            String account_type = String.valueOf(rs.getString("typeaccount"));
            String intrest_for = String.valueOf(rs.getString("intfor"));
            String intrest_per = String.valueOf(rs.getString("intpercent"));
            String create_date = String.valueOf(rs.getString("crt_date"));
            String deposit = String.valueOf(rs.getString("deposit"));

            
            String tbdata[]={id,fname,lname,address,dob,citizenship,nationality,email,phone,account_type,intrest_for,intrest_per,create_date,deposit};
                DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
                tblmodel.addRow(tbdata);
                
        }
        conn.close();
    }                                           
    catch(Exception e)
         {
             System.out.println(e.getMessage());
             
         }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
