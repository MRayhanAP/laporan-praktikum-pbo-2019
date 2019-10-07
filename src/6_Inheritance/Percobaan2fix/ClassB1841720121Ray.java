/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author ASUS
 */
public class ClassB1841720121Ray extends ClassA1841720121Ray{
    private int mz;

    public void setZRay(int mz) {
        this.mz = mz;
    }

    public void getNilaiZRay() {
        System.out.println("nilai Z: "+mz);
    }
    
    public void getJumlahRay(){
        System.out.println("Jumlah: "+(getXRay()+getYRay()+mz));
    }  
}