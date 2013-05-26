/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project4.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MergeSort 
{
    public static void sort(Comparable[] a, int begin, int end)
    {
        if((end - begin) >= 1)
        {
            int splitPoint = split(a, begin, end);
            sort(a, begin, splitPoint);
            sort(a, splitPoint + 1, end);
            join(a, begin, splitPoint, end);
        }
    }
    
    private static int split(Comparable[] a, int begin, int end)
    {
        return ((begin + end)/2);
    }
    
    private static void join(Comparable[] a, int begin, int splitPoint, int end)
    {
        Comparable[] temp;
        int intervalSize = (end - begin + 1);
        temp = new Comparable[intervalSize];
        int nextLeft = begin; // index for the first chunk
        int nextRight = splitPoint + 1 ; // index for the second chunk
        int i = 0; // index for temp
        
        // Merge till one side is exhausted
        while ((nextLeft <= splitPoint) && ( nextRight <= end))
        {
            if(a[nextLeft].compareTo(a[nextRight]) < 0)
            {
                temp[i] = a[nextLeft];
                i++;
                nextLeft++;
            }
            else
            {
                temp[i] = a[nextRight];
                i++;
                nextRight++;
            }
        }
        
        while(nextLeft <= splitPoint) // copy rest of left chunk, if any
        {
            temp[i] = a[nextLeft];
            i++;
            nextLeft++;
        }
        
        while(nextRight <= end) // copy rest of right chunk, if any
        {
            temp[i] = a[nextRight];
            i++;
            nextRight++;
        }
        
        for(i = 0; i < intervalSize; i++)
        {
            a[begin + i] = temp[i];
        }
    }
}
