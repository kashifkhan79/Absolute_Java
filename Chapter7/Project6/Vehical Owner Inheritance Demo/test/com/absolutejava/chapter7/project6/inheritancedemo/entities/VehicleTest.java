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
public class VehicleTest {
    
    @Test
    public void canCreateVehicleObject() {
        Vehicle vehicle = new Vehicle();
        assertNotNull(vehicle);
    }
    
    @Test
    public void canCreateVehicleObjectWithManufacturersName() {
        Vehicle vehicle = new Vehicle("Volvo");
        vehicle.setManufacturerName("Gilly Volvo");
        String name = vehicle.getManufacturerName();
        assertEquals("Manufacturers name is", "Gilly Volvo", name);
    }
    
    @Test
    public void canCreateVehicleObjectWithManufacturersNameAndNumberOfCylindersInEngine() {
        Vehicle vehicle = new Vehicle("Volvo", 4);
        vehicle.setNumberOfCylindersInEngine(5);
        int cylinders = vehicle.getNumberOfCylindersInEngine();
        assertEquals("Number of cylinders are", 5, cylinders);
    }
    
    @Test
    public void canCreateVehicleObjectWithManufacturersNameAndNumberOfCylindersInEngineAndOwner() {
        Vehicle vehicle = new Vehicle("Volvo", 4, new Person());
        vehicle.setOwner(new Person("Kashif Ahmed Khan"));
        Person owner = vehicle.getOwner();        
        assertTrue(new Person("Kashif Ahmed Khan").equals(owner));
    }
    
    @Test
    public void canGetVehicleInformationAndCompareVehicleObjects() {
        Vehicle vehicle = new Vehicle("Volvo", 4, new Person("Kashif Ahmed Khan"));
        Vehicle other = new Vehicle("Saab", 4, new Person("Saqib Ahmed Khan"));
        
        StringBuilder builder = new StringBuilder();
        builder.append("Manufacturer: ").append("Volvo").append("\n");
        builder.append("Number of cylinders in engine: ").append(4).append("\n");
        builder.append("Owner: ").append("Kashif Ahmed Khan").append("\n");
        assertEquals("Vehicles are same", builder.toString(), vehicle.toString());
        assertNotSame("Vehicle are not same", other.toString(), vehicle.toString());
        assertTrue("Vehicles are same by equals", vehicle.equals(new Vehicle("Volvo", 4, new Person("Kashif Ahmed Khan"))));
        assertFalse("Vehicles are not same by equals", vehicle.equals(other));
    }
}