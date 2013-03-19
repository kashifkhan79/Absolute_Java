/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project6.inheritancedemo.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class TruckTest {
    
    @Test
    public void canCreateTruckObject() {
        Truck truck = new Truck();
        assertNotNull(truck);
    }
    
    @Test
    public void canCreateTruckObjectWithLoadCapacityParameter() {
        Truck truck = new Truck("Volvo", 8, new Person(), 25.5);
        assertNotNull(truck);
        truck.setOwner(new Person("Kashif Ahmed Khan"));
        truck.setLoadCapacityInTons(30.5);
        double loadCapacity = truck.getLoadCapacityInTons();
        assertEquals("Load capacity is", 30.5, loadCapacity, 0.0);
    }
    
    @Test
    public void canCreateTruckObjectWithLoadCapacityAndTowingCapacityParameter() {
        Truck truck = new Truck("Volvo", 8, new Person(), 25.5, 0);
        assertNotNull(truck);
        truck.setOwner(new Person("Kashif Ahmed Khan"));
        truck.setTowingCapacityInPounds(2000);
        int towingCapacity = truck.getTowingCapacityInPounds();
        assertEquals("Load capacity is", 2000, towingCapacity);
    }
    
    @Test
    public void canGetTruckInformationAndCompareTruckObjects() {
        Truck truck1 = new Truck();
        truck1.setManufacturerName("Volvo");
        truck1.setNumberOfCylindersInEngine(8);
        truck1.setOwner(new Person("Kashif Ahmed Khan"));
        truck1.setLoadCapacityInTons(30.0);
        truck1.setTowingCapacityInPounds(4000);
        
        Truck truck2 = new Truck("Volvo", 8, new Person("Saqib Ahmed Khan"), 25.5, 6000);
        
        StringBuilder builder = new StringBuilder();
        builder.append("Manufacturer: ").append("Volvo").append("\n");
        builder.append("Number of cylinders in engine: ").append(8).append("\n");
        builder.append("Owner: ").append("Kashif Ahmed Khan").append("\n");
        builder.append("Load capacity in tons: ").append(30.0).append("\n");
        builder.append("Towing capacity in pounds: ").append(4000);
        assertEquals("Truck information is same", builder.toString(), truck1.toString());
        assertNotSame("Truck information is not same", truck1.toString(), truck2.toString());
        assertTrue("Trucks are same by equals", truck1.equals(new Truck("Volvo", 8, new Person("Kashif Ahmed Khan"), 30.0, 4000)));
        assertFalse("Trucks are not same by equals", truck1.equals(truck2));        
    }
}