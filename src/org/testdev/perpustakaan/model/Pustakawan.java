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
public class Pustakawan extends Pengguna {
    
    public Pustakawan(String nama, String id, long email) {
        super(nama, id, email);
    }
    
    public boolean tambahBuku(){
        return true;
    }
    
    public boolean hapusBuku(){
        return true;
    }
    
    public boolean updateBuku(){
        return true;
    }
    
    @Override
    public void cetakNama(){
        System.out.print("Pustakawan : ");
        super.cetakNama();
    }
    
}
