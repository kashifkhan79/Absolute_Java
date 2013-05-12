/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project3.entities;

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
        DoubleNumber numbers = new DoubleNumber();
        assertNotNull(numbers);
    }
    
    @Test
    public void canCalculateAverageOfNumbers()
    {
        DoubleNumber numbers = new DoubleNumber();
        double average = numbers.calculateAverage();
        assertEquals("Averga of numbers is", 15.69, average, 0.0);
    }
}