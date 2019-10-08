/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan5;

/**
 *
 * @author ASUS
 */
public class Manager1841720121Ray extends Karyawan1841720121Ray {
    public int tunjangan;
    
    public Manager1841720121Ray(){
        
    }
    
    public void tampilDataManagerRay(){
        super.tampilDataKaryawanRay();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("Total Gaji      = "+super.gaji+tunjangan);
    }
}