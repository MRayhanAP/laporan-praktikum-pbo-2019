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
public abstract class Zombie1841720121Ray implements Destroyable1841720121Ray { 
    protected int health;    
    protected int level;     
    
    public String getZombieInfoRay(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void healRay();    
    @Override    
    public abstract void destroyedRay(); 
    
}
