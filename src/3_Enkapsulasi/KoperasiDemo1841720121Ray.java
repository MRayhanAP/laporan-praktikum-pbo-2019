/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasigettersetter;

/**
 *
 * @author ASUS
 */
public class KoperasiDemo1841720121Ray {
    public static void main(String[] args) {
        Anggota1841720121Ray kru = new Anggota1841720121Ray();
        kru.setNamaRay("Rey Kun");
        kru.setAlamatRay("Japan Jl.Kurousagi No. 9");
        kru.setorRay(100000);
        System.out.println("Simpanan "+kru.getNamaRay()+" : "+kru.getSimpananRay());
        
        kru.pinjam(5000);
        System.out.println("Simpanan "+kru.getNamaRay()+" : "+kru.getSimpananRay());
    }
}
