package com.company;

public class CWH_29_practiceset5 {
    public static void main(String[] args) {

        // Practice set for arrays

        // Question 1 - Create an array of 5 floats and calculate their sum

        float[] marks = {10.1f, 20.2f, 30.3f, 40.4f, 50.5f};
//        float sum = 0.0f;
//        for(int i=0;i<marks.length;i++){
//            sum = sum + marks[i];
//        }
//        System.out.println(sum);

        // Question 2 - find out if an element is in the array or not?


//        float num = 10.1f;
//        boolean isInArray = false;
//        for (int i = 0; i < marks.length; i++) {
//
//            if (marks[i] == num) {
//                isInArray = true; // This condition will only come true as soon as an element is found.
//                break;  // As we don't need to check any further
//            }
//        }
//        if(isInArray){
//            System.out.println(num + " is present in the array!");
//        }else{
//            System.out.println("Number not found!!");
//        }


        // Question 3 - Calculate the average marks from a array containing marks of all students in Physics using
        // for each loop.
//        float sum = 0.0f;
//        System.out.println("Printing using for-each loop all elements in marks array ");
//        for (float element: marks) {
//            System.out.println(element);
//            sum = sum + element;
//        }
//        System.out.println("The Average is " + sum/marks.length);

        // Problem 4 - Adding two matrix
        // Pre-requsite the matrix should be of the same length

//            int [][] mat1 = {{11,12,13},
//                             {14,15,16}};
//            int [][] mat2 = {{13,12,11},
//                            {16,15,14}};
//            int [][] result = {{0,0,0},
//                             {0,0,0}};
//
//            for (int i=0; i<mat1.length;i++){ // row number of times - 2
////                System.out.println(mat1[i].length);
//                for(int j=0; j<mat1[i].length;j++){ // column number of times
//
////                    System.out.format("Setting value for i=%d and j=%d\n", i, j);
//                    result[i][j] = mat1[i][j] + mat2[i][j];
//                    System.out.print(result[i][j] + " ");
//
//                }
//                System.out.println(); // Prints a new line
//        }


            // Problem 5 - Reverse an array

            /* Length of an array = l
            Mid point of an array = Greatest integer of l/2 using Math.floorDiv(5,2)
            Replacing elements of an array a[i] with a[l-i-1]
            loop till the mid point of an array

           7 9 12 11 --> 11 12 9 7

           1 2 3 4 5 --> 5 4 3 2 1

             */

//            int[]arr = {10,20,30,40,50};
//
//            // Greatest integer value of 5,2 is 2
//            // to calculate the mid point
//            int l = arr.length;
//            int mid = Math.floorDiv(l,2);
////            System.out.println(mid);
//            int temp; // Temp element
//            for (int i=0; i<mid;i++){
//                // Swap a[i] and a[l-i-1]
//
//                // [4] [3] [](temp)
//                // [3] []  [4](temp)
//                // [3] [4] [](temp)
//
//
//                temp = arr[i];
//                arr[i] = arr[l-i-1];
//                arr[l-i-1] = temp;
//            }
//            for(int element: arr){
//                System.out.print(element+ " ");
//            }

//        // Problem 6 - Find a maximum value in an array
//
//        int[]arr = {102,220,30,405,550};
//        int max = 0;
//        int max = Integer.MIN_VALUE // to support min value
//        for (int element: arr){
//            // If the element is greater than max replace max
//            if (element>max){
//                max = element;
//            }
//        }
//        System.out.println("The maxi value element in this array is: " + max);

        // Problem 7 - Find a minimum value in an array

        /*
        Maximum and Minimum value of an integer

        System.out.println(Integer.MAX_VALUE); 2147483648
        System.out.println(Integer.MIN_VALUE); -2147483648
        */
//        int[]arr = {102,3,220,30,1,405,550};
//        int min = Integer.MAX_VALUE;
//        for (int element: arr){ // Here each element of the array is being compared one by one with next element
//            if (element<min){
////                System.out.println();
//                min = element;
//            }
//        }
//        System.out.println(min);

        // Problem 8 - Find a if a array is sorted or not ?

        /*
         For a sort array - First element should always be smaller than the next element of the array

         */
        boolean isSorted = true;
        int[]arr = {102,3,220,30,1,405,550};
//        int[]arr = {1,2,3,4,5,5,6,6};
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }

        }
    if (isSorted){
        System.out.println("Sorted Array!");
    }else{
        System.out.println("Not a sorted Array!");
    }
    }
}