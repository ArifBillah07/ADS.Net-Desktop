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
public class Pembayaran {
    private static int id_pembayaran;
    //private int id_pemesanan;
    private static String jenis_pembayaran;
    private static int total_pembayaran;

    public static int getId_pembayaran() {
        return id_pembayaran;
    }

    public static void setId_pembayaran(int id_pembayaran) {
        Pembayaran.id_pembayaran = id_pembayaran;
    }

    public static String getJenis_pembayaran() {
        return jenis_pembayaran;
    }

    public static void setJenis_pembayaran(String jenis_pembayaran) {
        Pembayaran.jenis_pembayaran = jenis_pembayaran;
    }

    public static int getTotal_pembayaran() {
        return total_pembayaran;
    }

    public static void setTotal_pembayaran(int total_pembayaran) {
        Pembayaran.total_pembayaran = total_pembayaran;
    }
    
}
