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
public class CashPaymentTest {
    
    @Test
    public void canCreateCashPaymentObject() {
        CashPayment cashPayment = new CashPayment();
        assertNotNull(cashPayment);
    }
    
    @Test
    public void cashPaymentCanPrintAmountOfPaymentWithExtraInformation() {
        CashPayment payment = new CashPayment();
        payment.setAmountOfPayment(10.5);
        
        assertEquals("Payment details are", "The amount of cash payment is 10.5", payment.paymentDetails());
    }
}