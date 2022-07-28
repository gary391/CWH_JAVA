package com.company;

public class CWH_28_MultiDimArray {
    public static void main(String[] args) {
        // Multi Dimensional Array
        // Where each element in an array is also an array

        int[] marks; // 1-D array
        int[][] flats; // 2-D array
        flats = new int[2][3]; // 2 rows and 3 column - two floors and three homes on each floor.

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)

        System.out.println("Printing a 2-D array using for loop!");
//        System.out.println(flats.length);
        for (int i=0;i<flats.length;i++){
//            System.out.println(i);
//            System.out.println(flats[i].length); // Length of each array i.e. row!
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.printf(" ");
            }
            System.out.println(""); // This will add a new line
        }

        // Three dimensional array
        // String [][][] arr = new String [2][3][4];
        // Here each element in itself is an array
    }
}