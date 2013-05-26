/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project4.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MergeSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Double[] a = {7.7, 5.5, 11.0, 3.0, 16.0, 4.4, 20.0, 14.0, 13.0, 42.7};
        
        System.out.println("Array contents before sorting:");
        int i;
        for(i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        MergeSort.sort(a, 0, a.length - 1);
        
        System.out.println("Array contents after sorting:");
        for(i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        Integer[] b = {7, 5, 11, 30, 160, 44, 200, 140, 130, 427};
        
        System.out.println("Array contents before sorting:");        
        for(i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        
        MergeSort.sort(b, 0, b.length - 1);
        
        System.out.println("Array contents after sorting:");
        for(i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
        
        System.out.println();
        
        String[] c = {"Test", "High", "Low", "Exclamation", "Alpha", "Zeta", "Gema", "Beta", "Pi", "Caliber"};
        
        System.out.println("Array contents before sorting:");        
        for(i = 0; i < c.length; i++)
        {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        
        MergeSort.sort(c, 0, c.length - 1);
        
        System.out.println("Array contents after sorting:");
        for(i = 0; i < c.length; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}
