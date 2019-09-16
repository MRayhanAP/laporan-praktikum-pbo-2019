/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class EncapDemo1841720121Ray {
    private String mname;
    private int mage;
    
    public String getName(){
        return mname;
    }
    
    public void setName(String newName){
        mname = newName;
    } 
    
    public int getAge(){
        return mage;
    }
    
    public void setAge(int newAge){
        if(newAge < 30){
            mage = 30;
        }
        else{
            mage = newAge;
        }
    }
}