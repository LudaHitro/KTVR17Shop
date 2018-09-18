/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import com.sun.istack.internal.logging.Logger;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import interfaces.Persistent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import ktvr17shop.KTVR17Shop;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Hitro
 */
public class FilesPersistImpl implements Persistent {

    @Override
    public void saveProductes(List<Product> productes) {
        try {
            FileOutputStream fos = new FileOutputStream(KTVR17Shop.PRODUCTES_SAVE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productes);
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "error", ex);

        }

    }

    @Override
    public void saveCustomers(List<Customer> customers) {
        try {
            FileOutputStream fos = new FileOutputStream(KTVR17Shop.CUSTOMERS_SAVE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка записи файла", ex);

        }

        @Override
        public void savePurchases
        (List<Purchase> purchases
        
            ) {
     try {
                FileOutputStream fos = new FileOutputStream(KTVR17Shop.PURCHASES_SAVE);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(purchases);
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка записи файла", ex);

            }
        }

        @Override
        public List<Product> loadProductes
        
            () {
       FileInputStream fis = null;
            List<Product> productes = new ArrayList<>();
            try {
                fis = new FileInputStream(KTVR17Shop.PRODUCTES_SAVE);
                ObjectInputStream oin = new ObjectInputStream(fis);
                productes = (List<Product>) oin.readObject();
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Не существует файл", ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка чтения файла", ex);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка закрытия потока", ex);
                }
            }
            return productes;
        }

        @Override
        public List<Customer> loadCustomers
        
            () {
         FileInputStream fis = null;
            List<Customer> customers = new ArrayList<>();
            try {
                fis = new FileInputStream(KTVR17Shop.CUSTOMERS_SAVE);
                ObjectInputStream oin = new ObjectInputStream(fis);
                customers = (List<Customer>) oin.readObject();
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Не существует файл", ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка чтения файла", ex);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка закрытия потока", ex);
                }

            }
            return customers;
        }

        @Override
        public List<Purchase> loadPurchases
        
            () {
          FileInputStream fis = null;
            List<Purchase> purchases = new ArrayList<>();
            try {
                fis = new FileInputStream(KTVR17Shop.PURCHASES_SAVE);
                ObjectInputStream oin = new ObjectInputStream(fis);
                purchases = (List<Purchase>) oin.readObject();
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Не существует файл", ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка чтения файла", ex);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FilesPersistImpl.class.getName()).log(Level.SEVERE, "Ошибка закрытия потока", ex);
                }

            }
            return purchases;

        }
    }
}
