package com.company;

public class CWH_15_practice {
    public static void main(String[] args) {


        // Problem 1 - Convert the string in a lower case

//        String name = "Jack Parker";
//        String named = name.toLowerCase(); // where we can either use same name or new string
//        System.out.println(named);


        // Problem 2 Replace the blank spaces with undescore

//        String text = "To Lower Case";
//        text = text.replace(" ", "_"); // This is a new string
//        System.out.println(text);


        // Problem 3 update a format
//        String letter = "Dear <|name|>, Thanks a lot!";
//        letter = letter.replace("<|name|>", "Harry");
//        System.out.println(letter);

        // Problem 4 - Detect double or triple spaces in the string.
//
//        String myString = "This string contains  double and   triple spaces";
//        System.out.println(myString.indexOf("  ")); // If the value is -1 implies that there is a double space in the string.
//        System.out.println(myString.indexOf("   "));


        // Problem 5 - Write a program to format the following letter using escape sequence characters.
        // letter = "Dear Harry, this Java course is nice. thanks"

        String myLetter = "Dear Harry, \n\tThis Java course is nice. \n\nThanks";
        System.out.println(myLetter);

    }
}
