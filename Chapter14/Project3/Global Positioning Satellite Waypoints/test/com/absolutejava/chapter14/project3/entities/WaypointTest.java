/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter14.project3.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class WaypointTest 
{
    @Test
    public void canCreateWaypointObject()
    {
        Waypoint waypoint = new Waypoint(new Point(2.0, 3.0), 3600);
        assertNotNull(waypoint);
    }
}