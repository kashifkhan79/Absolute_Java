/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project1.videogame.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Ogre extends Alien
{
    private static final int OGRE_DAMAGE = 6;
    public Ogre()
    {
        super();
    }

    public Ogre(int health, String name)
    {
        super(health, name);
    }

    @Override
    public int getDamage()
    {
        return OGRE_DAMAGE;
    }
}
