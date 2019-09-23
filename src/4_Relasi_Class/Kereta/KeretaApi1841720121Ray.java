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
public class KeretaApi1841720121Ray {
private String mnama;
    private String mkelas;
    private Pegawai1841720121Ray mmasinis;
    private Pegawai1841720121Ray masisten;

    public KeretaApi1841720121Ray(String mnama, String mkelas, Pegawai1841720121Ray mmasinis) {
        this.mnama = mnama;
        this.mkelas = mkelas;
        this.mmasinis = mmasinis;
    }

    public KeretaApi1841720121Ray(String mnama, String mkelas, Pegawai1841720121Ray mmasinis, Pegawai1841720121Ray masisten) {
        this.mnama = mnama;
        this.mkelas = mkelas;
        this.mmasinis = mmasinis;
        this.masisten = masisten;
    }

    public String getNamaRay() {
        return mnama;
    }

    public String getKelasRay() {
        return mkelas;
    }

    public Pegawai1841720121Ray getMasinisRay() {
        return mmasinis;
    }

    public Pegawai1841720121Ray getAsistenRay() {
        return masisten;
    }

    public void setNamaRay(String mnama) {
        this.mnama = mnama;
    }

    public void setKelasRay(String mkelas) {
        this.mkelas = mkelas;
    }

    public void setMasinisRay(Pegawai1841720121Ray mmasinis) {
        this.mmasinis = mmasinis;
    }

    public void setAsistenRay(Pegawai1841720121Ray masisten) {
        this.masisten = masisten;
    }
    
    public String infoRay(){
        String minfo = "";
        minfo += "Nama: " + this.mnama + "\n";
        minfo += "Kelas: " + this.mkelas + "\n";
        minfo += "Masinis: " + this.mmasinis.infoRay();
        minfo += "Asisten: " + this.masisten.infoRay();
        return minfo;
    }
}
