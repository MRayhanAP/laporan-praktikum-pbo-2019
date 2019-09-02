/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JS1;

/**
 *
 * @author ASUS
 */
public class Sepeda1841720121Rayhan {
    
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    public void setMerekRay(String newValue)
    {
        mMerek = newValue;
    }
    
    public void gantiGearRay(int newValue)
    {
        mKecepatan = newValue;
    }
    
    public void tambahKecepatanRay(int increment)
    {
        mGear = mKecepatan + increment;
    }
    
    public void remRay(int decrement)
    {
        mKecepatan = mKecepatan - decrement;
    }
    
    public void setWarnaRay(String newValue)
    {
        mWarna = newValue;
    }
    
    public void cetakStatusRay()
    {
        System.out.println("Merek: "+ mMerek);
        System.out.println("Kecepatan: "+ mKecepatan);
        System.out.println("Gear: "+ mGear);
        System.out.println("Warna: "+ mWarna);
    }
}
