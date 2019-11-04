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
public class PermanentEmployee1841720121Ray extends Employee1841720121Ray implements Payable1841720121Ray {
    
    private int salary;
    
    public PermanentEmployee1841720121Ray(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryRay() {
        return salary;
    }

    public void setSalaryRay(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmountRay(){
        return(int)(salary+0.05+salary);
    }
    
    @Override
    public String getEmployeeInfoRay(){
        String info=super.getEmployeeInfoRay()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return  info;
    } 
}
