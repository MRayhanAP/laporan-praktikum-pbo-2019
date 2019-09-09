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
public class BarangTugas1841720121Ray {
    public String mkode;
    public String mnamaBarang;
    public int mhargaDasar;
    public float mdiskon;

    public int hitungHargaJualRay(){
        int hargaJual=(int) (mhargaDasar-(mdiskon*(mhargaDasar/100)));
        
        return hargaJual;
    }
    
    public void tampilDataRay(){
        System.out.println("Kode Barang : "+mkode);
        System.out.println("Nama Barang : "+mnamaBarang);
        System.out.println("Harga Dasar : Rp."+mhargaDasar);
        System.out.println("Diskon : "+mdiskon+"%");
        System.out.println("harga Jual : "+hitungHargaJualRay());
    }
}
