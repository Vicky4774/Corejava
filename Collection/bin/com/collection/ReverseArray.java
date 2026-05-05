package com.collection;
import java.util.*;

public class ReverseArray 
{
	public static void main(String[] args) 
	    {
	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(45);
	        list.add(79);
	        list.add(32);
	        list.add(9);
	        list.add(99);
	        list.add(24);

	       Collections.reverse(list);

	        System.out.println(list);
	        System.out.println(list.contains(9));	//It will check the the element is present or not If present then print true.
	        System.out.println(list.remove(3));	//It will remove the element from the list.
	        System.out.println(list);
	    }
	}