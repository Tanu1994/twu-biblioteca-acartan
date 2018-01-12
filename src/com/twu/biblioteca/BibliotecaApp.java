package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);

        System.out.println(menu.WelcomeMessage());
        System.out.println();
        System.out.println("Please select one of the following options.");
        System.out.println();

        int selection = 0;

        do{
            System.out.println("1. See a list of books");
            System.out.println("2. Return a book");
            System.out.println("3. Quit");
            selection = in.nextInt();

            menu.doAction(selection);
        }
        while (selection != 3);
    }
}
