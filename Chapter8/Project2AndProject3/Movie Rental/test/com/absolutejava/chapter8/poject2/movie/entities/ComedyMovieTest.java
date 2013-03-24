/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter8.poject2.movie.entities;

import com.absolutejava.chapter8.project2.movie.entities.ComedyMovie;
import com.absolutejava.chapter8.project2.movie.entities.Movie;
import com.absolutejava.chapter8.project2.movie.entities.MovieRating;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ComedyMovieTest {
    
    @Test
    public void canCreateComedyMovieObject() {
        Movie comedy = new ComedyMovie();
        assertNotNull(comedy);
    }
    
    @Test
    public void canCreateComedyMovieWithIdAndTitleAndRatingAndCanGetMovieGenre() {
        Movie comedy = new ComedyMovie(1, "Wedding Crashers", MovieRating.RATED_G.toString());
        assertNotNull(comedy);
        assertEquals("Movie Genre is", "Comedy", comedy.movieGenre());
    }
    
    @Test
    public void canCalculateLateFeeForComedyMovie() {
        Movie comedy = new ComedyMovie(1, "Wedding Crashers", MovieRating.RATED_G.toString());
        double fee = comedy.calcLateFees(3);
        assertEquals("Late fee for comedy movie is", 18.0, fee, 0.0);
    }
}