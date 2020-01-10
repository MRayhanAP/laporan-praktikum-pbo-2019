package unittest;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Asus
 */
public class Anggota1841720121Ray {

    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720121Ray() {
    }

    public Anggota1841720121Ray(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getIdanggotaRay() {
        return mIdanggota;
    }

    public void setIdanggotaRay(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getNamaRay() {
        return mNama;
    }

    public void setNamaRay(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatRay() {
        return mAlamat;
    }

    public void setAlamatRay(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponRay() {
        return mTelepon;
    }

    public void setTeleponRay(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public Anggota1841720121Ray getByIdRay(int id) {
        Anggota1841720121Ray agt = new Anggota1841720121Ray();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720121Ray();
                agt.setIdanggotaRay(rs.getInt("idanggota"));
                agt.setNamaRay(rs.getString("nama"));
                agt.setAlamatRay(rs.getString("alamat"));
                agt.setTeleponRay(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720121Ray> getAllRay() {
        ArrayList<Anggota1841720121Ray> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720121Ray agt = new Anggota1841720121Ray();
                agt.setIdanggotaRay(rs.getInt("idanggota"));
                agt.setNamaRay(rs.getString("nama"));
                agt.setAlamatRay(rs.getString("alamat"));
                agt.setTeleponRay(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720121Ray> searchRay(String keyword) {
        ArrayList<Anggota1841720121Ray> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720121Ray.selectQueryRay(sql);

        try {
            while (rs.next()) {
                Anggota1841720121Ray agt = new Anggota1841720121Ray();
                agt.setIdanggotaRay(rs.getInt("idanggota"));
                agt.setNamaRay(rs.getString("nama"));
                agt.setAlamatRay(rs.getString("alamat"));
                agt.setTeleponRay(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720121Ray> getByNamaAndAlamatAndTeleponRay(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720121Ray> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'  AND telepon = '" + telepon + "'");

        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0)) {
            rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM anggota WHERE nama = '" + nama + "'");

        } else {
            rs = DBHelper1841720121Ray.selectQueryRay(
                    "SELECT * FROM anggota "
                    + "WHERE alamat = '" + alamat + "'  ");
        }
        try {
            while (rs.next()) {
                Anggota1841720121Ray ang = new Anggota1841720121Ray();
                ang.setIdanggotaRay(rs.getInt("idanggota"));
                ang.setNamaRay(rs.getString("nama"));
                ang.setAlamatRay(rs.getString("alamat"));
                ang.setTeleponRay(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveRay() {
        if (getByIdRay(mIdanggota).getIdanggotaRay() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdanggota = DBHelper1841720121Ray.insertQueryGetIdRay(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.mNama + "', " + " alamat = '" + this.mAlamat + "', " + " telepon = '" + this.mTelepon + "' " + " WHERE idanggota = '" + this.mIdanggota + "'";
            DBHelper1841720121Ray.executeQueryRay(SQL);
        }
    }

    public void deleteRay() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720121Ray.executeQueryRay(SQL);
    }
}
