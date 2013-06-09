/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project5.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class RandomDraw<T> 
{
    private List<T> items;
    
    public RandomDraw()
    {
        items = new ArrayList<>();
    }
    
    public void addItem(T item)
    {
        items.add(item);
    }
    
    public boolean isEmpty()
    {
        return items.isEmpty();
    }
    
    public T drawItem()
    {
        T item = null;
        if(!isEmpty())
        {
            Random random = new Random();
            int index = random.nextInt(items.size());
            item = items.get(index);
        }
        return item;
    }
    
    public void empty()
    {
        items.clear();
    }

    public List<T> getItems() 
    {
        return new ArrayList<>(items);
    }
}