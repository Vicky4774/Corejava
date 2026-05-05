package com.collection;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(15);
        list.add(85);
        list.add(56);
        list.add(49);
        list.add(37);

        Collections.sort(list);

        System.out.println("Sorted list : "+list);
    }
}