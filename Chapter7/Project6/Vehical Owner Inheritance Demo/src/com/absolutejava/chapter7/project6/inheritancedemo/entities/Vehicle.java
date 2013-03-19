/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project6.inheritancedemo.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Vehicle {
    private String manufacturerName;
    private int numberOfCylindersInEngine;
    private Person owner;
    
    public Vehicle() {
        this.manufacturerName = "No Manufacturer";
        this.numberOfCylindersInEngine = 0;
        this.owner = new Person("No owner");
    }

    public Vehicle(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    
    public Vehicle(String manufacturerName, int numberOfCylindersInEngine) {
        this(manufacturerName);
        this.numberOfCylindersInEngine = numberOfCylindersInEngine;
    }
    
    public Vehicle(String manufacturerName, int numberOfCylindersInEngine, Person owner) {
        this(manufacturerName, numberOfCylindersInEngine);
        this.owner = owner;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setNumberOfCylindersInEngine(int numberOfCylindersInEngine) {
        this.numberOfCylindersInEngine = numberOfCylindersInEngine;
    }

    public int getNumberOfCylindersInEngine() {
        return numberOfCylindersInEngine;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.manufacturerName);
        hash = 97 * hash + this.numberOfCylindersInEngine;
        hash = 97 * hash + Objects.hashCode(this.owner);
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
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.manufacturerName, other.manufacturerName)) {
            return false;
        }
        if (this.numberOfCylindersInEngine != other.numberOfCylindersInEngine) {
            return false;
        }
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Manufacturer: ").append(getManufacturerName()).append("\n");
        builder.append("Number of cylinders in engine: ").append(getNumberOfCylindersInEngine()).append("\n");
        builder.append("Owner: ").append(getOwner()).append("\n");
        return builder.toString();
    }
    
    
    
}
