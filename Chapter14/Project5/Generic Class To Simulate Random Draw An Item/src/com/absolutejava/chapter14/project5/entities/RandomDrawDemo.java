/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project5.entities;

import java.util.List;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class RandomDrawDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        RandomDraw<String> stringBox = new RandomDraw<>();
        boolean stringBoxEmpty = stringBox.isEmpty();
        
        System.out.println("Checking if String Box is empty or not " + stringBoxEmpty);
        System.out.println("Randomly drawing an item from String Box when it is empty " + stringBox.drawItem());
        
        stringBox.addItem("Kashif");
        stringBox.addItem("Saqib");
        stringBox.addItem("Iftikhar");
        
        stringBoxEmpty = stringBox.isEmpty();
        
        System.out.println("Checking if String Box is empty or not " + stringBoxEmpty);
        System.out.println("Following items are present in the box");
        
        List<String> stringItems = stringBox.getItems();
        
        for(String item : stringItems)
        {
            System.out.println(item);
        }
        
        System.out.println("Randomly drawing an item from String Box " + stringBox.drawItem());
        
        System.out.println("Emptying the String Box ");
        stringBox.empty();
        
        stringBoxEmpty = stringBox.isEmpty();
        
        System.out.println("Checking if String Box is empty or not " + stringBoxEmpty);
        
        RandomDraw<Integer> integerBox = new RandomDraw<>();
        boolean integerBoxEmpty = integerBox.isEmpty();
        
        System.out.println("Checking if String Box is empty or not " + integerBoxEmpty);
        System.out.println("Randomly drawing an item from String Box when it is empty " + integerBox.drawItem());
        
        integerBox.addItem(23);
        integerBox.addItem(24);
        integerBox.addItem(25);
        integerBox.addItem(35);
        integerBox.addItem(26);
        integerBox.addItem(29);
        integerBox.addItem(30);
        
        integerBoxEmpty = integerBox.isEmpty();
        
        System.out.println("Checking if String Box is empty or not " + integerBoxEmpty);
        System.out.println("Following items are present in the box");
        
        List<Integer> integerItems = integerBox.getItems();
        
        for(Integer item : integerItems)
        {
            System.out.println(item);
        }
        
        System.out.println("Randomly drawing an item from String Box " + integerBox.drawItem());
        System.out.println("Randomly drawing an item from String Box " + integerBox.drawItem());
        System.out.println("Randomly drawing an item from String Box " + integerBox.drawItem());
        
        System.out.println("Emptying the Integer Box ");
        integerBox.empty();
        
        integerBoxEmpty = integerBox.isEmpty();
        
        System.out.println("Checking if String Integer is empty or not " + integerBoxEmpty);
    }
}