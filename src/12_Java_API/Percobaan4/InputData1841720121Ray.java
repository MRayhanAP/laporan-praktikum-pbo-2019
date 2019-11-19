/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class InputData1841720121Ray {
    ArrayList<Mahasiswa1841720121Ray>ListMahasiswa;

    public InputData1841720121Ray() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataRay (String Nim, String Nama, String Alamat){
        Mahasiswa1841720121Ray mhs = new Mahasiswa1841720121Ray (Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720121Ray> getDataRay(){
        return ListMahasiswa;
    }
}
