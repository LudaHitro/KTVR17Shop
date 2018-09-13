/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import interfaces.Persistent;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Hitro
 */
public class ORMPers implements Persistent{
    private final EntityManager em;
    private final EntityTransaction tx;
    public ORMPers() {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("KTVR17ShopPu");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        
    }

   
    

    @Override
    public void saveProductes(List<Product> productes) { 
      tx.begin();
        for (int i = 0; i < productes.size(); i++) {
           Product product = productes.get(i);
            em.persist(product);
        }
        tx.commit();   
    }

    @Override
    public void saveCustomers(List<Customer> customers) {
         tx.begin();
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            em.persist(customer);
        }
        tx.commit();
    }

    @Override
    public void savePurchases(List<Purchase> purchases) {
         tx.begin();
        for (int i = 0; i < purchases.size(); i++) {
            Purchase purchase = purchases.get(i);
            em.persist(purchase);
        }
        tx.commit();
    }

    @Override
    public List<Product> loadProductes() {
        try {
            return em.createQuery("SELECT p FROM Product p").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
        
    }

    @Override
    public List<Customer> loadCustomers() {
       try {
            return em.createQuery("SELECT cu FROM Customer cu").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public List<Purchase> loadPurchases() {
        try {
            return em.createQuery("SELECT pur FROM Purchase pur").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
}
