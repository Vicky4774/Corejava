package com.collectionpactice;


import java.util.LinkedList;

public class LinkedAdd {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(34);
		list.add(78);
		list.add(58);
		list.add(53);
		System.out.print("linkedList Number :- ");
		for (Integer add : list) {
			System.out.print(add + " ");
		}
		System.out.println("");
		System.out.println("----------------");
		
		// search First and Last element
		LinkedList<String> l = new LinkedList<String>();
	      l.add("Java");
	      l.add("HTML");
	      l.add("CSS");
	      l.add("JS");
	      l.add("Python");
	      l.add("NodeJs");
           

	      String first = l.getFirst();
	      String last = l.getLast();
	     System.out.println("List :- " + l);
	      System.out.println("First Element :- " + first);
	      System.out.println("Last Element :- " + last);
	}

}
