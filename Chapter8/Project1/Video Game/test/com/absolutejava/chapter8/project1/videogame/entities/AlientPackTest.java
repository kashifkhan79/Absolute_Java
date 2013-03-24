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
public class AlientPackTest {
    
    @Test
    public void canCreateAlienPackObject() {
        AlienPack pack = new AlienPack(3);
        assertNotNull(pack);
    }
    
    @Test
    public void canAddAlienToAlienPack() {
        Alien snake = new Snake(35, "Snakey");
        AlienPack pack = new AlienPack(1);
        pack.addAlien(snake, 0);
        assertEquals("Alien at index 0 is", new Snake(35, "Snakey"), pack.getAliens()[0]);
    }
    
    @Test
    public void canAddMultipleAliensToAlienPack() {
        Alien snake = new Snake(35, "Snakey");
        Alien ogre = new Ogre(75, "Ogrey");
        Alien marshmallowMan = new MarshmallowMan(89, "Marshy");
        AlienPack pack = new AlienPack(3);
        pack.addAlien(snake, 0);
        pack.addAlien(ogre, 1);
        pack.addAlien(marshmallowMan, 2);
        assertEquals("Alien at index 0 is", new Snake(35, "Snakey"), pack.getAliens()[0]);
        assertEquals("Alien at index 0 is", new Ogre(75, "Ogrey"), pack.getAliens()[1]);
        assertEquals("Alien at index 0 is", new MarshmallowMan(89, "Marshy"), pack.getAliens()[2]);        
    }
    
    @Test
    public void canCalculateDamageDoneByAlienPack() {
        Alien snake = new Snake(35, "Snakey");
        Alien ogre = new Ogre(75, "Ogrey");
        Alien marshmallowMan = new MarshmallowMan(89, "Marshy");
        Alien python = new Snake(85, "Python");
        AlienPack pack = new AlienPack(4);
        pack.addAlien(snake, 0);
        pack.addAlien(ogre, 1);
        pack.addAlien(marshmallowMan, 2);
        pack.addAlien(python, 3);
        assertEquals("Damage done by Alien Pack is", 27, pack.calculateDamage());
    }
}