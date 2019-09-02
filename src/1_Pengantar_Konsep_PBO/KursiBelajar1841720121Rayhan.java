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
public class KursiBelajar1841720121Rayhan extends Kursi1841720121Rayhan{
    
    private String fitur;
    
    public void fitur(String newValue){
        fitur = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Fitur : "+ fitur);
    }
}
