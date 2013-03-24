/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter8.project3.rental.entities;

import com.absolutejava.chapter8.project2.movie.entities.ActionMovie;
import com.absolutejava.chapter8.project2.movie.entities.MovieRating;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class RentalTest {
    
    @Test
    public void canCreateRentalObject() {
        Rental rental = new Rental();
        assertNotNull(rental);
    }
    
    @Test
    public void canCreateRentalWithMovieAndCustomerIdAndLateDays() {
        Rental rental = new Rental(new ActionMovie(1, "Face Off", MovieRating.PG_13.toString()), 1L, 2);
        assertNotNull(rental);
        assertEquals("Movie is ", rental.getMovie(), new ActionMovie(1, "Face Off", MovieRating.PG_13.toString()));
        assertEquals("Customer id is", 1L, rental.getCustomerId());
        assertEquals("Days over are", 2, rental.getLateDays());
    }
}