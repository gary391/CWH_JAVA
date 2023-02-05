package com.company;

import java.util.Scanner;
/*
Handling specific exception

 */
public class CWH_81_ExceptionHandling {
    public static void main(String[] args) {
        int [] marks = new int[5];
//        System.out.println(marks);
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with:");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is "+ marks[ind] );
            System.out.println("The value at array-value/number is: "+ marks[ind]/number);
        }
        catch (ArithmeticException e){ // Handles exceptions of the type ArthmeticException
            System.out.println("Some ArithmeticException exception occured!");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){ // Handles exception of type ArrayIndexOutOfBound
            System.out.println("Some ArrayIndexOutOfBoundsException exception occured!");
            System.out.println(e);
        }catch (Exception e){ // Handles rest of the exception.
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }

    }
}
