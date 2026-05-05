package com.collectionpactice;

import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;

public class ConvertArrayVectorLinked

{
    public static void main(String[] args) 
    {

        //  Create ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        //  Transfer ArrayList → Vector
        Vector<String> vector = new Vector<>(arrayList);

        // Step 3: Transfer Vector → LinkedList
        LinkedList<String> linkedList = new LinkedList<>(vector);

        // Display all
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
        System.out.println("LinkedList: " + linkedList);
    }
}

