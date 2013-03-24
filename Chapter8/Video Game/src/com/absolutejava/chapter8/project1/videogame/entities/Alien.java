/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project1.videogame.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public abstract class Alien
{
    private int health;
    private String name;

    public Alien()
    {
        health = 0;
        name = "";
    }

    public Alien(int health, String name)
    {
        this.health = health;
        this.name = name;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int theHealth)
    {
        health = theHealth;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String theName)
    {
        name = theName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.health;
        hash = 19 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alien other = (Alien) obj;
        if (this.health != other.health) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
        
    public abstract int getDamage();
       
}
