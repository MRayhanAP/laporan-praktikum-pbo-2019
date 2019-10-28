/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class Orang1841720121Ray {
    private String mNama;
    private Hewan1841720121Ray mHewanPeliharaan;

    public Orang1841720121Ray(String mNama) {
        this.mNama = mNama;
    }

    public void peliharaHewanRay(Hewan1841720121Ray mHewanPeliharaan){
        this.mHewanPeliharaan=mHewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Nama kulo : "+this.mNama);
        System.out.println("Kewan ku, mlaku karo: " );
        this.mHewanPeliharaan.bergerakRay();
        System.out.println("================================");
    }
}
