package com.company;

public class CWH_10_resultingdatatype {
    public static void main(String[] args) {

//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a = y +z;
//        float b = 6.54f + x;
//        System.out.println(b);

        // Increment and decrement operators

//        int i =56;
////        System.out.println(i++); // i++ use i first and then increment
////        System.out.println(i);
////        System.out.println(++i); // first increment i then use i
////        System.out.println(i);

        // Quick quiz

        int y = 7;
        int x = ++y*8; // Here ++ take more precedence then *
        System.out.println(x); // 64

        char ch = 'b'; // Using uni code increment
        ch++; // This will increment the character to the next character value
        System.out.println(ch);

    }
}
