package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Book[] books = {
                new Book("Harry Potter", "J.K.Rowling", 2002, false),
                new Book("The Kite Runner", "Khaled Hosseini", 2014, false),
                new Book("Lolita", "Vladimir Nabokov", 2013, false),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 2016, false),
                new Book("The Great Gatsby", "F Scott Fitzgerald", 2007, false),
                new Book("Vanity Fair", "William Thackery", 2011, false),
                new Book("The Hobbit", "JRR Tolkien", 2015, false)
        };
        Movie[] movies = {
                new Movie("The Godfather", "Francis Ford Coppola", 1972, 4.70, false),
                new Movie("Pulp Fiction", "Quentin Tarantino", 1994, 3.80, false),
                new Movie("Star Wars", "George Lucas", 1977, 4.20, false),
                new Movie("The Matrix", "The Wachowskis", 1999, 4.40, false)
        };

        User[] users = {
                new User("000-0000","password","John Smith","john@smith.com","07778"),
                new User("111-1111","other","Ana Smith","ana@smith.com","078324")
        };
        Scanner in = new Scanner(System.in);


        System.out.println(menu.WelcomeMessage());
        System.out.println();
        System.out.println("Please select one of the following options.");
        System.out.println();

        String selection;

        do{
            System.out.println("1. See a list of books");
            System.out.println("2. Checkout a book");
            System.out.println("3. Return a book");
            System.out.println("4. See a list of movies");
            System.out.println("5. Checkout a movie");
            System.out.println("6. Return a movie");
            System.out.println("7. User Info");
            System.out.println("8. Quit");
            selection = in.nextLine();

            menu.doAction(selection, books, movies, users);
        }
        while (!selection.equals("8"));
    }
}
