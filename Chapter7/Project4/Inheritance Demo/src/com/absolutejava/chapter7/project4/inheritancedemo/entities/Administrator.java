/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project4.inheritancedemo.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Administrator extends SalariedEmployee {
    private String title;
    private String areaOfResponsibility;
    private String immediateSupervisorName;
    
    public Administrator(){
        super();
        this.title = "No title";
        this.areaOfResponsibility = "No area of responsibility";
        this.immediateSupervisorName = "No supervisor";
    }

    public Administrator(String theName, Date theDate, double theSalary, String title) {
        super(theName, theDate, theSalary);
        this.title = title;
        this.areaOfResponsibility = "No area of responsibility";
        this.immediateSupervisorName = "No supervisor";
    }
    
    public Administrator(String theName, Date theDate, double theSalary, String title, String areaOfResponsibility) {
        this(theName, theDate, theSalary, title);
        this.areaOfResponsibility = areaOfResponsibility;
        this.immediateSupervisorName = "No supervisor";
    }
    
    public Administrator(String theName, Date theDate, double theSalary, String title, String areaOfResponsibility, String immediateSupervisorName) {
        this(theName, theDate, theSalary, title, areaOfResponsibility);
        this.immediateSupervisorName = immediateSupervisorName;
    }
    
    public Administrator(Administrator other) 
    {        
        this(other.getName(), other.getHireDate(), other.getSalary(), other.getTitle(), other.getAreaOfResponsibility(), other.getImmediateSupervisorName());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAreaOfResponsibility() {
        return areaOfResponsibility;
    }

    public void setAreaOfResponsibility(String areaOfResponsibility) {
        this.areaOfResponsibility = areaOfResponsibility;
    }

    public String getImmediateSupervisorName() {
        return immediateSupervisorName;
    }

    public void setImmediateSupervisorName(String immediateSupervisorName) {
        this.immediateSupervisorName = immediateSupervisorName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.title);
        hash = 41 * hash + Objects.hashCode(this.areaOfResponsibility);
        hash = 41 * hash + Objects.hashCode(this.immediateSupervisorName);
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
        final Administrator other = (Administrator) obj;
        if(!super.equals(other)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.areaOfResponsibility, other.areaOfResponsibility)) {
            return false;
        }
        if (!Objects.equals(this.immediateSupervisorName, other.immediateSupervisorName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append("\n");
        builder.append(getTitle()).append("\n");
        builder.append(getAreaOfResponsibility()).append("\n");
        builder.append(getImmediateSupervisorName());
        return builder.toString();
    }
    
}
