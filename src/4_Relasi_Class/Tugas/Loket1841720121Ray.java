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
public class Loket1841720121Ray {
    private int noLoket;
    private Pegawai1841720121Ray mpegawai;
    
    Loket1841720121Ray(int noLoket){
        this.noLoket = noLoket;
    }
    
    public void setNoLoketRay(int mx){
       noLoket = mx;
    }
    
    public int geNoLoketRay(){
        return noLoket;
    }
    
    public void setPegawaiRay(Pegawai1841720121Ray my){
        mpegawai = my;
    }
    
    public Pegawai1841720121Ray getPegawaiRay(){
        return mpegawai;
    }
    
    public void infoRay(){
        System.out.println("No Loket : "+ this.noLoket + "\n");
        System.out.println("Pegawai : "+ mpegawai.infoRay());
        
    }
    
}