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
   private Manageable manager =new ConsoleInterface();
   
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
                  
                    productes.add(manager.importProduct());
                    break;
                case 2:
                   
                    customers.add(manager.newCustomer());
                    break;
                case 3:
                   
                    purchases.add(manager.add(productes, customers));
                default:
                    System.out.println("Выберите одно из действий!Enter! ");
            
            
            
       }
   }while("r".equals(repeat));
       
}
}
