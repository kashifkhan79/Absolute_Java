/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project7.clinicrecord.entities;

import com.absolutejava.chapter7.project5.inheritancedemo.entities.Doctor;
import com.absolutejava.chapter7.project6.inheritancedemo.entities.Person;
import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Patient extends Person{
    private Doctor doctor;
    
    public Patient() {
        super();
        this.doctor = new Doctor();
    }

    public Patient(String name) {
        super(name);
        this.doctor = new Doctor();
    }
    
    public Patient(String name, Doctor doctor) {
        this(name);
        this.doctor = doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.doctor);
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
        final Patient other = (Patient) obj;
        if(!super.equals(other)) {
            return false;
        }
        if (!Objects.equals(this.doctor, other.doctor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }   
}
