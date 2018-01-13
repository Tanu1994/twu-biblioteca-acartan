package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    public String WelcomeMessage() {
        return "Welcome to Biblioteca! Our library is available.";
    }

    public void doAction(int selection, Book[] books, Movie[] movies, User user) {
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
            case 4: {
                printListOfMovies(movies);
                System.out.println();
                break;
            }
            case 5: {
                checkoutMovie(movies);
                break;
            }
            case 6: {
                returnMovie(movies);
                break;
            }
            case 7: {
                showUserInfo(user);
                break;
            }
            case 8: break;
            default:
            {
                System.out.println();
                System.out.println("Sorry, this is not a valid option. Please select another option.");
                break;
            }
        }
    }

    private void showUserInfo(User user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email address: " + user.getEmail());
        System.out.println("Phone number: " + user.getPhone());
    }

    private void printListOfMovies(Movie[] movies) {
        System.out.println("List of available movies:");
        System.out.println();
        for (Movie movie : movies) {
            if (!movie.isBooked()) {
                System.out.println("'" + movie.getName() + "'" + ", by " + movie.getDirector() + " ("
                        + movie.getYear() + ")" + " - Rating: " + movie.getRating());
            }
        }
    }

    private void checkoutBook(Book[] books) {
        Scanner in = new Scanner(System.in);
        String bookName;
        System.out.println("Please type the name of book you want to checkout:");
        bookName = in.nextLine();

        boolean checkBookExists = false;
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                book.setBooked(true);
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
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                book.setBooked(false);
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

    private void checkoutMovie(Movie[] movies) {
        Scanner in = new Scanner(System.in);
        String movieName;
        System.out.println("Please type the name of movie you want to checkout:");
        movieName = in.nextLine();

        boolean checkMovieExists = false;
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                movie.setBooked(true);
                checkMovieExists = true;
            }
        }

        if (checkMovieExists){
            System.out.println("Thank you! Enjoy the movie");
        }
        else{
            System.out.println("That movie is not available.");
        }
    }

    private void returnMovie(Movie[] movies) {
        Scanner in = new Scanner(System.in);
        String movieName;
        System.out.println("Please type the name of movie you want to return:");
        movieName = in.nextLine();

        boolean checkMovieExists = false;
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                movie.setBooked(false);
                checkMovieExists = true;
            }
        }

        if (checkMovieExists){
            System.out.println("Thank you for returning the movie.");
        }
        else{
            System.out.println("That is not a valid movie to return.");
        }
    }

    private void printListOfBooks(Book[] books) {
        System.out.println("List of available books:");
        System.out.println();
        for (Book book : books) {
            if (!book.getBooked()) {
                System.out.println("'" + book.getName() + "'" + ", by " + book.getAuthor() + " ("
                        + book.getYear() + ")");
            }
        }
    }
}
