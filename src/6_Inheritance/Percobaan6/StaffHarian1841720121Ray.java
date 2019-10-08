/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan6;

import Percobaan5.Staff1841720121Ray;
/**
 *
 * @author ASUS
 */
public class StaffHarian1841720121Ray extends Staff1841720121Ray{
    public int jmlJamKerja;

    public StaffHarian1841720121Ray() {
        
    }

    public StaffHarian1841720121Ray(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarianRay(){
        System.out.println("==============Data Staff Harian===========");
        super.tampilDataStaffRay();
        System.out.println("Jumlah Jam Kerja     = "+jmlJamKerja);
        System.out.println("Gaji Bersih          = "+(gaji+lembur-potongan));
    }
}