package com.company;

public class CWH_32_MethodOverLoading {


    // "Static" method telljokes in the class
    // Static associates the method of class to the class instead to the object of the class.
    // Static method in a class is shared by all the objects.
    // Hostel water cooler in the courtyard (Static) vs each room having a water cooler.
    // Void return type - Where you don't want to return anything.

    // In simple term, static method can be called without creating an object.

    static void telljokes (){
        System.out.printf("You can learn Java!!");
    }

    // method that takes an integer value an updates the value of a
    static void change(int a ){

        a = 98;
    }

    // Method takes an array as a parameter value.

    static void change2(int [] arr ){

        arr[0] = 98;
    }


    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning " +  a + " bro!");
    }

    // Here a & b are parameters, whereas the values that are
    // passing in for a and b are called arguments.
    static void foo(int a, int b ){
        System.out.println("Good Morning with two parameter " +  a + " bro!");
        System.out.println("Good Morning with two parameter " +  b + " bro!");
    }



    // Main method
    public static void main(String[] args) {
        // Since it's a static method you don't need to create an object

//        telljokes();



        // Case 1: Changing the integer
        // Here the value of x did not change based on the method(change) as the 'x' and
        // 'a' are separate copies and method is not returning any value.
//        int x = 45;
//        change(x);


//        System.out.println("The value of x after running changes is: " + x );

        // Case 2: Changing the Array

//        int [] marks = {52,73,81,94,82,90,76};

        // This stems from the concept of primitive and non-primitive data types
        // Here we are passing the address of the object i.e. reference of the array
        // in the change2 method, thus in the method (change2) arr is also referring
        // to the marks object.
        // This is similar to objects passing to a method --> Which is also passing the reference.

//        change2(marks);
//
//        System.out.println("The value of x after running changes is: " + marks[0]);


        // Method overloading //

        // Arguments are actual!!! Values

        // Return type should be same for method overloading
        // Adding parameter is ok for method overloading
        // Arguments are Actual!!!

        foo();
        foo(3000);
        foo(3000, 4000);


    }
}
