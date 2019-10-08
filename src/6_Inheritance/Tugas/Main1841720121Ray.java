/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Main1841720121Ray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pc1841720121Ray p = new Pc1841720121Ray("TUF", 200, 36, "DMA", 21);
        Mac1841720121Ray m = new Mac1841720121Ray("TUF", 200, 36, "DMA", "SNSV", "WindowsFirewall");
        Windows1841720121Ray w = new Windows1841720121Ray("TUF", 200, 36, "DMA", "SNSV", "RGB Keyboard");
        
        p.tampilPCRay();
        m.tampilMacRay();
        w.tampilWindowsRay();
    }
}
