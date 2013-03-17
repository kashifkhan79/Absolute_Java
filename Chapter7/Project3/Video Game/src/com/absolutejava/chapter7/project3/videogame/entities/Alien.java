/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project3.videogame.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Alien {
   
    private int health;
    private String name;

    public Alien() {
    }
    
    public Alien(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getDamage() {
        return 0;
    }
    
}
