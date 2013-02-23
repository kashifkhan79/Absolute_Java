/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project6.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AlternateRational {

    private static final int NORMALIZER_VALUE = -1;
    private int numerator;
    private int denominator;

    public AlternateRational() {
        this(0);
    }

    public AlternateRational(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public AlternateRational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void add(AlternateRational other) {
        int tempDenominator = calculateLCM(this.getDenominator(), other.getDenominator());
        int tempNumerator = calculateNumeratorForAddition(this, tempDenominator, other);
        this.setNumerator(tempNumerator);
        this.setDenominator(tempDenominator);
        this.reduceToLowestTerms().normalize();
    }

    public void subtract(AlternateRational other) {
        int tempDenominator = calculateLCM(this.getDenominator(), other.getDenominator());
        int tempNumerator = calculateNumeratorForSubtraction(this, other, tempDenominator);
        this.setNumerator(tempNumerator);
        this.setDenominator(tempDenominator);
        this.reduceToLowestTerms().normalize();
    }

    public void multiply(AlternateRational other) {
        this.setNumerator(this.getNumerator() * other.getNumerator());
        this.setDenominator(this.getDenominator() * other.getDenominator());
        this.reduceToLowestTerms().normalize();
    }

    void divide(AlternateRational other) {
        this.setNumerator(this.getNumerator() * other.getDenominator());
        this.setDenominator(this.getDenominator() * other.getNumerator());
        this.reduceToLowestTerms().normalize();
    }

    private int calculateNumeratorForAddition(AlternateRational rational1, int denominator, AlternateRational rational2) {
        return rational1.getNumerator() * (denominator / rational1.getDenominator()) + rational2.getNumerator() * (denominator / rational2.getDenominator());
    }

    private int calculateNumeratorForSubtraction(AlternateRational rational1, AlternateRational rational2, int denominator) {
        return rational1.getNumerator() * (denominator / rational1.getDenominator()) - rational2.getNumerator() * (denominator / rational2.getDenominator());
    }

    private AlternateRational reduceToLowestTerms() {
        int tempNumerator = this.numerator / calculateGCD(this.numerator, this.denominator);
        int tempDenominator = this.denominator / calculateGCD(this.numerator, this.denominator);
        this.setNumerator(tempNumerator);
        this.setDenominator(tempDenominator);
        return this;
    }

    private AlternateRational normalize() {
        this.setNumerator(this.getDenominator() < 0 ? this.getNumerator() * NORMALIZER_VALUE : this.getNumerator());
        this.setDenominator(this.getDenominator() < 0 ? this.getDenominator() * NORMALIZER_VALUE : this.getDenominator());
        return this;
    }

    private int calculateLCM(int number1, int number2) {
        return (number1 * number2) / calculateGCD(number1, number2);
    }

    private int calculateGCD(int number1, int number2) {
        return number2 == 0 ? number1 : calculateGCD(number2, number1 % number2);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.numerator;
        hash = 11 * hash + this.denominator;
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
        final AlternateRational other = (AlternateRational) obj;
        return (this.getNumerator() * other.getDenominator() == this.getDenominator() * other.getNumerator());
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }
}
