package com.company;

import java.util.Scanner;

public class CWH_82_NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[5];
//        System.out.println(marks);
        marks[0] = 7;
        marks[1] = 56;
        marks[3] = 6;
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to video no 82");
            try{
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
