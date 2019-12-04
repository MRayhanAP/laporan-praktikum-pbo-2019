/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;
import backend.*;
/**
 *
 * @author ASUS
 */
public class Anggota1841720121Ray {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdAnggotaRay() {
        return idAnggota;
    }

    public void setIdAnggotaRay(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaRay() {
        return nama;
    }

    public void setNamaRay(String nama) {
        this.nama = nama;
    }

    public String getAlamatRay() {
        return alamat;
    }

    public void setAlamatRay(String alamat) {
        this.alamat = alamat;
    }

    public String getTeleponRay() {
        return telepon;
    }

    public void setTeleponRay(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720121Ray() {
    }

    public Anggota1841720121Ray(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public Anggota1841720121Ray getByIdRay(int id) {
        Anggota1841720121Ray agt = new Anggota1841720121Ray();
        ResultSet rs = DBHelper1841720121Ray.selectQueryRay("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720121Ray();
                agt.setIdAnggotaRay(rs.getInt("idAnggota"));
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
                agt.setIdAnggotaRay(rs.getInt("idAnggota"));
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

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720121Ray.selectQueryRay(sql);

        try {
            while (rs.next()) {
                Anggota1841720121Ray agt = new Anggota1841720121Ray();
                agt.setIdAnggotaRay(rs.getInt("idAnggota"));
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
    
    public void saveRay(){
        if(getByIdRay(idAnggota).getIdAnggotaRay() == 0){
            String SQL = "Insert into anggota (nama,alamat,telepon) values(" 
                    + " '" +this.nama + "', "
                    + " '" +this.alamat + "', "
                    + " '"+this.telepon+"' "
                    + " )";
                    this.idAnggota = DBHelper1841720121Ray.insertQueryGetIdRay(SQL);
        }else{
            String SQL = "Update anggota set"
                   + " nama = '" +this.nama +"', "
                   + " alamat = '" +this.alamat +"', "
                   + " telepon = '"+this.telepon+"' "
                   +"Where idAnggota = '"+this.idAnggota+"'";
            DBHelper1841720121Ray.executeQueryRay(SQL);
        }
    }
    
    public void deleteRay(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '"+this.idAnggota+"'";
        DBHelper1841720121Ray.executeQueryRay(SQL);
    }
}