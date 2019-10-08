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
public class Komputer1841720121Ray {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    public Komputer1841720121Ray(){
        
    }
    
    public Komputer1841720121Ray(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilDataRay(){
        System.out.println("Merk            = "+merk);
        System.out.println("KecProsesor     = "+kecProsesor);
        System.out.println("Size Memory     = "+sizeMemory);
        System.out.println("Jenis Prosesor  = "+jnsProsesor);
    }
}
