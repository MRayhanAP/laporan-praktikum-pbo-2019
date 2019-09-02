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
public class SepedaGunung1841720121Rayhan extends Sepeda1841720121Rayhan{
    private String tipeSuspensi;
    
    public void SetTipeSuspensiRay(String newValue)
    {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatusRay()
    {
        super.cetakStatusRay();
        System.out.println("Tipe suspensi:"+tipeSuspensi);
    }
}
