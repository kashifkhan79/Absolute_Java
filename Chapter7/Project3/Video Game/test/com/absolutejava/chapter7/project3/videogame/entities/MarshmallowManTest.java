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
public class MarshmallowManTest {
    
    @Test
    public void canCreateMarshmallowManObject() {
        MarshmallowMan marshmalloMan = new MarshmallowMan();
        assertNotNull(marshmalloMan);
    }
    
    @Test
    public void canCreateMarshmallowManObjectWithParameters() {
        MarshmallowMan marshmallowMan = new MarshmallowMan(100, "Marshmallow Man");
        assertNotNull(marshmallowMan);
    }
    
    @Test
    public void canGetDamageDoneByMarshmallowMan() {
        MarshmallowMan marshmallowMan = new MarshmallowMan(100, "Marshmallow Man");
        int damage = marshmallowMan.getDamage();
        assertEquals("Damage done by MarshmallowMan is", 1, damage);
    }
}