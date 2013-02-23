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
public class AlternateMoneyTest {

    @Test
    public void canCreateAlternateMoneyObject() {
        AlternateMoney money = new AlternateMoney();
        assertNotNull(money);
    }

    @Test
    public void canCreateAlternateMoneyObjectWithDollarsAndCentsAsDefaultValue() {
        AlternateMoney money = new AlternateMoney(12);
        assertNotNull(money);
    }

    @Test
    public void canCreateAlternateMoneyObjectWithDollarsAndCents() {
        AlternateMoney money = new AlternateMoney(12, 39);
        assertNotNull(money);
    }

    @Test
    public void canAddTwoAlternateMoneyValues() {
        AlternateMoney money1 = new AlternateMoney(12, 10);
        AlternateMoney money2 = new AlternateMoney(12, 20);
        AlternateMoney sum = AlternateMoney.add(money1, money2);
        assertEquals("Dollars in sum are", 24, sum.getDollars());
        assertEquals("Cents in sum are", 30, sum.getCents());
    }

    @Test
    public void addingTwoAlternateMoneyWithCarryOverFromCentsToDollars() {
        AlternateMoney money1 = new AlternateMoney(12, 80);
        AlternateMoney money2 = new AlternateMoney(12, 70);
        AlternateMoney sum = AlternateMoney.add(money1, money2);
        assertEquals("Dollars in sum are with carry over", 25, sum.getDollars());
        assertEquals("Cents in sum are with carry over", 50, sum.getCents());
    }

    @Test
    public void canSubtractOneAlternateMoneyValueFromAnother() {
        AlternateMoney money1 = new AlternateMoney(12, 30);
        AlternateMoney money2 = new AlternateMoney(10, 20);
        AlternateMoney difference = AlternateMoney.subtract(money1, money2);
        assertEquals("Dollars after subtraction", 2, difference.getDollars());
        assertEquals("Cents after subtraction", 10, difference.getCents());
    }
    
    @Test 
    public void canSubtractOneMoneyValueFromAnotherByBorrowingDollarsFromFirstMoneyValue(){
        AlternateMoney money1 = new AlternateMoney(12, 50);
        AlternateMoney money2 = new AlternateMoney(10, 80);
        AlternateMoney difference = AlternateMoney.subtract(money1, money2);
        assertEquals("Dollars after borrowing from first money value", 1, difference.getDollars());
        assertEquals("Cents after borrowing from first money value", 70, difference.getCents());        
    }
    
    @Test
    public void addingTwoAlternateMoneyValuesChangesCallingValue(){
        AlternateMoney money1 = new AlternateMoney(12, 50);
        AlternateMoney money2 = new AlternateMoney(10, 80);
        money1.add(money2);
        assertEquals("Money1 dollars are changed", 23, money1.getDollars());
        assertEquals("Money1 cents are changed", 30, money1.getCents());
    }
    
    @Test
    public void subtractingTwoAlternateMoneyValuesChangesCallingValue(){
        AlternateMoney money1 = new AlternateMoney(12, 50);
        AlternateMoney money2 = new AlternateMoney(10, 80);
        money1.subtract(money2);
        assertEquals("Money1 dollars are changed", 1, money1.getDollars());
        assertEquals("Money1 cents are changed", 70, money1.getCents());
    }
}