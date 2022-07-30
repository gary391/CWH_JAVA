package com.company;

public class CWH_31_methods {
    // method
    // Use of static method is important as you can call only static method in the main method.

    // If we remove static then each object that is created from this class will have a method named logic
    // Thus, we will have to create an object to call this method and we can't directly call this method in the class.

    static int logic(int x, int y){
//    int logic(int x, int y){

        int z;
        if (x>y){
            z = x+y;
        }else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
        // Method invocation using object creation
//        CWH_31_methods obj = new CWH_31_methods();
//        c = obj.logic(a,b);
        c = logic(a,b);

        System.out.println(c);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(a1+ " and "+b1);

        System.out.println(c1);
    }
}
