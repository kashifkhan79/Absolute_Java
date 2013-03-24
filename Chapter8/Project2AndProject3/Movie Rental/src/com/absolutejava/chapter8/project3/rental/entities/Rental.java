/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project3.rental.entities;

import com.absolutejava.chapter8.project2.movie.entities.Movie;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Rental
{
    private Movie movie;
    private long customerId;
    private int lateDays;

    public Rental()
    {
    }

    public Rental(Movie theMovie, long theCustomerId, int theLateDays)
    {
        setMovie(theMovie);
        setCustomerId(theCustomerId);
        setLateDays(theLateDays);
    }

    public Rental(Rental theRental)
    {
        setMovie(theRental.movie);
        setCustomerId(theRental.customerId);
        setLateDays(theRental.lateDays);
    }

    public final void setMovie(Movie theMovie)
    {
        if(isMovieInvalid(theMovie))
        {
            System.out.println("Error: Null Movie");
            System.exit(0);
        }
        movie = theMovie;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public final void setCustomerId(long theCustomerId)
    {
        if(isCustomerIdInvalid(theCustomerId))
        {
            System.out.println("Error: Invalid Customer Id");
            System.exit(0);
        }
        customerId = theCustomerId;
    }

    public long getCustomerId()
    {
        return customerId;
    }

    public final void setLateDays(int theLateDays)
    {
        if(isLateDaysInvalid(theLateDays))
        {
            System.out.println("Error: Invalid Late Days");
            System.exit(0);
        }
        lateDays = theLateDays;
    }

    public int getLateDays()
    {
        return lateDays;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Movie Rented: ").append("\n");
        builder.append(getMovie().toString()).append("\n");
        builder.append("Customer ID: ").append(getCustomerId()).append("\n");
        builder.append("The Movie is late by ").append(getLateDays()).append(" days\n");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (this.movie != null ? this.movie.hashCode() : 0);
        hash = 73 * hash + (int) (this.customerId ^ (this.customerId >>> 32));
        hash = 73 * hash + this.lateDays;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rental other = (Rental) obj;
        if (this.movie != other.movie && (this.movie == null || !this.movie.equals(other.movie))) {
            return false;
        }
        if (this.customerId != other.customerId) {
            return false;
        }
        if (this.lateDays != other.lateDays) {
            return false;
        }
        return true;
    }
    
    private boolean isLateDaysInvalid(int theLateDays) {
        return theLateDays < 0 || theLateDays > Integer.MAX_VALUE;
    }

    private boolean isCustomerIdInvalid(long theCustomerId) {
        return theCustomerId < 0 || theCustomerId > Long.MAX_VALUE;
    }

    private boolean isMovieInvalid(Movie theMovie) {
        return theMovie == null;
    }   
}
