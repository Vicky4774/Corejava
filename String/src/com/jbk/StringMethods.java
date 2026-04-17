package com.jbk;

public class StringMethods {

	public static void main(String[] args) 
	{
		String name="Vicky";	//Using Literal
		String surName="Latake";
		
		String fullName=name.concat(" "+surName);	//it is immutable means we can't change the value of the string.  it is stored in in the SCP(String Constant Pool)
		System.out.println(fullName);			
		System.out.println(fullName.charAt(2));
		System.out.println(fullName.codePointAt(2));
		System.out.println(fullName.toLowerCase());
		System.out.println(fullName.toUpperCase());
		System.out.println(name.hashCode());
		System.out.println(surName.hashCode());
		System.out.println(fullName.hashCode());
	}

}
