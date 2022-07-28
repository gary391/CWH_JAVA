package com.company;

public class CWH_27_arrayMethods {
    public static void main(String[] args) {
//        float[]marks = {10f,20f,30f,40f,50f};
//              String [] student = {"Harry", "Rohan", "Deepa", "minku"};
//        System.out.println(student.length);
//        System.out.println(student[0]);
//
        int[]marks = {10,20,30,40,50};

//        System.out.println(marks[0]);
//        System.out.println(marks.length);

    // Display of array using a for loop

//        for (int i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }

        // Display an array in decrimenting loop or reverse order
        System.out.println("Printing using for loop in reverse order");
        for (int i=marks.length-1;i>=0;i--){
//            System.out.println(i);
            System.out.println(marks[i]);
        }


        // for each loop: for each element in marks array print each element
        // Here value of i is not available here, and we only have elements

        System.out.println("Printing using for-each loop ");
        for (int element: marks){
            System.out.println(element);
        }

    }
}
