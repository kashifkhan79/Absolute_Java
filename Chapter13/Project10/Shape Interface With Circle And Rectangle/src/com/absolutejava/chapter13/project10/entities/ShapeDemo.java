/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter13.project10.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4,3);
        showArea(circle);
        showArea(rectangle);
    }
    
    public static void showArea(Shape s)
    {
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }
}
