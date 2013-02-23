/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project5.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AlternateMoney {

    private int dollars;
    private int cents;

    public AlternateMoney() {
        this(0);
    }

    public AlternateMoney(int dollars) {
        this(dollars, 0);
    }

    public AlternateMoney(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void add(AlternateMoney other) {
        int tempDollars = calculateDollarsFromCentsAfterAddition(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other));
        int tempCents = calculateCentsFromCentsAfterAddition(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other));
        this.dollars = tempDollars;
        this.cents = tempCents;
    }

    public static AlternateMoney add(AlternateMoney money1, AlternateMoney money2) {
        return new AlternateMoney(calculateDollarsFromCentsAfterAddition(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)),
                calculateCentsFromCentsAfterAddition(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)));
    }
    
    public void subtract(AlternateMoney other) {
        int tempDollars = calculateDollarsFromCentsAfterSubtraction(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other));
        int tempCents = calculateCentsFromCentsAfterSubtraction(calculateTotalCentsForMoney(this), calculateTotalCentsForMoney(other));
        this.dollars = tempDollars;
        this.cents = tempCents;
    }
    
    public static AlternateMoney subtract(AlternateMoney money1, AlternateMoney money2) {
        return new AlternateMoney(calculateDollarsFromCentsAfterSubtraction(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)),
                calculateCentsFromCentsAfterSubtraction(calculateTotalCentsForMoney(money1), calculateTotalCentsForMoney(money2)));
    }

    private static int calculateTotalCentsForMoney(AlternateMoney money) {
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
