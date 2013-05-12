/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project1.entities;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public abstract class Person {
    private String name;
    private int popularityRank;
    
    public Person() 
    {
        this.name = "No name";
        this.popularityRank = -1;
    }
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public Person(String name, int popularityRank)
    {
        this.name = name;
        this.popularityRank = popularityRank;
    }

    public String getName() 
    {
        return name;
    }
    
    public int getPopularityRank()
    {
        return popularityRank;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.popularityRank;
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
        if (this.popularityRank != other.popularityRank) {
            return false;
        }
        return true;
    }
}
