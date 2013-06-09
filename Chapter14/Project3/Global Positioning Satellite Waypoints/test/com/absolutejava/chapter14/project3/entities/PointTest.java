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
public class PointTest {
    
    @Test
    public void canCreatePointObject()
    {
        Point point = new Point(1.0,2.0);
        assertNotNull(point);
    }
}