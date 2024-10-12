/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import org.testdev.perpustakaan.model.Pustakawan;

/**
 *
 * @author PCL-B00-00
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pustakawan p = new Pustakawan("tes", "tess@tes.com", 1);
        p.cetakNama();
        
        // virtual method
        Pengguna x = new Pustakawan("tessttt", "diaz@test.com", 2);
        x.cetakNama(); // virtual method
        
        
    }
    
}
