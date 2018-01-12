package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    private Book[] books;

    public String WelcomeMessage() {
        return "Welcome to Biblioteca! Our library is available.";
    }

    public void doAction(int selection, Book[] books) {
        switch (selection){
            case 1: {
                printListOfBooks(books);
                System.out.println();
                break;
            }
            case 2: {
                checkoutBook(books);
                break;
            }
            case 3: {
                returnBook(books);
                break;
            }
            case 4: break;
            default:
            {
                System.out.println();
                System.out.println("Sorry, this is not a valid option. Please select another option.");
                break;
            }
        }
    }

    private void checkoutBook(Book[] books) {
        Scanner in = new Scanner(System.in);
        String bookName;
        System.out.println("Please type the name of book you want to checkout:");
        bookName = in.nextLine();

        boolean checkBookExists = false;
        for (int i = 0; i < books.length; i++){
            if (books[i].getName().equals(bookName)) {
                books[i].setBooked(true);
                checkBookExists = true;
            }
        }

        if (checkBookExists){
            System.out.println("Thank you! Enjoy the book");
        }
        else{
            System.out.println("That book is not available.");
        }
    }

    private void returnBook(Book[] books) {
        Scanner in = new Scanner(System.in);
        String bookName;
        System.out.println("Please type the name of book you want to return:");
        bookName = in.nextLine();

        boolean checkBookExists = false;
        for (int i = 0; i < books.length; i++){
            if (books[i].getName().equals(bookName)) {
                books[i].setBooked(false);
                checkBookExists = true;
            }
        }

        if (checkBookExists){
            System.out.println("Thank you for returning the book.");
        }
        else{
            System.out.println("That is not a valid book to return.");
        }
    }

    private void printListOfBooks(Book[] books) {
        System.out.println("List of available books:");
        System.out.println();
        for (int i = 0; i < books.length; i++){
            if (!books[i].getBooked()) {
                System.out.println("'" + books[i].getName() + "'" + ", by " + books[i].getAuthor() + " ("
                        + books[i].getYear() + ")");
            }
        }
    }
}
