package com.stackroute.pe5;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ArrayElementUpdation {
    private String[] givenStringArray;

    /*
    1. Should return Null pointer exception if a null value is passed.
    2. Should return Runtime Exception if an empty array is passed.
    3. Should return true if a valid string array is passed.
     */
    public boolean setArray(String[] givenStringArray){
        boolean boo = false;
        if (givenStringArray == null){
            int i = givenStringArray.length;
        }
        else if (givenStringArray.length == 0){
            String strings = givenStringArray[1];
        }
        else {
            this.givenStringArray = givenStringArray;
            boo = true;
        }
        return boo;
    }


    /*
    1. Should return NullPointer Exception if a null value is passed.
    2. Should return Runtime Exception if an empty map is passed.
    3. Should return a string array if a valid map is passed.
     */
    public String[] getUpdatedArray(Map<String, String> stringMap) {
        if (stringMap == null){
            throw new NullPointerException();
        }
        else if (stringMap.isEmpty()){
            throw new RuntimeException("You have passed a empty map");
        }
        List<String> stringList = Arrays.asList(this.givenStringArray);
        for (String key:stringMap.keySet()){
            Collections.replaceAll(stringList, key, stringMap.get(key));
        }
        String[] updatedArray = stringList.toArray(new String[stringList.size()]);
//        stringList.clear();
        return updatedArray;
    }
}
