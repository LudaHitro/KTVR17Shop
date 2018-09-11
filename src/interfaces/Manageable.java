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
public interface Manageable {
    Product importProduct();
    Customer newCustomer();
    Purchase add(List<Product> productes, List<Customer> customers);
    
}
