/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project7.clinicrecord.entities;

import com.absolutejava.chapter7.project5.inheritancedemo.entities.Doctor;
import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Billing {
    private Patient patient;
    private Doctor doctor;
    private double amountDue;
    
    public Billing() {
        this.patient = new Patient();
        this.doctor = new Doctor();
        this.amountDue = 0.0;
    }

    public Billing(Patient patient) {
        this.patient = patient;
        this.doctor = new Doctor();
        this.amountDue = 0.0;
    }
    
    public Billing(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
        this.amountDue = 0.0;
    }
    
    public Billing(Patient patient, Doctor doctor, double amountDue) {
        this.patient = patient;
        this.doctor = doctor;
        this.amountDue = amountDue;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getAmountDue() {
        return amountDue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.patient);
        hash = 29 * hash + Objects.hashCode(this.doctor);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.amountDue) ^ (Double.doubleToLongBits(this.amountDue) >>> 32));
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
        final Billing other = (Billing) obj;
        if (!Objects.equals(this.patient, other.patient)) {
            return false;
        }
        if (!Objects.equals(this.doctor, other.doctor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountDue) != Double.doubleToLongBits(other.amountDue)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Patient Details: ").append(getPatient().toString()).append("\n");
        builder.append("Doctor Details: ").append(getDoctor().toString()).append("\n");
        builder.append("Amount due: ").append(getAmountDue());
        return builder.toString();
    }
    
}
