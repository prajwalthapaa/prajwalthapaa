
package VIEW;

import MODEL.DataConnection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class newadmin extends javax.swing.JFrame {

    public newadmin() {
        initComponents();
        addPlaceholderstyle(txteid);
        addPlaceholderstyle(txtefname);
        addPlaceholderstyle(txtelname);
        addPlaceholderstyle(txtephone);
        addPlaceholderstyle(txteemail);
        addPlaceholderstyle(txtepassword);
        
    }
    public void addPlaceholderstyle (JTextField textField) { 
     Font font =textField.getFont();
     font =font.deriveFont (Font.ITALIC); 
     textField.setFont (font);
     textField.setForeground (Color.gray);
        }//font color
    public void removePlaceholderStyle (JTextField textField) {
    Font font= textField.getFont();
    font =font.deriveFont (Font. PLAIN|Font. BOLD);
    textField.setFont (font);
    textField.setForeground (Color.black);
        } //font color
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txteid = new javax.swing.JTextField();
        txtefname = new javax.swing.JTextField();
        txtelname = new javax.swing.JTextField();
        txtephone = new javax.swing.JTextField();
        txteemail = new javax.swing.JTextField();
        txtepassword = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NEW ADMIN REGISTER");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txteid.setBackground(new java.awt.Color(223, 224, 229));
        txteid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txteid.setText("UNIQUE ID");
        txteid.setBorder(null);
        txteid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txteidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txteidFocusLost(evt);
            }
        });
        txteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteidActionPerformed(evt);
            }
        });
        getContentPane().add(txteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 112, 90, 30));

        txtefname.setBackground(new java.awt.Color(223, 224, 229));
        txtefname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtefname.setText("FIRST NAME");
        txtefname.setBorder(null);
        txtefname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtefnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtefnameFocusLost(evt);
            }
        });
        txtefname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtefnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtefname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 120, 30));

        txtelname.setBackground(new java.awt.Color(223, 224, 229));
        txtelname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtelname.setText("LAST NAME");
        txtelname.setBorder(null);
        txtelname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtelnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtelnameFocusLost(evt);
            }
        });
        getContentPane().add(txtelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 140, 30));

        txtephone.setBackground(new java.awt.Color(223, 224, 229));
        txtephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtephone.setText("PHONE NO");
        txtephone.setBorder(null);
        txtephone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtephoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtephoneFocusLost(evt);
            }
        });
        txtephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtephoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 222, 240, 30));

        txteemail.setBackground(new java.awt.Color(223, 224, 229));
        txteemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txteemail.setText("E-MAIL ADDRESS");
        txteemail.setBorder(null);
        txteemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txteemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txteemailFocusLost(evt);
            }
        });
        getContentPane().add(txteemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 275, 250, 30));

        txtepassword.setBackground(new java.awt.Color(223, 224, 229));
        txtepassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtepassword.setText("PASSWORD");
        txtepassword.setBorder(null);
        txtepassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtepasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtepasswordFocusLost(evt);
            }
        });
        getContentPane().add(txtepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 260, 30));

        btnregister.setBackground(new java.awt.Color(223, 224, 229));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnregister.setText("REGISTER");
        btnregister.setBorder(null);
        btnregister.setBorderPainted(false);
        btnregister.setContentAreaFilled(false);
        btnregister.setDoubleBuffered(true);
        btnregister.setFocusTraversalPolicyProvider(true);
        btnregister.setFocusable(false);
        btnregister.setHideActionText(true);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 90, 30));

        jButton1.setBackground(new java.awt.Color(223, 224, 229));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("GO BACK TO LOGIN");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 437, 160, 30));

        jTextField2.setBackground(new java.awt.Color(0, 51, 102));
        jTextField2.setForeground(new java.awt.Color(0, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("MONEYPLEX");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/FINALREGIST.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 890, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtephoneActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
       Connection conn= DataConnection.dbconnect();
   try
   {
       Statement stmt =conn.createStatement();
       String sql ="insert into e_info values('"+txteid.getText()+"','"+txtefname.getText()+"','"+txtelname.getText()+"','"+txtephone.getText()+"','"+txteemail.getText()+"','"+txtepassword.getText()+"')";
       stmt.executeUpdate(sql);
       System.out.println("data inserted");
       JOptionPane.showMessageDialog(this,"SUCCESSFULLY REGISTERED", "EMPLOYEE", JOptionPane.INFORMATION_MESSAGE);
        
    }                                           
    catch(Exception e)
         {
             System.out.println(e.getMessage());
             
         }
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteidActionPerformed

    private void txteidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteidFocusGained
       if(txteid.getText().equals("UNIQUE ID")){
           txteid.setText(null);
           txteid.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txteid);
       }
    }//GEN-LAST:event_txteidFocusGained

    private void txtefnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtefnameFocusGained
        if(txtefname.getText().equals("FIRST NAME")){
           txtefname.setText(null);
           txtefname.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtefname);
       }
    }//GEN-LAST:event_txtefnameFocusGained

    private void txtelnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtelnameFocusGained
        if(txtelname.getText().equals("LAST NAME")){
           txtelname.setText(null);
           txtelname.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtelname);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txtelnameFocusGained

    private void txtephoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtephoneFocusGained
    if(txtephone.getText().equals("PHONE NO")){
           txtephone.setText(null);
           txtephone.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtephone);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txtephoneFocusGained

    private void txteemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteemailFocusGained
    if(txteemail.getText().equals("E-MAIL ADDRESS")){
           txteemail.setText(null);
           txteemail.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txteemail);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txteemailFocusGained

    private void txtepasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtepasswordFocusGained
    if(txtepassword.getText().equals("PASSWORD")){
           txtepassword.setText(null);
           txtepassword.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtepassword);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txtepasswordFocusGained

    private void txteidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteidFocusLost
    if(txteid.getText().length()==0){
        addPlaceholderstyle(txteid);
        txteid.setText("UNIQUE ID");    
       }
    }//GEN-LAST:event_txteidFocusLost

    private void txtefnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtefnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtefnameActionPerformed

    private void txtefnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtefnameFocusLost
    if(txtefname.getText().length()==0){
        addPlaceholderstyle(txtefname);
        txtefname.setText("FIRST NAME");    
        }
    }//GEN-LAST:event_txtefnameFocusLost

    private void txtelnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtelnameFocusLost
    if(txtelname.getText().length()==0){
        addPlaceholderstyle(txtelname);
        txtelname.setText("LAST NAME");    
        }    }//GEN-LAST:event_txtelnameFocusLost

    private void txtephoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtephoneFocusLost
if(txtephone.getText().length()==0){
        addPlaceholderstyle(txtephone);
        txtephone.setText("PHONE NO");    
        }    }//GEN-LAST:event_txtephoneFocusLost

    private void txteemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteemailFocusLost
if(txteemail.getText().length()==0){
        addPlaceholderstyle(txteemail);
        txteemail.setText("E-MAIL ADDRESS");    
        }    }//GEN-LAST:event_txteemailFocusLost

    private void txtepasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtepasswordFocusLost
if(txtepassword.getText().length()==0){
        addPlaceholderstyle(txtepassword);
        txtepassword.setText("PASSWORD");    
        }    }//GEN-LAST:event_txtepasswordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    LoginView s=new LoginView();
            s.setVisible(true);
            this.hide();    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txteemail;
    private javax.swing.JTextField txtefname;
    private javax.swing.JTextField txteid;
    private javax.swing.JTextField txtelname;
    private javax.swing.JTextField txtepassword;
    private javax.swing.JTextField txtephone;
    // End of variables declaration//GEN-END:variables
}
