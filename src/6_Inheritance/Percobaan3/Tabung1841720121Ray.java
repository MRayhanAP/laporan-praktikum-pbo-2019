/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author ASUS
 */
public class Tabung1841720121Ray extends Bangun1841720121Ray{
    protected int t;
    
    public void setSuperPhiRay(double phi){
        super.phi = phi;
    }
    
    public void setSuperRay(int r){
        super.r = r;
    }

    public void setTRay(int t) {
        this.t = t;
    }
    
    public void volumeRay(){
        System.out.println("Volume Tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }
}