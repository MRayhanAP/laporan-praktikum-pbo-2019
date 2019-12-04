/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Anggota1841720121Ray;
/**
 *
 * @author ASUS
 */
public class TestBackendAnggota1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota1841720121Ray agt1 = new Anggota1841720121Ray("Hunayn", "Sidaorjo", "123");
        Anggota1841720121Ray agt2 = new Anggota1841720121Ray("Ardan", "Bojonegoro", "456");
        Anggota1841720121Ray agt3 = new Anggota1841720121Ray("Dina", "Malang", "789");
        
        //test insert
        agt1.saveRay();
        agt2.saveRay();
        agt3.saveRay();
        
        //test update
        agt2.setAlamatRay("Jawa Timur");
        agt2.saveRay();
        
        //test delete
        agt3.deleteRay();
        
        //tes select all
        for(Anggota1841720121Ray k : new Anggota1841720121Ray().getAllRay()){
            System.out.println("Nama: " + k.getNamaRay() + ", Alamat : " + k.getAlamatRay() + ", Telepon : " + k.getTeleponRay());
        }
        
        //test search
        for(Anggota1841720121Ray a : new Anggota1841720121Ray().searchRay("Timur")){
            System.out.println("Nama: " + a.getNamaRay() + ", Alamat : " + a.getAlamatRay() + ", Telepon : " + a.getTeleponRay());
        }
    }
}