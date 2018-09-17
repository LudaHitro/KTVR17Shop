/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesCreator;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductCreator {
    public Product importProduct(){// завезенный товар
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("---------------Привоз продуктов :--------------------------");
        Product product=new Product();//(long id, String name, int price, int count)
        
        System.out.println("--------Введи код продукта -------------");
        product.setId(scanner.nextLong());
        
        System.out.println("-----------------Введи наименование продукта-----------------");
        product.setName(scanner.next());
        
        System.out.println("------------------Введи цену продукта--------------------");
        product.setPrice(scanner.nextInt());
        
        System.out.println("-----------------------------  Введи всего продуктов -------------------");
        product.setCount(scanner.nextInt());
        
        System.out.println("Dlja dobavlenia producta vvedite luboi simvol\ndlja ne dobavljat vvedite -1");
        String yes;
        yes=scanner.next();
        if ("-1".equals(yes)){
            System.out.println("Product ne dobavlen");
            return null;
        }else{ 
            System.out.println("Dobavleno!");
            return product;
        }
    }
    
}
