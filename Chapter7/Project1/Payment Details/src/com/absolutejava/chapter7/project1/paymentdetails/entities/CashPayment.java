/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project1.paymentdetails.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class CashPayment extends Payment {

    public CashPayment() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }   
    
    @Override
    public String paymentDetails() {
        return toString();
    }
    
    @Override
    public String toString() {
        return "The amount of cash payment is " + getAmountOfPayment();
    }
    
}
