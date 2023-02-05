package com.company;

import java.util.Scanner;

public class CWH_79_ErrorsDemo {
    public static void main(String[] args) {
        // Logical error demo
        // Write a program to print all prime numbers between 1 to 10.
        // A number is prime by one 1 and itself -  The number is not divisble by more than itself
//        System.out.println(2);
//        boolean isPrimeNumber = false;

        // Print numbers between 1 to 10
        for (int i = 2; i < 21; i++) {
//            System.out.println("Outer loop: "+i);
            int counter = 0;
            for(int j =1; j<=i; j++){
//                System.out.println(i+"%"+j);
                if(i%j==0){
                    counter = counter +1;

                }
//                System.out.println(counter);
            }

            if(counter == 2)
                System.out.println(i + " Prime number");
//            else
//                System.out.println(i + " Not Prime number");
        }


        // Runtime error
//        int k;
//        System.out.println("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        k = sc.nextInt();
//        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
//    }
    }
    }