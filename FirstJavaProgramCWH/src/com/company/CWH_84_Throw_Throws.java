package com.company;

public class CWH_84_Throw_Throws {

//    public static double area(int r){
//        float result = (float) (Math.PI * r * r);
//
//    }



    public static int divide(int a, int b) throws  ArithmeticException{
//    public static int divide(int a, int b){
        // Made by Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6, 0);
            System.out.println(c);
        }catch (Exception e) {
            System.out.println("Exception!");

        }
    }
}
