/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project3.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class WaypointDemo 
{
    
    private static List<Waypoint> waypoints = new ArrayList<>();
    private static Waypoint waypoint;
    private static Point point;
    private static final double SCALING_FACTOR = 0.1;
    private static final int SECONDS_IN_HOUR = 3600;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the waypoints X-Coordinate, Y-Coordinate, Timestamp: -1 to exit");
        
        boolean hasNextInput = true;
        while(hasNextInput)
        {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            
            if(tokens.length == 3)
            {
                point = new Point(Double.parseDouble(tokens[0]), Double.parseDouble(tokens[1]));
                int timeStamp = Integer.parseInt(tokens[2]);
                
                waypoint = new Waypoint(point, timeStamp);
                waypoints.add(waypoint);
                
                System.out.println("Enter the waypoints X-Coordinate, Y-Coordinate, Timestamp: -1 to exit");
            }
            else if(tokens.length == 1 && Integer.parseInt(tokens[0]) == -1)
            {
                hasNextInput = false;                
            }            
        }        
        if(waypoints.size() > 1)
        {
            double totalDistanceCovered = totalDistanceCovered();
            int totalTimeUsed = totalTimeUsed();
            
            System.out.println("Total distance " + totalDistanceCovered);
            System.out.println("Total time " + totalTimeUsed);
            
            double speed = (totalDistanceCovered * SCALING_FACTOR)/(totalTimeUsed / SECONDS_IN_HOUR);
            
            System.out.println("Speed is " + speed + " miles per hour");    
        }
    }
    
    private static double totalDistanceCovered()
    {
        double totalDistanceCovered = 0.00;
        int startIndex = 0;
        int endIndex = waypoints.size() - 1;
        
        //We traveled along the X-Coordinate
        if(waypoints.get(startIndex).getPoint().getxCoordinate() == waypoints.get(endIndex).getPoint().getxCoordinate())
        {            
            totalDistanceCovered = waypoints.get(endIndex).getPoint().getyCoordinate() - waypoints.get(startIndex).getPoint().getyCoordinate();
        }
        // We traveled along the Y-Coordinate
        else if (waypoints.get(startIndex).getPoint().getyCoordinate() == waypoints.get(endIndex).getPoint().getyCoordinate())
        {
            totalDistanceCovered = waypoints.get(endIndex).getPoint().getxCoordinate() - waypoints.get(startIndex).getPoint().getxCoordinate();
        }
        return totalDistanceCovered;
    }
    
    private static int totalTimeUsed()
    {
        int startIndex = 0;
        int endIndex = waypoints.size() - 1;
        return waypoints.get(endIndex).getTimestamp() - waypoints.get(startIndex).getTimestamp();
    }
}