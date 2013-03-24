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
public class BillingTest {
    
    @Test
    public void canCreateBillingObject() {
        Billing billing = new Billing();
        assertNotNull(billing);
    }
    
    @Test
    public void canCreateBillingObjectWithPatient() {
        Billing billing = new Billing(new Patient());
        billing.setPatient(new Patient("Naeem Mujahid"));
        Patient patient = billing.getPatient();
        assertEquals("Patient is", new Patient("Naeem Mujahid"), patient);
    }
    
    @Test
    public void canCreateBillingOBjectWithPatientAndDoctor() {
        Billing billing = new Billing(new Patient(), new Doctor());
        billing.setDoctor(new Doctor("Kashif Khan", new Date("March", 24, 2013), 35000.0, "General Physician", 750.0));
        Doctor doctor = billing.getDoctor();
        assertEquals("Doctor is", new Doctor("Kashif Khan", new Date("March", 24, 2013), 35000.0, "General Physician", 750.0), doctor);
    }
    
    @Test
    public void canCreateBillingObjectWithPatientAndDoctorAndAmountDue() {
        Billing billing = new Billing(new Patient(), new Doctor(), 0.0);
        billing.setPatient(new Patient("Naeem Mujahid"));
        billing.setDoctor(new Doctor("Kashif Khan", new Date("March", 24, 2013), 35000.0, "General Physician", 750.0));
        billing.setAmountDue(160.0);
        double amount = billing.getAmountDue();
        assertEquals("Amount due is", 160.0, amount, 0.0);
    }
    
    @Test
    public void canCreateMultipleBillingObjects() {
        Billing billing1 = new Billing(new Patient(), new Doctor(), 0.0);
        Billing billing2 = new Billing(new Patient(), new Doctor(), 0.0);
        
        billing1.setPatient(new Patient("Naeem Mujahid"));
        billing1.setDoctor(new Doctor("Kashif Khan", new Date("March", 24, 2013), 35000.0, "General Physician", 750.0));
        billing1.setAmountDue(160.0);
        
        billing2.setPatient(new Patient("Imran Hashmi"));
        billing2.setDoctor(new Doctor("Saqib Khan", new Date("March", 31, 2013), 45000.0, "ABC Specialist", 850.0));
        billing2.setAmountDue(150.0);
        
        double totalBill = billing1.getAmountDue() + billing2.getAmountDue();        
        assertEquals("Total billing amount is", 310.0, totalBill, 0.0);        
    }
}