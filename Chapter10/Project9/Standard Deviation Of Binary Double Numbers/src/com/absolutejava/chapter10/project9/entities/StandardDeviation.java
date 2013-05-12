/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project9.entities;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class StandardDeviation 
{
    private final String file = "src/data/doubles.dat";    
    private double[] doubleNumbers;
    private double[] standardDeviationNumbers;
    private double averageOfNumbers;
    
    public StandardDeviation()
    {
        doubleNumbers = new double[10];
        standardDeviationNumbers = new double[10];
    }

    public double calculateAverage() 
    {    
        double sum = 0;
        try
        {
            readNumbersInDoubleNumbersFromBinaryFile();            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File doubles.dat couldn't be opened or read");
        }
        catch(EOFException e)
        {
            System.out.println("No more numbers left to be read");
        }
        catch(IOException e)
        {
            System.out.println("IOException occured");
        }
        sum = calculateSumOfNumbers();
        averageOfNumbers = Double.parseDouble(convertNumberToTwoDecimalPlaces(sum/doubleNumbers.length));
        return averageOfNumbers;    
    }
    
    public double calculateStandardDeviation()
    {
        double sumOfStandardDeviationNumbers = 0;
        calculateAverage();
        populateStandardDeviationNumbers();
        sumOfStandardDeviationNumbers = calculateSumOfStandardDeviationNumbers();
        double standardDeviationAverage = Math.sqrt(sumOfStandardDeviationNumbers/standardDeviationNumbers.length);
        return Double.parseDouble(convertNumberToTwoDecimalPlaces(standardDeviationAverage));
    }
    
    private void readNumbersInDoubleNumbersFromBinaryFile() throws FileNotFoundException, EOFException, IOException
    {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        int i = 0;
        while(true)
        {
            doubleNumbers[i] = Double.parseDouble(convertNumberToTwoDecimalPlaces(input.readDouble()));
            i++;
        }        
    }
    
    private void populateStandardDeviationNumbers()
    {
        int i = 0;
        while(i < doubleNumbers.length)
        {
            standardDeviationNumbers[i] = Double.parseDouble(convertNumberToTwoDecimalPlaces(Math.pow(doubleNumbers[i] - averageOfNumbers, 2)));
            i++;
        }        
    }
    
    private double calculateSumOfNumbers()
    {
        double sum = 0;
        for(double number : doubleNumbers)
        {
            sum += number;
        }
        return sum;
    }
    
    private double calculateSumOfStandardDeviationNumbers()
    {
        double sum = 0;
        for(double number : standardDeviationNumbers)
        {
            sum += number;
        }
        return sum;
    }

    private String convertNumberToTwoDecimalPlaces(double number) 
    {
        return new DecimalFormat("#.##").format(number);
    }

    
}
