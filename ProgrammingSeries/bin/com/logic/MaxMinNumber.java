package com.logic;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args)
	{
		int a,b;
		System.out.println("Enter Two Number : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("Max No :"+a);
		}
		else
		{
			System.out.println("Min No :"+b);
		}

	}

}
