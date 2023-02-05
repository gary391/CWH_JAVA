package com.company;

import java.util.Scanner;
/*
Nested try catch block
 */
public class CWH_82_NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[5];
//        System.out.println(marks);
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.print("Enter an Index: ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println("Index Value: " + marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist: " + e);
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks you for using this program");
    }
}
