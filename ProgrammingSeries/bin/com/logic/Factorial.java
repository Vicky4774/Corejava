package com.logic;

public class Factorial {

	public static void main(String[] args) 
	{
		int fact=1;
		for(int i=1;i<=5;i++)	//1*2*3*4*5=120
		{
			fact=fact*i;
			
		}
		System.out.println("The Factorial Of Number : " +fact);

	}

}
