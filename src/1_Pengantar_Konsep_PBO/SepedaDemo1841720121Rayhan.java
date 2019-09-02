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
public class SepedaDemo1841720121Rayhan {

    public static void main(String[] args) {
        Sepeda1841720121Rayhan spd1 = new Sepeda1841720121Rayhan();
        Sepeda1841720121Rayhan spd2 = new Sepeda1841720121Rayhan();
        SepedaGunung1841720121Rayhan spd3 = new SepedaGunung1841720121Rayhan();
        
        spd1.setMerekRay("Polygon");
        spd1.tambahKecepatanRay(10);
        spd1.setWarnaRay("Merah");
        spd1.gantiGearRay(2);
        spd1.cetakStatusRay();
        
        spd2.setMerekRay("Wiim Cycle");
        spd2.tambahKecepatanRay(10);
        spd2.setWarnaRay("Hijau");
        spd2.gantiGearRay(2);
        spd2.tambahKecepatanRay(10);
        spd2.gantiGearRay(3);
        spd2.cetakStatusRay();
        
        spd3.setMerekRay("Klinee");
        spd3.tambahKecepatanRay(5);
        spd3.setWarnaRay("Merah");
        spd3.gantiGearRay(7);
        spd3.SetTipeSuspensiRay("Gas suspension");
        spd3.cetakStatusRay();
    }
}
