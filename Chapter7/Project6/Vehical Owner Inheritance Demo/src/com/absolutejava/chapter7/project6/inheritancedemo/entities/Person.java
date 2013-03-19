/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter7.project6.inheritancedemo.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Person {
    private String name;

    public Person() {
        this.name = "No Name";
    }

    public Person(String theName) {
        this.name = theName;
    }
    
    public Person(Person other) {
        this(other.name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
