package com.company;

import java.util.HashMap;

// Key value pair - Using employee name get the Id number. i.e. Map of employee with the id number.
// Employee name String and ids integer
// Order is not important

public class JavaMaps {
    public static void main(String[] args) {

        // HashMap is an implementation of Map
        // The type here should be Java Classes and should not be Primitive type  like "int"
        // Java wrapper class - String and Integer
        HashMap<String, Integer> empIds = new HashMap<>(); // Here <String, Integer> implies the map of what to what, which will be string to ids Integers

        empIds.put("jon",1234);
        empIds.put("con",32334);
        empIds.put("lon",12234);
        empIds.putIfAbsent("mac", 99999);

        System.out.println(empIds.get("jon"));
        System.out.println(empIds);
        System.out.println(empIds.containsKey("jon"));
        System.out.println(empIds.containsValue(99999));
        empIds.put("sonu", 12345);
    }
}
