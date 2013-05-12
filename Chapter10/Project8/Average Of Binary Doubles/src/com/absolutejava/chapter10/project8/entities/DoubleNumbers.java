/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project8.entities;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DoubleNumbers
{
    private double[] doubles;
    
    public DoubleNumbers() 
    {
        doubles = new double[10];
    }

    public double[] readDataFromBinaryFile() 
    {       
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/data/doubles.dat")))
        {
            try
            {
                int i = 0;
                while(true)
                {
                    doubles[i] = inputStream.readDouble();
                    i++;
                }
            }
            catch(EOFException e)
            {
                System.out.println("No more numbers to be read");
            }
        }
        catch(IOException e)
        {
            System.out.println("IOException occured");
        }
        return doubles;
    }    

    public double calculateAverage() 
    {
        double average;
        double sum = 0;
        double[] numbers = readDataFromBinaryFile();
        for(double number : numbers)
        {
            sum += number;
        }
        average = Double.parseDouble(new DecimalFormat("#.##").format(sum/numbers.length));
        return average;
    }
}
