/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laptop;

/**
 *
 * @author ASUS
 */
public class mainpercobaan11841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        processor1841720121Ray p = new processor1841720121Ray("Intel i5", 3);
        laptop1841720121Ray L = new laptop1841720121Ray("Thinkpad", p);
        
        L.infoRay();
        
        processor1841720121Ray p1 = new processor1841720121Ray();
        p1.setMerkRay("Intel i5");
        p1.setCacheRay(4);
        laptop1841720121Ray L1 = new laptop1841720121Ray();
        L1.setMerkRay("Thinkpad");
        L1.setProcRay(p1);
        L1.infoRay();
    }
}
