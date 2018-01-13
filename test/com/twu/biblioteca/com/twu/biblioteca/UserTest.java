package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user = new User("000-0000","password","John Smith","john@smith.com","07778");

    @Test
    public void testGetSetName(){
        assertEquals("Test getter for name", "John Smith", user.getName());
        user.setName("John Jackson");
        assertEquals("Test if name has changed", "John Jackson", user.getName());
    }

    @Test
    public void testGetSetUsername() {
        assertEquals("Test getter for username", "000-0000", user.getUsername());
        user.setUsername("000-2222");
        assertEquals("Test if username has changed", "000-2222", user.getUsername());
    }

    @Test
    public void testGetSetPassword() {
        assertEquals("Test getter for password", "password", user.getPassword());
        user.setPassword("000-2222");
        assertEquals("Test if password has changed", "000-2222", user.getPassword());
    }

    @Test
    public void testGetSetEmail() {
        assertEquals("Test getter for email", "john@smith.com", user.getEmail());
        user.setEmail("john@smith.co.uk");
        assertEquals("Test if email has changed", "john@smith.co.uk", user.getEmail());
    }

    @Test
    public void testGetSetPhone() {
        assertEquals("Test getter for address", "07778", user.getPhone());
        user.setPhone("07779");
        assertEquals("Test if address has changed", "07779", user.getPhone());
    }
}