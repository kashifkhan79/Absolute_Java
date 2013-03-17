/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project1.paymentdetails.entities;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class CreditCardPayment extends Payment {
    private String creditCardHolderName;
    private int creditCardNumber;
    private Calendar expiryDate;

    
    public CreditCardPayment() {
        super();
    }

    public CreditCardPayment(String creditCardHolderName, int creditCardNumber, Calendar expiryDate) {
        super();
        this.creditCardHolderName = creditCardHolderName;
        this.creditCardNumber = creditCardNumber;
        this.expiryDate = expiryDate;
    }
    
    public String getCreditCardHolderName() {
        return creditCardHolderName;
    }

    public void setCreditCardHolderName(String creditCardHolderName) {
        this.creditCardHolderName = creditCardHolderName;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Calendar getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    @Override
    public String paymentDetails() {
        return toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.creditCardHolderName);
        hash = 89 * hash + this.creditCardNumber;
        hash = 89 * hash + Objects.hashCode(this.expiryDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CreditCardPayment other = (CreditCardPayment) obj;
        if (!Objects.equals(this.creditCardHolderName, other.creditCardHolderName)) {
            return false;
        }
        if (this.creditCardNumber != other.creditCardNumber) {
            return false;
        }
        if (!Objects.equals(this.expiryDate, other.expiryDate)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(getCreditCardHolderName()).append("\n");
        builder.append("Credit Card Number: ").append(getCreditCardNumber()).append("\n");
        builder.append("Expiry Date: ").append(getExpiryDate().get(Calendar.YEAR)).append(" ").append(getExpiryDate().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)).append("\n");
        builder.append(super.toString());
        return builder.toString();
    }
    
}
