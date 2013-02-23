/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project5.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Money {

    private int dollars;
    private int cents;

    public Money() {
        this(0);
    }

    public Money(int dollars) {
        this(dollars, 0);
    }

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public static Money add(Money money1, Money money2) {
        return new Money(calculateDollarsFromCentsAfterAddition(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)),
                calculateCentsFromCentsAfterAddition(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)));
    }

    public static Money subtract(Money money1, Money money2) {
        return new Money(calculateDollarsFromCentsAfterSubtraction(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)),
                calculateCentsFromCentsAfterSubtraction(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)));
    }
    
    public Money add(Money other) {
        return new Money(calculateDollarsFromCentsAfterAddition(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other)),
                calculateCentsFromCentsAfterAddition(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other)));
    }

    public Money subtract(Money other) {
        return new Money(calculateDollarsFromCentsAfterSubtraction(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other)),
                calculateCentsFromCentsAfterSubtraction(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other)));
    }

    private static int calculateTotalCentsForMoney(Money money) {
        return money.getDollars() * 100 + money.getCents();
    }

    private static int calculateDollarsFromCentsAfterAddition(int totalCentsForMoney1, int totalCentsForMoney2) {
        return (totalCentsForMoney1 + totalCentsForMoney2) / 100;
    }

    private static int calculateCentsFromCentsAfterAddition(int totalCentsForMoney1, int totalCentsForMoney2) {
        return (totalCentsForMoney1 + totalCentsForMoney2) % 100;
    }
    
    private static int calculateDollarsFromCentsAfterSubtraction(int totalCentsForMoney1, int totalCentsForMoney2) {
        return (totalCentsForMoney1 - totalCentsForMoney2) / 100;
    }
    
    private static int calculateCentsFromCentsAfterSubtraction(int totalCentsForMoney1, int totalCentsForMoney2) {
        return (totalCentsForMoney1 - totalCentsForMoney2) % 100;
    }
    
}
