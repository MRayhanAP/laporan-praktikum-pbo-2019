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
public class Leptop1841720121Ray extends Komputer1841720121Ray {
    public String jnsBatrei;
    
    public Leptop1841720121Ray(){
        
    }
    
    public Leptop1841720121Ray(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLeptopRay(){
        super.tampilDataRay();
        System.out.println("Jenis Batrei    = "+jnsBatrei);
    }
}   
