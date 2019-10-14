/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class Staff1841720121Ray extends Karyawan1841720121Ray{
    private int mlembur;
    private double mgajilembur;
    
    public void setLemburRay(int mlembur)
    {
        this.mlembur = mlembur;
    }
    public int getlemburRay()
    {
        return mlembur;
    }
    public void setGajiLemburRay(double mgajilembur)
    {
        this.mgajilembur = mgajilembur;
    }
    public double getGajilemburRay()
    {
        return mgajilembur;
    }
    public double getGajiRay(int mlembur, double mgajilembur)
    {
        return super.getGajiRay()+mlembur*mgajilembur;
    }
    public double getGajiRay()
    {
        return super.getGajiRay()+mlembur*mgajilembur;
    }
    public void lihatInfo()
    {
        System.out.println("NIP         :"+this.getNipRay());
        System.out.println("Nama        :"+this.getNamaRay());
        System.out.println("Golongan    :"+this.getGolonganRay());
        System.out.println("Jml Lembur  :"+this.getlemburRay());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajilemburRay());
        System.out.printf("Gaji        :%.0f\n", this.getGajiRay());
    }
}
