package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie movie = new Movie("The Godfather", "Francis Ford Coppola", 1972, 4.70, false);

    @Test
    public void testGetSetName(){
        assertEquals("Test if initial name is set through constructor", "The Godfather", movie.getName());
        movie.setName("Pulp Fiction");
        assertEquals("Test if name has changed", "Pulp Fiction", movie.getName());
    }

    @Test
    public void testGetSetDirector(){
        assertEquals("Test if initial director is set through constructor", "Francis Ford Coppola", movie.getDirector());
        movie.setDirector("Frank Darabont");
        assertEquals("Test if director has changed", "Frank Darabont", movie.getDirector());
    }

    @Test
    public void testGetSetYear(){
        assertEquals("Test if initial year is set through constructor", 1972, movie.getYear());
        movie.setYear(1974);
        assertEquals("Test if year has changed", 1974, movie.getYear());
    }

    @Test
    public void testGetSetRating(){
        assertEquals("Test if initial rating is set through constructor", 4.70, movie.getRating(), 0.01);
        movie.setRating(3.80);
        assertEquals("Test if rating has changed", 3.80, movie.getRating(), 0.01);
    }

    @Test
    public void testGetSetBooked(){
        assertEquals("Test if initial booking status is set through constructor", false, movie.isBooked());
        movie.setBooked(true);
        assertEquals("Test if booking status has changed", true, movie.isBooked());
    }

}