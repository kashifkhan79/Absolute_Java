/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project10.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Rectangle implements Shape
{
    private double width;
    private double height;
    
    public Rectangle()
    {
        this.width = this.height = 0.0;
    }   
    
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }
    
    @Override
    public double area() 
    {
        return this.width * this.height ;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) 
        {
            return false;
        }
        return true;
    }    
    
}
