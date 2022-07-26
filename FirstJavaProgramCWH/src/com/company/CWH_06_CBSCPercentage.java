package com.company;
import  java.util.Scanner;

public class CWH_06_CBSCPercentage {
    public static void main(String[] args) {

        System.out.println("Taking input from the users");
        Scanner sc = new Scanner(System.in); // new object of the scanner class - System.in implies input from the key board
        System.out.println("Enter your marks in Hindi: ");
        float a = sc.nextFloat();
        System.out.println("Enter your marks in English: ");
        float b = sc.nextFloat();
        System.out.println("Enter your marks in Math: ");
        float c = sc.nextFloat();
        System.out.println("Enter your marks in Science: ");
        float d = sc.nextFloat();
        System.out.println("Enter your marks in Social Science: ");
        float e = sc.nextFloat();
        float precnt = (a+b+c+d+e)/5;
        System.out.println("The percentage of the subjects is");
        System.out.println(precnt);

    }
}
