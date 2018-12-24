import java.util.Collection;
import java.util.ArrayList;
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
public class Department {
  
 static Collection<String> nameDepatment  = new LinkedList();
    
 static Collection<String> description = new LinkedList();
 
 ArrayList<Product> product;

 static int size = 0;

    public Department(ArrayList<Product> product) {
        this.product = product;
    }

    public static Collection<String> getNameDepatment() {
        return nameDepatment;
    }

    public static void setNameDepatment(Collection<String> nameDepatment) {
        Department.nameDepatment = nameDepatment;
    }

    public static Collection<String> getDescription() {
        return description;
    }

    public static void setDescription(Collection<String> description) {
        Department.description = description;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
 
    
}
