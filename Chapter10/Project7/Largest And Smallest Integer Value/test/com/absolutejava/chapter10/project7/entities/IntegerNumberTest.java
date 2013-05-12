/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project7.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class IntegerNumberTest {
    
    @Test
    public void canCreateIntegerNumberObject()
    {
        IntegerNumber integers = new IntegerNumber();
        assertNotNull(integers);
    }
    
    @Test
    public void canReadNumbersFromBinaryFile()
    {
        IntegerNumber numbers = new IntegerNumber();
        int[] data = numbers.readDataFromBinaryFile();
        assertEquals("Length of array is ", 10, data.length);        
    }
    
    @Test
    public void canFindTheSmallestNumber()
    {
        IntegerNumber numbers = new IntegerNumber();
        int smallest = numbers.findSmallestNumber();
        assertEquals("Smallest number is", 12, smallest);
    }
    
    @Test
    public void canFindTheLargestNumber()
    {
        IntegerNumber numbers = new IntegerNumber();
        int largest = numbers.findLargestNumber();
        assertEquals("Largest number is", 92, largest);
    }
}