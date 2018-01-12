package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    Menu menu = new Menu();
    Book[] books = {
            new Book("Harry Potter", "J.K.Rowling", 2002, false),
            new Book("The Kite Runner", "Khaled Hosseini", 2014, false),
            new Book("Lolita", "Vladimir Nabokov", 2013, false),
            new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 2016, false),
            new Book("The Great Gatsby", "F Scott Fitzgerald", 2007, false),
            new Book("Vanity Fair", "William Thackery", 2011, false),
            new Book("The Hobbit", "JRR Tolkien", 2015, false),
    };

    @Test
    public void testWelcomeMessage(){
        assertEquals("Welcome to Biblioteca! Our library is available.", menu.WelcomeMessage());
    }


}