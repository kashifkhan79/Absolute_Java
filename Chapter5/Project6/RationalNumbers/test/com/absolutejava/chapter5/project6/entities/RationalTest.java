/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project6.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class RationalTest {

    @Test
    public void canCreateRationalObject() {
        Rational rational = new Rational();
        assertNotNull(rational);
    }

    @Test
    public void canCreateRationalObjectWithDefaultValues() {
        Rational rational = new Rational(3);
        assertNotNull(rational);
    }

    @Test
    public void canCreateRationalObjectWithDifferentValuesForNumeratorAndDenominator() {
        Rational rational = new Rational(2, 7);
        assertNotNull(rational);
    }

    @Test
    public void canSetAndGetValuesForNumeratorAndDenominatorOfARationalNumber() {
        Rational rational = new Rational();
        rational.setNumerator(2);
        rational.setDenominator(7);
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();

        assertEquals("Numerator is", 2, numerator);
        assertEquals("Denominator is", 7, denominator);
    }

    @Test
    public void canAddTwoRationalNumbers() {
        Rational rational1 = new Rational(2, 4);
        Rational rational2 = new Rational(3, 7);
        Rational result = Rational.add(rational1, rational2);
        assertEquals("Numerator after addition is", 13, result.getNumerator());
        assertEquals("Denominator after additon is", 14, result.getDenominator());
    }

    @Test
    public void canAddTwoRationalNumbersByCallingAddWithObject() {
        Rational rational1 = new Rational(2, 4);
        Rational rational2 = new Rational(3, 7);
        Rational result = rational1.add(rational2);
        assertEquals("Numerator after addition is", 13, result.getNumerator());
        assertEquals("Denominator after additon is", 14, result.getDenominator());
    }

    @Test
    public void canSubtractTwoRationalNumbers() {
        Rational rational1 = new Rational(2, -4);
        Rational rational2 = new Rational(3, 7);
        Rational result = Rational.subtract(rational1, rational2);
        assertEquals("Numerator after subtraction is", -13, result.getNumerator());
        assertEquals("Denominator after subtraction is", 14, result.getDenominator());
    }

    @Test
    public void canSubtractTwoRationalNumbersByCallingSubractWithObject() {
        Rational rational1 = new Rational(2, -4);
        Rational rational2 = new Rational(3, 7);
        Rational result = rational1.subtract(rational2);
        assertEquals("Numerator after subtraction is", -13, result.getNumerator());
        assertEquals("Denominator after subtraction is", 14, result.getDenominator());
    }

    @Test
    public void canMultipleTwoRationalNumbers() {
        Rational rational1 = new Rational(2, 4);
        Rational rational2 = new Rational(3, 7);
        Rational result = Rational.multiply(rational1, rational2);
        assertEquals("Numerator after multiplication is", 3, result.getNumerator());
        assertEquals("Denominator after multiplication is", 14, result.getDenominator());
    }
    
    @Test
    public void canMultipleTwoRationalNumbersByCallingMultipleWithObject() {
        Rational rational1 = new Rational(2, 4);
        Rational rational2 = new Rational(3, 7);
        Rational result = rational1.multiply(rational2);
        assertEquals("Numerator after multiplication is", 3, result.getNumerator());
        assertEquals("Denominator after multiplication is", 14, result.getDenominator());
    }

    @Test
    public void canDivideTwoRationalNumbers() {
        Rational rational1 = new Rational(2, -4);
        Rational rational2 = new Rational(3, 7);
        Rational result = Rational.divide(rational1, rational2);
        assertEquals("Numerator after multiplication is", -7, result.getNumerator());
        assertEquals("Denominator after multiplication is", 6, result.getDenominator());
    }

    @Test
    public void canDivideTwoRationalNumbersByCallingDivideWithObject() {
        Rational rational1 = new Rational(2, -4);
        Rational rational2 = new Rational(3, 7);
        Rational result = rational1.divide(rational2);
        assertEquals("Numerator after multiplication is", -7, result.getNumerator());
        assertEquals("Denominator after multiplication is", 6, result.getDenominator());
    }
    
    @Test
    public void testEqualityOfTwoRationalNumbers() {
        Rational rational1 = new Rational(2, 3);
        Rational rational2 = new Rational(4, 9);
        assertTrue("Rational1 is equal to ", Rational.add(rational1, rational2).equals(new Rational(10, 9)));
        assertTrue("Rational1 is equal to ", Rational.subtract(rational1, rational2).equals(new Rational(2, 9)));
        assertTrue("Rational1 is equal to ", Rational.multiply(rational1, rational2).equals(new Rational(8, 27)));
        assertTrue("Rational1 is equal to ", Rational.divide(rational1, rational2).equals(new Rational(3, 2)));
        assertTrue("Rational1 hashcode != Rational2 hashcode", rational1.hashCode() != rational2.hashCode());
        assertTrue("hashcodes are equals", Rational.add(rational1, rational2).hashCode() == new Rational(10, 9).hashCode());
        assertEquals("toString ", "10/9", Rational.add(rational1, rational2).toString());
    }
}