/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project3.videogame.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AlienTest {
    
    @Test
    public void canCreateAlienObject() {
        Alien anAlien = new Alien();
        assertNotNull(anAlien);
    }
    
    @Test
    public void canCreateAlienWithHealthAndNameParameters() {
        Alien anAlien = new Alien(100, "Snake");
        assertNotNull(anAlien);
    }
}