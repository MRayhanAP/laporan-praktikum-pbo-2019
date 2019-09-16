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
import java.util.Scanner;
public class TestKoperasi1841720121Ray {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        int mpilihan;
        int mnomorKtp;
        String mnama;
        int mpinjaman;
        int muang;
        
        System.out.print("Nomor KTP: ");
        mnomorKtp = scInt.nextInt();
        
        System.out.print("Nama: ");
        mnama = scString.nextLine();
        
        System.out.print("Pinjaman: ");
        mpinjaman = scInt.nextInt();
        
        Anggota1841720121Ray donny = new Anggota1841720121Ray(mnomorKtp, mnama, mpinjaman);
        do{
            System.out.println("1. Angsur");
            System.out.println("2. Lihat Jumlah Pinjaman");
            System.out.println("3. Tampilkan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            mpilihan = scInt.nextInt();
            switch(mpilihan){                    
                case 1:
                    System.out.print("Masukkan angsuran: ");
                    muang = scInt.nextInt();
                    donny.angsur(muang);
                    break;
                
                case 2:
                    System.out.println("Sisa Pinjaman: "+donny.getJumlahPinjam());
                    break;
                    
                case 3:
                    System.out.println("Nama: "+donny.getNama());
                    System.out.println("Nomor KTP: "+donny.getNomorKtp());
                    System.out.println("Limit Pinjaman: "+donny.getLimitPinjaman());
                    System.out.println("Sisa Pinjaman: "+donny.getJumlahPinjam());  
            }   
        }
        while(mpilihan!=4);
    }
}