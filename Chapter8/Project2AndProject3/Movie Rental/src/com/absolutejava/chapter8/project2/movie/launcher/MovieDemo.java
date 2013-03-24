/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.absolutejava.chapter8.project2.movie.launcher;

import com.absolutejava.chapter8.project2.movie.entities.ActionMovie;
import com.absolutejava.chapter8.project2.movie.entities.ComedyMovie;
import com.absolutejava.chapter8.project2.movie.entities.DramaMovie;
import com.absolutejava.chapter8.project2.movie.entities.Movie;
import com.absolutejava.chapter8.project2.movie.entities.MovieRating;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class MovieDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Movie actionMovie = new ActionMovie(0,"Face Off", MovieRating.PG_13.toString());
        Movie comedyMovie = new ComedyMovie(1,"Wedding Crashers",MovieRating.RATED_G.toString());
        Movie dramaMovie = new DramaMovie(2,"City of Angels", MovieRating.R.toString());

        System.out.println(actionMovie);
        System.out.println(comedyMovie);
        System.out.println(dramaMovie);

        System.out.println(actionMovie.getMovieTitle() + ": fine of $" + actionMovie.calcLateFees(2));
        
    }

}
