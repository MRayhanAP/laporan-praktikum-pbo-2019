/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motor;

/**
 *
 * @author ASUS
 */
public class motor1841720121Ray {
    public int mkecepatan = 0;
    public boolean mkontakOn = false;
    
    public void printStatusRay(){
        if (mkontakOn == true){
        System.out.println("Kontak On");
    }
    else{
        System.out.println("Kontak Off");
    }
        System.out.println("Kecepatan "+ mkecepatan + "\n");
    }            
}
