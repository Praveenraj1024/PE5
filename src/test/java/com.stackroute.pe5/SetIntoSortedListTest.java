package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SetIntoSortedListTest {
    private SetIntoSortedList setIntoSortedList;


    /*
    This method runs before each test cases and assigns required values to variables.
    */

    @Before
    public void setUp() {
        setIntoSortedList = new SetIntoSortedList();
    }


    /*
    This method runs after each test cases and destroys the created variable or
    changes the value.
    */
    @After
    public void tearDown() {
        setIntoSortedList = null;
    }


    @Test(expected = NullPointerException.class)
    public void givenNullReturnNullPointerExceptionWithMessage() {
        setIntoSortedList.sortElements(null);
    }

    /**
     * To Test sortElements()
     * Method should throw an NullPointerException when empty string is given.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldThrowNullPointerExceptionWithError() {
        setIntoSortedList.sortElements("");
    }

    /**
     * To Test sortElements()
     * Method should throw an NullPointerException when blank string is given.
     */
    @Test(expected = NullPointerException.class)
    public void givenBlankStringShouldThrowNullPointerExceptionWithError() {
        setIntoSortedList.sortElements("  ");
    }

    /**
     * To Test setSorter()
     * Given String, method should return a ArrayList of words in the string in
     * a sorted order.
     */
    @Test
    public void givenInputShouldReturnSortedArrayList() {
        String input = "Raj Arun Cinu David";
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Arun");
        expectedResult.add("Cinu");
        expectedResult.add("David");
        expectedResult.add("Raj");
        assertEquals(expectedResult, setIntoSortedList.sortElements(input));
    }

    /**
     * To test sortElements()
     * Given string with repeating words should return ArrayList without
     * duplicate elements in a sorted order.
     */
    @Test
    public void givenInputWithDuplicateValuesShouldReturnArrayListWithoutDuplicates() {
        String input = "Raj Arun Cinu Arun David";
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Arun");
        expectedResult.add("Cinu");
        expectedResult.add("David");
        expectedResult.add("Raj");
        assertEquals(expectedResult, setIntoSortedList.sortElements(input));
    }




}