/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project3.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Waypoint 
{
    private Point point;
    private int timestamp;
    
    public Waypoint()
    {
        this(new Point(), 0);
    }
    
    public Waypoint(Point point, int timestamp) 
    {
        this.point = point;
        this.timestamp = timestamp;
    }

    public Point getPoint()
    {
        return point;
    }

    public void setPoint(Point point)
    {
        this.point = point;
    }

    public int getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(int timestamp)
    {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.point);
        hash = 97 * hash + this.timestamp;
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
        final Waypoint other = (Waypoint) obj;
        if (!Objects.equals(this.point, other.point))
        {
            return false;
        }
        if (this.timestamp != other.timestamp)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Waypoint{" + "point=" + point + ", timestamp=" + timestamp + '}';
    }

}
