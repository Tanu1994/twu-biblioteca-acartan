package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    private Book book = new Book("Harry Potter", "J K Rowling", 2002, false);

    @Test
    public void testGetSetName(){
        assertEquals("Test if initial name is set through constructor", "Harry Potter", book.getName());
        book.setName("Vanity Fair");
        assertEquals("Test if name has changed", "Vanity Fair", book.getName());
    }

    @Test
    public void testGetSetAuthor(){
        assertEquals("Test if initial author is set through constructor", "J K Rowling", book.getAuthor());
        book.setAuthor("Rowling");
        assertEquals("Test if author has changed", "Rowling", book.getAuthor());
    }

    @Test
    public void testGetSetYear(){
        assertEquals("Test if initial year is set through constructor", 2002, book.getYear());
        book.setYear(2004);
        assertEquals("Test if year has changed", 2004, book.getYear());
    }

    @Test
    public void testGetSetBooked(){
        assertEquals("Test if initial status of booking is set through constructor", false, book.isBooked());
        book.setBooked(true);
        assertEquals("Test if status of booking has changed", true, book.isBooked());
    }

}