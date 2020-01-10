package unittest;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Asus
 */
public class Kategori1841720121Ray {

    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720121Ray() {
    }

    public Kategori1841720121Ray(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getIdkategoriRay() {
        return mIdkategori;
    }

    public void setIdkategoriRay(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getNamaRay() {
        return mNama;
    }

    public void setNamaRay(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganRay() {
        return mKeterangan;
    }

    public void setKeteranganRay(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720121Ray getByIdRay(int id) {
        Kategori1841720121Ray kat = new Kategori1841720121Ray();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720121Ray();
                kat.setIdkategoriRay(rs.getInt("idkategori"));
                kat.setNamaRay(rs.getString("nama"));
                kat.setKeteranganRay(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720121Ray> getAllRay() {
        ArrayList<Kategori1841720121Ray> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720121Ray kat = new Kategori1841720121Ray();
                kat.setIdkategoriRay(rs.getInt("idkategori"));
                kat.setNamaRay(rs.getString("nama"));
                kat.setKeteranganRay(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720121Ray> searchRay(String keyword) {
        ArrayList<Kategori1841720121Ray> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720121Ray.selectQueryRay(sql);

        try {
            while (rs.next()) {
                Kategori1841720121Ray kat = new Kategori1841720121Ray();
                kat.setIdkategoriRay(rs.getInt("idkategori"));
                kat.setNamaRay(rs.getString("nama"));
                kat.setKeteranganRay(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720121Ray> getByNamaAndKeteranganRay(String nama, String keterangan) {
        ArrayList<Kategori1841720121Ray> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720121Ray.selectQueryRay(
                    "SELECT * FROM kategori "
                    + "WHERE nama = '" + nama + "'  AND keterangan = '" + keterangan + "'  ");

        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM kategori WHERE nama = '" + nama + "'");
        } else {
            rs = DBHelper1841720121Ray.selectQueryRay(
                    "SELECT * FROM kategori "
                    + "WHERE keterangan = '" + keterangan + "'  ");

        }
        try {
            while (rs.next()) {
                Kategori1841720121Ray kat = new Kategori1841720121Ray();
                kat.setIdkategoriRay(rs.getInt("idkategori"));
                kat.setNamaRay(rs.getString("nama"));
                kat.setKeteranganRay(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveRay() {
        if (getByIdRay(mIdkategori).getIdkategoriRay() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + " '" + this.mNama + "', " + " '" + this.mKeterangan + "' " + " )";
            this.mIdkategori = DBHelper1841720121Ray.insertQueryGetIdRay(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + " nama = '" + this.mNama + "', " + " keterangan = '" + this.mKeterangan + "' " + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720121Ray.executeQueryRay(SQL);
        }
    }

    public void deleteRay() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720121Ray.executeQueryRay(SQL);
    }

    public String toString() {
        return mNama;
    }
}
