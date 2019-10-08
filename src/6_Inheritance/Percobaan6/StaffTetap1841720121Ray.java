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
public class StaffTetap1841720121Ray extends Staff1841720121Ray{
    public String golongan;
    public int asuransi;

    public StaffTetap1841720121Ray() {
        
    }

    public StaffTetap1841720121Ray(String golongan, int asuransi, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
 
    public void tampilStaffTetapRay(){
        System.out.println("==============Data Staff Tetap===========");
        super.tampilDataStaffRay();
        System.out.println("Golongan            = "+golongan);
        System.out.println("Jumlah Asuransi     = "+asuransi);
        System.out.println("Gaji Bersih         = "+(gaji+lembur-potongan-asuransi));
    }
}
