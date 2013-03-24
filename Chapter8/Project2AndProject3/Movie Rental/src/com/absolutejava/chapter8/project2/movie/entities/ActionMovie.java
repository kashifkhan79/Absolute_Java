/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project2.movie.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class ActionMovie extends Movie
{
    private final int LATE_FEE_ACTION_MOVIE = 8;

    public ActionMovie()
    {
        super();
    }

    public ActionMovie(long theMovieIdNumber, String theMovieTitle, String theMovieRating)
    {
        super(theMovieIdNumber, theMovieTitle, theMovieRating);
    }

    public ActionMovie(ActionMovie theOriginalMovie)
    {
        super(theOriginalMovie);
    }

    @Override
    public double calcLateFees(int lateDays)
    {
        return LATE_FEE_ACTION_MOVIE*lateDays;
    }

    @Override
    public String movieGenre()
    {
        String genre = MovieGenre.ACTION.toString();
        return genre.substring(0,1).toUpperCase().concat(genre.substring(1,genre.length()).toLowerCase());
    }
}
