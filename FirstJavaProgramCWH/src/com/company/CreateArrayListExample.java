package com.company;

import java.util.ArrayList;
import java.util.List;


public class CreateArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();
//        List<String> animal = {""};


        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);
        System.out.println(animals.contains("Lion"));
//        if (animals.contains("Lion")){
//            System.out.println();
//        }

    }
}
