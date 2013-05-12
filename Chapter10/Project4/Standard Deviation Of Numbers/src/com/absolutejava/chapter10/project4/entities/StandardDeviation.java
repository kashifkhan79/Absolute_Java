/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project4.entities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class StandardDeviation 
{
    private final String file = "src/data/number.txt";    
    private List<Double> numberList;
    private List<Double> standardDeviationNumberList;
    private double averageOfNumbers;
    
    public StandardDeviation()
    {
        numberList = new ArrayList<>();
        standardDeviationNumberList = new ArrayList<>();
        averageOfNumbers = 0;
    }

    public double calculateAverage() 
    {
        double sum = 0;
        try
        {
            readFileDataInNumberList();
            sum = calculateSumOfNumbers();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File number.txt couldn't be opened or read");
        }
        averageOfNumbers = Double.parseDouble(convertNumberToTwoDecimalPlaces(sum/numberList.size()));
        return averageOfNumbers;
    }
    
    public double calculateStandardDeviation() 
    {
        double sumOfStandardDeviationNumbers = 0;
        calculateAverage();
        populateStandardDeviationNumberList();
        sumOfStandardDeviationNumbers = calculateSumOfStandardDeviationNumbers();
        double standardDeviationAverage = Math.sqrt(sumOfStandardDeviationNumbers/standardDeviationNumberList.size());
        return Double.parseDouble(convertNumberToTwoDecimalPlaces(standardDeviationAverage));
    }
    
    private void readFileDataInNumberList() throws FileNotFoundException
    {
        Scanner input = new Scanner(new FileInputStream(file));
        while(input.hasNext())
        {
            numberList.add(Double.parseDouble(input.next()));
        }        
    }
    
    private double calculateSumOfNumbers()
    {
        double sum = 0;
        Iterator<Double> iterator = numberList.listIterator();
        while(iterator.hasNext())
        {
            sum += iterator.next();
        }
        return sum;
    }
    
    private void populateStandardDeviationNumberList()
    {
       Iterator<Double> iterator = numberList.listIterator();
       while(iterator.hasNext())
       {
           double number = iterator.next();
           standardDeviationNumberList.add(Double.parseDouble(convertNumberToTwoDecimalPlaces(Math.pow(number - averageOfNumbers, 2))));
       }
    }
    
    private double calculateSumOfStandardDeviationNumbers()
    {
        double sumOfStandardDeviationNumbers = 0;
        Iterator<Double> iterator = standardDeviationNumberList.listIterator();
        while(iterator.hasNext())
        {
            sumOfStandardDeviationNumbers += iterator.next();
        }
        return sumOfStandardDeviationNumbers;
    }

    private String convertNumberToTwoDecimalPlaces(double number)
    {
        return new DecimalFormat("#.##").format(number);
    }
}