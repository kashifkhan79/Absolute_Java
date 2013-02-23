/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.hotdogstands;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class HotDogStandTest {
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() throws Exception {
        HotDogStand.resetAllHotDogsSold();
    }
    
    @Test
    public void CanCreateHotDogStandObject() {
        HotDogStand stand = new HotDogStand();
        assertNotNull("Hot dog stand can be created", stand);
    }
    
    @Test
    public void oneHotDogIsSoldByOneStand() {
        HotDogStand stand = new HotDogStand(1);
        stand.justSold();
        assertEquals("Number of hot dogs sold", 1, stand.getNumberOfHotDogsSold());
    }
    
    @Test
    public void multipleHotDogsAreSoldByOneStand() {
        HotDogStand stand = new HotDogStand();
        stand.justSold();
        stand.justSold();
        assertEquals("Multiple hot dogs are sold by one stand", 2, stand.getNumberOfHotDogsSold());
    }
    
    @Test
    public void oneHotDogIsSoldByMultipleStands() {
        HotDogStand stand1 = new HotDogStand(1, 1);
        HotDogStand stand2 = new HotDogStand(2, 1);
        assertEquals("Stand1 with id 1 sold one hot dog", 1, stand1.getNumberOfHotDogsSold());
        assertEquals("Stand2 with id 2 sold one hot dog", 1, stand2.getNumberOfHotDogsSold());
    }
    
    @Test
    public void canGetAllHotDogsSoldByMultipleStands() {
        HotDogStand stand1 = new HotDogStand(1, 2);
        HotDogStand stand2 = new HotDogStand(2, 3);
        HotDogStand stand3 = new HotDogStand(3);
        stand3.justSold();
        stand3.justSold();        
        assertEquals("All hot dogs sold by all stands are", 7, HotDogStand.getAllHotDogsSold());        
    }
    
    
}
