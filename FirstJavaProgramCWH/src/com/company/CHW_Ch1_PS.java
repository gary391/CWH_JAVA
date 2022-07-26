package com.company;
import java.util.Scanner;

public class CHW_Ch1_PS {
    public static void main(String[] args) {
        // Question 1
//        int a = 5;
//        int b = 10;
//        int c = 30;
//        int sum = a+b+c;
//        System.out.println(sum);

        //Question 2
        // ctrl d to replicate subsequent line

//        float subject1 = 45;
//        float subject2 = 95;
//        float subject3 = 48;
//        float cgpa = (subject1 + subject2 +subject3)/30; // result will be int, also the operation is being done using
//        // integer if we store the value in float, that will also not help.
//        System.out.println(cgpa);

        // Question 3
//        System.out.println("Please enter your Name: ");
//        Scanner sc = new Scanner(System.in);
//
//        String name = sc.next(); // String support
//
//        System.out.println("Hello "+name+", How are doing today?");

        // Question 5 - Check if the number entered is an integer or not ?
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
