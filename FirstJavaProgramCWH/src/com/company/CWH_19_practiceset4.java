package com.company;

import java.util.Scanner;

public class CWH_19_practiceset4 {
    public static void main(String[] args) {

        // Problem 1
//        int a = 10;
//        if (a==11){
//            System.out.println("I am 11");
//        }else{
//            System.out.println("I am not 11 ");
//        }

        // Problem 2

        /*
        Write a program to find out weather a student is pass or fail; if it requires total
        40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input
        from the user.
        */
//        System.out.println("Taking input from the users");
//        Scanner sc = new Scanner(System.in); // new object of the scanner class - System.in implies input from the key board
//        System.out.println("Enter your marks in Hindi: ");
//        float a = sc.nextFloat();
////        if (a>=33) {
////            System.out.println(a);
////        }
//        System.out.println("Enter your marks in English: ");
//        float b = sc.nextFloat();
////        if(b>=33) {
////            System.out.println(b);
////        }
//        System.out.println("Enter your marks in Math: ");
//        float c = sc.nextFloat();
////        if (c>=33){
////            System.out.println(c);
////        }
//
//        float precnt = (a+b+c)/3.0f;
//        System.out.println("The percentage of the subjects is " + precnt);
//        if (precnt >=40 && a>=33 && b>=33&& c>=33){
//            System.out.println("Promoted!");
//        }else{
//            System.out.println("Not Promoted!");
//        }


        // Problem 3 Calculate income based on the income and corresponding slabs:
//        System.out.println("Please enter your income: ");
//        Scanner sc = new Scanner(System.in);
//        float income = sc.nextFloat();
//        float tax = 0; // Initial income tax
////        float income = 3.3f;
//        if (income <=2.5){
//            tax = tax + 0;
//        }
//        else if (income>2.5f && income <5.0f){
//            tax = tax + 0.05f* (income - 2.5f);
//        }
//        else if (income>=5f && income <10f){
//            tax = tax+ +0.05f* (5.0f - 2.5f);
//            tax = tax +0.2f* (income - 5f);
//        }else if (income >= 10){
//            tax = tax+ +0.05f* (5f - 2.5f);
//            tax = tax+ +0.2f* (10.0f - 5.0f);
//            tax = tax + 0.3f*(income -10.0f);
//        }
//
//        System.out.println("The total income tax paid by the employee is " + tax);


        // Problem 4 print the day of the week corresponding to inputs 1-7
//        System.out.println("Please enter which day you want me to print");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();

//        int day = 2;
//        switch (day){
//            case 1:
//                System.out.printf("Monday");
//                break;
//            case 2:
//                System.out.printf("Tuesday");
//                break;
//            case 3:
//                System.out.printf("Wednesday");
//                break;
//            case 4:
//                System.out.printf("Thursday");
//                break;
//            case 5:
//                System.out.printf("Friday");
//                break;
//            case 6:
//                System.out.printf("Saturday");
//                break;
//            case 7:
//                System.out.printf("Sunday");
//                break;
//        }

        // Problem 6 Identify the top level domain in the url
        System.out.println("Please enter a URL:");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if (website.endsWith(".org")){
            System.out.printf("This is an organizational website");
        }else if (website.endsWith(".com")){
            System.out.printf("This is a commercial website");
        }else if (website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }






    }
}
