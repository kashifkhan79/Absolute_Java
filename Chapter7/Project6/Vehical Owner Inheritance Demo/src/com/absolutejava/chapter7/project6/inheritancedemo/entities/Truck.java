/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project6.inheritancedemo.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Truck extends Vehicle {
    private double loadCapacityInTons;
    private int towingCapacityInPounds;
    
    public Truck() 
    {
        super();
        this.loadCapacityInTons = 0.0;
        this.towingCapacityInPounds = 0;
    }

    public Truck(String manufacturerName, int numberOfCylindersInEnginer, Person owner, double loadCapacityInTons) {
        super(manufacturerName, numberOfCylindersInEnginer, owner);
        this.loadCapacityInTons = loadCapacityInTons;
        this.towingCapacityInPounds = 0;
    }
    
    public Truck(String manufacturerName, int numberOfCylindersInEnginer, Person owner, double loadCapacityInTons, int towingCapacityInPounds) {
        this(manufacturerName, numberOfCylindersInEnginer, owner, loadCapacityInTons);
        this.towingCapacityInPounds = towingCapacityInPounds;
    }

    public void setLoadCapacityInTons(double loadCapacityInTons) {
        this.loadCapacityInTons = loadCapacityInTons;
    }

    public double getLoadCapacityInTons() {
        return loadCapacityInTons;
    }

    public void setTowingCapacityInPounds(int towingCapacityInPounds) {
        this.towingCapacityInPounds = towingCapacityInPounds;
    }

    public int getTowingCapacityInPounds() {
        return towingCapacityInPounds;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.loadCapacityInTons) ^ (Double.doubleToLongBits(this.loadCapacityInTons) >>> 32));
        hash = 71 * hash + this.towingCapacityInPounds;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Truck other = (Truck) obj;
        if(!super.equals(other)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loadCapacityInTons) != Double.doubleToLongBits(other.loadCapacityInTons)) {
            return false;
        }
        if (this.towingCapacityInPounds != other.towingCapacityInPounds) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("Load capacity in tons: ").append(getLoadCapacityInTons()).append("\n");
        builder.append("Towing capacity in pounds: ").append(getTowingCapacityInPounds());
        return builder.toString();
    }  
    
}
