/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotorEncapsulation;

/**
 *
 * @author ASUS
 */
public class motormodif1841720121Ray {
    private int mkecepatanm = 0;
    private boolean mkontakOnm = false;
    public void nyalakanMesinRay(){
        mkontakOnm = true;
    }
    public void matikanMesinRay(){
        mkontakOnm = false;
        mkecepatanm = 0;
    }
    public void tambahKecepatanRay(){
        if (mkontakOnm == true){
            mkecepatanm += 5;
        }
        else{
            System.out.println("Mesin mati jadi kecepatan tidak nambah! \n");
        }
    }
    public void kurangiKecepatanRay(){
        if(mkontakOnm == true){
            mkecepatanm -=5;
        }
        else{
            System.out.println("Mesin mati jadi kecepatan tidak berkurang! \n");
        }
    }
    public void prinStatusRay7(){
        if (mkontakOnm == true){
            System.out.println("kontak on");
        }
        else {
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan "+mkecepatanm+"\n");
    }
}
