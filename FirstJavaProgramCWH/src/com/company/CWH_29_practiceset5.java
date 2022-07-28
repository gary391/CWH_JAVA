package com.company;

public class CWH_29_practiceset5 {
    public static void main(String[] args) {

        // Practice set for arrays

        // Question 1 - Create an array of 5 floats and calculate their sum

        float[] marks = {10.1f, 20.2f, 30.3f, 40.4f, 50.5f};
//        float sum = 0.0f;
//        for(int i=0;i<marks.length;i++){
//            sum = sum + marks[i];
//        }
//        System.out.println(sum);

        // Question 2 - find out if an element is in the array or not?


//        float num = 10.1f;
//        boolean isInArray = false;
//        for (int i = 0; i < marks.length; i++) {
//
//            if (marks[i] == num) {
//                isInArray = true; // This condition will only come true as soon as an element is found.
//                break;  // As we don't need to check any further
//            }
//        }
//        if(isInArray){
//            System.out.println(num + " is present in the array!");
//        }else{
//            System.out.println("Number not found!!");
//        }


        // Question 3 - Calculate the average marks from a array containing marks of all students in Physics using
        // for each loop.
        float sum = 0.0f;
        System.out.println("Printing using for-each loop all elements in marks array ");
        for (float element: marks) {
//            System.out.println(element);
            sum = sum + element;
        }
        System.out.println("The Aveage is " + sum/marks.length);
    }
}