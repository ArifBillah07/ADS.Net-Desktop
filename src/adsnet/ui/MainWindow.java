/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsnet.ui;
import adsnet.helper.ConnectionCheck;
import javax.swing.JOptionPane;
import adsnet.model.Akun;
import adsnet.model.PaketInternet;
import adsnet.helper.ConnectionHelper;
import adsnet.manager.PemesananManager;
import adsnet.model.PemesananTambah;
import adsnet.model.Pemesanan;
import adsnet.model.PembayaranTambah;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author Arif
 */
public class MainWindow extends javax.swing.JFrame {
    int id_akun = Akun.getId_akun();
    String namaUser = Akun.getNama_customer();
    String namaPaket = PaketInternet.getNama_paket();
    String hargaPaket = PaketInternet.getHarga_paket();
    String speedPaket = PaketInternet.getSpeed_paket();
    //Akun ak = new Akun();
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        lbNama.setText(namaUser);
    }
    
    public void showMessage(String message, int type){
        if(type == 1){
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void clear(){
        tfNamaPaket.setText("");
        tfHargaPaket.setText("");
        tfSpeed.setText("");
        tfTotal.setText("");
    }
    
    public void loadDataPaket(){
        tfNamaPaket.setText(namaPaket);
        tfHargaPaket.setText(hargaPaket);
        tfSpeed.setText(speedPaket);
        tfTotal.setText(hargaPaket);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbWelcome = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        lbBerlangganan = new javax.swing.JLabel();
        lbHarga = new javax.swing.JLabel();
        lbTerlambat = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        tfNamaPaket = new javax.swing.JTextField();
        tfHargaPaket = new javax.swing.JTextField();
        tfSpeed = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        btLogout = new javax.swing.JButton();
        btPilihPaket = new javax.swing.JButton();
        btPesan = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btBayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADS.Net");

        lbWelcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbWelcome.setText("Welcome");

        lbNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNama.setText("Nama");

        lbBerlangganan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbBerlangganan.setText("Sekarang anda berlangganan:");

        lbHarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHarga.setText("Harga paket per (bulan):");

        lbTerlambat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTerlambat.setText("Speed:");

        lbTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTotal.setText("Total Pembayaran:");

        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        btPilihPaket.setText("Pilih Paket");
        btPilihPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPilihPaketActionPerformed(evt);
            }
        });

        btPesan.setText("Pesan");
        btPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesanActionPerformed(evt);
            }
        });

        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        btBayar.setText("Bayar");
        btBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbHarga)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfHargaPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbWelcome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbNama))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbBerlangganan)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfNamaPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btPilihPaket, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                            .addComponent(btLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTotal)
                                    .addComponent(lbTerlambat))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSpeed)
                                    .addComponent(tfTotal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWelcome)
                    .addComponent(btLogout)
                    .addComponent(lbNama))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBerlangganan)
                    .addComponent(tfNamaPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPilihPaket))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHarga)
                    .addComponent(tfHargaPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTerlambat)
                    .addComponent(tfSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotal)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesan)
                    .addComponent(btRefresh)
                    .addComponent(btBayar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPilihPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPilihPaketActionPerformed
        // TODO add your handling code here:
        new PaketWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btPilihPaketActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:
        clear();
        showMessage("Anda berhasil logout!", 1);
        dispose();
        new LoginWindow().setVisible(true);
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesanActionPerformed
        // TODO add your handling code here:
        PemesananTambah pt = new PemesananTambah();
        try{
            Connection conn = ConnectionHelper.getConnection();
            PreparedStatement pstmn = conn.prepareStatement("insert into pemesanan (id_pemesanan, "
                + "id_paket, id_akun, nama_paket, harga_paket, speed_paket) values (?, ?, ?, ?, ?, ?)");
            pstmn.setInt(1, pt.getId_pemesanan());
            pstmn.setInt(2, PaketInternet.getId_paket());
            pstmn.setInt(3, Akun.getId_akun());
            pstmn.setString(4, PaketInternet.getNama_paket());
            pstmn.setString(5, PaketInternet.getHarga_paket());
            pstmn.setString(6, PaketInternet.getSpeed_paket());
            pstmn.execute();
            showMessage("Pesanan telah ditambahkan, Silahkan lanjut ke pembayaran", 1);
            //new PembayaranWindow().setVisible(true);
        }catch(SQLException e){
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
    }//GEN-LAST:event_btPesanActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        // TODO add your handling code here:
        loadDataPaket();
        try{
            Connection conn = ConnectionHelper.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM pemesanan WHERE id_akun = '"+id_akun+"'";
            ResultSet rs = st.executeQuery(sql);

            if(rs.next()){        
                tfNamaPaket.setText(rs.getString("nama_paket"));
                tfHargaPaket.setText(rs.getString("harga_paket"));
                tfSpeed.setText(rs.getString("speed_paket"));
                tfTotal.setText(rs.getString("harga_paket"));
                showMessage("Data telah di refresh", 1);
            }
        }catch(SQLException e){
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBayarActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = ConnectionHelper.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM pemesanan WHERE id_akun = '"+id_akun+"'";
            ResultSet rs = st.executeQuery(sql);

            if(rs.next()){        
                Pemesanan.setId_pemesanan(rs.getInt("id_pemesanan"));
                Pemesanan.setHarga_paket(rs.getString("harga_paket"));
                new PembayaranWindow().setVisible(true);
            }
        }catch(SQLException e){
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btBayarActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBayar;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btPesan;
    private javax.swing.JButton btPilihPaket;
    private javax.swing.JButton btRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBerlangganan;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbTerlambat;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JTextField tfHargaPaket;
    private javax.swing.JTextField tfNamaPaket;
    private javax.swing.JTextField tfSpeed;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
