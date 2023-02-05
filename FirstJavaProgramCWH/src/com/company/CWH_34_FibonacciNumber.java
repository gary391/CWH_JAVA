package com.company;

public class CWH_34_FibonacciNumber {

    public static int fibonacciNumber(int n){
        //Fibonacci Number: 0,1,1,2,3,5,8,13,21,34
//        System.out.println("Enter a value of :");
//        System.in.read();

    int fib_ser;
    if(n==1){
        fib_ser =0;
    } else if (n==2) {
        fib_ser =1;
    }else
        fib_ser = fibonacciNumber(n-2)+ fibonacciNumber(n-1);
        return fib_ser;
    }


    public static void main(String[] args) {
        System.out.println("The 7th element of a fibonacci series is: "+ fibonacciNumber(7));

    }
}
