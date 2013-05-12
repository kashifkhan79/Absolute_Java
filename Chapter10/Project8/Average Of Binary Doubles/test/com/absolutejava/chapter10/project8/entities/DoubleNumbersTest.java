/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project8.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DoubleNumbersTest {
    
    @Test
    public void canCreateDoubleNumbersObject()
    {
        DoubleNumbers numbers = new DoubleNumbers();
        assertNotNull(numbers);
    }
    
    @Test
    public void canReadNumbersFromBinaryFile()
    {
        DoubleNumbers numbers = new DoubleNumbers();
        double[] data = numbers.readDataFromBinaryFile();
        assertEquals("Size of data is", 10, data.length);
        assertEquals("First element is", 28.21, data[0], 0.00);
        assertEquals("First element is", 39.42, data[9], 0.00);        
    }
    
    @Test
    public void canCalculateAverageOfNumbers()
    {
        DoubleNumbers numbers = new DoubleNumbers();        
        double average = numbers.calculateAverage();
        assertEquals("Averga of numbers is", 51.94, average, 0.0);        
    }
}