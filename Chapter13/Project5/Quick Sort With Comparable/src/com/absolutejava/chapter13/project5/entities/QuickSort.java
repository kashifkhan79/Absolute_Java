/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project5.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class QuickSort 
{
    public static void sort(Comparable[] a, int begin, int end)
    {
        if((end - begin) >= 1)
        {
            int splitPoint = split(a, begin, end);
            sort(a, begin, splitPoint);
            sort(a, splitPoint + 1, end);            
        }        
    }
    
    private static int split(Comparable[] a, int begin, int end)
    {
        Comparable[] temp;
        int size = ( end - begin + 1);
        temp = new Comparable[size];
        
        Comparable splitValue = a[begin];
        int up = 0;
        int down = size - 1;
        
        // Note that a[begin] = splitValue is skipped
        for(int i = begin + 1; i <= end; i++)
        {
            if(a[i].compareTo(splitValue) <= 0 )
            {
                temp[up] = a[i];
                up++;
            }
            else
            {
                temp[down] = a[i];
                down--;
            }
        }
        
        // 0 <= up = down < size
        temp[up] = a[begin]; // Positions the split value, splitValue
        
        System.arraycopy(temp, 0, a, begin, size);
        
        return (begin + up);
    }    
    
}
