/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project10.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Circle implements Shape
{
    private double radius;
    
    public Circle()
    {
        this.radius = 0.0;
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double area() 
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) 
        {
            return false;
        }
        return true;
    }   
    
}
