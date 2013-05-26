/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project3.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class NameCollection 
{
    private String[] names;
    
    public NameCollection(String[] names)
    {
        this.names = names;
    }
    
    public Enumeration getEnumeration()
    {
        return new Enumeration() {
            
            private int index = 0;          

            @Override
            public boolean hasNext() 
            {
                return index < names.length;
            }

            @Override
            public Object getNext() 
            {
                return names[index++];                
            }
        };
    }
}
