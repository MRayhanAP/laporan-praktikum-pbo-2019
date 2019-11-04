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
public class Plant1841720121Ray {
    public void doDestroy (Destroyable1841720121Ray d){
        if (d instanceof WalkingZombie1841720121Ray){
            WalkingZombie1841720121Ray wz = (WalkingZombie1841720121Ray) d;
            wz.destroyedRay();
        }else if (d instanceof JumpingZombie1841720121Ray){
            JumpingZombie1841720121Ray jz = (JumpingZombie1841720121Ray) d;
            jz.destroyedRay();
        }else if (d instanceof Barrier1841720121Ray){
            Barrier1841720121Ray b = (Barrier1841720121Ray) d;
            b.destroyedRay();
        }
    }
}
