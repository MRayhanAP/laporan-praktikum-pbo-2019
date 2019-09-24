/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Pelanggan1841720121Ray {
    private String mnama, mNF;
    private int mnoKrs;

    public Pelanggan1841720121Ray(String mnama, String mNF, int mnoKrs) {
    this.mnama = mnama;
    this.mNF = mNF;
    this.mnoKrs = mnoKrs;
    }
    
    
    public void setNamaRay(String mx){
        mnama = mx;
    }
    
    public String getNamaRay(){
        return mnama;
    }
    
    public void setNamaFilmRay(String my){
        mNF = my;
    }
    
    public String getNamaFilmRay(){
        return mNF;
    }
    
    public void setNoKursiRay(int mz){
        mnoKrs = mz;
    }
    
    public int getNoKursiRay(){
        return mnoKrs;
    }
    
    public void infoRay(){
        System.out.println("Nama : "+ this.mnama + "\n");
        System.out.println("Nama Film : "+ this.mNF + "\n");
        System.out.println("Nomor Kursi : "+ this.mnoKrs + "\n");
    }
    
}