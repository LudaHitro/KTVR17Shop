/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author pupil
 */
public class KTVR17Shop {

    public static void main(String[] args) {
        System.out.println("Hello");

        Product product1 = new Product(1L, "Moloko", 100, 30);
        Product product2 = new Product(2L, "Kolbasa", 300, 20);
        Product product3 = new Product(3L, "Hleb", 200, 29);

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());

        Customer customer1 = new Customer(1, "Kirill Do", 2000);
        Customer customer2 = new Customer(2, "Dima gul", 6000);
        Customer customer3 = new Customer(3, "Lada My", 2500);
        
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());

        Calendar calendar = new GregorianCalendar();
        Purchase purchase1 = new Purchase(product1, customer1, calendar.getTime(), 3 );
        Purchase purchase2 = new Purchase(product2, customer2, calendar.getTime(), 5 );
        Purchase purchase3 = new Purchase(product3, customer3, calendar.getTime(), 2 );
        
        customer1.setMoney(customer1.getMoney()-purchase1.getProduct().getPrice()*purchase1.getQuantity());//hind
        customer2.setMoney(customer2.getMoney()-purchase2.getProduct().getPrice()*purchase2.getQuantity());
        customer3.setMoney(customer3.getMoney()-purchase3.getProduct().getPrice()*purchase3.getQuantity());
        //count producta
        product1.setCount(product1.getCount()-purchase1.getQuantity());
        product2.setCount(product2.getCount()-purchase2.getQuantity());
        product3.setCount(product3.getCount()-purchase3.getQuantity());
        
        
        System.out.println(purchase1.toString());
        System.out.println(purchase2.toString());
        System.out.println(purchase3.toString());
        

    }

}
