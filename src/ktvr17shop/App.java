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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hitro
 *  Purchase add(List<Product> productes, List<Customer> customers)
 */
public class App {
    
   private List<Product> productes=new ArrayList<>();
   private List<Customer> customers=new ArrayList<>();
   private List<Purchase>purchases=new ArrayList<>();
   
   public void run(){
       String repeat="r";
       Scanner scanner=new Scanner(System.in);
       int task;
       do{
            System.out.println("--------Выберите действие:-----------");
            System.out.println("0 - выход из программы");
            System.out.println("1 - добавить продукт");
            System.out.println("2 - добавить нового покупателя");
            System.out.println("3 - выдать чек");
          
            
            task=scanner.nextInt();
            switch(task){
                case 0:
                    repeat="q";
                    break;
                case 1:
                    ProductCreator productCreator =new ProductCreator();
                    productes.add(productCreator.importProduct());
                    break;
                case 2:
                    CustomerCreator customerCreator=new CustomerCreator();
                    customers.add(customerCreator.newCustomer());
                    break;
                case 3:
                    PurchaseCreator purchaseCreator=new PurchaseCreator();
                    purchases.add(purchaseCreator.add(productes, customers));
                default:
                    System.out.println("Выберите одно из действий!Enter! ");
            
            
            
       }
   }while("r".equals(repeat));
       
}
}
