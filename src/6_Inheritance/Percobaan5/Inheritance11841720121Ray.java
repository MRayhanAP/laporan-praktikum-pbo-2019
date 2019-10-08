/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan5;

/**
 *
 * @author ASUS
 */
public class Inheritance11841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager1841720121Ray M = new Manager1841720121Ray();
        M.nama="Sylvie";
        M.alamat="Jl. iSekai";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManagerRay();
        
        Staff1841720121Ray S = new Staff1841720121Ray();
        S.nama="Lily";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaffRay();
    }
}