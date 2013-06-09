/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project4.entities;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MyMathClassTest {
    
    @Test
    public void canCreateMyMathClassObject()
    {
        MyMathClass<Integer> object = new MyMathClass();
        assertNotNull(object);
    }
    
    @Test
    public void cannotCreateMathClassObjectOfTypeNonNumber()
    {
        //MyMathClass<String> object = new MyMathClass();
    }
    
    @Test
    public void canCalculateStandardDeviationOfIntegerNumberTypeMathClass()
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        double standard = MyMathClass.standardDeviation(numbers);
        assertEquals("Standard deviation is", 1.708, standard, 0.000);        
    }
    
    @Test
    public void canCalculateStandardDeviationOfLongNumberTypeMathClass()
    {
        List<Long> numbers = new ArrayList<>();
        numbers.add(1L);
        numbers.add(2L);
        numbers.add(3L);
        numbers.add(4L);
        numbers.add(5L);
        numbers.add(6L);
        double standard = MyMathClass.standardDeviation(numbers);
        assertEquals("Standard deviation is", 1.708, standard, 0.000);        
    }
    
    @Test
    public void canCalculateStandardDeviationOfDoubleNumberTypeMathClass()
    {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(2.2);
        numbers.add(3.3);
        numbers.add(4.4);
        numbers.add(5.5);
        numbers.add(6.6);
        double standard = MyMathClass.standardDeviation(numbers);
        assertEquals("Standard deviation is", 1.879, standard, 0.000);        
    }
}