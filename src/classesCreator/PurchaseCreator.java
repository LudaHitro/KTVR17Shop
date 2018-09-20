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
        int quantity = scanner.nextInt();

        System.out.println("______________________________________________________________________________");

        System.out.println("------------Список покупок------");
        Purchase purchase = new Purchase();
        Product product = new Product();
        product = productes.get(new Integer(codProduct) - 1);

        purchase.setProduct(product);
        Customer customer = new Customer();
        customer = customers.get(new Integer(codCustomer) - 1);
        purchase.setCustomer(customer);
        purchase.setQuantity(quantity);
        if (product.getCount() - purchase.getQuantity() < 0) {
            System.out.println("******************Nou product");
            return null;
        }
        if (customer.getMoney() <= product.getPrice() * purchase.getQuantity()) {
            System.out.println("**********************************Nou money");
            return null;
        }
        Calendar c = new GregorianCalendar();
        purchase.setDatebegin(c.getTime());
        //customer1.setMoney(customer1.getMoney()-purchase1.getProduct().getPrice()*purchase1.getQuantity());
        purchase.getCustomer().setMoney(purchase.getCustomer().getMoney() - purchase.getProduct().getPrice() * purchase.getQuantity());

        purchase.getProduct().setCount(purchase.getProduct().getCount() - purchase.getQuantity());

        // product1.setCount(product1.getCount()-purchase1.getQuantity());
        System.out.println(purchase.toString());

        System.out.println("________________________________________________________________________________" + "\n");

        System.out.println("Dlja dobavlenia producta vvedite luboi simvol\n dlja ne dobavljat vvedite -1");

        String yes;
        yes = scanner.next();
        if ("-1".equals(yes)) {
            System.out.println("Pokupka ne dobavlena");
            return null;
        } else {
            System.out.println("Dobavleno!");
            return purchase;
        }
    }

}
