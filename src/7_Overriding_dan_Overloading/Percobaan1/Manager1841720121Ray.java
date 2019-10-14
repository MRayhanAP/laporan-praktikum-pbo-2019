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
public class Manager1841720121Ray extends Karyawan1841720121Ray{
    private double mtunjangan;
    private String mbagian;
    private Staff1841720121Ray mst[];
    
    public void setTunjanganRay(double mtunjangan)
    {
        this.mtunjangan=mtunjangan;
    }
    public double getTunjanganRay()
    {
        return mtunjangan;
    }
    public void setBagianRay(String mbagian)
    {
        this.mbagian=mbagian;
    }
    public String getBagianRay()
    {
        return mbagian;
    }
    public void setStaffRay(Staff1841720121Ray mst[])
    {
        this.mst=mst;
    }
    
    public void viewStaffRay()
    {
        int i;
        System.out.println("------------");
        for(i=0;i<mst.length;i++)
        {
            mst[i].lihatInfo();
        }
        System.out.println("------------");
    }
    public void lihatinfo()
    {
        System.out.println("Manager     :"+this.getBagianRay());
        System.out.println("NIP         :"+this.getNipRay());
        System.out.println("Nama        :"+this.getNamaRay());
        System.out.println("Golongan    :"+this.getGolonganRay());
        System.out.printf("Tunjanga    :%.0f\n",this.getTunjanganRay());
        System.out.printf("Gaji        :%.0f\n",this.getGajiRay());
        System.out.println("Bagian      :"+this.getBagianRay());
        this.viewStaffRay();
    }
    public double getGajiRay()
    {
        return super.getGajiRay()+mtunjangan;
    }
}   
