/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project5.inheritancedemo.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Doctor extends SalariedEmployee {
    private String speciality;
    private double visitFee;
    
    public Doctor() {
        super();
        this.speciality = "No speciality";
        this.visitFee = 0.0;
    }

    public Doctor(String theName, Date theDate, double theSalary, String theSpeciality) {
        super(theName, theDate, theSalary);
        this.speciality = theSpeciality;
        this.visitFee = 0.0;
    }
    
    public Doctor(String theName, Date theDate, double theSalary, String theSpeciality, double theVisitFee) {
        this(theName,theDate,theSalary, theSpeciality);
        this.visitFee = theVisitFee;
    }
    
    public Doctor(Doctor other) {
        this(other.getName(), other.getHireDate(), other.getSalary(), other.getSpeciality(), other.getVisitFee());
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getVisitFee() {
        return visitFee;
    }

    public void setVisitFee(double visitFee) {
        this.visitFee = visitFee;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.speciality);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.visitFee) ^ (Double.doubleToLongBits(this.visitFee) >>> 32));
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
        final Doctor other = (Doctor) obj;
        
        if(!super.equals(other)) {
            return false;
        }        
        if (!Objects.equals(this.speciality, other.speciality)) {
            return false;
        }
        if (Double.doubleToLongBits(this.visitFee) != Double.doubleToLongBits(other.visitFee)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getName()).append(" ");
        builder.append(getHireDate().toString()).append("\n");
        builder.append("$").append(getSalary()).append(" per year").append("\n");
        builder.append(getSpeciality()).append("\n");
        builder.append("$").append(getVisitFee());
        return builder.toString();
    }    
}
