/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

/**
 *
 * @author ASUS
 */
public class Anggota1841720121Ray {
    private int mnomorKtp;
    private String mnama;
    private int mpinjaman;
    
    Anggota1841720121Ray(int mnomorKtp, String mnama, int mpinjaman){
        this.mnomorKtp = mnomorKtp;
        this.mnama = mnama;
        this.mpinjaman = mpinjaman;
    }
    
    public void setNama(String nama){
        this.mnama = mnama;
    }
    public void setKtp(int nomorKtp){
        this.mnomorKtp = mnomorKtp;
    }
    public String getNama(){
        return mnama;
    }
    public int getNomorKtp(){
        return mnomorKtp;
    }
    public int getLimitPinjaman(){
        return mpinjaman;
    }
    public int getJumlahPinjam(){ 
        return mpinjaman;
    }
    public void pinjam(int pinjaman){
        if(pinjaman > 5000000){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
        else{
            this.mpinjaman = mpinjaman;
        }
    }
    public void angsur(int uang){
        int limit = mpinjaman*10/100;
        if(uang == limit){
            mpinjaman -=uang;
        }
        else{
           System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman"); 
        }    
    }
}