/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import classesCreator.CustomerCreator;
import classesCreator.ProductCreator;
import classesCreator.PurchaseCreator;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import interfaces.Manageable;
import java.util.List;

/**
 *
 * @author pupil
 */
public class ConsoleInterface implements Manageable {

    @Override
    public Product importProduct() {
       ProductCreator productCreator=new ProductCreator();
       return productCreator.importProduct();
    }

    @Override
    public Customer newCustomer() {
        CustomerCreator customerCreator=new CustomerCreator();
        return customerCreator.newCustomer();
    }

    @Override
    public Purchase add(List<Product> productes, List<Customer> customers) {
         PurchaseCreator purchaseCreator=new PurchaseCreator();
         return purchaseCreator.add(productes, customers);
        
    }

   
        
        
   

   
}
