/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project3;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DuelistTest {
    
    @Test
    public void canCreateADuelist() {
        Duelist duelist = new Duelist();
        assertNotNull(duelist);
    }
    
    @Test
    public void canCreateADuelistWithNameAndAccuracy() {
        Duelist duelist = new Duelist("Aaron", 1.0/3.0);
        assertNotNull(duelist);
    }
    
    @Test
    public void seeIfDuelistIsStillAlive() {
        Duelist duelist = new Duelist("Aaron", 1.0/3.0);
        duelist.setAlive(false);
        boolean status = duelist.isAlive();        
        assertFalse("Duelist is alive", status);
    }
}
