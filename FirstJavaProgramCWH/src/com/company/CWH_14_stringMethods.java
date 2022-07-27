package com.company;

import java.sql.SQLOutput;

public class CWH_14_stringMethods {
    public static void main(String[] args) {

        String name = "Harry";
//        String a1 = new String ("Harry");
//        System.out.println(name);

        // String methods (Strings are immutable)

        // Length of string
//        int value = name.length(); // Here name.length will return the length of string name
//        System.out.println(value);


        // Lower case string
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

        // Upper case string
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);


        //trim - Remove leading and trailing characters
//        String nonTrimmedString = "      Harry      ";
//        System.out.println(nonTrimmedString);
//        System.out.println(nonTrimmedString.trim());
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);


        // substring starting at specific index

//        System.out.println(name.substring(1)); // arry

        // substring using start index and end index, where the start index is included
        // end index is not included.

//        System.out.println(name.substring(1,5)); // arry


        // name.replace('r','p') where r and p are characters
        // returns a new string after replacing the character in this case.
        // replaces all occurance of character
//        System.out.println(name.replace('r', 'p'));
//
//        System.out.println(name.replace("rry", "ier"));


        // starts with - return a boolean value
//        System.out.println(name.startsWith("Har"));

        // ends with - return a boolean value
//        System.out.println(name.endsWith("D"));


        // What is the character as index?

//        System.out.println(name.charAt(4));


        // What is the first index of first occur
//        String modifiedName = "Harryrry";
//        System.out.println(modifiedName.indexOf("yrry", 4)); // index at which r is 2

        // lastIndexOf starts from the last, moving from right to left.
//        System.out.println(modifiedName.lastIndexOf("rry", 4 ));


        //name equals
        System.out.println(name.equals("Harry"));


        // name equals with ignoreCase -  This will only match characters
        System.out.println(name.equalsIgnoreCase("HaRry"));

        // escape sequence

        System.out.println("I am escape sequence \n double quote");

    }
}
