/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project4.inheritancedemo.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AdministratorTest {
    
    @Test
    public void canCreateAdministratorObject() {
        Administrator administrator = new Administrator();
        assertNotNull(administrator);
    }
    
    @Test
    public void canCreateAdministratorObjectWithTitle() {
        Administrator administrator = new Administrator("Kashif", new Date("January", 1, 1000), 40000, "Director");
        assertNotNull(administrator);
    }
    
    @Test
    public void canCreateAdministratorObjectWithAreaOfResponsibility() {
        Administrator administrator = new Administrator("Kashif", new Date("January", 1, 1000), 40000, "Director", "Software Development");
        assertNotNull(administrator);
    }
    
    @Test
    public void canCreateAdministratorObjectWithImmediateSupervisorName() {
        Administrator administrator = new Administrator("Kashif", new Date("January", 1, 1000), 40000, "Director", "Software Development", "Thomas Lettekrantz");
        assertNotNull(administrator);
    }
    
    @Test
    public void canCreateAdministratorObjectFromAnotherAdministratorObject() {
        Administrator administrator = new Administrator("Kashif", new Date("January", 1, 1000), 40000, "Director", "Software Development", "Thomas Lettekrantz");
        Administrator other = new Administrator(administrator);
        assertNotNull(other);
        
        assertEquals("Name is", "Kashif", other.getName());
        assertEquals("Hire Date is", new Date("January", 1, 1000), other.getHireDate());
        assertEquals("Salary is", 40000.0, other.getSalary(), 0.0);
        assertEquals("Title is", "Director", other.getTitle());
        assertEquals("Area of responsibility is", "Software Development", other.getAreaOfResponsibility());
        assertEquals("Immediate Supervisor name is", "Thomas Lettekrantz", other.getImmediateSupervisorName());
    }
    
    @Test
    public void canGetAdministratorInformationAndCompareAdministratorObjects() {
        Administrator administrator = new Administrator("Kashif", new Date("January", 1, 1000), 40000, "Director", "Software Development", "Thomas Lettekrantz");
        
        StringBuilder builder = new StringBuilder();
        builder.append("Kashif").append(" ");
        builder.append("January").append(" ").append("1").append(", ").append("1000").append("\n");
        builder.append("$40000.0 per year").append("\n");
        builder.append("Director").append("\n");
        builder.append("Software Development").append("\n");
        builder.append("Thomas Lettekrantz");
        
        assertEquals("Information is same", builder.toString(), administrator.toString());        
        assertTrue(administrator.equals(new Administrator("Kashif", new Date("January", 1, 1000), 40000, "Director", "Software Development", "Thomas Lettekrantz")));
        assertTrue(new Administrator("Kashif", new Date("January", 1, 1000), 40000, "Director", "Software Development", "Thomas Lettekrantz").equals(administrator));
        assertFalse(administrator.equals(new Administrator()));
    }
}