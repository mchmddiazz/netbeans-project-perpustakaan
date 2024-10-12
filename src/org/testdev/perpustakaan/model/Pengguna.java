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
public class Pengguna {
    private String nama;
    private String id;
    private long email;

    public Pengguna(String nama, String id, long email) {
        this.nama = nama;
        this.id = id;
        this.email = email;
    }
    
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public long getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(long email) {
        this.email = email;
    }
    
    public void cetakNama(){
        System.out.println(this.nama);
    }
    
}
