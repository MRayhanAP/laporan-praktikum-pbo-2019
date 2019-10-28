/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public abstract class Hewan1841720121Ray {
    private int mUmur;

    protected Hewan1841720121Ray() {
        this.mUmur = 0;
    }
    public void bertambahUmurRay(){
        this.mUmur +=1;
    }
    public abstract void bergerakRay();
    
}