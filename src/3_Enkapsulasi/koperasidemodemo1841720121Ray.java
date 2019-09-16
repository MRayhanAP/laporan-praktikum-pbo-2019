/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasigettersetterr;

/**
 *
 * @author ASUS
 */
public class koperasidemodemo1841720121Ray {
    public static void main(String[] args) {
        Anggotaanggota1841720121Ray kruu = new Anggotaanggota1841720121Ray("Reykun","Japan Jl.Kurousagi No. 9");
        System.out.println("Simpanan "+kruu.getNamaRayy()+" : "+kruu.getSimpananRayy());
        
        kruu.setNamaRayy("Rey Kun");
        kruu.setAlamatRayy("Japan Jl.Kurousagi No. 9");
        kruu.setorRayy(100000);
        System.out.println("Simpanan "+kruu.getNamaRayy()+" : "+kruu.getSimpananRayy());
        
        kruu.pinjam(5000);
        System.out.println("Simpanan "+kruu.getNamaRayy()+" : "+kruu.getSimpananRayy());
    }
}
