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
public class WalkingZombie1841720121Ray extends Zombie1841720121Ray {
    public WalkingZombie1841720121Ray(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void healRay(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    public void destroyedRay(){
        health -= health*0.19;
    }
    public String getZombieInfoRay(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfoRay()+"\n";
        return info;
    }  
}
