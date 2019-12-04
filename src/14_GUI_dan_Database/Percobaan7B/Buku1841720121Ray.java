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
public class Buku1841720121Ray {
    private int idbuku;
    private Kategori1841720121Ray kategori = new Kategori1841720121Ray();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdbukuRay() {
        return idbuku;
    }

    public void setIdbukuRay(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori1841720121Ray getKategoriRay() {
        return kategori;
    }

    public void setKategoriRay(Kategori1841720121Ray kategori) {
        this.kategori = kategori;
    }

    public String getJudulRay() {
        return judul;
    }

    public void setJudulRay(String judul) {
        this.judul = judul;
    }

    public String getPenerbitRay() {
        return penerbit;
    }

    public void setPenerbitRay(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulisRay() {
        return penulis;
    }

    public void setPenulisRay(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku1841720121Ray() {
    
    }
    
    public Buku1841720121Ray(Kategori1841720121Ray kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku1841720121Ray getByIdRay(int id) {
        Buku1841720121Ray buku = new Buku1841720121Ray();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.idbuku = '" + id + "'");
        try {
            while(rs.next()) {
                buku = new Buku1841720121Ray();
                buku.setIdbukuRay(rs.getInt("idbuku"));
                buku.getKategoriRay().setIdkategoriRay(rs.getInt("idkategori"));
                buku.getKategoriRay().setNamaRay(rs.getString("nama"));
                buku.getKategoriRay().setKeteranganRay(rs.getString("keterangan"));
                buku.setJudulRay(rs.getString("judul"));
                buku.setPenerbitRay(rs.getString("penerbit"));
                buku.setPenulisRay(rs.getString("penulis"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720121Ray> getAllRay() {
        ArrayList<Buku1841720121Ray> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()) {
                Buku1841720121Ray buku = new Buku1841720121Ray();
                buku.setIdbukuRay(rs.getInt("idbuku"));
                buku.getKategoriRay().setIdkategoriRay(rs.getInt("idkategori"));
                buku.getKategoriRay().setNamaRay(rs.getString("nama"));
                buku.getKategoriRay().setKeteranganRay(rs.getString("keterangan"));
                buku.setJudulRay(rs.getString("judul"));
                buku.setPenerbitRay(rs.getString("penerbit"));
                buku.setPenulisRay(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720121Ray> searchRay(String keyword) {
        ArrayList<Buku1841720121Ray> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.judul LIKE '%" + keyword + "%'"
                                                    + " OR b.penerbit LIKE '%" + keyword + "%'"
                                                    + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while(rs.next()) {
                Buku1841720121Ray buku = new Buku1841720121Ray();
                buku.setIdbukuRay(rs.getInt("idbuku"));
                buku.getKategoriRay().setIdkategoriRay(rs.getInt("idkategori"));
                buku.getKategoriRay().setNamaRay(rs.getString("nama"));
                buku.getKategoriRay().setKeteranganRay(rs.getString("keterangan"));
                buku.setJudulRay(rs.getString("judul"));
                buku.setPenerbitRay(rs.getString("penerbit"));
                buku.setPenulisRay(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void saveRay() {
        if(getByIdRay(idbuku).getIdbukuRay() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + "'" + this.judul + "', "
                        + "'" + this.getKategoriRay().getIdkategoriRay() + "', "
                        + "'" + this.penulis + "', "
                        + "'" + this.penerbit + "'"
                        + ")";
            this.idbuku = DBHelper1841720121Ray.insertQueryGetIdRay(SQL);
        }
        else {
            String SQL = "UPDATE buku SET"
                        + " judul = '" + this.judul + "', "
                        + " idkategori = '" + this.getKategoriRay().getIdkategoriRay() + "', "
                        + " penulis = '" + this.penulis + "', "
                        + " penerbit = '" + this.penerbit + "' "
                        + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper1841720121Ray.executeQueryRay(SQL);
        }
    }
    
    public void deleteRay() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720121Ray.executeQueryRay(SQL);
    }
}