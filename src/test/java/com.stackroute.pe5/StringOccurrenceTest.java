package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class StringOccurrenceTest {


    private StringOccurrence stringOccurrence;

    /*
    This method runs before each test cases and assigns required values to variables.
    */

    @Before
    public void setUp() {
        stringOccurrence = new StringOccurrence();
    }


    /*
    This method runs after each test cases and destroys the created variable or
    changes the value.
    */
    @After
    public void tearDown() {
        stringOccurrence = null;
    }


    /*
    To test setArray() method.
    Should return NullPointerException if null value is passed to it.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        stringOccurrence.setArray(null);
    }

    /*
    To test setArray() method.
    Should return RuntimeException if the empty string array is passed.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRuntimeException() {
        String[] strings = {};
        stringOccurrence.setArray(strings);
    }



    /*
    To test setArray() and getAppearanceMap() method.
    1. setArray() --> should return true if a valid string[] is passed to it.
    2. getOccurrenceMap() --> should return the expected map.
     */
    @Test
    public void givenStringShouldReturnTheMap() {
        String[] strings = {"a", "a", "b", "c", "a", "c"};

        assertTrue(stringOccurrence.setArray(strings));
        Map<String, Boolean> expectedOutput = new TreeMap<>();
        expectedOutput.put("a", true);
        expectedOutput.put("b", false);
        expectedOutput.put("c", true);
        assertEquals(expectedOutput, stringOccurrence.getAppearanceMap());
    }

    /*
    To test setString() and getAppearanceMap() method.
    1. setString() --> should return true if a valid string[] is passed to it.
    2. getOccurrenceMap() --> should not return the mentioned expected value.
    */
    @Test
    public void givenStringShouldNotReturnTheExpectedOutput() {
        String[] strings = {"a", "a", "b", "c", "a", "c"};
        assertTrue(stringOccurrence.setArray(strings));
        Map<String, Boolean> expectedOutput = new TreeMap<>();
        expectedOutput.put("a", true);
        expectedOutput.put("b", false);
        expectedOutput.put("c", false);
        assertNotEquals(expectedOutput, stringOccurrence.getAppearanceMap());
    }

}