package com.collection;

import java.util.LinkedList;

public class MyList {

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();		// Any type off the data will be added.
		list.add(12345);
		list.add("Ram");
		list.add(12.56f);
		list.add(122345678987654l);
		list.add('#');
		list.add(true);
		list.add("Shyam");
		list.add(true);

		System.out.println(list);
		
		LinkedList <String> list1 = new  <String>LinkedList();	//only specific data are added.		using Generics
		
		list1.add("Ram");
		list1.add("Sham");
		list1.add("Saurabh");
		list1.add("Onkar");
		list1.add("Ganesh");
		list1.add("Sita");
		

		System.out.println(list1);

	}

}
