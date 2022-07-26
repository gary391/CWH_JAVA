package com.company; // A package in Java is used to group related classes. Think of it as a folder in a file directory.

public class Main { // Name of the class is main so is the name of the file.

    // The main method is the entry point into the application.
    // Here void implies that there is no return value
    // Here public is access modifier, this class method can be access from anywhere.
    // static allows us to run the function of the class with out creating an object of the class.
    // In you want to disassociate a function from the class object, and can remain as an independent function.
    // and reside inside the class we use static method.

    public static void main(String[] args) {
	// write your code here
//        System.out.println("The sum of these number is: "); // println will add a new line
        System.out.print("The sum of these number is: ");
        int num1 = 6;
        int num2 = 8;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}

// add two number
// PascalNamingConvention - AddTwoNumber For naming classes
// Camel Case Naming Convention - addTwoNumber for naming functions


/*
function - group of code that does something
- Similar to cookie cutter
- Plumber

Classes - Collect of similar function
- HouseHold repair - Plumber, cook, painter

Classes is a template or blue print to make new objects



*/