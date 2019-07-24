package com.stackroute.pe5;

import java.security.InvalidParameterException;
import java.util.*;

public class OccurrenceCount {

    private String givenString;

    /*
    1. Should return Null pointer exception if a null value is passed.
    2. Should return Runtime Exception if an empty array is passed.
    3. Should return true if a valid string array is passed.
     */
    public boolean setString(String givenString){
        boolean boo = false;
        if (givenString == null){
            throw new NullPointerException();
        }
        else if (givenString.isEmpty()){
            throw new RuntimeException("You have entered an empty array.");
        }
        else {
            this.givenString = givenString;
            boo = true;
        }
        return boo;
    }

    /*
    Should return InvalidParameterException if int value is passed to setString() method.
     */
    public void setString(int givenString) {
        throw new InvalidParameterException();
    }


    /*
    Should return a map of word and its occurrence collection.
     */
    public Map<String, Integer> getOccurrenceMap() {
        Map<String, Integer> occurrenceMap = new TreeMap<>();
        String[] strings = this.givenString.trim().split("\\W|_| ");
        List<String> stringList = Arrays.asList(strings);
        for (String word:strings){
            if (!word.isEmpty()){
                if (!occurrenceMap.containsKey(word)){
                    occurrenceMap.put(word, Collections.frequency(stringList, word));
                }
            }
        }
        return occurrenceMap;
    }




}
