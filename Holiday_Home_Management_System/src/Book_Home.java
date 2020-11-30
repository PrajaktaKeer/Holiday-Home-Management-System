
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
public class Book_Home extends javax.swing.JFrame {

    /**
     * Creates new form Book_Home
     */
    public Book_Home() {
        initComponents();
        setSize(800, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Happy Holidays");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
logo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("logo.jpeg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        show_db();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void show_db() {
        String sql="select * from view_houses";
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            table_book.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
             JOptionPane.showMessageDialog(null, e);
        }
        //to stop table from being edited and selection is allowed
        table_book.setDefaultEditor(Object.class, null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_book = new javax.swing.JTable();
        btn_payment = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        s_date = new datechooser.beans.DateChooserCombo();
        end_date = new datechooser.beans.DateChooserCombo();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cust = new javax.swing.JMenu();
        menu_host = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_rent = new javax.swing.JMenu();
        menu_profile = new javax.swing.JMenu();
        menu_logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(183, 237, 232));

        logo.setText("jLabel1");

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setText("Book A Home");

        table_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_book);

        btn_payment.setText("Procced To Payment");
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel15.setText("End Date");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setText("Start Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(s_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(635, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_payment)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(412, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(52, 52, 52)))
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

        jMenu3.setText("Book A Home");
        jMenuBar1.add(jMenu3);

        menu_rent.setText("Rent A Home");
        menu_rent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_rentMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_rent);

        menu_profile.setText("Update Profile");
        menu_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_profileMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_profile);

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

    private void menu_rentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_rentMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Host")) {
            this.setVisible(false);
            new Rent_Home().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in as Customer", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_rentMouseClicked

    private void menu_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_profileMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
         new Update_Profile().setVisible(true);
    }//GEN-LAST:event_menu_profileMouseClicked

    private void menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_logoutMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
        new Login_Form().setVisible(true);
        
    }//GEN-LAST:event_menu_logoutMouseClicked

    public static String cost, av_to, av_from, img_file, loc;
    public static int cust_id = 0;
    
    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        // TODO add your handling code here:
        int row = table_book.getSelectedRow(), house_id = 0;
        cost = table_book.getModel().getValueAt(row, 0).toString();
        av_to = table_book.getModel().getValueAt(row, 1).toString();
        av_from = table_book.getModel().getValueAt(row, 2).toString();
        img_file = table_book.getModel().getValueAt(row, 3).toString();
        loc = table_book.getModel().getValueAt(row, 4).toString();
        
        //extract house id 
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement("select house_id from house where availablity_to = ? and availablity_from = ? and cost = ? and location = ?");
            ps.setString(1, av_to);
            ps.setString(2, av_from);
            ps.setString(3, cost);
            //ps.setString(4, img_file);
            ps.setString(4, loc);
            //ps.setString(4, fname);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                house_id = rs.getInt(1);
            }  
        }
        catch(SQLException ex) {
            System.out.println("House Id Error" + ex);
        }
        //System.out.println(house_id);
        
        //extracting cust_id
        
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement("select customer_id from customer where person_id = " + Login_Form.special_person_id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                cust_id = rs.getInt(1);
            }
        }
        catch(SQLException ex) {
            System.out.println("Login Error" + ex);
        }
        
        //inserting into booking table
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String sql = "insert into booking(customer_id, home_id, start_date, end_date, status) values (" + cust_id + "," + house_id + ",'" + sdf.format(s_date.getSelectedDate().getTime()) + "','" + sdf.format(end_date.getSelectedDate().getTime()) + "','Confirmed')";
        try {
            Connection conn = MysqlConnect.ConnectDb();
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Booking Successful");
        }
        catch(SQLException ex) {
            System.out.println("Insert Error" + ex);
        }
        
        this.setVisible(false);
         new Payment().setVisible(true);
    }//GEN-LAST:event_btn_paymentActionPerformed

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
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_payment;
    private datechooser.beans.DateChooserCombo end_date;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenu menu_cust;
    private javax.swing.JMenu menu_host;
    private javax.swing.JMenu menu_logout;
    private javax.swing.JMenu menu_profile;
    private javax.swing.JMenu menu_rent;
    private datechooser.beans.DateChooserCombo s_date;
    private javax.swing.JTable table_book;
    // End of variables declaration//GEN-END:variables
}