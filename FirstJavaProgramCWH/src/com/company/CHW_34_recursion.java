package com.company;

public class CHW_34_recursion {

    static int factorial (int n){

        // factorial(0) = 1

        // factorial (n) = n * n-1 * ...1
        // factorial (5) = 5 * 4 * 3 * 2 * 1 = 120
        // factorial (n) = n * factorial(n-1) - Condition n should be >= 1

        // Function in java can call itself such calling of function is called recursion.

        if (n==0 || n ==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        // considering basic case where n == 0, n==1
        if (n==0 || n ==1){
            return 1;
        }else{
            int prod = 1;
            for (int i=1;i<=n; i++){
//                System.out.println(i);
                prod = prod * i;

            }
            return prod;
        }
    }

    public static void main(String[] args) {

        System.out.println("The value of factorial is: " + factorial(1));
        System.out.println("The value of factorial using iterative approach is: " + factorial_iterative(1));


        // Print Fibonacci Numbers in Java

    }
}
