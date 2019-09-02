/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JS1;

/**
 *
 * @author ASUS
 */
public class Kursi1841720121Rayhan {
    private String merk;
    private String warna;
    private String bahan;
    private int tinggikaki;
    private int luaskursi;
    
    public void merkK(String mk){
        merk = mk;
    }
    
    public void warnaK(String wk){
        warna = wk;
    }
    public void bahanK(String bk){
        bahan = bk;
    }
    public void tinggiK(int sk){
        tinggikaki = sk;
    }
    public void luasS(int l, int p){
        luaskursi = l * p;
    }
    
     public void cetakStatus(){
       System.out.println("Warna: " + warna);
       System.out.println("Tinggi Kaki: " + tinggikaki + "cm");
       System.out.println("Merek: " + merk);
       System.out.println("Luas Kursi: " + luaskursi + "cm");
       System.out.println("Bahan: " + bahan);
   }
}
