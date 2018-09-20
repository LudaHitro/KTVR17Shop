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
 *сохранять и считывать в приложение сохраненные раннее данные.
 * @author Hitro
 */

    
    public interface Retentive {//Persistense
    public void saveProduct(Product product);
    public void saveCustomer(Customer customer);
    public void savePurchase(Purchase purchase, boolean update);
    
    public List<Product>loadProductes();
    public List<Customer>loadCustomers();
    public List<Purchase>loadPurchases();
    public  void freeResources();
    
}
