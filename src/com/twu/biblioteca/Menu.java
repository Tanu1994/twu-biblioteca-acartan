package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    private User loggedInUser;
    private boolean loggedIn = false;

    public String WelcomeMessage() {
        return "Welcome to Biblioteca! Our library is available.";
    }

    public void doAction(String selection, Book[] books, Movie[] movies, User[] users) {
        switch (selection){
            case "1": {
                printListOfBooks(books);
                System.out.println();
                break;
            }
            case "2": {
                checkoutBook(books);
                break;
            }
            case "3": {
                returnBook(books);
                break;
            }
            case "4": {
                printListOfMovies(movies);
                System.out.println();
                break;
            }
            case "5": {
                checkoutMovie(movies);
                break;
            }
            case "6": {
                returnMovie(movies);
                break;
            }
            case "7": {
                if(loggedIn){
                    showUserInfo();
                }
                else {
                    doLogin(users);
                }
                break;
            }
            case "8": break;
            default:
            {
                System.out.println();
                System.out.println("Sorry, this is not a valid option. Please select another option.");
                break;
            }
        }
    }

    private void doLogin(User[] users) {

        Scanner in = new Scanner(System.in);
        System.out.println("You have to login.");
        System.out.println("Username:");
        String username = in.nextLine();
        System.out.println("Password:");
        String password = in.nextLine();

        for (User user:users) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
                this.loggedInUser = user;
                this.loggedIn = true;
                System.out.println("You're logged in.");
            }
        }

        if (!loggedIn) {
            System.out.println("Sorry, username or password are not valid.");
        }
    }

    private void showUserInfo() {
        System.out.println("Name: " + loggedInUser.getName());
        System.out.println("Email address: " + loggedInUser.getEmail());
        System.out.println("Phone number: " + loggedInUser.getPhone());
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
