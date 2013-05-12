/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter10.project1.entities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class PersonRecord {

    private List<Person> malesList;
    private List<Person> femalesList;

    public PersonRecord() 
    {
        malesList = new ArrayList<>();
        femalesList = new ArrayList<>();
    }

    public List<Person> getMalePersons() 
    {
        return malesList;
    }
    
    public List<Person> getFemalePersons() 
    {
        return femalesList;
    }

    public void readMaleRecordsFromFile() 
    {
        Scanner inputStream = null;        
        String name = null;
        int rankPopularity = -1;
        try 
        {
            inputStream = new Scanner(new FileInputStream("src/Data/boynames.txt"));
            while (inputStream.hasNextLine()) 
            {
                String[] tokens = inputStream.nextLine().split(" ");
                for (String token : tokens) 
                {
                    name = tokens[0];
                    rankPopularity = Integer.parseInt(tokens[1]);                    
                }
                malesList.add(new Male(name, rankPopularity));
            }
        }
        catch (FileNotFoundException fnfe) 
        {
            System.out.println("File boynames.txt couldn't be found or opened");
        }
    }

    public void readFemaleRecordsFromFile() 
    {
        Scanner inputStream = null;        
        String name = null;
        int rankPopularity = -1;
        try 
        {
            inputStream = new Scanner(new FileInputStream("src/Data/girlnames.txt"));
            while (inputStream.hasNextLine()) 
            {
                String[] tokens = inputStream.nextLine().split(" ");
                for (String token : tokens) 
                {
                    name = tokens[0];
                    rankPopularity = Integer.parseInt(tokens[1]);                    
                }
                femalesList.add(new Female(name, rankPopularity));
            }
        }
        catch (FileNotFoundException fnfe) 
        {
            System.out.println("File girlnames.txt couldn't be found or opened");
        }
    }

    public int personIndexInMaleRecords(String name) 
    {        
        int index = -1;
        Person[] males = malesList.toArray(new Person[malesList.size()]);
        for(int i = 0; i < males.length; i++)
        {
            if(males[i].getName().equalsIgnoreCase(name))
            {
                index = i;
            }
        }
        return index;
    }

    public int personIndexInFemaleRecords(String name) 
    {
        int index = -1;
        Person[] females = femalesList.toArray(new Person[femalesList.size()]);
        for(int i = 0; i < females.length; i++)
        {
            if(females[i].getName().equalsIgnoreCase(name))
            {
                index = i;
            }
        }
        return index;
    }
    
}
