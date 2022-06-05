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
public class PembayaranTambah {
    private int id_pembayaran;
    //private int id_pemesanan;
    private String jenis_pembayaran;
    private String jenis_nontunai;
    private String total_pembayaran;

    public int getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(int id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public String getJenis_pembayaran() {
        return jenis_pembayaran;
    }

    public void setJenis_pembayaran(String jenis_pembayaran) {
        this.jenis_pembayaran = jenis_pembayaran;
    }

    public String getJenis_nontunai() {
        return jenis_nontunai;
    }

    public void setJenis_nontunai(String jenis_nontunai) {
        this.jenis_nontunai = jenis_nontunai;
    }

    public String getTotal_pembayaran() {
        return total_pembayaran;
    }

    public void setTotal_pembayaran(String total_pembayaran) {
        this.total_pembayaran = total_pembayaran;
    }

}
