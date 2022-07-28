package com.company;

public class CWH_24_meraContinue {
    public static void main(String[] args) {
        // continue using loop!

//        for (int i=0; i<5;i++) {
//            if (i == 2) {
//                System.out.println("Skipping the loop for "+ i + " Iteration");
//                continue; // Continue allows for skipping the iteration here it will skip 2
//
//            }
//            System.out.println(i);
//            System.out.println("Java is great!");
//        }

        // while loop
//        int i=0;
//        while  (i<5){
//            System.out.println(i);
//            System.out.println("Java is great!");
//
//            // If block with break condition
//            if (i==2) {
//                System.out.println("Ending the loop");
//                break; // Here the break statement exits the loop
//            }
//            i++;
//        }

        // do while loop

        int i=0;
        do{
//            i++;
            // If block with  condition
            if (i==2) {
                System.out.println("Skipping the loop for "+ i + " Iteration");
                continue; //  Continue allows for skipping the iteration here it will skip 2

            }
//            i++;
            System.out.println(i);
            System.out.println("Java is great!");

        }while(i<5);
        System.out.printf("Loops ends here!");



    }
}
