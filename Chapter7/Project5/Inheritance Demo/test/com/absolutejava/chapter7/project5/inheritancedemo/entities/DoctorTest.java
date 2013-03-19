/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project5.inheritancedemo.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DoctorTest {
    
    @Test
    public void canCreateDoctorObject() {
        Doctor doctor = new Doctor();
        assertNotNull(doctor);
    }
    
    @Test
    public void canCreateDoctorObjectWithSpeciality() {
        Doctor doctor = new Doctor("Kashif", new Date("January", 1, 1000), 40000.0, "General Practitioner");
        assertNotNull(doctor);
    }
    
    @Test
    public void canCreateDoctorObjectWithVisitFee() {
        Doctor doctor = new Doctor("Kashif", new Date("January", 1, 1000), 40000.0, "General Practitioner", 160.0);
        assertNotNull(doctor);
    }    
   
    @Test
    public void canCreateDoctorObjectFromAnotherDoctorObject() {
        Doctor doctor = new Doctor("Kashif", new Date("January", 1, 1000), 40000.0, "General Practitioner", 160.0);
        Doctor other = new Doctor(doctor);
        assertNotNull(other);
        
        assertEquals("Name is", "Kashif", other.getName());
        assertEquals("Hire Date is", new Date("January", 1, 1000), other.getHireDate());
        assertEquals("Salary is", 40000.0, other.getSalary(), 0.0);
        assertEquals("Doctors Speciality is", "General Practitioner", other.getSpeciality());
        assertEquals("Office Visit fee is", 160.0, other.getVisitFee(), 0.0);        
    }
    
    @Test
    public void canGetDoctorInformationAndCompareDoctorObjects() {
        Doctor doctor = new Doctor("Kashif", new Date("January", 1, 1000), 40000.0, "General Practitioner", 160.0);
        
        StringBuilder builder = new StringBuilder();
        builder.append("Kashif").append(" ");
        builder.append("January").append(" ").append("1").append(", ").append("1000").append("\n");
        builder.append("$40000.0 per year").append("\n");
        builder.append("General Practitioner").append("\n");        
        builder.append("$160.0");
        
        assertEquals("Information is same", builder.toString(), doctor.toString());        
        assertTrue(doctor.equals(new Doctor("Kashif", new Date("January", 1, 1000), 40000.0, "General Practitioner", 160.0)));
        assertTrue(new Doctor("Kashif", new Date("January", 1, 1000), 40000.0, "General Practitioner", 160.0).equals(doctor));
        assertFalse(doctor.equals(new Doctor()));
    }
}