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
public class InternshipEmployee1841720121Ray extends Employee1841720121Ray {
    private int length;

    public InternshipEmployee1841720121Ray(String name,int length) {
        this.length = length;
        this.name = name;
    }

    public int getLengthRay() {
        return length;
    }

    public void setLengthRay(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoRay(){
        String info=super.getEmployeeInfoRay()+"\n";
        info += "Registerd as internship employee for "+length+" month/s\n";
        return info;
    }   
}
