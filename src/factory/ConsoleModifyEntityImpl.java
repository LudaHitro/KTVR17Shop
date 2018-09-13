/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import interfaces.ModifyEntity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class ConsoleModifyEntityImpl implements ModifyEntity{
    
    public BufferedReader br;
    public ConsoleModifyEntityImpl(){
        try {
            br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ConsoleModifyEntityImpl.class.getName()).log(Level.SEVERE,"No codirovka",ex);
        }
    }
    

    @Override
    public Product addProduct() {//Product(long id, String name, int price, int count)
       Product product=new Product();
       try{
           System.out.println("-----------------Данные п-т. -------------------");
           
           System.out.println("Cod Producta");
           product.setId(br.read());
           
           System.out.println(" Name");
           product.setName(br.readLine());
           
           System.out.println("Price");
           product.setPrice(br.read());
           
           System.out.println("Count");
           product.setCount(br.read());
           
           
           
           
           
           
       } catch (IOException ex) {
            Logger.getLogger(ConsoleModifyEntityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return product;
    }

    @Override
    public Customer addCustomer() {
     Customer customer=new Customer();
     try{
         System.out.println("-------------Данные customer------------------");
         
         System.out.println("Cod customer");
         customer.setId(br.read());
         
         System.out.println("Name customer");
         customer.setName(br.readLine());
         
         System.out.println("Money");
         customer.setMoney(br.read());
         
         
     }catch(IOException ex){
         Logger.getLogger(ConsoleModifyEntityImpl.class.getName()).log(Level.SEVERE,null, ex);
     }
    return customer;    
    }

    @Override
    public Purchase addPurcase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
