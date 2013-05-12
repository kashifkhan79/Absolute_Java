/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project7.entities;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class IntegerNumber 
{
    private int[] numbers;
    
    public IntegerNumber()
    {
        numbers = new int[10];
    }

    public int[] readDataFromBinaryFile() 
    {
        ObjectInputStream inputStream = null;
        
        try 
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/data/integers.dat"));
            int i = 0;
            try
            {
                while (true) 
                {
                    numbers[i] = inputStream.readInt();
                    i++;
                }
            }
            catch(EOFException e)
            {
                System.out.println("No more numbers to be read");
            }
        }
        catch (IOException e) 
        {
            System.out.println("IO Exception occured");
        }
        return numbers;        
    }

    public int findSmallestNumber() 
    {
        int[] tempNumbers = readDataFromBinaryFile();
        int smallest = tempNumbers[0];
        for(int number : tempNumbers)
        {            
            smallest = (smallest <= number) ? smallest : number;
        }
        return smallest;
    }

    public int findLargestNumber() 
    {
        int[] tempNumbers = readDataFromBinaryFile();
        int largest = tempNumbers[0];
        for(int number : tempNumbers)
        {            
            largest = (largest >= number) ? largest : number;
        }
        return largest;
    }
}
