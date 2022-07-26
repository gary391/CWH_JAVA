package com.company;
import  java.util.Scanner;

// Exam answer sheet are class templates
// Each students fill the answer sheet and creates an object for a submission

public class CWH_05_TakingInput {
    // "psvm" and press tab after creating a class

    public static void main(String[] args) {
        //sout and press tab

        System.out.println("Taking Input from the User!");

        Scanner sc = new Scanner(System.in); // system.in read from the keyboard - It is a new object of scanner class.
//        System.out.println("Enter number 1");
//        int a = sc.nextInt(); // integer entered by keyboard will enter in a
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");

//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a+b;
//        float sum = a+b;

//        System.out.println("The sum of these numbers is");
//        System.out.println(sum);

        // Check if the number entered is an int or not
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

        // String support

//        String str = sc.next(); // Read only first word only
        String str1 = sc.nextLine(); // Reads the complete line
        System.out.println(str1);

      }
}