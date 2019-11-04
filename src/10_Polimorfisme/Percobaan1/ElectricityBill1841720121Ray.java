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
public class ElectricityBill1841720121Ray implements Payable1841720121Ray{
    private int kwh;
    private String category;

    public ElectricityBill1841720121Ray(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhRay() {
        return kwh;
    }

    public void setKwhRay(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryRay() {
        return category;
    }

    public void setCategoryRay(String category) {
        this.category = category;
    }
    
    @Override
    public int getPaymentAmountRay(){
    return kwh*getBasePriceRay();
    }
    public int getBasePriceRay(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfoRay(){
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePriceRay()+" per kWH)\n";
    } 
}
