/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project3.entities;

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
public class DoubleNumber {
    
    List<Double> doublesList = null;
    private final String file = "src/data/number.txt";    
    
    public DoubleNumber()
    {        
        doublesList = new ArrayList<>();
    }

    public double calculateAverage()
    {
        double sum = 0;
        try
        {
            readDataFromFile();
            sum = calculateSumOfNumbers();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File number.txt couldn't be opened or read");
        }
        return Double.parseDouble(convertNumberToTwoDecimalPlaces(sum));
    }

    private void readDataFromFile() throws FileNotFoundException {
        Scanner input;
        input = new Scanner(new FileInputStream(file));
        while(input.hasNextDouble())
        {
            doublesList.add(input.nextDouble());
        }
    }

    private double calculateSumOfNumbers()
    {
        double sum = 0.0;
        Iterator<Double> iterator = doublesList.iterator();
        while(iterator.hasNext())
        {
            sum += iterator.next();
        }
        return sum;
    }

    private String convertNumberToTwoDecimalPlaces(double sum)
    {
        return new DecimalFormat("#.##").format(sum/doublesList.size());
    }
}
