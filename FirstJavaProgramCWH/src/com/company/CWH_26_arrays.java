package com.company;

public class CWH_26_arrays {
    public static void main(String[] args) {
        // Classroom for 500 students - You have to store marks of these 500 students
        /*
        You have two options:
        1. create a 500 variable
        2. use array (recommended)
        * */
        // 1. Declaration and memory allocation in the same line

//        int[]marks;  // this creates a array of type int named "marks"

//        int[] marks = new int[5]; // Here we are creating a array and allocating memory to the array, which in our case
                                  // value of 5

        // 2. Another way to create a array Declaration and memory allocation in separate lines
//        int[] marks;
//        marks = new int[5];
//
//        // Initialization
//        marks[0]=100;
//        marks[1]=10;
//        marks[2]=20;
//        marks[3]=45;
//        marks[4]=86;

//        System.out.println(marks[5]); // This will through an array
        // 3. Declaration, memory allocation and initialization together
        int[]marks = {10,20,30,40,50};


        System.out.println(marks[4]);


    }
}
