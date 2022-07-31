package com.company;

public class CWH_35_PracticeSetMethods {

//    static void multable(int a){
//        int result = 1;
//        for(int i=1;i<=10;i++){
//            result= a*i;
////            System.out.println(a+"x"+i+"="+result);
//            System.out.format("%d X %d = %d", a, i, a*i);
//            System.out.println();
//        }
//    }

//    static void starpattern (int a){
//        // This loop provides rows for the patterns
//        for(int i=1;i<=a;i++){
//
//            // This loop provides column of the patterns
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" * ");
//            }
//            System.out.println("  - IamNewLineCharacter");
//        }
//    }

//        static int sumRec(int a){
//
//            if (a==1){
//                return 1;
//            }else{
//                return a + sumRec(a-1);
//            }
//        }

//


//    static int fib(int n){
//
////        if(n==1){
////            return 0;
////        }else if (n==2){
////            return 1;
//
//        if (n==1 || n==2){
//            return n-1;
//        }else{
//            return (fib(n-1) + fib(n-2));
//        }
//    }


//    static void starpatternRec(int n){
//
//        // the initial condition that checks for value of n and will not execute if the condition is not met.
//
//        if(n>0){
//            starpatternRec(n-1);
//
//            for(int i = 0;i<n; i++) {
//                System.out.print("*");
//            }
//            System.out.println(" - IamANewLineCharacter");
//        }
//    }

    /*
    starpatternRec(3)
    starpatternRec(2) + 3 times star and new line
    starpatternRec(1) + 2 times star and new line + 3 times star and new line
    starpatternRec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    * */


    static void ReverseStarPatternRec(int n){

        if (n>0){

            for (int i=n;i>0;i--){

                System.out.print(i + "*"); // This will print the number of stars that are equal to n

            }

            System.out.println( "- IamNewLineCharacter");
            ReverseStarPatternRec(n-1);
        }

    }
        /*
            ReverseStarPatternRec(3) - * * *
            ReverseStarPatternRec(2) - * *
            ReverseStarPatternRec(1) - *
            ReverseStarPatternRec(0) - exit and will not be execute as the condition is not valid.
         */


    public static void main(String[] args) {

        // Problem 1 - Write a Java method t print table of a number n
//        multable(6);


        // Problem 2 - Write a program using function to print the following pattern:
        /*

        *
        * *
        * * *
        * * * *

         */
//        starpattern(8);

        // Problem 3: Write a recursive function to calculate sum of first n natural numbers
        // Natural number start at 1
        // sum(n) = 1 + 2+ 3 + ..+n
        // sum(n) = 1 + 2 + 3 + .. + n-1 +n
        // sum(n) = sum(n-1) + n

//        System.out.println(sumRec(8));

        // Problem 4 - Write a program using function to print the following pattern:
        /*

         * * * *
         * * *
         * *
         *

         */

//        invertStarP(8);


        // Problem 5: Fibonacci Series - 0,1,1,2,3,5,8,13,21,34
        // Find the nth term in the Fibonacci series using recursion.  - Here we assume the term start at 1
        // If we have an index we start at zero.

//        System.out.println(fib(7));

        // Problem 6: Write a function to find average of a set of numbers passed as arguments

//         myavg():

        // Problem 7: Repeat pattern using recursion

//        starpatternRec(4);


        // Problem 8: Repeat pattern using recursion

        ReverseStarPatternRec(3);

        // Problem 9: C to F
    }
}
