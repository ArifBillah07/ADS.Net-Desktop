/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsnet.model;

/**
 *
 * @author Arif
 */
public class Pemesanan {
    private static int id_pemesanan;
    //private int id_paket;
    //private int id_akun;
    private static String harga_paket;

    public static int getId_pemesanan() {
        return id_pemesanan;
    }

    public static void setId_pemesanan(int id_pemesanan) {
        Pemesanan.id_pemesanan = id_pemesanan;
    }

    public static String getHarga_paket() {
        return harga_paket;
    }

    public static void setHarga_paket(String harga_paket) {
        Pemesanan.harga_paket = harga_paket;
    }
    
}
