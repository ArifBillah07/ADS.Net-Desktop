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
public class PaketInternet {
    
    private static int id_paket;
    private static String nama_paket;
    private static String harga_paket;
    private static String speed_paket;

    public static int getId_paket() {
        return id_paket;
    }

    public static void setId_paket(int id_paket) {
        PaketInternet.id_paket = id_paket;
    }

    public static String getNama_paket() {
        return nama_paket;
    }

    public static void setNama_paket(String nama_paket) {
        PaketInternet.nama_paket = nama_paket;
    }

    public static String getHarga_paket() {
        return harga_paket;
    }

    public static void setHarga_paket(String harga_paket) {
        PaketInternet.harga_paket = harga_paket;
    }

    public static String getSpeed_paket() {
        return speed_paket;
    }

    public static void setSpeed_paket(String speed_paket) {
        PaketInternet.speed_paket = speed_paket;
    }

    
    
}


