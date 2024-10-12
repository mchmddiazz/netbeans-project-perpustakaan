/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.testdev.perpustakaan.model;

/**
 *
 * @author PCL-B00-00
 */
public class Buku {
    String judul;
    int tahunTerbit;
    String penulis;
    String penerbit;
    long hargaSewa;

    public Buku(String judul, int tahunTerbit, String penulis, String penerbit, long hargaSewa) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.hargaSewa = hargaSewa;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public long getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(long hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    
}
