/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasigettersetterr;

/**
 *
 * @author ASUS
 */
public class Anggotaanggota1841720121Ray {
    private String mnama;
    private String malamat;
    private float msimpanan;
    
    Anggotaanggota1841720121Ray(String mnama, String malamat){
        this.mnama = mnama;
        this.malamat = malamat;
        this.msimpanan = 0;
    }
    
    public void setNamaRayy(String mnama){
        this.mnama = mnama;
    }
    public void setAlamatRayy(String malamat){
        this.malamat = malamat;
    }
    public String getNamaRayy(){
        return mnama;
    }
    public String getAlamatRayy(){
        return malamat;
    }
    public float getSimpananRayy(){
        return msimpanan;
    }
    public void setorRayy(float uang){
        msimpanan +=uang;
    }
    public void pinjam(float uang){
        msimpanan -=uang;
    }
}