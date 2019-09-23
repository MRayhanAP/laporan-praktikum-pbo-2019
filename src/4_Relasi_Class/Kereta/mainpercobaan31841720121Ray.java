package Kereta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class mainpercobaan31841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai1841720121Ray masinis = new Pegawai1841720121Ray("1234", "Spongebob Squarepants");
        Pegawai1841720121Ray asisten = new Pegawai1841720121Ray("4567", "Patrick Star");
        KeretaApi1841720121Ray keretaApi = new KeretaApi1841720121Ray("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.print(keretaApi.infoRay());
    }
    
}