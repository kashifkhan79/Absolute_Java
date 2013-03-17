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
public class SnakeTest {
    
    @Test
    public void canCreateSnakeObject() {
        Snake snake = new Snake();
        assertNotNull(snake);
    }
    
    @Test
    public void canCreateSnakeObjectWithParameters() {
        Snake snake = new Snake(100, "Snake");
        assertNotNull(snake);        
    }
    
    @Test
    public void canGetDamageDoneBySnake() {
        Snake snake = new Snake(100, "Snake");
        int damage = snake.getDamage();
        assertEquals("Damage done by snake is", 10, damage);
    }
}