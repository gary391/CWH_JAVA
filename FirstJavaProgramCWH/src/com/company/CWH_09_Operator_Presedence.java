package com.company;

public class CWH_09_Operator_Presedence {
    public static void main(String[] args) {
//        int a = 6*5-34/2;
        /*

        =30-34/2
        =30-17
        =13
        */
//        System.out.println(a);
//
//        int b = 60/5-34*2;

        /*
         precedence between * and / same
         so here associativity is left to right which will come into picture where
         the operator have the same precedence.

         = 12-34*2
         = 12-68
         = -56
        */

//        System.out.println(b);

        // Precedence & Associativity
        // Which is bigger (Precedence)
        // ++, == right to lift associativity

        // Quick Quiz

        int x = 5;
        int y = 6;
        int k = x*y /2;
        System.out.println(k);

    }
}
