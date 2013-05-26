/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project1.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class BinarySearch 
{
    public static int search(Comparable[] a, int first, int last, Comparable key)
    {
        int result = 0;
        if(first > last)
        {
            result = -1;
        }
        else
        {
            int mid = (first + last) / 2;
            
            if(key.compareTo(a[mid]) == 0)
            {
                result = mid;
            }
            else if (key.compareTo(a[mid]) == -1)
            {
                result = search(a, first, mid - 1, key);
            }
            else if(key.compareTo(a[mid]) == 1 )
            {
                result = search(a, mid + 1, last, key);
            }
        }
            
        return result;
    }
}
