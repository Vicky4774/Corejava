package com.collectionpactice;

import java.util.ArrayList;
import java.util.Vector;

public class ConvertArray {

	public static void main(String[] args) {
		 Vector<String> v = new Vector<>();
	        v.add("Java");
	        v.add("Python");
	        v.add("C++");
	    
	        ArrayList<String> list =  new ArrayList<String>(v);
	        System.out.println("ArrayList Element :- " + list);
	        

	}

}