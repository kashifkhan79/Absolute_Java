/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.fractions;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class FractionsTest {
    
    @Test
    public void canCreateFractionObject() {
        Fraction fraction = new Fraction();        
        assertNotNull(fraction);
    }
    
    @Test
    public void canDisplayFraction() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(5);
        fraction.setDenominator(7);        
        assertEquals("Fraction is", "5/7", fraction.toString());
    }
    
    @Test
    public void canReduceToLowestTerms() {
        Fraction fraction = new Fraction(20, 60);
        fraction = fraction.reduceToLowestTerms();        
        assertEquals("Fraction reduced to lowest terms is", "1/3", fraction.toString());
    }
    
    @Test
    public void fractionsAreEqualIfReducedToLowestTermsAreEqual() {
        Fraction fraction = new Fraction(33, 45);
        fraction = fraction.reduceToLowestTerms();
        Fraction reducedFraction = new Fraction(11, 15);        
        assertEquals("Fraction are equal",  true, fraction.equals(reducedFraction));
        assertEquals("Same fraction is equal", true, fraction.equals(fraction));
        assertEquals("Fraction hash code are equal", fraction.hashCode(), reducedFraction.hashCode());
        assertTrue(fraction.hashCode() != new Fraction(11,35).hashCode());
    }
}