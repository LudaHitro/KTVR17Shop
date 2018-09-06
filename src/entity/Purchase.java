/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Purchase {//history
    private Product product;
    private Customer customer;
    private Date datebegin ;
    private int quantity;// count

    public Purchase() {
    }

    public Purchase(Product product, Customer customer, Date datebegin, int quantity) {
        this.product = product;
        this.customer = customer;
        this.datebegin = datebegin;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDatebegin(Date datebegin) {
        this.datebegin = datebegin;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDatebegin() {
        return datebegin;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.product);
        hash = 97 * hash + Objects.hashCode(this.customer);
        hash = 97 * hash + Objects.hashCode(this.datebegin);
        hash = 97 * hash + this.quantity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Purchase other = (Purchase) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.datebegin, other.datebegin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Purchase{" + "product=" + product + ", customer=" + customer + ", datebegin=" + datebegin + ", quantity=" + quantity + '}';
    }
    
    
    
    
    
    
}
