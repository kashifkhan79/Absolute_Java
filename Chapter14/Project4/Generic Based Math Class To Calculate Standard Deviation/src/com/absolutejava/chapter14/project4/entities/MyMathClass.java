/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project4.entities;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MyMathClass<T extends Number> 
{   
    public static <T extends Number> double standardDeviation(List<T> numbers)
    {
        Double average = calculateAverage(numbers);
        Double sum = new Double(0.0);
        for(T n : numbers)
        {
            sum = sum.doubleValue() + Math.pow((((T)n).doubleValue() - average) , 2);
        }
        return Double.parseDouble(new DecimalFormat("#.###").format(Math.sqrt(sum/(double)numbers.size())));
    }
    
    private static <T extends Number> double calculateAverage(List<T> numbers)
    {
        Double sum = new Double(0.0);
        for(T n : numbers)
        {
            sum = sum.doubleValue() + ((T)n).doubleValue();
        }
        return sum.doubleValue()/(double)numbers.size();
    }
}