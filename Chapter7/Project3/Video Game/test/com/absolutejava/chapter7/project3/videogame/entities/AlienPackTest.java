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
public class AlienPackTest {
    
    @Test
    public void canCreateAlienPackObject() {
        AlienPack alienPack = new AlienPack(3);
        assertNotNull(alienPack);
        assertEquals("Size of alien pack", 3, alienPack.getAliens().length);
    }
    
    @Test
    public void canAddAlienToAnAlienPack() {
        AlienPack alienPack = new AlienPack(3);
        Alien snake = new Alien(100, "Snake");
        Alien ogre = new Alien(100, "Ogre");
        Alien marshmallowMan = new Alien(100, "Mashmallo Man");
        alienPack.addAlien(snake, 0);
        alienPack.addAlien(ogre, 1);
        alienPack.addAlien(marshmallowMan, 2);
        
        assertEquals("Alien at index 0 is", alienPack.getAliens()[0], snake);
        assertEquals("Alien at index 1 is", alienPack.getAliens()[1], ogre);
        assertEquals("Alien at index 2 is", alienPack.getAliens()[2], marshmallowMan);
    }
    
    @Test
    public void canCalculateDamageByAlienPack() {
        AlienPack alienPack = new AlienPack(3);
        Snake snake = new Snake(100, "Snake");
        Ogre ogre = new Ogre(100, "Ogre");
        MarshmallowMan marshmallowMan = new MarshmallowMan(100, "Mashmallo Man");
        alienPack.addAlien(snake, 0);
        alienPack.addAlien(ogre, 1);
        alienPack.addAlien(marshmallowMan, 2);
        
        assertEquals("Damage done by alien pack is ", 17, alienPack.calculateDamage());
    }
}