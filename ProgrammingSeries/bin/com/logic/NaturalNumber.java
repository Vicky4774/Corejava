package com.logic;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) 
	{
		int num;
		
		System.out.println("Enter a Number :");
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(i +" ");
		}
	}

}
