package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    private User loggedInUser;
    private boolean loggedIn = false;

    public String WelcomeMessage() {
        return "Welcome to Biblioteca! Our library is available.";
    }

    public void doAction(String selection, Book[] books, Movie[] movies, User[] users) {
        if (selection.matches("[23567]") && (!loggedIn)) {
            doLogin(users);
        }
        else switch (selection){
            case "1": {
                printListOfItems(books);
                break;
            }
            case "2": {
                checkoutItem(books);
                break;
            }
            case "3": {
                returnItem(books);
                break;
            }
            case "4": {
                printListOfItems(movies);
                break;
            }
            case "5": {
                checkoutItem(movies);
                break;
            }
            case "6": {
                returnItem(movies);
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
                System.out.println("\nSorry, this is not a valid option. Please select another option.");
                break;
            }

        }
        System.out.println();
    }

    private void doLogin(User[] users) {

        System.out.println("You have to login.");
        System.out.println("Username:");
        String username = readUserInput();
        System.out.println("Password:");
        String password = readUserInput();

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

    private void printListOfItems(LibraryItem[] items) {
        System.out.println("List of available items:\n");
        for (LibraryItem item : items) {
            if (!item.isBooked()) {
                System.out.println(item.toString());
            }
        }
    }

    private void checkoutItem(LibraryItem[] items) {
        System.out.println("Please type the name of the item you want to checkout:");
        String itemName = readUserInput();

        boolean checkItemExists = false;
        for (LibraryItem item : items) {
            if (item.getName().equals(itemName)) {
                item.setBooked(true);
                checkItemExists = true;
            }
        }

        if (checkItemExists){
            System.out.println("Thank you! Enjoy");
        }
        else{
            System.out.println("That item is not available.");
        }
    }

    private void returnItem(LibraryItem[] items) {
        System.out.println("Please type the name of item you want to return:");
        String itemName = readUserInput();

        boolean checkItemExists = false;
        for (LibraryItem item : items) {
            if (item.getName().equals(itemName)) {
                item.setBooked(false);
                checkItemExists = true;
            }
        }

        if (checkItemExists){
            System.out.println("Thank you for returning the item.");
        }
        else{
            System.out.println("That is not a valid item to return.");
        }
    }

    private String readUserInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
