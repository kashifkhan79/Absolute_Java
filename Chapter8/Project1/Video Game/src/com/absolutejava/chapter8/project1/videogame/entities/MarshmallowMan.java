/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project1.videogame.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MarshmallowMan extends Alien
{
    private static final int MARSHMALLOW_MAN_DAMAGE = 1;
    public MarshmallowMan()
    {
        super();
    }

    public MarshmallowMan(int health, String name)
    {
        super(health, name);
    }

    @Override
    public int getDamage()
    {
        return MARSHMALLOW_MAN_DAMAGE;
    }
}
