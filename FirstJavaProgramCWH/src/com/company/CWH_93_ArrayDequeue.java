package com.company;

import java.util.ArrayDeque;

/*
ArrayDequeue - Internally AD will create an array internally
Dequeue  - Double ended Queue - Insertion and deletion can happen from
any end.
 */
public class CWH_93_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();

        ad.add(6);
        ad.add(56);
        ad.add(9);
        ad.addFirst(5);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

    }
}
