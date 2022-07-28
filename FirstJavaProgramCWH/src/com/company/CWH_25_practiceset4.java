package com.company;

public class CWH_25_practiceset4 {
    public static void main(String[] args) {


        // Write a program to print a pattern
        /*
             ****
             ***
             **
             *
         */

//        int n = 4;
//        for (int i=n;i>0; i--) {
//            for (int j=0;j<i;j++){
//                System.out.print('*'); // Print the number of star based on the value of i one after the other
//            }
//                System.out.print("\n");
//        }

        // Practice problem 2
        // Write a program to sum first n even numbers using while loop

//        int sum = 0;
//        int n=4;
//        for (int i=0; i<n; i++){
//
//            sum = sum + (2*i);
//
//        }
//        System.out.println("Sum of even numbers: "+ sum);

        // Problem 3 - Write a program to print multiplication table of a given number

//        int num = 4;
//        for (int i=1; i<=10; i++){
//            System.out.println(num +"x"+i+"="+num*i);
//        }

        // Problem 4 - Write a program to print multiplication table of a given number in the reverse order
//        int num = 4;
//        for (int i=10; i>0; i--){
////            System.out.println(i);
//            System.out.println(num +"x"+i+"="+num*i);
//        }


        // Problem 5 - Factorial of a given number
        // 3! = 3*2*1
        //4! = 4*3*2*1 = 24

//        int sum = 1;
//        int n = 3;
//        for (int i=n;i>0;i--){
//
//            sum = sum * i;
//
//        }
//
//        System.out.println(sum);


        // Factorial of a given number using a while loop

//        int sum = 1;
//        int i = 4;
//        while(i>0){ // While loop will run up till when value of i is greater than 0
//            sum = sum * i; // Starting with the first value of i which in this case is 4
//            i--; // decrement operator.
//        }
//        System.out.println(sum);

        // Write a program to calculate the sum of the numbers occuring in the multiplication table of 8
        int sum = 0;
        int num = 8;
        for (int i=1; i<=10; i++){
//            System.out.println(num +"x"+i+"="+num*i);
            sum = sum + num*i;

        }
        System.out.print(sum);
    }
}
