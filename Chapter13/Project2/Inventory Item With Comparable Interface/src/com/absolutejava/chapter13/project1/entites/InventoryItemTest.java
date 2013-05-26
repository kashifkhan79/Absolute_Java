/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project1.entites;

import java.util.Arrays;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class InventoryItemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        InventoryItem[] items = { new InventoryItem("Item1", 1), 
                                  new InventoryItem("Item2", -10),
                                  new InventoryItem("Item3", 34), 
                                  new InventoryItem("Item4", 10), 
                                  new InventoryItem("Item5", 7),
                                  new InventoryItem("Item6", 4),
                                  new InventoryItem("Item7", 45), 
                                  new InventoryItem("Item8", -11),
                                  new InventoryItem("Item9", 94), 
                                  new InventoryItem("Item10", 9)};
        
        System.out.println("Before Sorting");
        for(InventoryItem item : items)
        {            
            System.out.println(item);
        }
        
        Arrays.sort(items);
        
        System.out.println("After Sorting");
        for(InventoryItem item : items)
        {
            System.out.println(item);
        }
    }
    
}