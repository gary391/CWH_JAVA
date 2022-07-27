package com.company;

public class CWH_22_dowhileloop {
    public static void main(String[] args) {
//        int a = 10;
//        while (a<5){ // this will start from a = 0 and run till a less then 5.
//            System.out.println(a);
//            a++;
//        }

        // Do while loop


//        int b = 0;
//        do {
//            System.out.println(b);
//            b++;
//        }while (b<5);

        int b = 10; // Here it will execute at least once and print 10,
        do {
            System.out.println(b);
            b++;
        }while (b<5); // Note this semicolon

        // Write a small program to print first 100 natural numbers

        int num = 1;
        do {
            System.out.println(num);
            num++;

        }while(num<101);
    }
}
