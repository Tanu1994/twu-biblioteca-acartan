package com.twu.biblioteca;

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
                returnBook();
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

    private void returnBook() {

    }

    private void printListOfBooks(Book[] books) {
        System.out.println("List of available books:");
        System.out.println();
        for (int i = 0; i < books.length; i++){
            System.out.println(books[i].getName() + " " + books[i].getAuthor() + " " + books[i].getYear());
        }
    }
}
