package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModificationInMapTest {

    ModificationInMap modificationInMap;

    /*
    This method runs before each test cases and assigns required values to variables.
    */
    @Before
    public void setUp(){
        modificationInMap = new ModificationInMap();
    }

    /*
    This method runs after each test cases and destroys the created variable or
    changes the value.
    */
    @After
    public void tearDown() {
        modificationInMap = null;
    }


    /*
    To test setMap() and getModifiedMap() methods.
    1. setMap() --> should return true if a valid map is passed to it.
    2. getModifiedMap() --> should return the expected map.
     */
    @Test
    public void givenMapShouldReturnAModifiedMap() {
        Map<String, String> stringMap = new LinkedHashMap<>();
        stringMap.put("key1", "raj");
        stringMap.put("key2", "Praveen");
        assertTrue(modificationInMap.setMap(stringMap));
        Map<String, String> expectedOutput = new LinkedHashMap<>();
        expectedOutput.put("key1", "");
        expectedOutput.put("key2", "raj");
        assertEquals(expectedOutput, modificationInMap.getModifiedMap());
    }


    /*
    To test setMap() and getModifiedMap() methods.
    1. setMap() --> should return true if a valid map is passed to it.
    2. getModifiedMap() --> should return the expected map.
     */
    @Test
    public void givenMapShouldReturnUnModifiedMap() {
        Map<String, String> stringMap = new LinkedHashMap<>();
        stringMap.put("key1", "");
        stringMap.put("key2", "Praveen");
        assertTrue(modificationInMap.setMap(stringMap));
        Map<String, String> expectedOutput = new LinkedHashMap<>();
        expectedOutput.put("key1", "");
        expectedOutput.put("key2", "Praveen");
        assertEquals(expectedOutput, modificationInMap.getModifiedMap());
    }


    /*
    To test setMap() method, should return Null Pointer Exception if null value is passed to it.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullMapShouldReturnNullPointerException() {
        modificationInMap.setMap(null);
    }


    /*
    To test setMap() method.
        should return runtime exception if an empty map is passed to it.
     */
    @Test(expected = RuntimeException.class)
    public void givenNullMapShouldReturnRuntimeException() {
        Map<String, String> stringMap = new LinkedHashMap<>();
        modificationInMap.setMap(stringMap);
    }

}