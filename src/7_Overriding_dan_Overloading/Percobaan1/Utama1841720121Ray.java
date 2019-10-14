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
public class Utama1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager1841720121Ray man[] = new Manager1841720121Ray[2];
        Staff1841720121Ray staff1[] = new Staff1841720121Ray[2];
        Staff1841720121Ray staff2[] = new Staff1841720121Ray[3];
        
        //pembuatan manager
        
        man[0] = new Manager1841720121Ray();
        man[0].setNamaRay("Tedjo");
        man[0].setNipRay("101");
        man[0].setGolonganRay("1");
        man[0].setTunjanganRay(5000000);
        man[0].setBagianRay("Administrasi");
        
        man[1] = new Manager1841720121Ray();
        man[1].setNamaRay("Atika");
        man[1].setNipRay("102");
        man[1].setGolonganRay("1");
        man[1].setTunjanganRay(2500000);
        man[1].setBagianRay("Pemasaran");
        
        staff1[0] = new Staff1841720121Ray();
        staff1[0].setNamaRay("Usman");
        staff1[0].setNipRay("0003");
        staff1[0].setGolonganRay("2");
        staff1[0].setLemburRay(10);
        staff1[0].setGajiLemburRay(10000);
        
        staff1[1] = new Staff1841720121Ray();
        staff1[1].setNamaRay("Anugrah");
        staff1[1].setNipRay("0005");
        staff1[1].setGolonganRay("2");
        staff1[1].setLemburRay(10);
        staff1[1].setGajiLemburRay(55000);
        man[0].setStaffRay(staff1);
        
        staff2[0] = new Staff1841720121Ray();
        staff2[0].setNamaRay("Hendra");
        staff2[0].setNipRay("0004");
        staff2[0].setGolonganRay("3");
        staff2[0].setLemburRay(15);
        staff2[0].setGajiLemburRay(5500);
        
        staff2[1] = new Staff1841720121Ray();
        staff2[1].setNamaRay("Arie");
        staff2[1].setNipRay("0006");
        staff2[1].setGolonganRay("4");
        staff2[1].setLemburRay(5);
        staff2[1].setGajiLemburRay(100000);
        
        staff2[2] = new Staff1841720121Ray();
        staff2[2].setNamaRay("Mentari");
        staff2[2].setNipRay("0007");
        staff2[2].setGolonganRay("3");
        staff2[2].setLemburRay(6);
        staff2[2].setGajiLemburRay(20000);
        man[1].setStaffRay(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].lihatinfo();
        man[1].lihatinfo();
        
        
    }
}