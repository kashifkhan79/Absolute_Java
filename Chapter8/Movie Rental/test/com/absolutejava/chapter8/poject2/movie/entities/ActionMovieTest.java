/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter8.poject2.movie.entities;

import com.absolutejava.chapter8.project2.movie.entities.ActionMovie;
import com.absolutejava.chapter8.project2.movie.entities.Movie;
import com.absolutejava.chapter8.project2.movie.entities.MovieRating;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ActionMovieTest {
    
    @Test
    public void canCreateActionMovie() {
        Movie action = new ActionMovie();
        assertNotNull(action);
    }
    
    @Test
    public void canCreateActionMovieWithIdAndTitleAndRatingAndCanGetMovieGenre() {
        Movie action = new ActionMovie();
        action.setMovieIdNumber(1);
        action.setMovieTitle("Face Off");
        action.setMovieRating("PG_13");
        assertNotNull(action);
        assertEquals("Movie Id is", 1, action.getMovieIdNumber());
        assertEquals("Movie Title is", "Face Off", action.getMovieTitle());
        assertEquals("Movie Rating is", "PG_13", action.getMovieRating());
        assertEquals("Movie genre is", "Action", action.movieGenre());
    }
        
    @Test
    public void canCalculateLateFeeForActionMovie() {
        Movie action = new ActionMovie(1, "Face Off", MovieRating.PG_13.toString());
        double fee = action.calcLateFees(3);
        assertEquals("Late fee for action movie is", 24.0, fee, 0.0);
    }
}