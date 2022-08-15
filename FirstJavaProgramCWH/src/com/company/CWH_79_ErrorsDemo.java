package com.company;

import java.util.Scanner;

public class CWH_79_ErrorsDemo {
    public static void main(String[] args) {
        // Logical error demo
        // Write a program to print all prime numbers between 1 to 10.
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1); // logical error - This will give you a odd numbers instead of prime numbers
        }
        // Runtime error
        int k;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}
