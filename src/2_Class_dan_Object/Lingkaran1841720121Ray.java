/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JS2;

/**
 *
 * @author ASUS
 */
public class Lingkaran1841720121Ray {
    public double phi;
    public double r;
    
    public double hitungLuasRay(){
        double luas = phi * r;
        
        return luas;
    }
    
    public double hitungKelilingRay(){
        double keliling = phi * r/2;
        
        return keliling;
    }
    
    public void cetakHasilRay(){
        System.out.println("PHI : "+phi);
        System.out.println("Jari-jari : "+r);
        System.out.println("Luas : "+hitungLuasRay());
        System.out.println("Keliling : "+hitungKelilingRay());
    }
}
