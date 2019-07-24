package com.stackroute.pe5;

import java.security.InvalidParameterException;
import java.util.*;

public class StringOccurrence {

    private String[] givenArray;

    public boolean setArray(String[] givenArray){
        boolean boo = false;
        if (givenArray == null){
            int length = givenArray.length;
        }
        else if (givenArray.length == 0){
            String string = givenArray[1];
        }
        else {
            this.givenArray = givenArray;
            boo = true;
        }
        return boo;
    }

    public Map<String, Boolean> getAppearanceMap() {
        Map<String, Boolean> occurrenceMap = new TreeMap<>();
        List<String> stringList = Arrays.asList(this.givenArray);
        for (String word:this.givenArray){
            if (!word.isEmpty()){
                if (!occurrenceMap.containsKey(word)){
                    Boolean boo = false;
                    if (Collections.frequency(stringList, word) >= 2) boo = true;
                    occurrenceMap.put(word, boo);
                }
            }
        }
        return occurrenceMap;
    }
}
