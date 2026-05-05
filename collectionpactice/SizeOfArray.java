package com.collectionpactice;

import java.util.ArrayList;

public class SizeOfArray {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
        s.add("Java");
        s.add("Python");
        s.add("Js");
        s.add("NodeJs");
        s.add("HTML");
        int size = s.size();
        
        System.out.println("Array Element :- " + s);
        System.out.println("Array Size :- " + size);
	}

}
