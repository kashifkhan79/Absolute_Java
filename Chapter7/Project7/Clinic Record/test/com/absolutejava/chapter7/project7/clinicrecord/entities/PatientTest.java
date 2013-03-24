/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project7.clinicrecord.entities;

import com.absolutejava.chapter7.project5.inheritancedemo.entities.Date;
import com.absolutejava.chapter7.project5.inheritancedemo.entities.Doctor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class PatientTest {
    
    @Test
    public void canCreatePatientObject() {
        Patient patient = new Patient();
        assertNotNull(patient);
    }
    
    @Test
    public void canCreatePatientObjectWithName() {
        Patient patient = new Patient("");
        assertNotNull(patient);
        patient.setName("Naeem Mujahid");
        String name = patient.getName();
        assertEquals("Patient name is", "Naeem Mujahid", name);
    }
    
    @Test
    public void canCreatePatientObjectWithNameAndPrimaryPhysician() {
        Patient patient = new Patient("Naeem Maujahid", new Doctor());
        assertNotNull(patient);
        patient.setDoctor(new Doctor("Kashif Khan", new Date("March", 24, 2013), 35000.0, "General Physician", 750.0));
        Doctor doctor = patient.getDoctor();
        assertEquals("Doctor is", new Doctor("Kashif Khan", new Date("March", 24, 2013), 35000.0, "General Physician", 750.0), doctor);
    }
}