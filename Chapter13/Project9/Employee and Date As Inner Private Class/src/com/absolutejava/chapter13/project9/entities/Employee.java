/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project9.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Employee 
{

    private String name;
    private Date hireDate;

    public Employee() 
    {
        this.name = "No Name";
        this.hireDate = new Date("January", 1, 1000);
    }

    public Employee(String name, Date hireDate) 
    {
        if (name == null /* || date == null*/) 
        {
            System.out.println("Fatal error creating employee");
            System.exit(0);
        }
        this.name = name;
        this.hireDate = hireDate;
    }

    public Employee(Employee other) 
    {
        name = other.name;
        hireDate = new Date(other.hireDate);
    }

    public String getName() 
    {
        return name;
    }

    public Date getHireDate() 
    {
        return new Date(hireDate);
    }

    public void setName(String name) 
    {
        if (name == null) 
        {
            System.out.println("Fatal error setting employee name");
            System.exit(0);
        }
        this.name = name;
    }

    public void setHireDate(Date hireDate) 
    {
        if (hireDate == null) 
        {
            System.out.println("Fatal error setting employee hire date");
            System.exit(0);
        }
        this.hireDate = hireDate;
    }

    @Override
    public String toString() 
    {
        return (name + " " + hireDate.toString());
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.hireDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.hireDate, other.hireDate)) {
            return false;
        }
        return true;
    }

    public class Date 
    {
        private String month;
        private int day;
        private int year;

        public Date() 
        {
            this.month = "January";
            this.day = 1;
            this.year = 1000;
        }

        public Date(int month, int day, int year) 
        {
            setDate(month, day, year);
        }

        public Date(String month, int day, int year) 
        {
            setDate(month, day, year);
        }

        public Date(int year) 
        {
            setDate(1, 1, year);
        }

        public Date(Date date) 
        {
            if (date == null) 
            {
                System.out.println("Fatal error creating date");
                System.exit(0);
            }
            month = date.month;
            day = date.day;
            year = date.year;
        }

        private void setDate(int month, int day, int year) 
        {
            if (dateOK(month, day, year)) 
            {
                this.month = monthString(month);
                this.day = day;
                this.year = year;
            }
            else 
            {
                System.out.println("Fatal error creating date");
                System.exit(0);
            }
        }

        private void setDate(String monthString, int day, int year) 
        {
            if (dateOK(monthString, day, year)) 
            {
                this.month = monthString;
                this.day = day;
                this.year = year;
            }
            else 
            {
                System.out.println("Fatal Error");
                System.exit(0);
            }
        }

        private void setDate(int year) 
        {
            setDate(1, 1, year);
        }

        private void setYear(int year) 
        {
            if ((year < 1000) || (year > 9999)) 
            {
                System.out.println("Fatal Error");
                System.exit(0);
            }
            else 
            {
                this.year = year;
            }
        }

        private void setMonth(int monthNumber) 
        {
            if ((monthNumber <= 0) || (monthNumber > 12)) 
            {
                System.out.println("Fatal Error");
                System.exit(0);
            }
            else 
            {
                month = monthString(monthNumber);
            }
        }

        private void setDay(int day) 
        {
            if ((day <= 0) || (day > 31)) 
            {
                System.out.println("Fatal Error");
                System.exit(0);
            }
            else 
            {
                this.day = day;
            }
        }

        private int getMonth() 
        {
            if (month.equals("January")) 
            {
                return 1;
            }
            else if (month.equals("February")) 
            {
                return 2;
            }
            else if (month.equalsIgnoreCase("March")) 
            {
                return 3;
            }
            else if (month.equalsIgnoreCase("April")) 
            {
                return 4;
            }
            else if (month.equalsIgnoreCase("May")) 
            {
                return 5;
            }
            else if (month.equals("June")) 
            {
                return 6;
            }
            else if (month.equalsIgnoreCase("July")) 
            {
                return 7;
            }
            else if (month.equalsIgnoreCase("August")) 
            {
                return 8;
            }
            else if (month.equalsIgnoreCase("September")) 
            {
                return 9;
            }
            else if (month.equalsIgnoreCase("October")) 
            {
                return 10;
            }
            else if (month.equals("November")) 
            {
                return 11;
            }
            else if (month.equals("December")) 
            {
                return 12;
            }
            else 
            {
                System.out.println("Fatal Error");
                System.exit(0);
                return 0; //Needed to keep the compiler happy
            }
        }

        private int getDay() 
        {
            return day;
        }

        private int getYear() 
        {
            return year;
        }

        @Override
        public String toString() 
        {
            return (month + " " + day + ", " + year);
        }

        @Override
        public int hashCode() 
        {
            int hash = 7;
            hash = 97 * hash + Objects.hashCode(this.month);
            hash = 97 * hash + this.day;
            hash = 97 * hash + this.year;
            return hash;
        }

        @Override
        public boolean equals(Object obj) 
        {
            if (obj == null) 
            {
                return false;
            }
            if (getClass() != obj.getClass()) 
            {
                return false;
            }
            final Date other = (Date) obj;
            if (!Objects.equals(this.month, other.month)) 
            {
                return false;
            }
            if (this.day != other.day) 
            {
                return false;
            }
            if (this.year != other.year) 
            {
                return false;
            }
            return true;
        }

        private boolean precedes(Date otherDate) 
        {
            return ((year < otherDate.year)
                    || (year == otherDate.year && getMonth() < otherDate.getMonth())
                    || (year == otherDate.year && month.equals(otherDate.month)
                    && day < otherDate.day));
        }        

        private boolean dateOK(int monthInt, int dayInt, int yearInt) 
        {
            return ((monthInt >= 1) && (monthInt <= 12)
                    && (dayInt >= 1) && (dayInt <= 31)
                    && (yearInt >= 1000) && (yearInt <= 9999));
        }

        private boolean dateOK(String monthString, int dayInt, int yearInt) 
        {
            return (monthOK(monthString)
                    && (dayInt >= 1) && (dayInt <= 31)
                    && (yearInt >= 1000) && (yearInt <= 9999));
        }

        private boolean monthOK(String month) 
        {
            return (month.equals("January") || month.equals("February")
                    || month.equals("March") || month.equals("April")
                    || month.equals("May") || month.equals("June")
                    || month.equals("July") || month.equals("August")
                    || month.equals("September") || month.equals("October")
                    || month.equals("November") || month.equals("December"));
        }

        private String monthString(int monthNumber) 
        {
            switch (monthNumber) 
            {
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    System.out.println("Fatal Error");
                    System.exit(0);
                    return "Error"; //to keep the compiler happy
            }
        }
    }
}