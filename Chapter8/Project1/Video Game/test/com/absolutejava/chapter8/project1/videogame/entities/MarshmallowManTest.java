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
public class MarshmallowManTest {
    
    @Test
    public void canCreateMarshmallowManObject() {
        Alien marshmallowMan = new MarshmallowMan();
        assertNotNull(marshmallowMan);
    }
    
    @Test
    public void canCreateMarshmallowManObjectWithHealthAndName() {
        Alien marshmallowMan = new MarshmallowMan(89, "Marshy");
        assertEquals("MarshmallowMan name is", "Marshy", marshmallowMan.getName());
        assertEquals("MarshmallowMan health is", 89, marshmallowMan.getHealth());
    }
    
    @Test
    public void canGetDamageDoneByMarshmallowMan() {
        Alien marshmallowMan = new MarshmallowMan(89, "Marshy");
        assertEquals("Damage done by MarshmallowMan is", 1, marshmallowMan.getDamage());
    }
}