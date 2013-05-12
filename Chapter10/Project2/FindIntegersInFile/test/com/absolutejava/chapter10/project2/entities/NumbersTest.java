/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project2.entities;

import com.absolutejava.chapter10.project2.entites.Numbers;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class NumbersTest {
    
    @Test
    public void canCreateNumbersObject()
    {
        Numbers numnbers = new Numbers();
        assertNotNull(numnbers);
    }    
    
    @Test
    public void canFindTheLargestNumber()
    {
        Numbers numbers = new Numbers();        
        int largest = numbers.getLargestNumber();
        assertEquals("Largest number is", 76, largest);
    }
    
    @Test
    public void canFindSmallestNumber()
    {
        Numbers numbers = new Numbers();        
        int smallest = numbers.getSmallestNumber();
        assertEquals("Largest number is", -23, smallest);
    }
}