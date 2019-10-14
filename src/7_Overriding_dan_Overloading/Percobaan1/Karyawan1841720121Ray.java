/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class Karyawan1841720121Ray {
    private String mnama;
    private String mnip;
    private String mgolongan;
    private double mgaji;
    
    public void setNamaRay(String mnama)
    {
        this.mnama = mnama;
    }
    public void setNipRay(String mnip)
    {
        this.mnip = mnip;
    }
    public void setGolonganRay(String mgolongan)
    {
        this.mgolongan = mgolongan;
        
        switch(mgolongan.charAt(0)){
            case '1' : this.mgaji = 5000000;
            break;
            case '2' : this.mgaji = 3000000;
            break;
            case '3' : this.mgaji = 2000000;
            break;
            case '4' : this.mgaji = 1000000;
            break;
            case '5' : this.mgaji = 750000;
            break;
        }
    }
    public void setGajiRay(double mgaji)
    {
        this.mgaji=mgaji;
    }
    public String getNamaRay()
    {
        return mnama;
    }
    public String getNipRay()
    {
        return mnip;
    }
    public String getGolonganRay()
    {
        return mgolongan;
    }
    public double getGajiRay()
    {
        return mgaji;
    }
}