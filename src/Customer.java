/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
public class Customer {
  long id;
String NameCustomer;
String addrees;
String userName;
long password;
boolean isInsert;
public Customer(){
    this.isInsert = false;
}
    public Customer(long id, String NameCustomer, String addrees, String userName, long password) {
        this.id = id;
        this.NameCustomer = NameCustomer;
        this.addrees = addrees;
        this.userName = userName;
        this.password = password;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return NameCustomer;
    }

    public void setNameCustomer(String NameCustomer) {
        this.NameCustomer = NameCustomer;
    }

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public boolean isIsInsert() {
        return isInsert;
    }

    public void setIsInsert(boolean isInsert) {
        this.isInsert = isInsert;
    }

}
