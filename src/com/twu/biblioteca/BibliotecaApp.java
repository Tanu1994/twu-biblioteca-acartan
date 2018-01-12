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
                new Book("The Hobbit", "JRR Tolkien", 2015, false),
        };
        Scanner in = new Scanner(System.in);


        System.out.println(menu.WelcomeMessage());
        System.out.println();
        System.out.println("Please select one of the following options.");
        System.out.println();

        int selection = 0;

        do{
            System.out.println("1. See a list of books");
            System.out.println("2. Checkout a book");
            System.out.println("3. Return a book");
            System.out.println("4. Quit");
            selection = in.nextInt();

            menu.doAction(selection, books);
        }
        while (selection != 4);
    }
}
