/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesCreator;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hitro
 */
public class PurchaseCreator {//(Product product, Customer customer, int quantity,Date datebegin, )

    public Purchase add(List<Product> productes, List<Customer> customers) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Список productes:--------------------------------");
        for (int i = 0; i < productes.size(); i++) {
            Product p = productes.get(i);
            System.out.println(i + 1 + ". " + p.toString());

        }

        System.out.println("----Список customers:-------------------------------------");
        for (int i = 0; i < customers.size(); i++) {
           Customer cu = customers.get(i);

            System.out.println(i + 1 + ". " + cu.toString());

        }
        
        System.out.println("---------Выберите код продукта и покупателя-------------");
        
        System.out.println("Код покупателя: ");
        String codCustomer = scanner.nextLine();
        System.out.println("Код продукта: ");
        String codProduct = scanner.nextLine();
        System.out.println("Введите количество купленного товара");
        String quantity= scanner.nextLine();
        
        
        System.out.println("______________________________________________________________________________");
        
        
        
        System.out.println("------------Список покупок------");
        
        Purchase pur=new Purchase();
        pur.setProduct(productes.get(new Integer(codProduct)-1));
        pur.setCustomer(customers.get(new Integer(codCustomer)-1));
       // pur.setQuantity(quantity.get());
        Calendar c = new GregorianCalendar();
        pur.setDatebegin(c.getTime());
        System.out.println("Выдано: "+ pur.toString());
        System.out.println("________________________________________________________________________________" +"\n" );
         
        
        
        
        
        
        return pur;
    }

}
