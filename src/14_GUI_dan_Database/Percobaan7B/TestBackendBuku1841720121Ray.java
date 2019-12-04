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
public class TestBackendBuku1841720121Ray {
    public static void main(String[] args) {
        Kategori1841720121Ray novel = new Kategori1841720121Ray().getByIdRay(4);
        Kategori1841720121Ray referensi = new Kategori1841720121Ray().getByIdRay(8);
        
        Buku1841720121Ray buku1 = new Buku1841720121Ray(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720121Ray buku2 = new Buku1841720121Ray(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720121Ray buku3 = new Buku1841720121Ray(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.saveRay();
        buku2.saveRay();
       
        buku2.setJudulRay("Aljabar Linier");
        buku2.saveRay();
      
        buku3.deleteRay();
        
        for(Buku1841720121Ray b : new Buku1841720121Ray().getAllRay()){
            System.out.println("Kategori: " + b.getKategoriRay().getNamaRay() + ", Judul: " + b.getJudulRay());
        }
        // test search
        for(Buku1841720121Ray b : new Buku1841720121Ray().searchRay("timun")){
            System.out.println("Kategori: " + b.getKategoriRay().getNamaRay() + ", Judul: " + b.getJudulRay());
        }
    }
}