
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
public class Reg_Host extends javax.swing.JFrame {

    /**
     * Creates new form Reg_Host
     */
    public Reg_Host() {
        initComponents();
        setSize(800, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Happy Holidays");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
logo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("logo.jpeg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        txt_acc_type.setSelectedItem("Null");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    int x =  Login_Form.special_person_id;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_clr = new javax.swing.JButton();
        btn_reg1 = new javax.swing.JButton();
        txt_bank = new javax.swing.JTextField();
        txt_acc_type = new javax.swing.JComboBox<>();
        txt_acc_no = new javax.swing.JTextField();
        alab = new javax.swing.JLabel();
        nlab = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menu_cust = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_book = new javax.swing.JMenu();
        menu_rent = new javax.swing.JMenu();
        menu_profile = new javax.swing.JMenu();
        menu_logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(181, 240, 233));

        logo.setText("jLabel1");

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel13.setText("Account Number");

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setText("Bank Name");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel15.setText("Account Type");

        btn_clr.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_clr.setText("Clear");
        btn_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clrActionPerformed(evt);
            }
        });

        btn_reg1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_reg1.setText("Register");
        btn_reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg1ActionPerformed(evt);
            }
        });

        txt_bank.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bankKeyReleased(evt);
            }
        });

        txt_acc_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings", "Current", "Null" }));

        txt_acc_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_acc_noKeyReleased(evt);
            }
        });

        alab.setForeground(new java.awt.Color(231, 20, 50));

        nlab.setForeground(new java.awt.Color(231, 20, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txt_acc_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_bank, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(alab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(nlab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btn_reg1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btn_clr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nlab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_acc_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reg1)
                    .addComponent(btn_clr))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        menu_cust.setText("Register As Customer");
        menu_cust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_custMouseClicked(evt);
            }
        });
        jMenuBar2.add(menu_cust);

        jMenu3.setText("Register As Host");
        jMenuBar2.add(jMenu3);

        menu_book.setText("Book A Home");
        menu_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_bookMouseClicked(evt);
            }
        });
        jMenuBar2.add(menu_book);

        menu_rent.setText("Rent A Home");
        menu_rent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_rentMouseClicked(evt);
            }
        });
        jMenuBar2.add(menu_rent);

        menu_profile.setText("Update Profile");
        menu_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_profileMouseClicked(evt);
            }
        });
        jMenuBar2.add(menu_profile);

        menu_logout.setText("LogOut");
        menu_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_logoutMouseClicked(evt);
            }
        });
        jMenuBar2.add(menu_logout);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clrActionPerformed
        txt_acc_no.setText(null);
        txt_bank.setText(null);
        txt_acc_type.setSelectedItem("Null");
    }//GEN-LAST:event_btn_clrActionPerformed

    private void btn_reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg1ActionPerformed
        // TODO add your handling code here:
        String q1 = "select * from host where pers_id = " + Login_Form.special_person_id;
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement(q1);
            ResultSet rs = ps.executeQuery();
            if(rs.next() != false ) {
                JOptionPane.showMessageDialog(null, "You already have registered as a Host");
            }
            else {
                if(Login_Form.special_account_type.equals("Host")) {
                    String sql = "insert into host (pers_id, account_no, bank_name, account_type) values (" + x + ","+ txt_acc_no.getText() + ",'" + txt_bank.getText() + "','" + (String)txt_acc_type.getSelectedItem() + "')";

                    try {
                        Connection conn = MysqlConnect.ConnectDb();
                        Statement st = conn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Registration Successful");
                    }
                    catch(SQLException ex) {
                        System.out.println("Insert Error" + ex);
                    }

                    this.setVisible(false);
                    new welcome().setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "You have not signed up as Host", "Access Denied", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_reg1ActionPerformed

    private void menu_custMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_custMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Customer")) {
            this.setVisible(false);
            new Reg_Customer().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in Customer", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_custMouseClicked

    private void menu_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_bookMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Customer")) {
            this.setVisible(false);
            new Book_Home().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in as Host", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_bookMouseClicked

    private void menu_rentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_rentMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Host")) {
            this.setVisible(false);
            new Rent_Home().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in as Host", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_rentMouseClicked

    private void menu_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_profileMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Customer")) {
            this.setVisible(false);
            new Update_Profile().setVisible(true);
         }
         else {
            this.setVisible(false);
            new Update_Profile_Host().setVisible(true);
        }
    }//GEN-LAST:event_menu_profileMouseClicked

    private void menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_logoutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Login_Form().setVisible(true);
    }//GEN-LAST:event_menu_logoutMouseClicked

    private void txt_acc_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_acc_noKeyReleased
        // TODO add your handling code here:
        String acc_regax="^[0-9]{16}$";
        Pattern pat=Pattern.compile(acc_regax);
        Matcher match=pat.matcher(txt_acc_no.getText());
        if(!match.matches())
        {
            alab.setText("Please Enter Valid Account Number");
        }
        else
        {
            alab.setText(" ");
        }
    }//GEN-LAST:event_txt_acc_noKeyReleased

    private void txt_bankKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bankKeyReleased
        // TODO add your handling code here:
        String fname_regax="^[A_Za-z]{1,20}$";
        Pattern pat=Pattern.compile(fname_regax);
        Matcher match=pat.matcher(txt_bank.getText());
        if(!match.matches())
        {
            nlab.setText("Please Enter Valid Bank Name");
        }
        else
        {
            nlab.setText(" ");
        }
    }//GEN-LAST:event_txt_bankKeyReleased

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
            java.util.logging.Logger.getLogger(Reg_Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg_Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg_Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg_Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg_Host().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alab;
    private javax.swing.JButton btn_clr;
    private javax.swing.JButton btn_reg1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenu menu_book;
    private javax.swing.JMenu menu_cust;
    private javax.swing.JMenu menu_logout;
    private javax.swing.JMenu menu_profile;
    private javax.swing.JMenu menu_rent;
    private javax.swing.JLabel nlab;
    private javax.swing.JTextField txt_acc_no;
    private javax.swing.JComboBox<String> txt_acc_type;
    private javax.swing.JTextField txt_bank;
    // End of variables declaration//GEN-END:variables
}
