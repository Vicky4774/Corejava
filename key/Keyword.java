package com.key;

public class Keyword 
{
	public static String collageName="FTC";
	
	static
	{
		System.out.println("This is static block of keyword class..");
	}
	static
	{
		System.out.println("This is static block 2 of keyword class..");
	}
	
	{
		System.out.println("This is non-static block of keyword class..");
	}
	public Keyword()
	{
		System.out.println("This is Keyword class Construtor...");
	}

//	public static void main(String[] args) 
//	{
//		System.out.println(collageName);
//		//System.out.println("Hiii");
//		//Keyword k=new Keyword();
//				
//
//	}

}
