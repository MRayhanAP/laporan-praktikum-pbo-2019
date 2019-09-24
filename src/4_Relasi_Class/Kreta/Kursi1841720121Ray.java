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
public class Kursi1841720121Ray {
    private String mnomer;
    private Penumpang1841720121Ray mpenumpang;

    public Kursi1841720121Ray(String mnomer) {
        this.mnomer = mnomer;
    }

    public void setNomerRay(String mnomer) {
        this.mnomer = mnomer;
    }

    public void setPenumpangRay(Penumpang1841720121Ray mpenumpang) {
        this.mpenumpang = mpenumpang;
    }

    public String getNomerRay() {
        return mnomer;
    }

    public Penumpang1841720121Ray getPenumpangRay() {
        return mpenumpang;
    }
    
    public String infoRay(){
        String minfo = "";
        minfo += "Nomor: " + mnomer + "\n";
        if (this.mpenumpang != null){
            minfo += "penumpang: " + mpenumpang.infoRay() + "\n";
        }
        return minfo;
    }
}