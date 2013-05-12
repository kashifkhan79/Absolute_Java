/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project1.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class PersonTest {
    
    @Test
    public void canCreateMaleObject()
    {
        Person male = new Male();
        assertNotNull(male);
    }
   
    @Test
    public void canCreateMaleObjectWithNameAndPopularityRank()
    {
        Person male = new Male("Jacob", 29195);
        assertNotNull(male);
        int popularity = male.getPopularityRank();
        assertEquals("Popularity is", 29195, popularity);
    }
    
    @Test
    public void canCreateFemaleObject()
    {
        Person female = new Female();
        assertNotNull(female);
    }
    
    @Test
    public void canCreateFemaleObjectWithNameAndPopularityRank()
    {
        Person female = new Female("Emily", 25494);
        assertNotNull(female);
    }  
}