/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsnet.manager;
import adsnet.helper.ConnectionHelper;
import java.sql.*;
import adsnet.model.AkunTambah;
/**
 *
 * @author Arif
 */
public class AkunManager {
    public static void tambahAkun(AkunTambah at) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into akun_customer (id_akun ,username, "
            + "password, email, nama_customer, alamat_customer, gender, no_hp) values (?, ?, ?, ?, ?, ?, ?, ?)");
        pstmn.setInt(1, at.getId_akun());
        pstmn.setString(2, at.getUsername());
        pstmn.setString(3, at.getPassword());
        pstmn.setString(4, at.getEmail());
        pstmn.setString(5, at.getNama_customer());
        pstmn.setString(6, at.getAlamat_customer());
        pstmn.setString(7, at.getGender());
        pstmn.setString(8, at.getNo_telp());
        pstmn.execute();
    }
}
