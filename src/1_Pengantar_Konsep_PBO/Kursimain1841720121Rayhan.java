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
public class Kursimain1841720121Rayhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kursi1841720121Rayhan krs1 = new Kursi1841720121Rayhan();
        KursiBelajar1841720121Rayhan krs2 = new KursiBelajar1841720121Rayhan();
        
        krs1.merkK("Dodo");
        krs1.warnaK("Pink");
        krs1.bahanK("Kain");
        krs1.tinggiK(4);
        krs1.luasS(5, 7);
        krs1.cetakStatus();
        
        krs2.merkK("Akina");
        krs2.warnaK("Coklat");
        krs2.bahanK("Kayu");
        krs2.fitur("Meja yang tersambung di kursi");
        krs2.tinggiK(4);
        krs2.luasS(5, 7);
        krs2.cetakStatus();
    }
    
}
