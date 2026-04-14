package com.key;

public class Demo extends Keyword{

	
	public Demo()
	{
		System.out.println("This is Demo class Constructor..");
	}
	static
	{
		System.out.println("This is static block of Demo class");
	}
	{
		System.out.println("This is  Non- static block of Demo class");
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("-----------------------");
		//System.out.println(Keyword.collageName);
		Keyword d=new Demo();
		//System.out.println(Keyword.collageName);


	}

}
