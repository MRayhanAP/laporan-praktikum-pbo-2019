/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JS2;

/**
 *
 * @author ASUS
 */
public class TestBarang1841720121Ray {
    public static void main(String[] args) {
        Barang1841720121Ray brg1Ray = new Barang1841720121Ray();
        brg1Ray.mNamaBrg = "Pensil";
        brg1Ray.mJenisBrg = "ATK";
        brg1Ray.mStok = 10;
        brg1Ray.tampilBarangRay();
        
        System.out.println("Stok baru adalah "+brg1Ray.tambahStok(20));
    }
}
