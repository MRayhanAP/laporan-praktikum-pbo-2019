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
public class Anggota1841720121Ray {
    private String mnama;
    private String malamat;
    private float msimpanan;
    
    public void setNamaRay(String mnama){
        this.mnama = mnama;
    }
    public void setAlamatRay(String malamat){
        this.malamat = malamat;
    }
    public String getNamaRay(){
        return mnama;
    }
    public String getAlamatRay(){
        return malamat;
    }
    public float getSimpananRay(){
        return msimpanan;
    }
    public void setorRay(float uang){
        msimpanan +=uang;
    }
    public void pinjam(float uang){
        msimpanan -=uang;
    }
}
