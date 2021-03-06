
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
public class Update_Profile extends javax.swing.JFrame {

    /**
     * Creates new form Update_Profile
     */
    public Update_Profile() {
        initComponents();
        setSize(800, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Happy Holidays");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        logo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("logo.jpeg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        display();
    }
    
    public void display() {
        String sql = "select * from person where person_id = " + Login_Form.special_person_id;
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                txt_fname.setText(rs.getString(2));
                txt_lname.setText(rs.getString(3));
                txt_email.setText(rs.getString(4));
                txt_password.setText(rs.getString(5));
                txt_dob.setText(rs.getString(6));
                txt_gender.setSelectedItem(rs.getString(7));
                txt_phone.setText(rs.getString(9));
                txt_user.setText(rs.getString(8));
            }
        }
        catch(SQLException ex) {
            System.out.println("Find Person Error" + ex);
        }
        
        String sql1 = "select * from customer where person_id = " + Login_Form.special_person_id;
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement(sql1);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                txt_c_name.setText(rs.getString(3));
                txt_c_no.setText(rs.getString(4));
            
            }
        }
        catch(SQLException ex) {
            System.out.println("Find Person Error" + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        txt_lname = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_c_name = new javax.swing.JTextField();
        txt_c_no = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        btn_show = new javax.swing.JButton();
        txt_gender = new javax.swing.JComboBox<>();
        nlab = new javax.swing.JLabel();
        nlab1 = new javax.swing.JLabel();
        plab = new javax.swing.JLabel();
        phlab = new javax.swing.JLabel();
        nlab2 = new javax.swing.JLabel();
        nlab3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cust = new javax.swing.JMenu();
        menu_host = new javax.swing.JMenu();
        menu_book = new javax.swing.JMenu();
        menu_rent = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        menu_logout = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(194, 238, 231));

        logo.setText("jLabel1");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setText("Your Profile");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setText("Email");

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel13.setText("Password");

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setText("Name");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel15.setText("Gender");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setText("Phone Number");

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel17.setText("User Type");

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel18.setText("Name On Card");

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel19.setText("Date Of Birth");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel20.setText("Card Number");

        btn_update.setText("Update Profile");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete Account");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_email.setEditable(false);

        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_fnameKeyReleased(evt);
            }
        });

        txt_dob.setEditable(false);

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phoneKeyReleased(evt);
            }
        });

        txt_user.setEditable(false);

        txt_c_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_c_nameKeyReleased(evt);
            }
        });

        txt_c_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_c_noKeyReleased(evt);
            }
        });

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        btn_show.setText("Show All Bookings");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        txt_gender.setEditable(true);
        txt_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        nlab1.setForeground(new java.awt.Color(232, 31, 31));

        plab.setForeground(new java.awt.Color(235, 28, 28));

        phlab.setForeground(new java.awt.Color(235, 28, 28));

        nlab2.setForeground(new java.awt.Color(232, 31, 31));

        nlab3.setForeground(new java.awt.Color(232, 31, 31));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nlab1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_update)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_email)
                                            .addComponent(txt_dob)
                                            .addComponent(txt_phone)
                                            .addComponent(txt_user)
                                            .addComponent(txt_c_name)
                                            .addComponent(txt_c_no)
                                            .addComponent(txt_password)
                                            .addComponent(txt_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(phlab, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nlab2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                                    .addComponent(plab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(nlab3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btn_delete)
                                        .addGap(45, 45, 45)
                                        .addComponent(btn_show)))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nlab)
                            .addComponent(nlab1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(plab, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phlab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_c_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nlab2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_c_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nlab3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(btn_show))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu_cust.setText("Register As Customer");
        menu_cust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_custMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_cust);

        menu_host.setText("Register As Host");
        menu_host.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_hostMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_host);

        menu_book.setText("Book A Home");
        menu_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_bookMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_book);

        menu_rent.setText("Rent A Home");
        menu_rent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_rentMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_rent);

        jMenu11.setText("Update Profile");
        jMenuBar1.add(jMenu11);

        menu_logout.setText("LogOut");
        menu_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_logout);

        setJMenuBar(jMenuBar1);

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

    private void menu_hostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_hostMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Host")) {
            this.setVisible(false);
            new Reg_Host().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in as Host", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_hostMouseClicked

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

    private void menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_logoutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Login_Form().setVisible(true);
    }//GEN-LAST:event_menu_logoutMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        String q1 = "delete from person where person_id = " + Login_Form.special_person_id;
        try {
            Connection con = MysqlConnect.ConnectDb();
            Statement st1 = con.createStatement();
            st1.executeUpdate(q1);
            JOptionPane.showMessageDialog(null, "Thank you for using Happy Holidays!!" + "Your Account is sucessfully deleted!!");
            this.setVisible(false);
            new SignUp().setVisible(true);
        }
        catch(SQLException ex) {
            System.out.println("Delete Error" + ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String q1 = "update person set fname = '" + txt_fname.getText() + "', lname = '" + txt_lname.getText() + "', password = '" + txt_password.getText() + "', gender = '" + txt_gender.getSelectedItem() + "', phone_no = " + txt_phone.getText() + " where person_id = " + Login_Form.special_person_id;
        String q2 = "update customer set name_on_card = '" + txt_c_name.getText() + "', card_no = " + txt_c_no.getText() + " where person_id = " + Login_Form.special_person_id;
        try {
            Connection con = MysqlConnect.ConnectDb();
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();
            st1.executeUpdate(q1);
            st2.executeUpdate(q2);
            JOptionPane.showMessageDialog(null, "Profile Updated sucessfully!!");
        }
        catch(SQLException ex) {
            System.out.println("Update Error" + ex);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new show_bookings().setVisible(true);
    }//GEN-LAST:event_btn_showActionPerformed

    private void txt_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyReleased
        // TODO add your handling code here:
        String fname_regax="^[A_Za-z]{3,20}$";
        Pattern pat=Pattern.compile(fname_regax);
        Matcher match=pat.matcher(txt_fname.getText());
        if(!match.matches())
        {
            nlab1.setText("Please Enter Valid First Name");
        }
        else
        {
            nlab1.setText(" ");
        }
    }//GEN-LAST:event_txt_fnameKeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        // TODO add your handling code here:
        String pass_regax= "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern pat=Pattern.compile(pass_regax);
        Matcher match=pat.matcher(txt_password.getText());
        if(!match.matches())
        {
            plab.setText("Password contains 8-20 charcter,at least one digit,"
                    + "one upper case,lowercase alphabet,one special character" );

        }
        else
        {
            plab.setText(" ");
        }
    }//GEN-LAST:event_txt_passwordKeyReleased

    private void txt_phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyReleased
        // TODO add your handling code here:
        String phone_regax="^[0-9]{10}$";
        Pattern pat=Pattern.compile(phone_regax);
        Matcher match=pat.matcher(txt_phone.getText());
        if(!match.matches())
        {
            phlab.setText("Please Enter Valid Phone Number");
        }
        else
        {
            phlab.setText(" ");
        }
    }//GEN-LAST:event_txt_phoneKeyReleased

    private void txt_c_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_c_nameKeyReleased
        // TODO add your handling code here:
        String fname_regax="^[A_Za-z]{3,20}$";
        Pattern pat=Pattern.compile(fname_regax);
        Matcher match=pat.matcher(txt_c_name.getText());
        if(!match.matches())
        {
            nlab2.setText("Please Enter Valid Card Name");
        }
        else
        {
            nlab2.setText(" ");
        }
    }//GEN-LAST:event_txt_c_nameKeyReleased

    private void txt_c_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_c_noKeyReleased
        // TODO add your handling code here:
        String acc_regax="^[0-9]{16}$";
        Pattern pat=Pattern.compile(acc_regax);
        Matcher match=pat.matcher(txt_c_no.getText());
        if(!match.matches())
        {
            nlab3.setText("Please Enter Valid Card Number");
        }
        else
        {
            nlab3.setText(" ");
        }
    }//GEN-LAST:event_txt_c_noKeyReleased

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
            java.util.logging.Logger.getLogger(Update_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_show;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenu menu_book;
    private javax.swing.JMenu menu_cust;
    private javax.swing.JMenu menu_host;
    private javax.swing.JMenu menu_logout;
    private javax.swing.JMenu menu_rent;
    private javax.swing.JLabel nlab;
    private javax.swing.JLabel nlab1;
    private javax.swing.JLabel nlab2;
    private javax.swing.JLabel nlab3;
    private javax.swing.JLabel phlab;
    private javax.swing.JLabel plab;
    private javax.swing.JTextField txt_c_name;
    private javax.swing.JTextField txt_c_no;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JComboBox<String> txt_gender;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
