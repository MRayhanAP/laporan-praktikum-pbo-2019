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
public class Sarjana1841720121Ray extends Mahasiswa1841720121Ray implements ICumlaude1841720121Ray, IBerprestasi1841720121Ray{

    public Sarjana1841720121Ray(String mNama) {
        super(mNama);
    }

    @Override
    public void LulusRay() {
        System.out.println("Aku menyelesaikan SKRIPSI");
    }
    @Override
    public void MeraihIPKTinggiRay(){
        System.out.println("IPK-ku Lebih dari 3,51");
    }

    @Override
    public void KuliahDiKampusRay() {
        super.KuliahDiKampusRay();
    }

    @Override
    public void menjuaraiKompetisiRay() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIOAL");
    }

    @Override
    public void membuatPublikasiIlmiahRay() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
    
}