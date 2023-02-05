package com.company;

import java.util.HashSet;

public class CWH_95_HashSet {
    public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet(5, 0.5f);
    hs.add(6);
    hs.add(8);
    hs.add(3);
    hs.add(3);
    System.out.println(hs.contains(6));
    }
}
