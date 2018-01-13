package com.twu.biblioteca;

public class Movie extends LibraryItem {
    private String director;
    private double rating;

    Movie(String name, String director, int year, double rating, boolean booked){
        super(name, year, booked);
        this.director = director;
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
