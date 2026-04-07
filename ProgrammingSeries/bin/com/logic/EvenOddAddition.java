package com.logic;

import java.util.Scanner;

public class EvenOddAddition {

	public static void main(String[] args) 
	{
		int num,sum=0;
		
		System.out.println("Enter the Range :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num%2==0)
		{
			for(int i=0;i<=num;i=i+2)
			{
				sum=sum+i;
				
			}
			
			System.out.println("The Sum Of Even Number :"+sum);
		}
		else
		{
			for(int j=1;j<=num;j=j+2)
			{
				sum=sum+j;
			}
			
			System.out.println("The Sum Of Odd Number :"+sum);
		}
		

	}

}
