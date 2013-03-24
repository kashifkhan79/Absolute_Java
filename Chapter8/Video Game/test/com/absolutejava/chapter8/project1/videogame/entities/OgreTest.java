/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter8.project1.videogame.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class OgreTest {
    
    @Test
    public void canCreateOgreObject() {
        Ogre ogre = new Ogre();
        assertNotNull(ogre);
    }
    
    @Test
    public void canCreateOgreWithHealthAndName() {
        Alien ogre = new Ogre(75, "Ogrey");
        assertEquals("Ogre health is", 75, ogre.getHealth());
        assertEquals("Ogre name is", "Ogrey", ogre.getName());
    }
    
    @Test
    public void canGetDamageDoneByOgre() {
        Alien ogre = new Ogre(75, "Ogrey");
        assertEquals("Damage done by ogre is", 6, ogre.getDamage());
    }
}