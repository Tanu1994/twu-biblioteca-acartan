package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    private Menu menu = new Menu();

    @Test
    public void testWelcomeMessage(){
        assertEquals("Welcome to Biblioteca! Our library is available.", menu.WelcomeMessage());
    }


}