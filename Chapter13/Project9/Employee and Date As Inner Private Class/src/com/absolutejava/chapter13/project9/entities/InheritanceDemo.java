/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project9.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   
        HourlyEmployee joe = new HourlyEmployee();
        HourlyEmployee.Date date = joe.new Date("January", 1, 2004);
        joe.setName("Joe Worker");
        joe.setWageRate(50.50);
        joe.setHours(160);
        joe.setHireDate(date);
        
        System.out.println("Joe's longer name is " + joe.getName());
        
        System.out.println("Chaging Joe's name to Josephine");
        joe.setName("Josephine");
        
        System.out.println("Joe's record is as follows");
        System.out.println(joe);
        System.out.println("Salary for Josephine is $" + joe.getPay());
    }
}
