/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kreta;

/**
 *
 * @author ASUS
 */
public class mainpercobaan41841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penumpang1841720121Ray p = new Penumpang1841720121Ray("12345", "Mr. Krab");
        Gerbong1841720121Ray gerbong = new Gerbong1841720121Ray("A", 10);
        gerbong.setPenumpangRay(p, 1);
        System.out.println(gerbong.infoRay());
    }
    
}
