package com.company;

/*
Problem with array list - Inserting an element in the arraylist will
require moving the elements of the list which will be a heavy operation


For better deletion and insertion

LinkedList in Java - This uses independent objects (Value, reference of previous element,
and next element), whereas arrayList uses arrays.

- Each object will have previous element reference, value and next reference.
- When inserting an element in a linkedList, the old reference will be removed and
- new reference will be created between the two values in between which the new
- element is being added. This will reduce operation cost for not moving the
- entire data structure as in case of an array.

 */

import java.util.ArrayList;
import java.util.LinkedList;

public class CWH_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(16);
        ll1.add(26);
        ll1.add(36);
        ll.add(7);
        ll.add(4);
        ll.add(6);
        ll.add(6);
        ll.add(0 , 8);
        ll.addAll(ll1);
        ll.addFirst(777);
        ll.addLast(999);
//        al.clear();
        System.out.println("The size of the ArrayList: " + ll.size());
        System.out.println(ll.contains(316));
        System.out.println("Indexof: "+ll.indexOf(6));
        System.out.println("LastIndexof: "+ll.lastIndexOf(6));
        ll.set(1, 566);

        for (int i =0; i<ll.size(); i++){
            System.out.print(ll.get(i)); // print will print in a single line
            System.out.print(", ");
        }
    }
}
