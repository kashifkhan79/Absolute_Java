/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project5.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MoneyTest {
    
    @Test
    public void canCreateMoneyObject(){
        Money money = new Money();
        assertNotNull(money);
    }
    
    @Test
    public void canCreateMoneyObjectWithDollarsAndCentsAsDefaultValue() {
        Money money = new Money(12);
        assertNotNull(money);
    }
    
    @Test
    public void canCreateMoneyObjectWithDollarsAndCents(){
        Money money = new Money(12, 39);
        assertNotNull(money);
    }
    
    @Test
    public void canAddTwoMoneyValues(){
        Money money1 = new Money(12, 10);
        Money money2 = new Money(12, 20);
        
        Money sum = Money.add(money1, money2);
        
        int dollars = sum.getDollars();
        int cents = sum.getCents();
        
        assertEquals("Dollars in sum are", 24, dollars);
        assertEquals("Cents in sum are", 30, cents);        
    }
    
    @Test
    public void addingTwoMoneyWithCarryOverFromCentsToDollars(){
        Money money1 = new Money(12, 80);
        Money money2 = new Money(12, 70);
        
        Money sum = Money.add(money1, money2);
        
        assertEquals("Dollars in sum are with carry over", 25, sum.getDollars());
        assertEquals("Cents in sum are with carry over", 50, sum.getCents());
    }
    
    @Test
    public void canSubtractOneMoneyValueFromAnother() {
        Money money1 = new Money(12, 30);
        Money money2 = new Money(10, 20);
        
        Money difference = Money.subtract(money1, money2);
        
        int dollars = difference.getDollars();
        int cents = difference.getCents();
        
        assertEquals("Dollars after subtraction", 2, dollars);
        assertEquals("Cents after subtraction", 10, cents);
    }
    
    @Test 
    public void canSubtractOneMoneyValueFromAnotherByBorrowingDollarsFromFirstMoneyValue(){
        Money money1 = new Money(12, 50);
        Money money2 = new Money(10, 80);
        
        Money difference = Money.subtract(money1, money2);
        
        int dollars = difference.getDollars();
        int cents = difference.getCents();
        
        assertEquals("Dollars after borrowing from first money value", 1, dollars);
        assertEquals("Cents after borrowing from first money value", 70, cents);        
    }
    
    @Test
    public void canAddTwoMoneyValuesByCallingAddMethodUsingAnObject(){
        Money money1 = new Money(12,30);
        Money money2 = new Money(10,90);
        
        Money sum = money1.add(money2);
        
        assertEquals("Dollars in sum using object.add method are", 23, sum.getDollars());
        assertEquals("Cents in sum using object.add method are", 20, sum.getCents());
    }
    
    @Test
    public void canSubtractMoneyValuesByCallingSubtractMethodUsingObject(){
        Money money1 = new Money(12,30);
        Money money2 = new Money(10,90);
        
        Money difference = money1.subtract(money2);
        
        assertEquals("Dollars after subtracting using object.subtract", 1, difference.getDollars());
        assertEquals("Cents after subtracting using object.subtract", 40, difference.getCents());
    }    
}