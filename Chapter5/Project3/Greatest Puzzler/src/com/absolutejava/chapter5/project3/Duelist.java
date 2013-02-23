/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project3;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Duelist {
    
    private boolean alive;
    private String name;
    private double accuracy;
    
    private static int totalDeaths = 0;

    public Duelist() {
        this.name = "";
        this.accuracy = 0.0;
        this.alive = false;        
    }
    
    public Duelist(String name, double accuracy) {
        this.name = name;
        this.accuracy = accuracy;
        this.alive = true;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void shootAtTarget(Duelist target) {
        if(Math.random() <= this.accuracy) {
            target.alive = false;
            totalDeaths++;
        }
    }
    
    public static void resetDeaths() {
        totalDeaths = 0;
    }
    
    public static int getTotalDeaths(){
        return totalDeaths;
    }

    public void resurrect() {
        setAlive(true);
    }
    
}
