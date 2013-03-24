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
public class SnakeTest {
    
    @Test
    public void canCreateSnakeObject() {
        Alien snake = new Snake();
        assertNotNull(snake);
    }
    
    @Test
    public void canCreateSnakeWithHealthAndName() {
        Alien snake = new Snake(0, "");
        snake.setName("Snakey");
        snake.setHealth(70);
        assertEquals("Snake Name is", "Snakey", snake.getName());
        assertEquals("Snake health is", 70, snake.getHealth());
    }
    
    @Test
    public void canGetDamageDoneBySnake() {
        Alien snake = new Snake(95, "Snakey");
        assertEquals("Damage done", 10, snake.getDamage());
    }
}