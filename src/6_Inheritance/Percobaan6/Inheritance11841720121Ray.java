/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan6;

/**
 *
 * @author ASUS
 */
public class Inheritance11841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaffTetap1841720121Ray ST = new StaffTetap1841720121Ray("2A", 100000, 200000, 250000, "Von", "Malang", "Laki-laki", 20, 2000000);
        ST.tampilStaffTetapRay();
        
        StaffHarian1841720121Ray SH = new StaffHarian1841720121Ray(100, 100000, 50000, "Von", "Malang", "Laki-laki", 20, 2000000);
        SH.tampilStaffHarianRay();
    }
}
