package com.company;

import java.util.Scanner;

/*
We can write our own custom Exception using Exception class in Java
part of Java.lang.


 */
class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}
public class CWH_83_ExceptionsClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        if(a<9){
            try {
                throw new MyException(); // Throwing a custom exception here
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished!");
            }
        }

    }
}
