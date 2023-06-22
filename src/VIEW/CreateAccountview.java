package VIEW;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CreateAccountview extends javax.swing.JFrame {

    public CreateAccountview() {
        initComponents();
        setExtendedState(NORMAL);

        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrptyp_acc = new javax.swing.ButtonGroup();
        btngrpint_for = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnhome = new javax.swing.JButton();
        btncustomermg = new javax.swing.JButton();
        btntransaction = new javax.swing.JButton();
        btntransachistory = new javax.swing.JButton();
        btnintrest = new javax.swing.JButton();
        btnloan = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtmidname = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtcitizenshipno = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphoneno = new javax.swing.JTextField();
        txtprofession = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtnationality = new javax.swing.JComboBox<>();
        txtdeposite = new javax.swing.JTextField();
        rb_crtacc = new javax.swing.JRadioButton();
        rb_fixacc = new javax.swing.JRadioButton();
        rb_savacc = new javax.swing.JRadioButton();
        rb_3m = new javax.swing.JRadioButton();
        tb_6m = new javax.swing.JRadioButton();
        rb_1year = new javax.swing.JRadioButton();
        rb_5int = new javax.swing.JRadioButton();
        rb_10int = new javax.swing.JRadioButton();
        rb_13int = new javax.swing.JRadioButton();
        btncreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MONEYPLEX");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setBackground(new java.awt.Color(42, 144, 174));
        btnhome.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnhome.setText("DASHBOARD");
        btnhome.setBorderPainted(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 50));

        btncustomermg.setBackground(new java.awt.Color(0, 255, 255));
        btncustomermg.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btncustomermg.setText("CUSTOMERS");
        btncustomermg.setBorderPainted(false);
        btncustomermg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomermgActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomermg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

        btntransaction.setBackground(new java.awt.Color(42, 144, 174));
        btntransaction.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btntransaction.setText("TRANSACTION");
        btntransaction.setBorderPainted(false);
        btntransaction.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btntransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransactionActionPerformed(evt);
            }
        });
        getContentPane().add(btntransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 50));

        btntransachistory.setBackground(new java.awt.Color(42, 144, 174));
        btntransachistory.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btntransachistory.setText("STATEMENT");
        btntransachistory.setBorderPainted(false);
        getContentPane().add(btntransachistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 150, 50));

        btnintrest.setBackground(new java.awt.Color(42, 144, 174));
        btnintrest.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnintrest.setText("INTREST");
        btnintrest.setBorderPainted(false);
        getContentPane().add(btnintrest, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 150, 50));

        btnloan.setBackground(new java.awt.Color(42, 144, 174));
        btnloan.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnloan.setText("LOAN");
        btnloan.setBorderPainted(false);
        getContentPane().add(btnloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 150, 50));

        btnreport.setBackground(new java.awt.Color(42, 144, 174));
        btnreport.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnreport.setText("MORE...");
        btnreport.setBorderPainted(false);
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, 50));

        jPanel1.setBackground(new java.awt.Color(4, 127, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("CREATE ACCOUNT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setBorderPainted(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("LOG OUT");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        jButton3.setBackground(new java.awt.Color(42, 144, 174));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setText("UPDATE ACCOUNT");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 50));

        jButton4.setBackground(new java.awt.Color(42, 144, 174));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton4.setText("ACCOUNT DETAILS");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/accountdetails.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 100));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("CUSTOMERS");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PROFESSION");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("PHONE NO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("E-MAIL");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("NATIONALITY");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CITIZENSHIP NO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DATE OF BIRTH");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("ADDRESS");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("LAST  NAME");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("MIDDLE NAME");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("FIRST NAME");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("DEPOSIT AMOUNT");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("ID NO:-");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("DATE");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("INTREST PERCENT");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("INTREST FOR:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("TYPE OF ACCOUNT:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));
        jPanel2.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, -1));
        jPanel2.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, -1));

        txtmidname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmidnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtmidname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, -1));
        jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, -1));
        jPanel2.add(txtcitizenshipno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 160, -1));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 140, -1));

        txtphoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenoActionPerformed(evt);
            }
        });
        jPanel2.add(txtphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 160, -1));
        jPanel2.add(txtprofession, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 160, -1));
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 160, -1));
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 130, -1));

        txtnationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEPAL", "INDIA", "CHINA", "BHUTAN", "PAKISTAN", "SRILANKA", "BANGLADESH", "AFGANISTAN", "USA", "AUSTRALIA", " " }));
        jPanel2.add(txtnationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 160, -1));
        jPanel2.add(txtdeposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 140, -1));

        btngrptyp_acc.add(rb_crtacc);
        rb_crtacc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_crtacc.setText("CURRENT ACCOUNT");
        rb_crtacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_crtaccActionPerformed(evt);
            }
        });
        jPanel2.add(rb_crtacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        btngrptyp_acc.add(rb_fixacc);
        rb_fixacc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_fixacc.setText("FIXED ACCOUNT");
        rb_fixacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fixaccActionPerformed(evt);
            }
        });
        jPanel2.add(rb_fixacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, -1));

        btngrptyp_acc.add(rb_savacc);
        rb_savacc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_savacc.setText("SAVING ACCOUNT");
        rb_savacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_savaccActionPerformed(evt);
            }
        });
        jPanel2.add(rb_savacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        btngrpint_for.add(rb_3m);
        rb_3m.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_3m.setText("3 MONTHS");
        rb_3m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_3mActionPerformed(evt);
            }
        });
        jPanel2.add(rb_3m, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        btngrpint_for.add(tb_6m);
        tb_6m.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_6m.setText("6 MONTHS");
        tb_6m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_6mActionPerformed(evt);
            }
        });
        jPanel2.add(tb_6m, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        btngrpint_for.add(rb_1year);
        rb_1year.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_1year.setText("1 YEAR");
        rb_1year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_1yearActionPerformed(evt);
            }
        });
        jPanel2.add(rb_1year, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        buttonGroup1.add(rb_5int);
        rb_5int.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_5int.setText("5%");
        rb_5int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_5intActionPerformed(evt);
            }
        });
        jPanel2.add(rb_5int, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 80, -1));

        buttonGroup1.add(rb_10int);
        rb_10int.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_10int.setText("10%");
        rb_10int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_10intActionPerformed(evt);
            }
        });
        jPanel2.add(rb_10int, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        buttonGroup1.add(rb_13int);
        rb_13int.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_13int.setText("13%");
        rb_13int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_13intActionPerformed(evt);
            }
        });
        jPanel2.add(rb_13int, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        btncreate.setBackground(new java.awt.Color(51, 204, 255));
        btncreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btncreate.setText("CREATE");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        jPanel2.add(btncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 860, 460));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactionActionPerformed
this.setVisible(false);
        Withdrawview ca= new Withdrawview();

       ca.setVisible(true);
    }//GEN-LAST:event_btntransactionActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
this.setVisible(false);
        DashBoardview ca= new DashBoardview();

       ca.setVisible(true);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btncustomermgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomermgActionPerformed

    }//GEN-LAST:event_btncustomermgActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.setVisible(false);
        AccountDetailview ca= new AccountDetailview();

       ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtmidnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmidnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmidnameActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtphonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenoActionPerformed

    private void rb_crtaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_crtaccActionPerformed
        type_acc="current account"; // TODO add your handling code here:
    }//GEN-LAST:event_rb_crtaccActionPerformed

    private void rb_fixaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_fixaccActionPerformed
        type_acc="fixed account";        // TODO add your handling code here:
    }//GEN-LAST:event_rb_fixaccActionPerformed

    private void rb_savaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_savaccActionPerformed
        type_acc="saving account";        // TODO add your handling code here:
    }//GEN-LAST:event_rb_savaccActionPerformed

    private void rb_3mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_3mActionPerformed
        int_for="3 months";        // TODO add your handling code here:
    }//GEN-LAST:event_rb_3mActionPerformed

    private void tb_6mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_6mActionPerformed
        int_for="6 months";   // TODO add your handling code here:
    }//GEN-LAST:event_tb_6mActionPerformed

    private void rb_1yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_1yearActionPerformed
        int_for="1 year";         // TODO add your handling code here:
    }//GEN-LAST:event_rb_1yearActionPerformed

    private void rb_5intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_5intActionPerformed
        int_per="5 %";        // TODO add your handling code here:
    }//GEN-LAST:event_rb_5intActionPerformed

    private void rb_10intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_10intActionPerformed
        int_per="10 %";        // TODO add your handling code here:
    }//GEN-LAST:event_rb_10intActionPerformed

    private void rb_13intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_13intActionPerformed
        int_per="13 %";        // TODO add your handling code here:
    }//GEN-LAST:event_rb_13intActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
//        Connection conn= DataConnection.dbconnect();
//        try
//        {
//            Statement stmt =conn.createStatement();
//            String sql ="insert into info values('"+txtid.getText()+"','"+txtfirstname.getText()+"','"+txtmidname.getText()+"','"+txtlastname.getText()+"','"+txtaddress.getText()+"','"+txtdob.getText()+"',"
//            + "'"+txtcitizenshipno.getText()+"','"+txtnationality.getSelectedItem().toString()+"','"+txtemail.getText()+"','"+txtphoneno.getText()+"','"+txtprofession.getText()+"'"
//            + ",'"+type_acc+"','"+int_for+"','"+int_per+"','"+txtdate.getText()+"','"+txtdeposite.getText()+"')";
//            stmt.executeUpdate(sql);
//            System.out.println("data inserted");
//            JOptionPane.showMessageDialog(this,"succefully inserted", "teacher", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//
//        }
    }//GEN-LAST:event_btncreateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
        UpdateAccountview ca= new UpdateAccountview();

       ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccountview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btncustomermg;
    private javax.swing.ButtonGroup btngrpint_for;
    private javax.swing.ButtonGroup btngrptyp_acc;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnintrest;
    private javax.swing.JButton btnloan;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btntransachistory;
    private javax.swing.JButton btntransaction;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rb_10int;
    private javax.swing.JRadioButton rb_13int;
    private javax.swing.JRadioButton rb_1year;
    private javax.swing.JRadioButton rb_3m;
    private javax.swing.JRadioButton rb_5int;
    private javax.swing.JRadioButton rb_crtacc;
    private javax.swing.JRadioButton rb_fixacc;
    private javax.swing.JRadioButton rb_savacc;
    private javax.swing.JRadioButton tb_6m;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcitizenshipno;
    public javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdeposite;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmidname;
    private javax.swing.JComboBox<String> txtnationality;
    private javax.swing.JTextField txtphoneno;
    private javax.swing.JTextField txtprofession;
    // End of variables declaration//GEN-END:variables
private String type_acc;
private String int_for;
private String int_per;
}
