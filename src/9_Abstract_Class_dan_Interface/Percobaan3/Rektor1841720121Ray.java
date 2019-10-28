/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;
/**
 *
 * @author ASUS
 */
public class Rektor1841720121Ray {
    public void BeriSertifikatCumlaude(ICumlaude1841720121Ray mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda..");
    
        mahasiswa.KuliahDiKampusRay();
        mahasiswa.LulusRay();
        mahasiswa.MeraihIPKTinggiRay();
    
        System.out.println("==========================================");
}
    public void beriSertifikatMawapres(IBerprestasi1841720121Ray mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisiRay();
        mahasiswa.membuatPublikasiIlmiahRay();
        
        System.out.println("==========================================");
    }
}