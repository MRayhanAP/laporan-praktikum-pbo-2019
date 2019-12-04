/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.*;
/**
 *
 * @author ASUS
 */
public class TestBackend1841720121Ray {
    public static void main(String[] args) {
        Kategori1841720121Ray kat1 = new Kategori1841720121Ray("Novel", "Koleksi buku novel");
        Kategori1841720121Ray kat2 = new Kategori1841720121Ray("Referensi", "Buku referensi ilmiah");
        Kategori1841720121Ray kat3 = new Kategori1841720121Ray("Komik", "Komik anak-anak");
        
        kat1.saveRay();
        kat2.saveRay();
        kat3.saveRay();

        kat2.setKeteranganRay("Koleksi buku referensi ilmiah");
        kat2.saveRay();

        kat3.deleteRay();

        for(Kategori1841720121Ray k : new Kategori1841720121Ray().getAllRay()){
            System.out.println("Nama: " + k.getNamaRay() + ", Ket: " + k.getKeteranganRay());
        }

        for(Kategori1841720121Ray k : new Kategori1841720121Ray().searchRay("ilmiah")){
            System.out.println("Nama: " + k.getNamaRay() + ", Ket: " + k.getKeteranganRay());
        }
    }
}
