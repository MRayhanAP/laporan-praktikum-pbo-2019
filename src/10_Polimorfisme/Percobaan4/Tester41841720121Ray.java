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
public class Tester41841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owner1841720121Ray ow =new Owner1841720121Ray();
        ElectricityBill1841720121Ray eBill = new ElectricityBill1841720121Ray(5, "R-1");
        ow.payRay(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720121Ray pEmp =new PermanentEmployee1841720121Ray("Dedik", 500);
        ow.payRay(pEmp);
        System.out.println("-----------------------------");
        
        InternshipEmployee1841720121Ray iEmp = new InternshipEmployee1841720121Ray("Sunarto", 5);
        ow.showMyEmployeeRay(pEmp);
        System.out.println("---------------------------------------");
        ow.showMyEmployeeRay(iEmp);
    }
}
