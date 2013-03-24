/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project2.movie.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public abstract class Movie
{
    private static final int LATE_FEE_DEFAULT = 10;
    private long movieIdNumber;
    private String movieTitle;
    private String movieRating;
    
    public Movie()
    {
       setMovieIdNumber(0);
       setMovieTitle("No title yet");
       setMovieRating(MovieRating.DEFAULT.name());
    }

    public Movie(long theMovieIdNumber, String theMovieTitle, String theMovieRating)
    {
       setMovieIdNumber(theMovieIdNumber);
       setMovieTitle(theMovieTitle);
       setMovieRating(theMovieRating);
    }

    public Movie(Movie originalObject)
    {
        setMovieIdNumber(originalObject.movieIdNumber);
        setMovieTitle(originalObject.movieTitle);
        setMovieRating(originalObject.movieRating);
    }

    public long getMovieIdNumber()
    {
        return movieIdNumber;
    }

    public final void setMovieIdNumber(long theMovieIdNumber)
    {
        if(theMovieIdNumber < 0)
        {
            System.out.println("Error: Invalid Movie Id");
            System.exit(0);
        }
        movieIdNumber = theMovieIdNumber;
    }

    public String getMovieTitle()
    {
        return movieTitle;
    }

    public final void setMovieTitle(String theMovieTitle)
    {
        if(theMovieTitle == null || theMovieTitle.equals(""))
        {
            System.out.println("Error: Invalid Movie Title");
            System.exit(0);
        }
        movieTitle = theMovieTitle;
    }

    public String getMovieRating()
    {
        return movieRating;
    }

    public final void setMovieRating(String theMovieRating)
    {
        if( theMovieRating == null || theMovieRating.equals(""))
        {
            System.out.println("Error: Invalid Movie Id");
            System.exit(0);
        }
        movieRating = theMovieRating;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Movie ID Number: ").append(getMovieIdNumber()).append("\n");
        builder.append("Movie Title: ").append(getMovieTitle()).append("\n");
        builder.append("Movie Rating: ").append(getMovieRating()).append("\n");
        builder.append("Movie Genre: ").append(movieGenre()).append("\n");

        return builder.toString();
    }

    @Override
    public boolean equals(Object theObject)
    {
        if(theObject == null)
            return false;
        if(getClass() != theObject.getClass())
            return false;
        if(this == theObject)
            return true;
        final Movie theMovie = (Movie)theObject;
        if(this.movieIdNumber != theMovie.movieIdNumber)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = 53 * hash + (int) (this.movieIdNumber ^ (this.movieIdNumber >>> 32));
        hash = 53 * hash + (this.movieTitle != null ? this.movieTitle.hashCode() : 0);
        hash = 53 * hash + (this.movieRating != null ? this.movieRating.hashCode() : 0);
        return hash;
    }

    public abstract double calcLateFees(int lateDays);
    public abstract String movieGenre();
}
