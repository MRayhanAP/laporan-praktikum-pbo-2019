/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kreta;

/**
 *
 * @author ASUS
 */
public class Gerbong1841720121Ray {
    private String mkode;
    private Kursi1841720121Ray[] arrayKursi;
    
    private void initKursiRay(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720121Ray(String.valueOf(i + 1));
        }
    }
    
    public Gerbong1841720121Ray(String mkode, int mjumlah){
        this.mkode = mkode;
        this.arrayKursi = new Kursi1841720121Ray[mjumlah];
        this.initKursiRay();
    }
    
    public String infoRay(){
        String minfo = "";    
        minfo += "Kode: " + mkode + "\n";
        for(Kursi1841720121Ray kursi : arrayKursi){
            minfo += kursi.infoRay();
        }    
        return minfo;
    }
    
    public void setPenumpangRay(Penumpang1841720121Ray mpenumpang, int mnomor){
        this.arrayKursi[mnomor - 1].setPenumpangRay(mpenumpang);
    }
}