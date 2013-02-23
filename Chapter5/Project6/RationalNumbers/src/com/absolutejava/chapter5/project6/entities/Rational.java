/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project6.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Rational {

    private static final int NORMALIZER_VALUE = -1;
    private int numerator;
    private int denominator;

    public Rational() {
        this(0);
    }

    public Rational(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static Rational add(Rational rational1, Rational rational2) {
        int denominator = calculateLCM(rational1.getDenominator(), rational2.getDenominator());
        int numerator = calculateNumeratorAfterAddition(rational1, rational2, denominator);
        return new Rational(numerator, denominator).reduceToLowestTerms().normalize();
    }

    public Rational add(Rational other) {
        int localDenominator = calculateLCM(this.getDenominator(), other.getDenominator());
        int localNumerator = calculateNumeratorAfterAddition(this, other, localDenominator);
        return new Rational(localNumerator, localDenominator).reduceToLowestTerms().normalize();
    }

    public static Rational subtract(Rational rational1, Rational rational2) {
        int denominator = calculateLCM(rational1.getDenominator(), rational2.getDenominator());
        int numerator = calculateNumeratorAfterSubtraction(rational1, rational2, denominator);
        return new Rational(numerator, denominator).reduceToLowestTerms().normalize();
    }

    public Rational subtract(Rational other) {
        int localDenominator = calculateLCM(this.getDenominator(), other.getDenominator());
        int localNumerator = calculateNumeratorAfterSubtraction(this, other, localDenominator);
        return new Rational(localNumerator, localDenominator).reduceToLowestTerms().normalize();
    }

    public static Rational multiply(Rational rational1, Rational rational2) {
        int numerator = rational1.getNumerator() * rational2.getNumerator();
        int denominator = rational1.getDenominator() * rational2.getDenominator();
        return new Rational(numerator, denominator).reduceToLowestTerms().normalize();
    }

    public Rational multiply(Rational other) {
        int localNumerator = this.getNumerator() * other.getNumerator();
        int localDenominator = this.getDenominator() * other.getDenominator();
        return new Rational(localNumerator, localDenominator).reduceToLowestTerms().normalize();
    }

    public static Rational divide(Rational rational1, Rational rational2) {
        int numerator = rational1.getNumerator() * rational2.getDenominator();
        int denominator = rational1.getDenominator() * rational2.getNumerator();
        return new Rational(numerator, denominator).reduceToLowestTerms().normalize();
    }

    public Rational divide(Rational other) {
        int localNumerator = this.getNumerator() * other.getDenominator();
        int localDenominator = this.getDenominator() * other.getNumerator();
        return new Rational(localNumerator, localDenominator).reduceToLowestTerms().normalize();
    }

    private static int calculateNumeratorAfterAddition(Rational rational1, Rational rational2, int denominator) {
        return rational1.getNumerator() * (denominator / rational1.getDenominator()) + rational2.getNumerator() * (denominator / rational2.getDenominator());
    }

    private static int calculateNumeratorAfterSubtraction(Rational rational1, Rational rational2, int denominator) {
        return rational1.getNumerator() * (denominator / rational1.getDenominator()) - rational2.getNumerator() * (denominator / rational2.getDenominator());
    }

    private Rational reduceToLowestTerms() {
        return new Rational(this.getNumerator() / calculateGCD(this.getNumerator(), this.getDenominator()),
                this.getDenominator() / calculateGCD(this.getNumerator(), this.getDenominator()));
    }

    private Rational normalize() {
        this.setNumerator(this.getDenominator() < 0 ? this.getNumerator() * NORMALIZER_VALUE : this.getNumerator());
        this.setDenominator(this.getDenominator() < 0 ? this.getDenominator() * NORMALIZER_VALUE : this.getDenominator());
        return this;
    }

    private static int calculateLCM(int number1, int number2) {
        return (number1 * number2) / calculateGCD(number1, number2);
    }

    private static int calculateGCD(int number1, int number2) {
        return number2 == 0 ? number1 : calculateGCD(number2, number1 % number2);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.getNumerator();
        hash = 71 * hash + this.getDenominator();
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
        final Rational other = (Rational) obj;
        return (this.getNumerator() * other.getDenominator() == this.getDenominator() * other.getNumerator());
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }
}
