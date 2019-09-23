/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laptop;

/**
 *
 * @author ASUS
 */
public class laptop1841720121Ray {
    private String mmerk;
    private processor1841720121Ray mproc;
    
    laptop1841720121Ray(String mmerk, processor1841720121Ray mproc){
        this.mmerk = mmerk;
        this.mproc = mproc;
    }
    
    laptop1841720121Ray(){
        
    }
    
    public void setMerkRay(String x){
        mmerk = x;
    }
    
    public String getMerkRay(){
        return mmerk;
    }
    
    public void setProcRay(processor1841720121Ray y){
        mproc = y;
    }
    
    public processor1841720121Ray getProcRay(){
        return mproc;
    }
    
    public void infoRay(){
        System.out.println("Merk Laptop = " + mmerk);
        mproc.infoRay();
    }
}
