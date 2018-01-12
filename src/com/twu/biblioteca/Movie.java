package com.twu.biblioteca;

public class Movie {
    private String name;
    private String director;
    private int year;
    private double rating;
    private boolean booked;

    Movie(String name, String director, int year, double rating, boolean booked){
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.booked = booked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
