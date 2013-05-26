/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project1.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class BinarySearchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Integer[] a = {-2, 0, 2, 4, 6, 8, 10, 12, 14, 16};
        int finalIndex = 9;
        
        System.out.println("Array contains:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        int result;
        for(int key = -3; key < 5; key++)
        {
            result = BinarySearch.search(a, 0, finalIndex, key);
            if(result >= 0)
            {
                System.out.println(key + " is at index " + result);
            }
            else
            {
                System.out.println(key + " is not in the array");
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        Double[] b = {-2.0, 0.0, 2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0};
        System.out.println("Array contains:");
        for(int i = 0; i < b.length; i++)
        {
            System.out.println(b[i] + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        for(double key = -3; key < 5; key++)
        {
            result = BinarySearch.search(b, 0, finalIndex, key);
            if(result >= 0)
            {
                System.out.println(key + " is at index " + result);
            }
            else
            {
                System.out.println(key + " is not in the array");
            }
        }
    }
}
