/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project2.entites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Numbers 
{
    private final String file = "src/data/numbers.txt";   
    List<Integer> numberList = null;
    
    public Numbers()
    {
        numberList = new ArrayList<>();
    }
    
    public int getLargestNumber() 
    {
        loadFileData();
        Collections.sort(numberList);
        return numberList.get(numberList.size()-1);
    }

    public int getSmallestNumber() 
    {
        loadFileData();
        Collections.sort(numberList);
        return numberList.get(0);
    }
        
    private void loadFileData() 
    {
        try
        {
            Scanner scanner = new Scanner(new FileInputStream(file));
            while(scanner.hasNextInt())
            {
                numberList.add(scanner.nextInt());
            }            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File numbers.txt couldn't be opened or found");
        }
    }
}
