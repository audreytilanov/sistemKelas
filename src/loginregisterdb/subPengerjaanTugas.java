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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class subPengerjaanTugas extends javax.swing.JFrame {

    /**
     * Creates new form subPengerjaanTugas
     */
    public subPengerjaanTugas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        idTugas = new javax.swing.JTextField();
        idUser = new javax.swing.JTextField();
        tglDikumpul = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        isi = new javax.swing.JTextArea();
        idPengerjaan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        lihatTugas = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 760, 260));

        idTugas.setBorder(null);
        getContentPane().add(idTugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 260, 30));

        idUser.setBorder(null);
        getContentPane().add(idUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 260, 30));

        tglDikumpul.setBorder(null);
        getContentPane().add(tglDikumpul, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 260, 30));

        isi.setColumns(20);
        isi.setRows(5);
        isi.setBorder(null);
        jScrollPane2.setViewportView(isi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 730, 290));

        idPengerjaan.setBorder(null);
        getContentPane().add(idPengerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 260, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/subpengerjaan tugas.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        kembali.setText("kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 90, 60));

        lihatTugas.setText("Lihat Tugas");
        lihatTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatTugasActionPerformed(evt);
            }
        });
        getContentPane().add(lihatTugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, 190, 60));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 200, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        klikData();
    }//GEN-LAST:event_tabelMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        inputData();
    }//GEN-LAST:event_submitActionPerformed

    private void lihatTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatTugasActionPerformed
        lihatData();
    }//GEN-LAST:event_lihatTugasActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        index st = new index();
        st.show();
        st.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(subPengerjaanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subPengerjaanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subPengerjaanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subPengerjaanTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subPengerjaanTugas().setVisible(true);
            }
        });
    }

    private void klikData(){
	int baris=tabel.getSelectedRow();
	String a=tabel.getValueAt(baris, 0).toString();
	String b=tabel.getValueAt(baris, 1).toString();
	String c=tabel.getValueAt(baris, 2).toString();
        String d=tabel.getValueAt(baris, 3).toString();
        String e=tabel.getValueAt(baris, 4).toString();
        String idu = index.getIDU();
//	idPengerjaan.setText(a);
	idTugas.setText(b);
        idUser.setText(idu);
//        tglDikumpul.setText(d);
//        isi.setText(e);
    }
    
    private void inputData(){
                idUser.setEnabled(false);
		if(idTugas.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Mohon Masukan judul");
		}else if(tglDikumpul.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Mohon Masukan Kelas");
                
                }else if(isi.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Mohon Masukan Kelas");
                }else{
                String idu = index.getIDU();
		String proses="INSERT INTO pengerjaan_tugas(id_pengerjaan,id_tugas,id_user,tgl_dikumpul,isi) VALUES (?,?,?,?,?)";
		try {
                    Connection conn = (Connection)koneksi.configDB();
		    PreparedStatement st=conn.prepareStatement(proses);
		    st.setString(1, idPengerjaan.getText());
                    st.setString(2, idTugas.getText());
                    st.setString(3, idu);
                    st.setString(4, tglDikumpul.getText());
		    st.setString(5, isi.getText());
           
		    
		    st.executeUpdate ();
		    JOptionPane.showMessageDialog(null, "Data Sukses Disimpan");
		    idTugas.setText("");
                    idPengerjaan.setText("");
                    idUser.setText("");
                    tglDikumpul.setText("");
		    isi.setText("");
		    
                    
                    
//                    lihatData();
                    
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "GAGAL DISIMPAN, error di : "+ex);
                }
		}
	}
    private void lihatData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Tugas");
        model.addColumn("ID Guru");
        model.addColumn("Nama Tugas");
        model.addColumn("Tgl Berakhir");
        model.addColumn("Deadline");
        
        try{
            int no = 1;
            String sql = "select * from tugas";             //ngambil data dari mysql
            Connection conn = (Connection)koneksi.configDB(); //memanggil koneksi dari file config.java
            Statement statem = conn.createStatement();       //statement untuk mengexecute query
            ResultSet result = statem.executeQuery(sql);    //mengambil data dengan memanggil sql
            while(result.next()){          //perulangan untuk menampilkan data
                model.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5)});
            }
            tabel.setModel(model);
            JOptionPane.showMessageDialog(null, "Data berhasil");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idPengerjaan;
    private javax.swing.JTextField idTugas;
    private javax.swing.JTextField idUser;
    private javax.swing.JTextArea isi;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembali;
    private javax.swing.JButton lihatTugas;
    private javax.swing.JButton submit;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tglDikumpul;
    // End of variables declaration//GEN-END:variables
}
