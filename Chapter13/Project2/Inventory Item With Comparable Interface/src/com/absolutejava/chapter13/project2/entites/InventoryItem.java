/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project2.entites;

import java.util.Objects;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class InventoryItem implements Comparable<InventoryItem>
{
    private String name;
    private int uniqueItemID;
    
    public InventoryItem()
    {
        this.name = "";
        this.uniqueItemID = Integer.MIN_VALUE;
    }
    
    public InventoryItem(String name, int uniqueItemID)
    {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = (name != null ? name : "");
    }

    public int getUniqueItemID() {
        return uniqueItemID;
    }

    public void setUniqueItemID(int uniqueItemID) {
        this.uniqueItemID = uniqueItemID;
    }
        
    @Override
    public int compareTo(InventoryItem item) 
    {
        return (this.uniqueItemID < item.uniqueItemID) ? -1 : (this.uniqueItemID == item.uniqueItemID) ? 0 : 1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.uniqueItemID;
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.uniqueItemID != other.uniqueItemID) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return this.name + " " + this.uniqueItemID;
    }
    
}
