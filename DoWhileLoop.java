package com.loops;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
//		Print numbers from 1 to 10 using a loop.
		
		int i=1;
		
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);
		System.out.println("--------------------------------------");
		
//		Print numbers from 10 to 1.
		
		int no=10;
		
		do
		{
			System.out.println(no);
			no--;
		}
		while(no>=1);
		System.out.println("--------------------------------------");
		
//		Print all even numbers between 1 and 50.
		
		int numbr=1;
		
		do
		{
			if(numbr%2==0)
			{
				System.out.println(" Even Number "+ numbr);
			}
			numbr++;
		}
		while (numbr<=50);
		System.out.println("----------------------------------------");
		
//		Print all odd numbers between 1 and 50.
		
		int number=1;
		
		do
		{
			if(number%2==1)
			{
				System.out.println(" Odd Number "+ number);
			}
			number++;
		}
		while (number<=50);
		
		
		System.out.println("----------------------------");
		
//		Print the table of 5 using a loop.
		
		int num=1;
		
		do
		{
			System.out.println(num*5);
			num++;
		}
		while(num<=10);
		System.out.println("----------------------------");
//		Print the table of any number (e.g., n = 7).
		int num1=1;
		
		do
		{
			System.out.println(num1*7);
			num1++;
		}
		while(num1<=10);
		System.out.println("----------------------------");
		
//		Print Hello 10 times.
		
		int k=1;
		
		do
		{
			System.out.println("Hello...!");
			k++;
		}
		while(k<=10);
		
		System.out.println("------------------------------------------");
		
//		Print the sum of first 10 natural numbers.
		int num_1=1;
		int sum=0;
		
		do
		{
			sum=sum+num_1;
			System.out.println(sum);
			num_1++;
		}
		while(num_1<=10);
		System.out.println("------------------------------------------");

//		Print the sum of even numbers from 1 to 100.
		
		int number_1=1;
		int sum1=0;
		
		do
		{
			if(number_1%2==0)
			sum1=sum1+number_1;
			System.out.println(" Sum Even Number " +sum1);
			number_1++;
		}
		while(number_1<=50);
		System.out.println("------------------------------------------");
		
//		Print the sum of odd numbers from 1 to 100.
		
		int number_2=1;
		int sum2=0;
		
		do
		{
			if(number_2%2==0)
			sum2=sum2+number_2;
			System.out.println("Sum Odd Number " +sum2);
			number_2++;
		}
		while(number_2<=50);
		System.out.println("------------------------------------------");

	}

}
