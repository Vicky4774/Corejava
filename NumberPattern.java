package com.starPattern;

public class NumberPattern {

	public static void main(String[] args) 
	{
		
//			
//			1
//			01
//			101
//			0101
//			10101

		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(" " +i);
			}
			System.out.println("");
		}

	

	}
}
