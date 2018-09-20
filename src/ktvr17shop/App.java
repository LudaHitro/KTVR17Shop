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
import interfaces.Retentive;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hitro Purchase add(List<Product> productes, List<Customer> customers)
 */
public class App {

    private List<Product> productes = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Purchase> purchases = new ArrayList<>();
    private Manageable manager = new ConsoleInterface();//объекта manager имеющего тип Manageable, а создан он
//на основе реализации этого интерфейса классом ConsoleInterface.
//графический интерфейс нашего приложения вместо
//консольного, то изменится всего лишь одна строчка в сласе App,
// Вместо класса ConsoleInterface(), будет использоваться другой класс, например, с названием
//GraphicInterface. 
    private Retentive saver = new PersistToBase();

    public App() {
        this.customers = saver.loadCustomers();
        this.productes = saver.loadProductes();
        this.purchases = saver.loadPurchases();
    }

    public void run() {
        String repeat = "r";
        Scanner scanner = new Scanner(System.in);
        int task;
        do {
            System.out.println("--------Выберите действие:-----------");
            System.out.println("0 - выход из программы");
            System.out.println("1 - добавить продукт");
            System.out.println("2 - добавить нового покупателя");
            System.out.println("3 - покупка");

            task = scanner.nextInt();
            switch (task) {
                case 0:
                    repeat = "q";
                    break;
                case 1:
                    Product product = manager.importProduct();
                    //productes.add(manager.importProduct());
                    if (product != null) {
                        productes.add(product);
                        saver.saveProduct(product);
                    }
                    break;
                case 2:
                    Customer customer = manager.newCustomer();
                    if (customer != null) {
                        //customers.add(manager.newCustomer());
                        customers.add(customer);
                        saver.saveCustomer(customer);
                    }
                    break;
                case 3:
                    Purchase purchase = manager.add(productes, customers);
                    //purchases.add(manager.add(productes, customers));
                    if (purchase != null) {
                        purchases.add(purchase);
                        saver.savePurchase(purchase, true);
                    }
                default:
                    System.out.println("Выберите одно из действий!Enter! ");

            }
        } while ("r".equals(repeat));

    }
}
