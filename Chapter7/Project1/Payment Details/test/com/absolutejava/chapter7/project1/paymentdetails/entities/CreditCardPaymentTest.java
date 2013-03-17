/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project1.paymentdetails.entities;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class CreditCardPaymentTest {
    
    @Test
    public void canCreateCreditCardPaymentObject() {
        CreditCardPayment payment = new CreditCardPayment();
        assertNotNull(payment);
    }
    
    @Test
    public void creditCardPaymentDetailsContainExtraInformation() {
        Calendar date = GregorianCalendar.getInstance();                
        CreditCardPayment payment = new CreditCardPayment("XYZ", 1234567890, date);
        payment.setAmountOfPayment(10.5);
        
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append("XYZ").append("\n");
        builder.append("Credit Card Number: ").append("1234567890").append("\n");
        builder.append("Expiry Date: ").append(date.get(Calendar.YEAR)).append(" ").append(date.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)).append("\n");
        builder.append("The amount of the payment is ").append("10.5");
        String details = builder.toString();
        
        assertEquals("Credit card details are", details, payment.paymentDetails());
    }
}