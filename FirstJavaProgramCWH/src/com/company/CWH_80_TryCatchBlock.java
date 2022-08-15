package com.company;
// Exceptions in Java
/*
Checked and unchecked exception
 */

public class CWH_80_TryCatchBlock {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // Add the code that you would like to execute.
        try {
            int c = a / b;
            System.out.println("The result is "+ c);
        }
        // This block of code is executed when there is an exception.
        // Exception is a class, and the exception that occurs is an object of that class
        // Here e can be considered as a function argument
        catch (Exception e){
            System.out.println("We failed to divide. Reason: "+ e);
//            System.out.println(e);
        }
        System.out.println("End of Program!");
    }
}
