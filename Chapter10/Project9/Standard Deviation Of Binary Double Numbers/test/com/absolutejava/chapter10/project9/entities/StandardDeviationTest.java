/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project9.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class StandardDeviationTest {
    
    @Test
    public void canCreateStandardDeviationObject()
    {
        StandardDeviation deviation = new StandardDeviation();
        assertNotNull(deviation);
    }
    
    @Test
    public void canCalculateAverageOfNumbers()
    {
        StandardDeviation deviation = new StandardDeviation();
        double average = deviation.calculateAverage();
        assertEquals("Averga of numbers is", 51.94, average, 0.0);        
    }
    
    @Test
    public void canCalculateStandardDeviationOfNumbers()
    {
        StandardDeviation deviation = new StandardDeviation();
        double average = deviation.calculateStandardDeviation();
        assertEquals("Averga of numbers is", 27.33, average, 0.0);        
    }
    
}