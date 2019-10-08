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
public class Pc1841720121Ray extends Komputer1841720121Ray{
    public int ukuranMonitor;
    public Pc1841720121Ray(){
        
    }
    
    public Pc1841720121Ray(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;;
    }
    
    public void tampilPCRay(){
        super.tampilDataRay();
        System.out.println("Ukuran Monitor  = "+ukuranMonitor);
    }
}
