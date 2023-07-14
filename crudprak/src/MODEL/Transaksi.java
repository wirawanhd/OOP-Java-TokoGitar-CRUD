/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Win10
 */
public class Transaksi {
    private int kodetransaksi;
    private String nama_pembeli,kode;

    public Transaksi() {
    }

    public Transaksi(int kodetransaksi, String nama_pembeli, String kode) {
        this.kodetransaksi = kodetransaksi;
        this.nama_pembeli = nama_pembeli;
        this.kode = kode;
    }

    public int getKodetransaksi() {
        return kodetransaksi;
    }

    public void setKodetransaksi(int kodetransaksi) {
        this.kodetransaksi = kodetransaksi;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return "Transaksi{" + "kodetransaksi=" + kodetransaksi + ", nama_pembeli=" + nama_pembeli + ", kode=" + kode + '}';
    }
    
    
}
