/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project9.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class HourlyEmployee extends Employee
{
    private double wageRate;
    private double hours;
    
    public HourlyEmployee()
    {
        super();
        wageRate = 0;
        hours = 0;
    }
    
    public HourlyEmployee(String name, Date hireDate, double wageRate, double hours)
    {
        super(name, hireDate);
        if((wageRate >= 0) && (hours >= 0))
        {
            this.wageRate = wageRate;
            this.hours = hours;
        }
        else
        {
            System.out.println("Fatal error creating an illegaly hourly employee");
            System.exit(0);
        }
    }
    
    public HourlyEmployee(HourlyEmployee object)
    {
        super(object);
        this.wageRate = object.wageRate;
        this.hours = object.hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        if(wageRate >= 0)
        {
            this.wageRate = wageRate;
        }
        else
        {
            System.out.println("Fatal error: Negative hours worked");
            System.exit(0);
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours >= 0)
        {
            this.hours = hours;
        }
        else
        {
            System.out.println("Fatal error: Negative wage rate");
            System.exit(0);
        }        
    }
    
    public double getPay()
    {
        return getWageRate()* getHours();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.wageRate) ^ (Double.doubleToLongBits(this.wageRate) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.hours) ^ (Double.doubleToLongBits(this.hours) >>> 32));
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
        final HourlyEmployee other = (HourlyEmployee) obj;
        if (Double.doubleToLongBits(this.wageRate) != Double.doubleToLongBits(other.wageRate)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hours) != Double.doubleToLongBits(other.hours)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return (getName() + " " + getHireDate().toString() + "\n$" + wageRate + " per hour for " + hours + " hours");
    }
}