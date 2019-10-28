package Percobaan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Program1841720121Ray {
    public static void main(String[] args) {
        Kucing1841720121Ray KucingKampung = new Kucing1841720121Ray();
        Ikan1841720121Ray LumbaLumba =  new Ikan1841720121Ray();
        
        Orang1841720121Ray ani = new Orang1841720121Ray("Ani");
        Orang1841720121Ray budi = new Orang1841720121Ray("Budi");
        
        budi.peliharaHewanRay(LumbaLumba);
        ani.peliharaHewanRay(KucingKampung);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}