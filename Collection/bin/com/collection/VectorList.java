package com.collection;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args)
	{
		Vector list=new Vector();		//using this list we can add any type of the data.
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add("ram");
		list.add('@');
		list.add(20.25f);
		
		System.out.println(list);
		
		
		Vector <Integer> list1=new <Integer> Vector();	// We are using the generics add the specific data to the list.
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		
		System.out.println(list1);
		

	}

}
