/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class Main1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia1841720121Ray human = new Manusia1841720121Ray();
        Manusia1841720121Ray dosen = new Dosen1841720121Ray();
        Manusia1841720121Ray mahasiwa = new Mahasiswa1841720121Ray();
        
        human.BernafasRay();
        human.MakanRay();
        mahasiwa.MakanRay();
        dosen.MakanRay();
    }
    
}
