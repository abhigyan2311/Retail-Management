/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailmanagement;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author abhigyan
 */
public class Signup extends javax.swing.JFrame {
    
    public static final String DBURL = "jdbc:oracle:thin:@54.255.163.223:1521:XE";
    public static final String DBUSER = "dbms";
    public static final String DBPASS = "dbms";

    /**
     * Creates new form Main
     */
    public Signup() {
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

        tfemail = new javax.swing.JTextField();
        tfpwd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfmobile = new javax.swing.JTextField();
        tfcity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfstate = new javax.swing.JTextField();
        tfpin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfcname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        tfemail.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });
        getContentPane().add(tfemail);
        tfemail.setBounds(600, 170, 230, 40);

        tfpwd.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(tfpwd);
        tfpwd.setBounds(600, 210, 230, 40);

        jLabel1.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 180, 55, 29);

        jLabel2.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 220, 103, 29);

        jLabel3.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 300, 70, 29);

        tfmobile.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(tfmobile);
        tfmobile.setBounds(600, 290, 230, 40);

        tfcity.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(tfcity);
        tfcity.setBounds(600, 330, 230, 40);

        jLabel4.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 340, 40, 29);

        jLabel5.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("State");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 380, 53, 29);

        jLabel6.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pincode");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 420, 84, 29);

        tfstate.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(tfstate);
        tfstate.setBounds(600, 370, 230, 41);

        tfpin.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(tfpin);
        tfpin.setBounds(600, 410, 230, 40);

        jLabel7.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 260, 62, 29);

        tfcname.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        tfcname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcnameActionPerformed(evt);
            }
        });
        getContentPane().add(tfcname);
        tfcname.setBounds(600, 250, 230, 40);

        jLabel10.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("< Back");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 10, 120, 50);

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Please check information");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 480, 510, 40);

        jLabel9.setBackground(new java.awt.Color(255, 153, 51));
        jLabel9.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sign Up");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 560, 180, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retailmanagement/assets/ubuntu_tv_wallpaper.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfemailActionPerformed

    private void tfcnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcnameActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
               jLabel9.setForeground(new java.awt.Color(255,153,51));
        jLabel9.setBackground(new java.awt.Color(255,255,255));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51),5)); 
        
           String email  = tfemail.getText();
           String pwd    = tfpwd.getText();
           String cname  = tfcname.getText();
           String smobile = tfmobile.getText();
           String city   = tfcity.getText();
           String state  = tfstate.getText();
           String spin = tfpin.getText();
           
           if(email=="" || pwd=="" || cname=="" || city=="" || state==""){
               jLabel11.setText("Please enter all the information");
               jLabel11.setVisible(true);
           }
           else if (pwd.length()<=6){
               jLabel11.setText("Please enter a password with 6 characters or more.");
               
           }
           else if ( email.contains("@") == false || email.contains(".") == false){
               jLabel11.setText("Please enter a valid Email");
               jLabel11.setVisible(true);
           }
           else if(smobile.length()!=10 ){
               jLabel11.setText("Please enter a valid Mobile number");
               jLabel11.setVisible(true);
           }
           else if(spin.length()!=6){
               jLabel11.setText("Please enter a valid Pincode");
               jLabel11.setVisible(true);
           }
           else{
               
               try{
                   
                  int pin       = Integer.parseInt(spin);
               
            
                  //Initialize Connection to DB Server
                  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                  Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
                  Statement stmt = con.createStatement();
           
                  int cid = 1;
                 
                  //Sending data to DB Server
                  String sql = "Insert into CUSTOMER values('"+(email)+"','"+(city)+"',"+(pin)+",'"+(state)+"','"+(cname)+"',"+(smobile)+","+(cid)+",'"+(pwd)+"')";
                  stmt.executeUpdate(sql);
           
                  //Success Message
                  jLabel11.setVisible(false);
                  JOptionPane.showMessageDialog(this,"Successfully Signed Up!");
           
                  //Clear fields
                  tfemail.setText("");
                  tfpwd.setText("");
                  tfcname.setText("");
                  tfmobile.setText("");
                  tfcity.setText("");
                  tfstate.setText("");
                  tfpin.setText("");
           
                  //Show Next Screen
                  new Login().setVisible(true);
                  this.dispose();
   

       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
        jLabel9.setForeground(new java.awt.Color(255,255,255));
        jLabel9.setBackground(new java.awt.Color(255,153,51));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255),5));
    }//GEN-LAST:event_jLabel9MouseReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jLabel11.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfcity;
    private javax.swing.JTextField tfcname;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfmobile;
    private javax.swing.JTextField tfpin;
    private javax.swing.JTextField tfpwd;
    private javax.swing.JTextField tfstate;
    // End of variables declaration//GEN-END:variables
}
