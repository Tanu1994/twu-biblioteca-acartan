package com.twu.biblioteca;

public class LibraryItem {

    private String name;
    private int year;
    private boolean booked;

    public LibraryItem(String name, int year, boolean booked) {
        this.name = name;
        this.year = year;
        this.booked = booked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return String.format("'%s' (%d)", this.name, this.year);
    }
}
