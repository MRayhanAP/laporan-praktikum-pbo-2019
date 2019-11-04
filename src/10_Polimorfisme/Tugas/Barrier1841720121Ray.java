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
public class Barrier1841720121Ray implements Destroyable1841720121Ray {
    private int strength;
    
    public Barrier1841720121Ray (int strength){
        this.strength = strength;
    }
    public void setStrengthRay (int strength){
        this.strength = strength;
    }
    public int getStrengthRay (){
        return strength;
    } 
    public void destroyRay(){
        strength -= strength*0.1;
    }  
    public void destroyedRay(){
        destroyRay();
    }
    public String getBarrierInfoRay(){
        return "Barrier Strength = "+strength+"\n";
    }
    
}
