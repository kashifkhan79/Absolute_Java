/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project1.videogame.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Snake extends Alien
{
    private static final int SNAKE_DAMAGE = 10;
    
    public Snake()
    {
        super();
    }

    public Snake(int health, String name)
    {
        super(health, name);
    }

    @Override
    public int getDamage()
    {
        return SNAKE_DAMAGE;
    }  
    
}
