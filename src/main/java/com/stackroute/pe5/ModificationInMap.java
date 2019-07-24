package com.stackroute.pe5;

import java.util.Map;

public class ModificationInMap {

    private Map<String, String> givenMap;


    /*
    1. Should return Null pointer exception if a null value is passed.
    2. Should return Runtime Exception if an empty array is passed.
    3. Should return true if a valid string array is passed.
     */
    public boolean setMap(Map<String, String> givenMap) {
        boolean boo = false;
        if (givenMap == null){
            givenMap.get("sdf");
        }
        else if (givenMap.isEmpty()){
            throw new RuntimeException("you have passed a empty map");
        }
        else {
            this.givenMap = givenMap;
            boo = true;
        }
        return boo;
    }


    /*
    If the first value is not empty then the second value should be replaced by first value,
    and the first value should be changed as empty.
     */
    public Map<String, String> getModifiedMap() {
        String[] keys = this.givenMap.keySet().toArray(new String[this.givenMap.size()]);
        if (!(this.givenMap.get(keys[0]).trim().isEmpty())){
            String replacer = this.givenMap.get(keys[0]);
            this.givenMap.replace(keys[0], "");
            this.givenMap.replace(keys[1], replacer);
        }
        return this.givenMap;
    }
}
