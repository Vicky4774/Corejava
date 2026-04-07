package com.logic;

import java.util.Scanner;

public class EvenNumberInList {

	public static void main(String[] args)
	{
		int num;
		
		System.out.println("Enter a Term");
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		
		for(int i=0;i<=num;i=i+2)	//When we are find out the odd number then i=1 initialize the value.
		{
			
			System.out.println("Even Number : "+i);
			
		}

	}

}
