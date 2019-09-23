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
public class Pelanggan1841720121Ray {
 private String mnama;
    private Mobil1841720121Ray mmobil;
    private Sopir1841720121Ray msopir;
    private int mhari;

    public Pelanggan1841720121Ray() {
    }

    public String getNamaRay() {
        return mnama;
    }

    public Mobil1841720121Ray getMobilRay() {
        return mmobil;
    }

    public Sopir1841720121Ray getSopirRay() {
        return msopir;
    }

    public void setNamaRay(String mnama) {
        this.mnama = mnama;
    }

    public void setMobilRay(Mobil1841720121Ray mmobil) {
        this.mmobil = mmobil;
    }

    public void setSopirRay(Sopir1841720121Ray msopir) {
        this.msopir = msopir;
    }

    public int getHariRay() {
        return mhari;
    }

    public void setHariRay(int mhari) {
        this.mhari = mhari;
    }
    
    public int hitungBiayaTotalRay(){
        return mmobil.hitungBiayaMobilRay(mhari) + msopir.hitungBiayaSopirRay(mhari);
    }
}
