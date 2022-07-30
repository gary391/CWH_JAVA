package com.company;

public class CWH_33_varargs {


//    static int sum(int a, int b){
//        return  a+b;
//    }
//
//    static int sum(int a, int b, int c){
//        return  a+b+c;
//    }

    // ...
    // int x make it complusory
    public static int sum (int x, int ...arr){
        int result=x;
        for (int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorials");

        // Passing multiple argument to a function
        System.out.println(sum(3));
        System.out.println(sum(1));

        System.out.println("The sum of 4 and 5 is: "+sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is: "+sum(4,3,5));
        System.out.println("The sum of 4, 3, 5 and 18 is: "+sum(4,3,5, 18));
    }
}
