/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project3.videogame.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AlienPack 
{
    private Alien[] aliens;
    
    public AlienPack(int numAliens) 
    {
        aliens = new Alien[numAliens];
    }
    
    public void addAlien(Alien newAlien, int index) 
    {
        aliens[index] = newAlien;
    }
    
    public Alien[] getAliens() 
    {
        return aliens;
    }
    
    public int calculateDamage() 
    {
        int damage = 0;
        for(int i = 0; i < aliens.length; i++) 
        {
            damage += aliens[i].getDamage();
        }
        return damage;
    }
}
