/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JS2;

/**
 *
 * @author ASUS
 */
public class SewaVideoGame1841720121Ray {
    public int mid;
    public String mnamem;
    public String mnagem;
    public int mharga;
    public int mlamasewa;
    
    public int totalHargaRay(){
        int total = mharga*mlamasewa;
        
        return total;
    }
    
    public void cetakHasilRay(){
        System.out.println("ID : "+mid);
        System.out.println("Name : "+mnamem);
        System.out.println("Name Game : "+mnagem);
        System.out.println("Lama sewa : "+mlamasewa+" hari");
        System.out.println("Harga sewa game : Rp."+mharga);
        System.out.println("Harga yang harus dibayar : Rp."+totalHargaRay());
    }
}
