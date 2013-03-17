/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project3.videogame.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MarshmallowMan extends Alien {
    
    private static final int MARSHMALLOWMAN_DAMAGE = 1;
    
    public MarshmallowMan() {
        
    }

    public MarshmallowMan(int health, String name) {
        super(health, name);
    }

    @Override
    public int getDamage() {
        return MARSHMALLOWMAN_DAMAGE;
    }
}
