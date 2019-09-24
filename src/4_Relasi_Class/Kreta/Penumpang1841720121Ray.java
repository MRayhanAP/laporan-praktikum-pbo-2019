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
public class Penumpang1841720121Ray {
private String mktp;
    private String mnama;

    public Penumpang1841720121Ray(String mktp, String mnama) {
        this.mktp = mktp;
        this.mnama = mnama;
    }

    public void setKtpRay(String mktp) {
        this.mktp = mktp;
    }

    public void setNamaRay(String mnama) {
        this.mnama = mnama;
    }

    public String getKtpRay() {
        return mktp;
    }

    public String getNamaRay() {
        return mnama;
    }
    
    public String infoRay(){
        String minfo = "";
        minfo += "Ktp: " + mktp + "\n";
        minfo += "Nama: " + mnama + "\n";
        return minfo;
    }
}