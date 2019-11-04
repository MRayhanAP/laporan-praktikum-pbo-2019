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
public class Owner1841720121Ray {
    public void payRay(Payable1841720121Ray p) {
        System.out.println("Total payment = "+p.getPaymentAmountRay());
        if(p instanceof ElectricityBill1841720121Ray){
            ElectricityBill1841720121Ray eb = (ElectricityBill1841720121Ray)p;
            System.out.println(""+eb.getBillInfoRay());
        }else if(p instanceof PermanentEmployee1841720121Ray){
            PermanentEmployee1841720121Ray pe = (PermanentEmployee1841720121Ray) p;
            pe.getEmployeeInfoRay();
            System.out.println(""+pe.getEmployeeInfoRay());
        }
    }
    
    public void showMyEmployeeRay(Employee1841720121Ray e){
        System.out.println(""+e.getEmployeeInfoRay());
        if (e instanceof PermanentEmployee1841720121Ray) 
            System.out.println("You Have to pay her/him monthly!!!");
        else 
            System.out.println("No need to pay him/her :)");
    }
}
