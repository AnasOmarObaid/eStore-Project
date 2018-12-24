
import java.util.Collection;
import java.util.LinkedList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
class Product {
 
 String nameProdect;
  double price;  
  int quatiy;  
  String descriptionProduct;
String dep;

    public Product() {
    }

    public Product(String nameProdect, double price, int quatiy, String descriptionProduct, String dep) {
        this.nameProdect = nameProdect;
        this.price = price;
        this.quatiy = quatiy;
        this.descriptionProduct = descriptionProduct;
        this.dep = dep;
    }

    public String getNameProdect() {
        return nameProdect;
    }

    public void setNameProdect(String nameProdect) {
        this.nameProdect = nameProdect;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuatiy() {
        return quatiy;
    }

    public void setQuatiy(int quatiy) {
        this.quatiy = quatiy;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

   

}
