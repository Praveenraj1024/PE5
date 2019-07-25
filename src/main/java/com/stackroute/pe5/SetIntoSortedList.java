package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SetIntoSortedList {

    /*
     This method should throw Null Pointer Exception if a null value is passed to it.
     Should return the sorted array list if the passed input is valid
    */

    public List<String> sortElements(String inputString) {
        if (inputString.isEmpty() || inputString.isBlank()) {
            inputString.charAt(1);
        }
        String[] inputArray = inputString.split(" ");
        List<String> inputArrayList = new ArrayList<>(Arrays.asList(inputArray));
        TreeSet<String> treeSet = new TreeSet<>(inputArrayList);
        return new ArrayList<>(treeSet);
    }
}
