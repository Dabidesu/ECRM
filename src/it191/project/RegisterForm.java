/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it191.project;

import java.awt.Color;
import java.sql.*;
import java.lang.*;
import javax.swing.JOptionPane;
import java.text.*;

public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        
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

        usernameField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_Username = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        lbl_Confirm = new javax.swing.JLabel();
        s_username = new javax.swing.JTextField();
        s_pw = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        s_confirmpw = new javax.swing.JTextField();

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Username.setText("Username:");
        jPanel1.add(lbl_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 30));

        lbl_Password.setText("Password:");
        jPanel1.add(lbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 30));

        lbl_Confirm.setText("Confirm Password:");
        jPanel1.add(lbl_Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));
        jPanel1.add(s_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 130, 30));

        s_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_pwActionPerformed(evt);
            }
        });
        s_pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                s_pwKeyReleased(evt);
            }
        });
        jPanel1.add(s_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 90, -1));

        loginBtn.setText("Confirm");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 20));

        s_confirmpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_confirmpwActionPerformed(evt);
            }
        });
        s_confirmpw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                s_confirmpwKeyReleased(evt);
            }
        });
        jPanel1.add(s_confirmpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void s_confirmpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_confirmpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_confirmpwActionPerformed

    private void s_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_pwActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
            
            String sql = "INSERT INTO test (username, password) VALUES(?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,s_username.getText());
            pst.setString(2,s_pw.getText());
            String conf = s_pw.getText();
            String vrfy = s_confirmpw.getText();
            
            int n1 = pst.executeUpdate();
            
            
            
            if(conf == vrfy)
               {
                   
                    
               }
            else if(conf == vrfy)
            {
              System.out.println(conf + "3" + vrfy);
                   JOptionPane.showMessageDialog(null, "tite");
                    if(n1 != 0)
                    {
                           JOptionPane.showMessageDialog(null, "Registration complete.");
                           //Next Page
                    }
            }
            JOptionPane.showMessageDialog(null, conf + " test " + vrfy);
            if(conf != vrfy)
                {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                    JOptionPane.showMessageDialog(null, conf + " " + vrfy);
                    s_username.setText("");
                    s_pw.setText("");
                    s_confirmpw.setText("");
                }
            
            con.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void s_pwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_pwKeyReleased
        String conf = s_pw.getText();
        String vrfy = s_confirmpw.getText();
        System.out.println(conf + "Test" + vrfy);
    }//GEN-LAST:event_s_pwKeyReleased

    private void s_confirmpwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_confirmpwKeyReleased
        String conf = s_pw.getText();
        String vrfy = s_confirmpw.getText();
        System.out.println(conf + "Test" + vrfy);
    }//GEN-LAST:event_s_confirmpwKeyReleased

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Confirm;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_Username;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField s_confirmpw;
    private javax.swing.JTextField s_pw;
    private javax.swing.JTextField s_username;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
