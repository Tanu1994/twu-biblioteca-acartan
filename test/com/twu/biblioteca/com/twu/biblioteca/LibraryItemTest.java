package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryItemTest {

    private static final String ITEM = "Item";
    private static final int YEAR = 2000;
    private static final int SECOND_YEAR = 2001;

    LibraryItem item;

    @Before
    public void setUp() throws Exception {
       item = new LibraryItem(ITEM, YEAR, false);
    }

    @Test
    public void getName() {
        assertEquals(ITEM, item.getName());
    }

    @Test
    public void setName() {
        item.setName(ITEM+ITEM);
        assertEquals(ITEM+ITEM, item.getName());
    }

    @Test
    public void getYear() {
        assertEquals(YEAR, item.getYear());
    }

    @Test
    public void setYear() {
        item.setYear(SECOND_YEAR);
        assertEquals(SECOND_YEAR, item.getYear());
    }

    @Test
    public void isBooked() {
        assertEquals(false, item.isBooked());
    }

    @Test
    public void setBooked() {
        item.setBooked(true);
        assertEquals(true, item.isBooked());
    }

    @Test
    public void testToString() {
        assertEquals("'Item' (2000)", item.toString());
    }
}