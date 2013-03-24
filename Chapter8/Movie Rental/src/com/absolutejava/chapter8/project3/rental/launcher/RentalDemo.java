/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project3.rental.launcher;

import com.absolutejava.chapter8.project2.movie.entities.ActionMovie;
import com.absolutejava.chapter8.project2.movie.entities.ComedyMovie;
import com.absolutejava.chapter8.project2.movie.entities.DramaMovie;
import com.absolutejava.chapter8.project2.movie.entities.Movie;
import com.absolutejava.chapter8.project2.movie.entities.MovieRating;
import com.absolutejava.chapter8.project3.rental.entities.Rental;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class RentalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Movie actionMovie = new ActionMovie(0,"Face Off", MovieRating.PG_13.toString());
        Movie comedyMovie = new ComedyMovie(1,"Wedding Crashers",MovieRating.RATED_G.toString());
        Movie dramaMovie = new DramaMovie(2,"City of Angels", MovieRating.R.toString());

        Rental[] rentalList = new Rental[3];

        rentalList[0] = new Rental();
        rentalList[0].setCustomerId(1);
        rentalList[0].setMovie(actionMovie);
        rentalList[0].setLateDays(3);

        rentalList[1] = new Rental();
        rentalList[1].setCustomerId(2);
        rentalList[1].setMovie(comedyMovie);
        rentalList[1].setLateDays(3);

        rentalList[2] = new Rental();
        rentalList[2].setCustomerId(3);
        rentalList[2].setMovie(dramaMovie);
        rentalList[2].setLateDays(3);

        System.out.println(rentalList[0]);
        System.out.println(rentalList[1]);
        System.out.println(rentalList[2]);
        
        System.out.println("Total late fees owed are $" + RentalDemo.lateFeesOwed(rentalList));
    }

    private static double lateFeesOwed(Rental[] theRentalList)
    {
        double totalLateFees = 0.0;
        for(Rental m : theRentalList)
        {
            totalLateFees += m.getMovie().calcLateFees(m.getLateDays());
        }
        return totalLateFees;
    }
}
