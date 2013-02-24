/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project7.complexnumbers.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AlternateComplexNumberTest {

    @Test
    public void canCreateAlternateComplexNumberObject() {
        AlternateComplex complex = new AlternateComplex();
        assertNotNull(complex);
    }

    @Test
    public void canCreateComplexNumberObjectWithRealPart() {
        AlternateComplex complex = new AlternateComplex(3.0);
        assertNotNull(complex);
    }

    @Test
    public void canCreateComplexNumberObjectWithRealAndImaginaryPart() {
        AlternateComplex complex = new AlternateComplex(3.0, -4.0);
        assertNotNull(complex);
    }

    @Test
    public void canSetAndGetRealAndImaginaryPartsOfComplexNumber() {
        AlternateComplex complex = new AlternateComplex();
        complex.setReal(3.0);
        complex.setImaginary(-5.9);
        assertEquals("Real part is", 3.0, complex.getReal(), 0.0);
        assertEquals("Imaginary part is", -5.9, complex.getImaginary(), 0.0);
    }

    @Test
    public void canAddTwoComplexNumbersByCallingAddWithObject() {
        AlternateComplex c1 = new AlternateComplex(3.0, -4.0);
        AlternateComplex c2 = new AlternateComplex(4.0, 4.0);
        c1.add(c2);
        assertEquals("Real part of sum is", 7.0, c1.getReal(), 0.0);
        assertEquals("Imaginary part of sum is", 0.0, c1.getImaginary(), 0.0);
    }

    @Test
    public void canSubtractTwoComplexNumbersByCallingSubtractWithObject() {
        AlternateComplex c1 = new AlternateComplex(3.0, -4.0);
        AlternateComplex c2 = new AlternateComplex(4.0, 5.0);
        c1.subtract(c2);
        assertEquals("Real part of difference is", -1.0, c1.getReal(), 0.0);
        assertEquals("Imaginary part of difference is", -9.0, c1.getImaginary(), 0.0);
    }

    @Test
    public void canMultiplyTwoComplexNumbersByCallingMultiplyWithObject() {
        AlternateComplex c1 = new AlternateComplex(3.0, -4.0);
        AlternateComplex c2 = new AlternateComplex(4.0, 7.0);
        c1.multiply(c2);
        assertEquals("Real part of result is", 40.0, c1.getReal(), 0.0);
        assertEquals("Imaginary part of result is", 5.0, c1.getImaginary(), 0.0);
    }

    @Test
    public void canTestEqualityOfTwoComplexNumbers() {
        AlternateComplex c1 = new AlternateComplex(3.0, -4.0);
        AlternateComplex c2 = new AlternateComplex(4.0, 7.0);
        c1.multiply(c2);
        assertTrue("Complex c3 is equal", c1.equals(new AlternateComplex(40.0, 5.0)));
        assertTrue("Complex c3 is equal", c1.equals(c1));
        assertTrue("Complex c3 is equal", new AlternateComplex(40.0, 5.0).equals(c1));
        assertTrue("hashCode is equal", c1.hashCode() == new AlternateComplex(40.0, 5.0).hashCode());
        assertEquals("toString is equal", "40.0 + 5.0i", c1.toString());
    }
}