/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project2.movie.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ComedyMovie extends Movie 
{
    private final int LATE_FEE_COMEDY_MOVIE = 6;

    public ComedyMovie()
    {
        super();
    }

    public ComedyMovie(long theMovieIdNumber, String theMovieTitle, String theMovieRating)
    {
        super(theMovieIdNumber, theMovieTitle, theMovieRating);
    }

    public ComedyMovie(ComedyMovie theOriginalMovie)
    {
        super(theOriginalMovie);
    }

    @Override
    public double calcLateFees(int lateDays)
    {
        return LATE_FEE_COMEDY_MOVIE*lateDays;
    }

    @Override
    public String movieGenre()
    {
        String genre = MovieGenre.COMEDY.toString();
        return genre.substring(0,1).toUpperCase().concat(genre.substring(1,genre.length()).toLowerCase());
    }
}
