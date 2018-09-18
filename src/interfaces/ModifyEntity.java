/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Customer;
import entity.Product;
import entity.Purchase;

/**
 *
 * @author pupil
 */
public interface ModifyEntity {
    public Product addProduct();
    public Customer addCustomer();
    public Purchase addPurchase();
    
}
