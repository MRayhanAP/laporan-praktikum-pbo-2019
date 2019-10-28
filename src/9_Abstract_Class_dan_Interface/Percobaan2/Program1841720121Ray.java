/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author ASUS
 */
public class Program1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rektor1841720121Ray pakRektor = new Rektor1841720121Ray();
        Mahasiswa1841720121Ray mahasiswaBiasa = new Mahasiswa1841720121Ray("Charlie");
        Sarjana1841720121Ray sarjanaCumlaude = new Sarjana1841720121Ray("Dini");
        PascaSarjana1841720121Ray masterCumlaude = new PascaSarjana1841720121Ray("Elok");
        
        pakRektor.BeriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.BeriSertifikatCumlaude(masterCumlaude);
     
    }

}