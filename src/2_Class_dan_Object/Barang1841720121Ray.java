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
public class Barang1841720121Ray {
    public String mNamaBrg;
    public String mJenisBrg;
    public int mStok;
    
    public void tampilBarangRay(){
        System.out.println("Nama Barang     : "+mNamaBrg);
        System.out.println("Jenis Barang    : "+mJenisBrg);
        System.out.println("Stok            : "+mStok);
    }
    
    //method dgn argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk+mStok;
        return stokBaru;
    }
}
