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
public class Tiket1841720121Ray {
    private int mtiketID, mnoStudio, mharga;
    private Loket1841720121Ray mloket;
    private Pelanggan1841720121Ray mpelanggan;
    
    Tiket1841720121Ray(int mtiketID, int mnoStudio,int mharga){
        this.mtiketID = mtiketID;
        this.mnoStudio = mnoStudio;
        this.mharga = mharga;
    }
    
    public void setIDRay(int mx){
        mtiketID = mx;
    }
    
    public int getIDRay(){
        return mtiketID;
    }
    
    public void setNoStudioRay(int my){
        mnoStudio = my;
    }
    
    public int getNoStudioRay(){
        return mnoStudio;
    }
    
    public void setHargaRay(int mf){
        mharga = mf;
    }
    
    public int getHargaRay(){
        return mharga;
    }
    
    public void setPelangganRay(Pelanggan1841720121Ray mz){
        mpelanggan = mz;
    }
    
    public Pelanggan1841720121Ray getPelangganRay(){
        return mpelanggan;
    }
        
    public void infoRay(){
        System.out.println("Ticket ID : "+ this.mtiketID + "\n");
        System.out.println("No Studio : "+ this.mnoStudio + "\n");
        mpelanggan.infoRay();
        System.out.println("Harga : "+ this.mharga + "\n");
        
    }
}