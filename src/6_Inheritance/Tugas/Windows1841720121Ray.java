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
public class Windows1841720121Ray extends Leptop1841720121Ray{
    public String fitur;
    
    public Windows1841720121Ray(){
        
    }
    
    public Windows1841720121Ray(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    public void tampilWindowsRay(){
        System.out.println("======== Data Windows ========");
        super.tampilLeptopRay();
        System.out.println("Fitur        = "+fitur);
    }
}
