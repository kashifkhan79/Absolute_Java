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
public class OgreTest {
    
    @Test
    public void canCreateOgreObject() {
        Ogre ogre = new Ogre();
        assertNotNull(ogre);
    }
    
    @Test
    public void canCreateOgreObjectWithParameters() {
        Ogre ogre = new Ogre(100, "Ogre");
        assertNotNull(ogre);
    }
    
    @Test
    public void canGetDamageDoneByOgre() {
        Ogre ogre = new Ogre(100, "Ogre");
        int damage = ogre.getDamage();
        assertEquals("Damage done by ogre is", 6, damage);
    }
}