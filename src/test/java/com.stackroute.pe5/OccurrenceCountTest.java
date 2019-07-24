package com.stackroute.pe5;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class OccurrenceCountTest {


    private OccurrenceCount occurrenceCount;

    /*
    This method runs before each test cases and assigns required values to variables.
    */

    @Before
    public void setUp() {
        occurrenceCount = new OccurrenceCount();
    }


    /*
    This method runs after each test cases and destroys the created variable or
    changes the value.
    */
    @After
    public void tearDown() {
        occurrenceCount = null;
    }


    /*
    To test setString() method.
    Should return NullPointerException if null value is passed to it.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        occurrenceCount.setString(null);
    }

    /*
    To test setString() method.
    Should return RuntimeException if the empty string is passed.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRuntimeException() {
        occurrenceCount.setString("");
    }

    /*
    To test setString() method.
    Should return InvalidParameterException if the int value is passed to it.
     */

    @Test(expected = InvalidParameterException.class)
    public void givenIntShouldReturnInvalidParameterException() {
        occurrenceCount.setString(12);
    }


    /*
    To test setString() and getOccurrenceMap() method.
    1. setString() --> should return true if a valid string is passed to it.
    2. getOccurrenceMap() --> should return the expected map.
     */
    @Test
    public void givenStringShouldReturnTheMap() {
        assertTrue(occurrenceCount.setString("one one -one___two,,three,one @three*one?two"));
        Map<String, Integer> expectedOutput = new TreeMap<>();
        expectedOutput.put("one", 5);
        expectedOutput.put("two", 2);
        expectedOutput.put("three", 2);
        assertEquals(expectedOutput, occurrenceCount.getOccurrenceMap());
    }

    /*
    To test setString() and getOccurrenceMap() method.
    1. setString() --> should return true if a valid string is passed to it.
    2. getOccurrenceMap() --> should not return the mentioned expected value.
     */
    @Test
    public void givenStringShouldNotReturnTheExpectedOutput() {
        assertTrue(occurrenceCount.setString("one one -one___two,,three,one @three*one?two"));
        Map<String, Integer> expectedOutput = new TreeMap<>();
        expectedOutput.put("one", 5);
        expectedOutput.put("two", 1);
        expectedOutput.put("three", 2);
        assertNotEquals(expectedOutput, occurrenceCount.getOccurrenceMap());
    }


}