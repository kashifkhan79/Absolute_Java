/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project3.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Point 
{
    private double xCoordinate;
    private double yCoordinate;
    
    public Point()
    {
        this(0,0);
    }

    public Point(double xCoordinate, double yCoordinate) 
    {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() 
    {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) 
    {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() 
    {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) 
    {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public int hashCode() 
    {
        int hash = 71;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.xCoordinate) ^ (Double.doubleToLongBits(this.xCoordinate) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.yCoordinate) ^ (Double.doubleToLongBits(this.yCoordinate) >>> 32));
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
        if(this == obj)
        {
            return true;
        }            
        final Point other = (Point) obj;
        if (Double.doubleToLongBits(this.xCoordinate) != Double.doubleToLongBits(other.xCoordinate))
        {
            return false;
        }
        if (Double.doubleToLongBits(this.yCoordinate) != Double.doubleToLongBits(other.yCoordinate))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Point{" + "xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + '}';
    }   
}
