/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author ASUS
 */
public class mainpercobaan21841720121Ray {
    public static void main(String[] args) {
        Mobil1841720121Ray mobil = new Mobil1841720121Ray();
        mobil.setMerkRay("Avanza");
        mobil.setBiayaRay(350000);
        Sopir1841720121Ray sopir = new Sopir1841720121Ray();
        sopir.setNamaRay("John Doe");
        sopir.setBiayaRay(200000);
        Pelanggan1841720121Ray planggan = new Pelanggan1841720121Ray();
        planggan.setNamaRay("Jane Doe");
        planggan.setMobilRay(mobil);
        planggan.setSopirRay(sopir);
        planggan.setHariRay(2);
        System.out.println("Biaya Total: " + planggan.hitungBiayaTotalRay());
    }
    
}
