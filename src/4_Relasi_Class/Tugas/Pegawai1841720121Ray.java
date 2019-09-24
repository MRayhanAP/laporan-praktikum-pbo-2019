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
public class Pegawai1841720121Ray {
    private String mnip;
    private String mnama;
    
    Pegawai1841720121Ray(String mnip, String mnama){
        this.mnip = mnip;
        this.mnama = mnama;
    }
    
    public void setNipRay(String mx){
        mnip = mx;
    }
    
    public String geNipRay(){
        return mnip;
    }
    
    public void setNamaRay(String my){
        mnama = my;
    }
    
    public String getNamaRay(){
        return mnama;
    }
    
    public String infoRay() { 
        String minfo = "";
        minfo += "Nip: " + this.mnip + "\n";
        minfo += "Nama: " + this.mnama + "\n";
        return minfo; }
}
