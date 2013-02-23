/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.fractions;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction() {
    }
    
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public Fraction reduceToLowestTerms() {
        return new Fraction(numerator/calculateGCD(this.numerator, this.denominator), denominator/calculateGCD(this.numerator, this.denominator));
    }
    
    private int calculateGCD(int numerator, int denominator) {
        return denominator == 0 ? numerator : calculateGCD(denominator, numerator % denominator);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.numerator;
        hash = 89 * hash + this.denominator;
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
        final Fraction other = (Fraction) obj;
        if (this.numerator != other.numerator) {
            return false;
        }
        if (this.denominator != other.denominator) {
            return false;
        }
        return true;
    }
     
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }    
}