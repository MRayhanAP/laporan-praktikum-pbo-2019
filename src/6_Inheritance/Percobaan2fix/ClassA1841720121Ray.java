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
public class ClassA1841720121Ray {
    private int mx;
    private int my;
    
    public void setXRay(int mx) {
        this.mx = mx;
    }

    public void setYRay(int my) {
        this.my = my;
    }
    
    public void getNilaiRay(){
        System.out.println("nilai x: "+mx);
        System.out.println("nilai y: "+my);
    }
    
    public int getXRay() {
        return mx;
    }

    public int getYRay() {
        return my;
    }
}
