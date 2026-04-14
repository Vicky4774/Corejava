package com.scanner;

import java.util.Scanner;

public class FactorialUser {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial Of "+ num + " : " + fact);
	}

}
