package com.collection;

import java.util.ArrayList;

public class SecondList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(24);
		list.add(56);
		list.add(55);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
