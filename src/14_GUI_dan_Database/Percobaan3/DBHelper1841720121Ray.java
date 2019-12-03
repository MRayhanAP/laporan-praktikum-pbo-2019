/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class DBHelper1841720121Ray {
    private static Connection sKoneksi;

    public static void bukaKoneksiRay(){
        if (sKoneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sKoneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbperpus?useTimezone=true&serverTimezone=UTC", "root", "");
            } catch (Exception t) {
                System.out.println("Error koneksi!");
            }
        }
    }
    
    public static int insertQueryGetIdRay(String query) {
        bukaKoneksiRay();
        int num = 0;
        int result = -1;

        try {
            Statement stmt = sKoneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQueryRay(String query) {
        bukaKoneksiRay();
        boolean result = false;

        try {
            Statement stmt = sKoneksi.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQueryRay(String query) {
        bukaKoneksiRay();
        ResultSet rs = null;
        try {
            Statement stmt = sKoneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}