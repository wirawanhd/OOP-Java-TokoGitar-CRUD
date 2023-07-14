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
public class Gitar {
     private String kode,nama,jenis;
    private String harga;

    public Gitar(String kode, String nama, String jenis, String harga) {
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public Gitar() {
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Gitar{" + "kode : " + kode + ", nama : " + nama + ", jenis : " + jenis + ", harga : " + harga + '}';
    }
    
}
