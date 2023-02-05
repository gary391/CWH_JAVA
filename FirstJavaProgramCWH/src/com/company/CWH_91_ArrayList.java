package com.company;


import java.util.ArrayList;

public class CWH_91_ArrayList {
    public static void main(String[] args) {
        // Modified array
        // Resize of array
        // Generic syntax - ArrayList is of integer type.
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(16);
        al1.add(26);
        al1.add(36);
        al.add(7);
        al.add(4);
        al.add(6);
        al.add(6);
        al.add(0 , 8);
        al.addAll(al1);
//        al.clear();
        System.out.println("The size of the ArrayList: " + al.size());
        System.out.println(al.contains(316));
        System.out.println("Indexof: "+al.indexOf(6));
        System.out.println("LastIndexof: "+al.lastIndexOf(6));
        al.set(1, 566);

        for (int i =0; i<al.size(); i++){
            System.out.print(al.get(i)); // print will print in a single line
            System.out.print(", ");
        }
    }

}
