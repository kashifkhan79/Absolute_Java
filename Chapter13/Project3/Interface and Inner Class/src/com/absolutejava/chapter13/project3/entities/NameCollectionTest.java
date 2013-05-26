/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project3.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class NameCollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String[] names = {"Alice", "Bob", "Richard", "Kashif", "Saqib", "Silvija", "Iftikhar", "Iffat"};
        NameCollection collection = new NameCollection(names);
        
        Enumeration iterator = collection.getEnumeration();
        while(iterator.hasNext())
        {
            System.out.println(iterator.getNext());
        }
    }
}
