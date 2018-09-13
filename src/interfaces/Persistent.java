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
public interface Persistent {
    public void saveProductes(List<Product>productes);
    public void saveCustomer(List<Customer> customers);
    public void savePurchase(List<Purchase> purchases);
    
    public List<Product>loadProductes();
    public List<Customer>loadCustomers();
    public List<Purchase>loadPurchases();
    
}
