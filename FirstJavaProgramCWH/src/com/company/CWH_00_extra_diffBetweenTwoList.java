package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.baeldung.com/java-lists-difference
 Q: How to find difference between two list (Interface) ?

 Q: Why use list if we already have arraylist ?
  - List is an interface whereas arraylist is a class, which will allow us to use polymorphism

 */
public class CWH_00_extra_diffBetweenTwoList {
    // Case 1: All element in resolveIP are new - Remove and add
    private static final List db1 = Arrays.asList("Jack", "Tom", "Sam");
    private static final List resolveIP1 = Arrays.asList("Alan", "James", "George");

    // Case 2: resolveIP has extra element ("Daniel") - To be added
    private static final List db2 = Arrays.asList("Jack", "Tom", "Sam", "John", "James");
    private static final List resolveIP2 = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Daniel");

    // Case 3: resolveIP has less element (missing: James)
    private static final List db3 = Arrays.asList("Jack", "Tom", "Sam", "John", "James");
    private static final List resolveIP3 = Arrays.asList("Jack", "Tom", "Sam", "John");

    // Case 4: resolveIP has few new element (Daniel, "George" and missing "John", "James")
    private static final List db4 = Arrays.asList("Jack", "Tom", "Sam", "John", "James");
    private static final List resolveIP4 = Arrays.asList("Jack", "Tom", "Sam", "Daniel", "George");
//    private static final List resolveIP4 = Arrays.asList("Jack", "Tom", "Sam", "John", "James");

    public static void main(String[] args) {

        //case1: A. Elements in db1 that are not in resolveIP1 - REMOVE
        List<String> differences1a = new ArrayList<>(db4);
        System.out.println("Initial Values of differences1a in db " + differences1a);
        System.out.println("Initial Values of resolveIP4 " + resolveIP4);
        System.out.println("----------------------------------------");
        differences1a.removeAll(resolveIP4);
        System.out.println("Final Values of differences1a to Remove " + differences1a); // Those that are to be removed

        //case1: B. Elements in resolveIP1 that are not in db1 - ADD
        List<String> differences1b = new ArrayList<>(resolveIP4);
//        System.out.println("Initial Values of differences1b " + differences1b);
        differences1b.removeAll(db4);
        System.out.println("Final Values of differences1b to Add " + differences1b); // These need to be added

    }
}

