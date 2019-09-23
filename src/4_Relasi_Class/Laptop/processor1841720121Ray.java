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
public class processor1841720121Ray {
    private String mmerk;
    private double mcache;
    
    processor1841720121Ray(String merk, double cache){
        this.mmerk = merk;
        this.mcache = cache;
    }
    public processor1841720121Ray() {
        
    }
     public void setMerkRay(String x){
        mmerk = x;
    }
    
    public String getMerkRay(){
        return mmerk;
    }
    
    public void setCacheRay(double y){
        mcache = y;
    }
    
    public double getCacheRay(){
        return mcache;
    }
    
    public void infoRay(){
        System.out.printf("Merk Processor = %s\n", mmerk);
        System.out.printf("Cache Memory = %.2f\n", mcache);
    }
    
}

