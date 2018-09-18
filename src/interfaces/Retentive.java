/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;

/**
 *
 * @author pupil
 */
<<<<<<< HEAD:src/interfaces/Retentive.java
public interface Retentive {//Persistense
    public void saveProduct(Product product);
    public void saveCustomer(Customer customer);
    public void savePurchase(Purchase purchase, boolean update);
=======
public interface Persistent {
    public void saveProductes(List<Product>productes);
    public void saveCustomers(List<Customer> customers);
    public void savePurchases(List<Purchase> purchases);
>>>>>>> ceba0b36cdd54e040008555991ee455f765db337:src/interfaces/Persistent.java
    
    public List<Product>loadProductes();
    public List<Customer>loadCustomers();
    public List<Purchase>loadPurchases();
    public  void freeResources();
    
    
    
}
