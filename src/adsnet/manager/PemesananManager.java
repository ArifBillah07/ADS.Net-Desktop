/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsnet.manager;
import adsnet.model.PemesananTambah;
import adsnet.model.Akun;
import adsnet.model.PaketInternet;
import adsnet.helper.ConnectionHelper;
import java.sql.*;
/**
 *
 * @author Arif
 */
public class PemesananManager {
    public static void tambahPesanan(PemesananTambah pt) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into pemesanan (id_pemesanan ,id_paket, "
            + "id_akun) values (?, ?, ?)");
        pstmn.setInt(1, pt.getId_pemesanan());
        pstmn.setInt(2, Akun.getId_akun());
        pstmn.setInt(3, PaketInternet.getId_paket());
        pstmn.execute();
    }
}
