/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejonas
 */
public class Products {
    private String itemName;
    private double price;
    private int quantity;
    private double total;
    

    Products(String itemName,double price,int quantity){
       this.itemName = itemName;
       this.price = price;
       this.quantity = quantity;
    }
    
    
    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  
    /**
     * @return the total
     */
    public double getTotal() {
        return total = price * quantity;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    
    void printItems() {     
        System.out.println(itemName+"\tR "+ price+"\t "+ quantity+"\tR "+getTotal());
    }

    
    
    
    
}
