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
public class Tester1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1841720121Ray pEmp =new PermanentEmployee1841720121Ray("Dedik", 500);
        InternshipEmployee1841720121Ray iEmp = new InternshipEmployee1841720121Ray("Sunarto", 5);
        ElectricityBill1841720121Ray eBill = new ElectricityBill1841720121Ray(5, "A-1");
        Employee1841720121Ray e;
        Payable1841720121Ray p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
    
}
