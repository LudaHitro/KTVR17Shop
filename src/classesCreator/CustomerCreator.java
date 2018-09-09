/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesCreator;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerCreator {
 public Customer newCustomer(){
   Scanner scanner=new Scanner(System.in); 
     System.out.println("---------Добавления нового клиента-------------");
     Customer customer= new Customer();// Customer(long id, String name, int money)
     
     System.out.println("Введите код покупателя");
     customer.setId(scanner.nextLong());
     
     System.out.println("Введите name покупателя"); 
     customer.setName(scanner.next());
     
     System.out.println("Введите money");
     customer.setMoney(scanner.nextInt());
         
     
     return customer;
 }
    
    
}
