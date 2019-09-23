/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kereta;

/**
 *
 * @author ASUS
 */
public class Pegawai1841720121Ray {
private String mnip;
    private String mnama;

    public Pegawai1841720121Ray(String mnip, String mnama) {
        this.mnip = mnip;
        this.mnama = mnama;
    }

    public String getNipRay() {
        return mnip;
    }

    public String getNamaRay() {
        return mnama;
    }

    public void setNipRay(String mnip) {
        this.mnip = mnip;
    }

    public void setNamaRay(String mnama) {
        this.mnama = mnama;
    }
    
    public String infoRay(){
        String minfo = "";
        minfo += "Nip: " + this.mnip + "\n";
        minfo += "Nama: " + this.mnama + "\n";
        return minfo;
    }
}