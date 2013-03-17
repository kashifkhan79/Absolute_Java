/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project1.paymentdetails.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Payment {
    private double amountOfPayment;

    public Payment() {
    }

    public void setAmountOfPayment(double amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }

    public double getAmountOfPayment() {
        return amountOfPayment;
    }

    public String paymentDetails() {
        return toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.amountOfPayment) ^ (Double.doubleToLongBits(this.amountOfPayment) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Payment other = (Payment) obj;
        if (Double.doubleToLongBits(this.amountOfPayment) != Double.doubleToLongBits(other.amountOfPayment)) {
            return false;
        }
        return true;
    }
       
    @Override
    public String toString() {
        return "The amount of the payment is " + getAmountOfPayment();
    }
    
}
