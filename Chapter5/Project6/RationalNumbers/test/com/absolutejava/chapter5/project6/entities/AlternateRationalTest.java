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
public class AlternateRationalTest {
    
    @Test
    public void canCreateRationalObject() {
        AlternateRational rational = new AlternateRational();
        assertNotNull(rational);
    }

    @Test
    public void canCreateRationalObjectWithDefaultValues() {
        AlternateRational rational = new AlternateRational(3);
        assertNotNull(rational);
    }

    @Test
    public void canCreateRationalObjectWithDifferentValuesForNumeratorAndDenominator() {
        AlternateRational rational = new AlternateRational(2, 7);
        assertNotNull(rational);
    }

    @Test
    public void canSetAndGetValuesForNumeratorAndDenominatorOfARationalNumber() {
        AlternateRational rational = new AlternateRational();
        rational.setNumerator(-2);
        rational.setDenominator(-7);
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();

        assertEquals("Numerator is", -2, numerator);
        assertEquals("Denominator is", -7, denominator);
    }
    
    @Test
    public void canAddTwoRationalNumbersByCallingAddWithObject() {
        AlternateRational rational1 = new AlternateRational(2, 4);
        AlternateRational rational2 = new AlternateRational(3, 7);
        rational1.add(rational2);
        assertEquals("Numerator after addition is", 13, rational1.getNumerator());
        assertEquals("Denominator after additon is", 14, rational1.getDenominator());
    }
    
    @Test
    public void canSubtractTwoRationalNumbersByCallingSubractWithObject() {
        AlternateRational rational1 = new AlternateRational(2, -4);
        AlternateRational rational2 = new AlternateRational(3, 7);
        rational1.subtract(rational2);
        assertEquals("Numerator after subtraction is", -13, rational1.getNumerator());
        assertEquals("Denominator after subtraction is", 14, rational1.getDenominator());
    }
    
    @Test
    public void canMultipleTwoRationalNumbersByCallingMultipleWithObject() {
        AlternateRational rational1 = new AlternateRational(2, 4);
        AlternateRational rational2 = new AlternateRational(3, 7);
        rational1.multiply(rational2);
        assertEquals("Numerator after multiplication is", 3, rational1.getNumerator());
        assertEquals("Denominator after multiplication is", 14, rational1.getDenominator());
    }
    
    @Test
    public void canDivideTwoRationalNumbersByCallingDivideWithObject() {
        AlternateRational rational1 = new AlternateRational(2, -4);
        AlternateRational rational2 = new AlternateRational(3, 7);
        rational1.divide(rational2);
        assertEquals("Numerator after multiplication is", -7, rational1.getNumerator());
        assertEquals("Denominator after multiplication is", 6, rational1.getDenominator());
    }
    
    
    @Test
    public void testEqualityOfTwoRationalNumbers() {
        AlternateRational rational1 = new AlternateRational(2, 3);
        AlternateRational rational2 = new AlternateRational(4, 9);
        rational1.add(rational2);
        assertTrue("Rational1 is equal to ", rational1.equals(new AlternateRational(10, 9)));
        
        rational1.subtract(rational2);
        assertTrue("Rational1 is equal to ", rational1.equals(new AlternateRational(2, 3)));
        
        rational1.multiply(rational2);
        assertTrue("Rational1 is equal to ", rational1.equals(new AlternateRational(8, 27)));
        
        rational1.divide(rational2);
        assertTrue("Rational1 is equal to ", rational1.equals(new AlternateRational(2, 3)));
        assertTrue("Rational1 hashcode != Rational2 hashcode", rational1.hashCode() != rational2.hashCode());        
        assertTrue("hashCodes are equal", rational1.hashCode() == new AlternateRational(2, 3).hashCode());
        assertEquals("toString ", "2/3", rational1.toString());
    }
    
}