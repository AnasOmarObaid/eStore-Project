

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
public class Cart {
   
 String product,
        description;
 int quantity;
 double price,
        total;
 String userName;
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cart(String product, String description, int quantity, double price, double total , String userName) {
        this.product = product;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.userName = userName;
    }
 
  public double getTotal(){
      return this.price*this.quantity;
  }  
   
   public String getUserName(){
      return userName;
  }
 public void setUserName(String userName){
     this.userName = userName;
 } 
  
}
