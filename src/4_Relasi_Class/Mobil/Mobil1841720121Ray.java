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
public class Mobil1841720121Ray {
private String mmerk;
    private int mbiaya;

    public Mobil1841720121Ray() {
    }

    public String getMerkRay() {
        return mmerk;
    }

    public int getBiayaRay() {
        return mbiaya;
    }

    public void setMerkRay(String mmerk) {
        this.mmerk = mmerk;
    }

    public void setBiayaRay(int mbiaya) {
        this.mbiaya = mbiaya;
    }
    
    public int hitungBiayaMobilRay(int mhari){
        return mbiaya * mhari;
    }
}
