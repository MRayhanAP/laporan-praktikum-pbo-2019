/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Anggota1841720121Ray;
import backend.Buku1841720121Ray;
import backend.Peminjaman1841720121Ray;
/**
 *
 * @author ASUS
 */
public class TesBeckendPinjam1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota1841720121Ray Ardan = new Anggota1841720121Ray().getByIdRay(2);
        Buku1841720121Ray kenanglah = new Buku1841720121Ray().getByIdRay(15);
        Peminjaman1841720121Ray peminjaman2 = new Peminjaman1841720121Ray(Ardan, kenanglah, "2019/12/21", "2020/01/21");
         
        
         peminjaman2.saveRay();
         
         for (Peminjaman1841720121Ray p : new Peminjaman1841720121Ray().getAllRay()) {
            System.out.println("Nama Anggota : " + p.getAnggotaRay().getNamaRay()+ ", Judul Buku : " + p.getBukuRay().getJudulRay()+ ", " + "Tanggal Pinjam: " + p.getTanggalpinjamRay()+ ", Tanggal Kembali: " + p.getTanggalkembaliRay());
        }
    }
   
}