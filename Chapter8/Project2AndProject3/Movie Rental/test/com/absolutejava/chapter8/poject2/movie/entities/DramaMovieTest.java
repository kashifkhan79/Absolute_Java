/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter8.poject2.movie.entities;

import com.absolutejava.chapter8.project2.movie.entities.DramaMovie;
import com.absolutejava.chapter8.project2.movie.entities.Movie;
import com.absolutejava.chapter8.project2.movie.entities.MovieRating;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class DramaMovieTest {
    
    @Test
    public void canCreateDramaMovieObject()
    {
        Movie drama = new DramaMovie();
        assertNotNull(drama);
    }
    
    @Test
    public void canCreateDramaMovieObjectWithIdAndTitleAndRatingAndCanGetMovieGenre() 
    {
        Movie drama = new DramaMovie(2,"City of Angels", MovieRating.R.toString());
        assertNotNull(drama);
        assertEquals("Genre of drama movie is", "Drama", drama.movieGenre());
    }
    
    @Test
    public void canCalculateLateFeeForDramaMovie() 
    {
        Movie drama = new DramaMovie(2,"City of Angels", MovieRating.R.toString());
        double fee = drama.calcLateFees(3);
        assertEquals("Late fee for drama movie is", 12.0, fee, 0.0);
    }
}