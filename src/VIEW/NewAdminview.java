
package VIEW;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import MODEL.*;
import CONTROLLER.*;
import java.awt.event.ActionListener;
public class NewAdminview extends javax.swing.JFrame {
    NewAdminmodel model1;
    public NewAdminview() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("back ground.jpg")));
        Image img1=  myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
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
     textField.setForeground (Color.black);
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

        txtefname = new javax.swing.JTextField();
        txtelname = new javax.swing.JTextField();
        txtephone = new javax.swing.JTextField();
        txteemail = new javax.swing.JTextField();
        txtepassword = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NEW ADMIN REGISTER");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(txtefname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 30));

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
        getContentPane().add(txtelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, 30));

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
        getContentPane().add(txtephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 222, 250, 30));

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
        getContentPane().add(txtepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 250, 30));

        btnregister.setBackground(new java.awt.Color(223, 224, 229));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTER");
        btnregister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnregister.setContentAreaFilled(false);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 30));

        jButton1.setBackground(new java.awt.Color(223, 224, 229));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GO BACK TO LOGIN");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 160, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 265, 50));

        jLabel3.setBackground(new java.awt.Color(12, 103, 130));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 360, 480));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 900, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtephoneActionPerformed

    public NewAdminmodel getMymodel()
    {
        model1=new NewAdminmodel(Integer.parseInt(txtephone.getText()),txtefname.getText(),txtelname.getText(),txteemail.getText(),txtepassword.getText());
        return model1;
    }
     public void showMessage(String msg)
    {
        JOptionPane.showMessageDialog(this,msg);
    }
    public void addLoginListner(ActionListener log)
{
    btnregister.addActionListener(log);
}
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
    NewAdmincontroller na= new NewAdmincontroller(this);
    }//GEN-LAST:event_btnregisterActionPerformed

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

    private void txtefnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtefnameActionPerformed

    }//GEN-LAST:event_txtefnameActionPerformed
    public void resetme(){
    txtefname.setText("");
    txtepassword.setText(" ");
    txteemail.setText(" ");
    txtelname.setText(" ");
    txtephone.setText(" ");
    }

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
                new NewAdminview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txteemail;
    private javax.swing.JTextField txtefname;
    private javax.swing.JTextField txtelname;
    private javax.swing.JTextField txtepassword;
    private javax.swing.JTextField txtephone;
    // End of variables declaration//GEN-END:variables
}
