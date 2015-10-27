/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailmanagement;

import java.sql.*;
import javax.swing.JOptionPane;
import static retailmanagement.Signup.DBPASS;
import static retailmanagement.Signup.DBURL;
import static retailmanagement.Signup.DBUSER;

/**
 *
 * @author abhigyan
 */
public class Profile extends javax.swing.JFrame {
    String uname=null;

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
    }
    public Profile(String user) {
        uname = user;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        passTF = new javax.swing.JTextField();
        pinTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        cityTF = new javax.swing.JTextField();
        stateTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 250, 100, 32);

        jLabel3.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 290, 100, 32);

        jLabel4.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 330, 120, 30);

        jLabel5.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("City");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 410, 80, 30);

        jLabel6.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pincode");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 490, 110, 30);

        jLabel7.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("State");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 450, 130, 30);

        jLabel8.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 370, 130, 30);

        nameTF.setEditable(false);
        nameTF.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(nameTF);
        nameTF.setBounds(500, 240, 250, 40);

        passTF.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(passTF);
        passTF.setBounds(500, 320, 250, 40);

        pinTF.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(pinTF);
        pinTF.setBounds(500, 480, 250, 40);

        emailTF.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(emailTF);
        emailTF.setBounds(500, 280, 250, 40);

        phoneTF.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(phoneTF);
        phoneTF.setBounds(500, 360, 250, 40);

        cityTF.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(cityTF);
        cityTF.setBounds(500, 400, 250, 40);

        stateTF.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        getContentPane().add(stateTF);
        stateTF.setBounds(500, 440, 250, 40);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 550, 130, 50);

        jButton2.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 20, 89, 60);

        jLabel9.setFont(new java.awt.Font("SF UI Display", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Profile");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 70, 110, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retailmanagement/assets/Abstract Wallpapers 21.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-5, -4, 1090, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        
       String cemail= null;String cphno= null;String cpass= null;String cstate= null;String cpin= null;String ccity= null;
        try{
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
           Statement stmt = con.createStatement();
           
           String sql = "Select * from CUSTOMER where CNAME='"+uname+"'";
           ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                cemail = rs.getString("EMAILID");
                cphno=rs.getString("CPHNO");
                cpass=rs.getString("PASSWORD");
                cstate=rs.getString("STATE");
                cpin=rs.getString("PINCODE");
                ccity=rs.getString("CITY");
            }
            
            emailTF.setText(cemail);
            nameTF.setText(uname);
            passTF.setText(cpass);
            phoneTF.setText(cphno);
            stateTF.setText(cstate);
            pinTF.setText(cpin);
            cityTF.setText(ccity);
           
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
           Statement stmt = con.createStatement();
           
           String sql = "UPDATE CUSTOMER SET EMAILID='" +(emailTF.getText())+ "', CITY='"+(cityTF.getText())+"', PINCODE='"+(pinTF.getText())+"', STATE='"+(stateTF.getText())+"', CPHNO='"+(phoneTF.getText())+"', PASSWORD='"+(passTF.getText())+"' WHERE CNAME='"+(uname)+"'";
           stmt.executeUpdate(sql);
           JOptionPane.showMessageDialog(this, "Successfully updated details.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new homepage(uname).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField passTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField pinTF;
    private javax.swing.JTextField stateTF;
    // End of variables declaration//GEN-END:variables
}
