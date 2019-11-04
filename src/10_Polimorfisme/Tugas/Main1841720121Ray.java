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
public class Main1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WalkingZombie1841720121Ray wz = new WalkingZombie1841720121Ray(100,1);
        JumpingZombie1841720121Ray jz = new JumpingZombie1841720121Ray(100,2);
        Barrier1841720121Ray b = new Barrier1841720121Ray (100);
        Plant1841720121Ray p = new Plant1841720121Ray();
        System.out.println(""+wz.getZombieInfoRay());
        System.out.println(""+jz.getZombieInfoRay());
        System.out.println(""+b.getBarrierInfoRay());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoRay());
        System.out.println(""+jz.getZombieInfoRay());
        System.out.println(""+b.getBarrierInfoRay());
    } 
}
