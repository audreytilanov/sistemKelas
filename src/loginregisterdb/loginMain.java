/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregisterdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class loginMain extends javax.swing.JFrame {
    static String unameSession;
    static String aksesSession;
    static String idSession;
    /**
     * Creates new form loginMain
     */
    public loginMain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        register1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        login1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        pass = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        reg1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        passGuru = new javax.swing.JPasswordField();
        userGuru = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();
        logGuru = new javax.swing.JButton();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/employee.png"))); // NOI18N

        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });

        register1.setBackground(new java.awt.Color(204, 255, 255));
        register1.setFont(new java.awt.Font("Oswald", 1, 18)); // NOI18N
        register1.setForeground(new java.awt.Color(153, 51, 0));
        register1.setText("Register");
        register1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 51, 0), 3, true));
        register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Oswald", 1, 30)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("REGISTER PAGE");

        jLabel7.setFont(new java.awt.Font("Oswald", 1, 20)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Oswald", 1, 20)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Password");

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Sudah punya akun?");

        login1.setFont(new java.awt.Font("Oswald", 1, 19)); // NOI18N
        login1.setForeground(new java.awt.Color(153, 0, 0));
        login1.setText("Login");
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 102));

        jPanel4.setLayout(null);
        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel5.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 410, 40));

        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel5.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 410, 40));

        jLabel35.setFont(new java.awt.Font("Oswald", 1, 30)); // NOI18N
        jLabel35.setText("LOGIN MURID");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 310, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/halaman login siswa.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1280, 930));

        log.setBackground(new java.awt.Color(204, 255, 255));
        log.setFont(new java.awt.Font("Oswald", 1, 18)); // NOI18N
        log.setForeground(new java.awt.Color(153, 51, 0));
        log.setText("login");
        log.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 51, 0), 3, true));
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel5.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 260, 60));

        reg1.setFont(new java.awt.Font("Oswald", 1, 19)); // NOI18N
        reg1.setForeground(new java.awt.Color(153, 0, 0));
        reg1.setText("Register");
        reg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg1MouseClicked(evt);
            }
        });
        jPanel5.add(reg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 240, 60));

        jTabbedPane1.addTab("Siswa", jPanel5);

        jPanel4.setLayout(null);
        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passGuru.setBorder(null);
        passGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passGuruActionPerformed(evt);
            }
        });
        jPanel4.add(passGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 420, 32));

        userGuru.setBorder(null);
        userGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuruActionPerformed(evt);
            }
        });
        jPanel4.add(userGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 420, 31));

        jLabel30.setFont(new java.awt.Font("Oswald", 1, 30)); // NOI18N
        jLabel30.setText("LOGIN GURU");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 196, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/halaman login siswa.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        reg.setFont(new java.awt.Font("Oswald", 1, 19)); // NOI18N
        reg.setForeground(new java.awt.Color(153, 0, 0));
        reg.setText("Register");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        jPanel4.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 240, 50));

        logGuru.setBackground(new java.awt.Color(204, 255, 255));
        logGuru.setFont(new java.awt.Font("Oswald", 1, 18)); // NOI18N
        logGuru.setForeground(new java.awt.Color(153, 51, 0));
        logGuru.setText("login");
        logGuru.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 51, 0), 3, true));
        logGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logGuruActionPerformed(evt);
            }
        });
        jPanel4.add(logGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 260, 60));

        jTabbedPane1.addTab("Guru", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed
        
    private void register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register1ActionPerformed
        /* Kode ini digunakan untuk membuat halaman register muncul (setVisible)
        ketika tulisan register di klik*/
        new registerMain().setVisible(true); 
    }//GEN-LAST:event_register1ActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        // TODO add your handling code here:
        registerMain reg = new registerMain();
        reg.show();
    }//GEN-LAST:event_login1MouseClicked

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
        // TODO add your handling code here:
        registerMain reg = new registerMain();
        reg.show();
        reg.setLocationRelativeTo(null);
        this.setVisible(false);
        //        dispose();
    }//GEN-LAST:event_regMouseClicked

    private void logGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logGuruActionPerformed
        // TODO add your handling code here:
        loginGuru();
    }//GEN-LAST:event_logGuruActionPerformed

    private void userGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userGuruActionPerformed

    private void passGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passGuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passGuruActionPerformed

    private void reg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reg1MouseClicked

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        loginSiswa();
    }//GEN-LAST:event_logActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Memunculkan halaman login ketika program di run */
        java.awt.EventQueue.invokeLater(() -> {
            new loginMain().setVisible(true);
        });
    }

    public void loginSiswa(){
    if(user.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Masukan Username");
    }else if(pass.getPassword().equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Masukan Password");
    }
    else{
    String proses="SELECT * FROM user WHERE username='"+user.getText()+"' AND password='"+pass.getText()+"'";
    try {
        Connection conn = koneksi.configDB();
        Statement st=conn.createStatement();
        ResultSet hasil = st.executeQuery(proses);
        if(hasil.next()){
            if(user.getText().equals(hasil.getString("username")) && pass.getText().equals(hasil.getString("password"))){
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                unameSession = hasil.getString("username");
                aksesSession = hasil.getString("akses");
                idSession = hasil.getString("id_user");
                if(hasil.getString("akses").equals("1")){
                    JOptionPane.showMessageDialog(null, "Berhasil Murid");
                    index idx = new index();
                    idx.show();
                    idx.setLocationRelativeTo(null);
                    this.setVisible(false);
                    dispose();
                }
                
            }
        }
        
        user.setText("");
        pass.setText("");
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "GAGAL DISIMPAN, error di : "+ex);
    }
    }
}
    public void loginGuru(){
    if(userGuru.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Masukan Username");
    }else if(passGuru.getPassword().equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Masukan Password");
    }
    else{
    String proses="SELECT * FROM guru WHERE username='"+userGuru.getText()+"' AND password='"+passGuru.getText()+"'";
    try {
        Connection conn = koneksi.configDB();
        Statement st=conn.createStatement();
        ResultSet hasil = st.executeQuery(proses);
        if(hasil.next()){
            if(userGuru.getText().equals(hasil.getString("username")) && passGuru.getText().equals(hasil.getString("password"))){
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                unameSession = hasil.getString("username");
                aksesSession = hasil.getString("akses");
                idSession = hasil.getString("id_guru");
                if(hasil.getString("akses").equals("2")){
                    JOptionPane.showMessageDialog(null, "Berhasil Guru");
                    index idx = new index();
                    idx.show();
                    idx.setLocationRelativeTo(null);
                    this.setVisible(false);
                    dispose();
                }else if(hasil.getString("akses").equals("3")){
                    JOptionPane.showMessageDialog(null, "Berhasil Admin");
                    indexAdmin idxa = new indexAdmin();
                    idxa.show();
                    idxa.setLocationRelativeTo(null);
                    this.setVisible(false);
                    dispose();
                }
                
                
            }
        }
        
        userGuru.setText("");
        passGuru.setText("");
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "GAGAL DISIMPAN, error di : "+ex);
    }
    }
}
    public static String getUname(){
        return unameSession;
    }
    public static String getAkses(){
        return aksesSession;
    }
    public static String getId(){
        return idSession;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton log;
    private javax.swing.JButton logGuru;
    private javax.swing.JLabel login1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField passGuru;
    private javax.swing.JPasswordField password1;
    private javax.swing.JLabel reg;
    private javax.swing.JLabel reg1;
    private javax.swing.JButton register1;
    private javax.swing.JTextField user;
    private javax.swing.JTextField userGuru;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}