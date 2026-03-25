package com.method;

public class EvenOdd 
{
	
	public String evenOdd()
	{
		int num=10;
		
		if(num%2==0)
		{
			//System.out.println("Even Number "+num);
			return "The Number Is Even " + num;		
		}
		else
		{
			//System.out.println("Odd Number "+num);  //we don't write any return type.
			//return num;							// we need write return type based on the variable type.
			return "The Number Is Even " + num;	//we write a return type as a String because we are giving in the String.
		}
	}
	
	public static void main(String[] args)
	{
		EvenOdd ed=new EvenOdd();
	//	ed.evenOdd();			//we don't write any return type
		
		String res=ed.evenOdd();
		System.out.println(res);
		
		
	}
}
