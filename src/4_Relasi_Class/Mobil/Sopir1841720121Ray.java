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
public class Sopir1841720121Ray {
private String mnama;
    private int mbiaya;

    public Sopir1841720121Ray() {
    }

    public String getNamaRay() {
        return mnama;
    }

    public int getBiayaRay() {
        return mbiaya;
    }

    public void setNamaRay(String mnama) {
        this.mnama = mnama;
    }

    public void setBiayaRay(int mbiaya) {
        this.mbiaya = mbiaya;
    }
    
    public int hitungBiayaSopirRay(int mhari){
        return mbiaya * mhari;
    }
}
