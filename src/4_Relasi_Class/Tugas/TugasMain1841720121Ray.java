/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class TugasMain1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai1841720121Ray pi = new Pegawai1841720121Ray ("1841720121", "Rey kun");
        Loket1841720121Ray l = new Loket1841720121Ray(3);
        Pelanggan1841720121Ray pl = new Pelanggan1841720121Ray ("Reyasviel", "Tenki no Ko", 22);
        Tiket1841720121Ray t = new Tiket1841720121Ray(1841720121, 1, 25000);
        
        System.out.println("===============================");
        l.setPegawaiRay(pi);
        t.setPelangganRay(pl);
        l.infoRay();
        System.out.println("===============================");
        t.infoRay();
    }
    
}
