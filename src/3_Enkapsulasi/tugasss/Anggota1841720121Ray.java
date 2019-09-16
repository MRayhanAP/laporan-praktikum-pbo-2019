/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss;

/**
 *
 * @author ASUS
 */
public class Anggota1841720121Ray {
    private String mid;
    private String mnama;
    private int mpinjaman;
    
    Anggota1841720121Ray(String mid, String mnama, int mpinjaman){
        this.mid = mid;
        this.mnama = mnama;
        this.mpinjaman = mpinjaman;
    }
    
    public void setNama(String mnama){
        this.mnama = mnama;
    }
    public void pinjam(int mpinjaman){
        if(mpinjaman > 5000000){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
        else{
            this.mpinjaman = mpinjaman;
        }
    }
    public String getNama(){
        return mnama;
    }
    public int getLimitPinjaman(){
        return mpinjaman;
    }
    public int getJumlahPinjam(){ 
        return mpinjaman;
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