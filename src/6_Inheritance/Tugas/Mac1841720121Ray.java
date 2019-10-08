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
public class Mac1841720121Ray extends Leptop1841720121Ray {
    public String security;
    
    public Mac1841720121Ray(){
        
    }
    
    public Mac1841720121Ray(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    
    public void tampilMacRay(){
        System.out.println("======== Data MAC ========");
        super.tampilLeptopRay();
        System.out.println("Security        = "+security);
    }
}
