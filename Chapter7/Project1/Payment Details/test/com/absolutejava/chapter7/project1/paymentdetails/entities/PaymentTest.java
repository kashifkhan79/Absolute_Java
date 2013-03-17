/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project1.paymentdetails.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class PaymentTest {
    
    @Test
    public void canCreatePaymentObject() {
        Payment payment = new Payment();
        assertNotNull(payment);
    }
    
    @Test
    public void paymentContainsAmount() {
        Payment payment = new Payment();
        payment.setAmountOfPayment(10.5);
        
        double amount = payment.getAmountOfPayment();
        assertEquals("Amount is", 10.5, amount, 0.0);
    }
    
    @Test
    public void paymentCanPrintAmountOfPayment() {
        Payment payment = new Payment();
        payment.setAmountOfPayment(10.5);                
        assertEquals("Payment details are", "The amount of the payment is 10.5", payment.paymentDetails());
    }
}