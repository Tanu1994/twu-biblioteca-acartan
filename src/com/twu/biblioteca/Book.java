package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private int year;
    private boolean booked;
    private Book[] books;

    public Book(String name, String author, int year, boolean booked){
        this.name = name;
        this.author = author;
        this.year = year;
        this.booked = booked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean getBooked(){
        return booked;
    }

    public void setBooked(boolean booked){
        this.booked = booked;
    }
}
