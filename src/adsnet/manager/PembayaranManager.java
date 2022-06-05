/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsnet.manager;
import adsnet.model.PembayaranTambah;
import adsnet.model.Pemesanan;
import adsnet.helper.ConnectionHelper;
import java.sql.*;
/**
 *
 * @author Arif
 */
public class PembayaranManager {
    public static void tambahPembayaran(PembayaranTambah pt) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into pembayaran (id_pembayaran, "
            + "id_pemesanan, jenis_pembayaran, jenis_nontunai, total_pembayaran) values (?, ?, ?, ?, ?)");
        pstmn.setInt(1, pt.getId_pembayaran());
        pstmn.setInt(2, Pemesanan.getId_pemesanan());
        pstmn.setString(3, pt.getJenis_pembayaran());
        pstmn.setString(4, pt.getJenis_nontunai());
        pstmn.setString(5, pt.getTotal_pembayaran());
        pstmn.execute();
    }
}
