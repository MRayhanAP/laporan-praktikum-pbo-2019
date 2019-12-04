/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Peminjaman1841720121Ray {
    private int idpeminjaman;
    private Anggota1841720121Ray anggota = new Anggota1841720121Ray();
    private Buku1841720121Ray buku = new Buku1841720121Ray();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman1841720121Ray() {
    }

    public Peminjaman1841720121Ray(Anggota1841720121Ray anggota, Buku1841720121Ray buku, String tanggalpinjam, String tanggalkembali) {        
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }    

    public int getIdpeminjamanRay() {
        return idpeminjaman;
    }

    public void setIdpeminjamanRay(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota1841720121Ray getAnggotaRay() {
        return anggota;
    }

    public void setAnggotaRay(Anggota1841720121Ray anggota) {
        this.anggota = anggota;
    }

    public Buku1841720121Ray getBukuRay() {
        return buku;
    }

    public void setBukuRay(Buku1841720121Ray buku) {
        this.buku = buku;
    }

    public String getTanggalpinjamRay() {
        return tanggalpinjam;
    }

    public void setTanggalpinjamRay(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembaliRay() {
        return tanggalkembali;
    }

    public void setTanggalkembaliRay(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    
    
    public Peminjaman1841720121Ray getByIdRay(int id){
        Peminjaman1841720121Ray peminjaman = new Peminjaman1841720121Ray();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.idpeminjaman = '"+ id + "'");
        try {
            while(rs.next()){
                peminjaman = new Peminjaman1841720121Ray();
                peminjaman.setIdpeminjamanRay(rs.getInt("idbuku"));
                peminjaman.getAnggotaRay().setIdAnggotaRay(rs.getInt("idanggota"));
                peminjaman.getAnggotaRay().setNamaRay(rs.getString("nama_anggota"));
                peminjaman.getAnggotaRay().setAlamatRay(rs.getString("alamat"));
                peminjaman.getAnggotaRay().setTeleponRay(rs.getString("telepon"));
                peminjaman.getBukuRay().setIdbukuRay(rs.getInt("idbuku"));
                peminjaman.getBukuRay().getKategoriRay().setIdkategoriRay(rs.getInt("idkategori"));
                peminjaman.getBukuRay().getKategoriRay().setNamaRay(rs.getString("nama_kategori"));
                peminjaman.getBukuRay().getKategoriRay().setKeteranganRay(rs.getString("keterangan"));
                peminjaman.getBukuRay().setJudulRay(rs.getString("judul"));
                peminjaman.getBukuRay().setPenerbitRay(rs.getString("penerbit"));
                peminjaman.getBukuRay().setPenulisRay(rs.getString("penulis"));
                peminjaman.setTanggalpinjamRay(rs.getDate("tanggalpinjam").toString());
                peminjaman.setTanggalkembaliRay(rs.getDate("tanggalkembali").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }
    
    public ArrayList<Peminjaman1841720121Ray> getAllRay(){
        ArrayList<Peminjaman1841720121Ray> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota ");
        
        try {
            while(rs.next()){
                Peminjaman1841720121Ray peminjaman = new Peminjaman1841720121Ray();
                peminjaman.setIdpeminjamanRay(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaRay().setIdAnggotaRay(rs.getInt("idanggota"));
                peminjaman.getAnggotaRay().setNamaRay(rs.getString("nama_anggota"));
                peminjaman.getAnggotaRay().setAlamatRay(rs.getString("alamat"));
                peminjaman.getAnggotaRay().setTeleponRay(rs.getString("telepon"));
                peminjaman.getBukuRay().setIdbukuRay(rs.getInt("idbuku"));
                peminjaman.getBukuRay().getKategoriRay().setIdkategoriRay(rs.getInt("idkategori"));
                peminjaman.getBukuRay().getKategoriRay().setNamaRay(rs.getString("nama_kategori"));
                peminjaman.getBukuRay().getKategoriRay().setKeteranganRay(rs.getString("keterangan"));
                peminjaman.getBukuRay().setJudulRay(rs.getString("judul"));
                peminjaman.getBukuRay().setPenerbitRay(rs.getString("penerbit"));
                peminjaman.getBukuRay().setPenulisRay(rs.getString("penulis"));
                peminjaman.setTanggalpinjamRay(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliRay(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1841720121Ray> searchRay(String keyword){
        ArrayList<Peminjaman1841720121Ray> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
                                        +"          OR p.tanggalkembali LIKE '%" + keyword + "%' ");
        
        try {
            while(rs.next()){
                Peminjaman1841720121Ray peminjaman = new Peminjaman1841720121Ray();
                peminjaman.setIdpeminjamanRay(rs.getInt("idbuku"));
                peminjaman.getAnggotaRay().setIdAnggotaRay(rs.getInt("idanggota"));
                peminjaman.getAnggotaRay().setNamaRay(rs.getString("nama_anggota"));
                peminjaman.getAnggotaRay().setAlamatRay(rs.getString("alamat"));
                peminjaman.getAnggotaRay().setTeleponRay(rs.getString("telepon"));
                peminjaman.getBukuRay().setIdbukuRay(rs.getInt("idbuku"));
                peminjaman.getBukuRay().getKategoriRay().setIdkategoriRay(rs.getInt("idkategori"));
                peminjaman.getBukuRay().getKategoriRay().setNamaRay(rs.getString("nama_kategori"));
                peminjaman.getBukuRay().getKategoriRay().setKeteranganRay(rs.getString("keterangan"));
                peminjaman.getBukuRay().setJudulRay(rs.getString("judul"));
                peminjaman.getBukuRay().setPenerbitRay(rs.getString("penerbit"));
                peminjaman.getBukuRay().setPenulisRay(rs.getString("penulis"));
                peminjaman.setTanggalpinjamRay(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliRay(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public void saveRay(){
        if(getByIdRay(idpeminjaman).getIdpeminjamanRay()== 0){
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    +"      '"+ this.getAnggotaRay().getIdAnggotaRay()+"', "
                    +"      '"+ this.getBukuRay().getIdbukuRay()+"', "
                    +"      '"+ this.tanggalpinjam + "', "
                    +"      '"+ this.tanggalkembali + "' "
                    +"      )";
            this.idpeminjaman = DBHelper1841720121Ray.insertQueryGetIdRay(SQL);
            
        } else {
            String SQL = "UPDATE peminjaman SET "
                    +"      idanggota = '"+ this.getAnggotaRay().getIdAnggotaRay() + "', "
                    +"      idbuku = '"+ this.getBukuRay().getIdbukuRay()+"', "
                    +"      tanggalpinjam = '"+ this.tanggalpinjam +"', "
                    +"      tanggalkembali = '"+ this.tanggalkembali +"' "
                    +"      WHERE idpeminjaman = '"+this.idpeminjaman + "'";
            DBHelper1841720121Ray.executeQueryRay(SQL);
        }
    }
    
    public void deleteRay(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720121Ray.executeQueryRay(SQL);
    }   
    
}