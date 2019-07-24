package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ArrayElementUpdationTest {

    private ArrayElementUpdation arrayElementUpdation;


    /*
    This method runs before each test cases and assigns required values to variables.
    */

    @Before
    public void setUp() {
        arrayElementUpdation = new ArrayElementUpdation();
    }


    /*
    This method runs after each test cases and destroys the created variable or
    changes the value.
    */
    @After
    public void tearDown() {
        arrayElementUpdation = null;
    }


    /*
    To test setArray() method.
    Should return NullPointerException if null value is passed to it.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        arrayElementUpdation.setArray(null);
    }

    /*
    To test setArray() method.
    Should return RuntimeException if the empty string array is passed.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyArrayShouldReturnRuntimeException() {
        String[] strings = new String[0];
        arrayElementUpdation.setArray(strings);
    }


    /*
    To test setArray() and getUpdatedArray() methods.
     setArray() --> should return True if the valid String is passed.
     */
    @Test
    public void givenStringArrayShouldReturnTrue() {
        String[] strings = {"raju", "Praveen", "Siva", "MS"};
        assertTrue(arrayElementUpdation.setArray(strings));
    }


    /*
    To test setArray() and getUpdatedArray() methods.
    1. setArray() --> should return True if the valid String is passed.
    2. getUpdatedArray() --> should return the updated String array.
     */
    @Test
    public void givenStringArrayAndMapShouldReturnTheStringArray() {
        String[] strings = {"raju", "Praveen", "Siva", "MS"};
        assertTrue(arrayElementUpdation.setArray(strings));
        Map<String, String> stringMap = new TreeMap<>();
        stringMap.put("raju", "Raj");
        stringMap.put("MS", "MSDhoni");
        String[] expectedOutput = {"Raj", "Praveen", "Siva", "MSDhoni"};
        assertArrayEquals(expectedOutput, arrayElementUpdation.getUpdatedArray(stringMap));
    }

    /*
    To test setArray() and getUpdatedArray() methods.
    1. setArray() --> should return True if the valid String is passed.
    2. getUpdatedArray() --> should return RuntimeException if empty map is passed.
     */
    @Test(expected = RuntimeException.class)
    public void givenStringArrayAndEmptyMapShouldReturnTheRuntimeException() {
        String[] strings = {"raju", "Praveen", "Siva", "MS"};
        assertTrue(arrayElementUpdation.setArray(strings));
        Map<String, String> stringMap = new TreeMap<>();
        arrayElementUpdation.getUpdatedArray(stringMap);
    }

    /*
    To test setArray() and getUpdatedArray() methods.
    1. setArray() --> should return True if the valid String is passed.
    2. getUpdatedArray() --> should return Null Pointer exception if the null value is passed.
    */
    @Test(expected = NullPointerException.class)
    public void givenStringArrayAndNullShouldReturnNullPointerException() {
        String[] strings = {"raju", "Praveen", "Siva", "MS"};
        assertTrue(arrayElementUpdation.setArray(strings));
        Map<String, String> stringMap = null;
        arrayElementUpdation.getUpdatedArray(stringMap);
    }




}