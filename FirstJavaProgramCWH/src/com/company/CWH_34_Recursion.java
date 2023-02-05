package com.company;

public class CWH_34_Recursion {
    static int factorial(int n){
        // factorial (n) = n * n-1*....1
        // factorial (5) = 5*4*3*2*1 =120
        // factorial (n) = n*(n-1)! where the value of n is greater than 1.
        // factorial 0 = 1 & factorial 1 =1
        if(n==0 || n==1){
            return 1;
        }else {
            return n* factorial(n-1);
        }


    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("The factorial of "+x+" is: "+factorial(4));

    }
}
