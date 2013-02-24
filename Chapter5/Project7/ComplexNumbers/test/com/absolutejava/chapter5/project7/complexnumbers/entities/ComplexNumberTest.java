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
public class ComplexNumberTest {

    @Test
    public void canCreateComplexNumberObject() {
        Complex complex = new Complex();
        assertNotNull(complex);
    }

    @Test
    public void canCreateComplexNumberObjectWithRealPart() {
        Complex complex = new Complex(3.0);
        assertNotNull(complex);
    }

    @Test
    public void canCreateComplexNumberObjectWithRealAndImaginaryPart() {
        Complex complex = new Complex(3.0, -4.0);
        assertNotNull(complex);
    }

    @Test
    public void canSetAndGetRealAndImaginaryPartsOfComplexNumber() {
        Complex complex = new Complex();
        complex.setReal(3.0);
        complex.setImaginary(-5.9);
        assertEquals("Real part is", 3.0, complex.getReal(), 0.0);
        assertEquals("Imaginary part is", -5.9, complex.getImaginary(), 0.0);
    }
    
    @Test
    public void canAddTwoComplexNumbers(){
        Complex c1 = new Complex(3.0, -4.0);
        Complex c2 = new Complex(4.0);
        Complex result = Complex.add(c1, c2);
        assertEquals("Real part of sum is", 7.0, result.getReal(), 0.0);
        assertEquals("Imaginary part of sum is", -4.0, result.getImaginary(), 0.0);
    }
    
    @Test
    public void canAddTwoComplexNumbersByCallingAddWithObject(){
        Complex c1 = new Complex(3.0, -4.0);
        Complex c2 = new Complex(4.0, 4.0);
        Complex result = c1.add(c2);
        assertEquals("Real part of sum is", 7.0, result.getReal(), 0.0);
        assertEquals("Imaginary part of sum is", 0.0, result.getImaginary(), 0.0);
    }
    
    @Test
    public void canSubtractTwoComplexNumbers(){
        Complex c1 = new Complex(3.0, -4.0);
        Complex c2 = new Complex(4.0);
        Complex result = Complex.subtract(c1, c2);
        assertEquals("Real part of difference is", -1.0, result.getReal(), 0.0);
        assertEquals("Imaginary part of difference is", -4.0, result.getImaginary(), 0.0);
    }
    
    @Test
    public void canSubtractTwoComplexNumbersByCallingSubtractWithObject(){
        Complex c1 = new Complex(3.0, -4.0);
        Complex c2 = new Complex(4.0, 5.0);
        Complex result = c1.subtract(c2);
        assertEquals("Real part of difference is", -1.0, result.getReal(), 0.0);
        assertEquals("Imaginary part of difference is", -9.0, result.getImaginary(), 0.0);
    }
    
    @Test
    public void canMultiplyTwoComplexNumbers(){
        Complex c1 = new Complex(3.0, -4.0);
        Complex c2 = new Complex(4.0, 7.0);
        Complex result = Complex.multiply(c1, c2);
        assertEquals("Real part of result is", 40.0, result.getReal(), 0.0);
        assertEquals("Imaginary part of result is", 5.0, result.getImaginary(), 0.0);
    }
    
    @Test
    public void canMultiplyTwoComplexNumbersByCallingMultiplyWithObject(){
        Complex c1 = new Complex(3.0, -4.0);
        Complex c2 = new Complex(4.0, 7.0);
        Complex result = c1.multiply(c2);
        assertEquals("Real part of result is", 40.0, result.getReal(), 0.0);
        assertEquals("Imaginary part of result is", 5.0, result.getImaginary(), 0.0);
    }
    
    @Test
    public void canTestEqualityOfTwoComplexNumbers(){
        Complex c1 = new Complex(3.0, -4.0);
        Complex c2 = new Complex(4.0, 7.0);
        Complex c3 = c1.multiply(c2);
        assertTrue("Complex c3 is equal", c3.equals(new Complex(40.0, 5.0)));
        assertTrue("Complex c3 is equal", c3.equals(c3));
        assertTrue("Complex c3 is equal", new Complex(40.0, 5.0).equals(c3));
        assertTrue("hashCode is equal", c3.hashCode() == new Complex(40.0, 5.0).hashCode());
        assertEquals("toString is equal", "40.0 + 5.0i", c3.toString());
    }
}