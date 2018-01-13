package com.twu.biblioteca;

public class Book extends LibraryItem {

    private String author;

    Book(String name, String author, int year, boolean booked){
        super(name, year, booked);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("'%s', by %s (%d)",this.getName(),this.author, this.getYear());
    }
}
