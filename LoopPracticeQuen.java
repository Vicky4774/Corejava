package com.loops;

public class LoopPracticeQuen {

	public static void main(String[] args) 
	{
		System.out.println("FOR LOOP PROGRAM PRACTICE QUESTIONS");
//	1	Print numbers from 1 to 10 using a loop.
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		
//	2	Print numbers from 10 to 1.
		
		for(int a=10;a>=1;a--)
		{
			System.out.println(a);
		}
		System.out.println("-----------------------------");
		
//	3	Print all even numbers between 1 and 50.
		
		for(int num=1;num<=50;num++)
		{
			if(num%2==0)
			{
				System.out.println("Even Number " + num);
			}
		}
		System.out.println("-----------------------------");
		
//	4	Print all odd numbers between 1 and 50.
		
		for(int num=1;num<=50;num++)
		{
			if(num%2!=0)
			{
				System.out.println("Odd Number " + num);
			}
		}
		System.out.println("-----------------------------");
		
//	5	Print the table of 5 using a loop.
	
		for(int t=1;t<=10;t++)
		{
			System.out.println(2*t);
		}
		
		System.out.println("-----------------------------");
		
		for(int t=1;t<=10;t++)
		{
			System.out.println(3*t);
		}
		
		System.out.println("-----------------------------");
		
		for(int t=1;t<=10;t++)
		{
			System.out.println(4*t);
		}
		
		System.out.println("-----------------------------");
		
		for(int t=1;t<=10;t++)
		{
			System.out.println(5*t);
		}
		
		System.out.println("-----------------------------");
		
		for(int t=1;t<=10;t++)
		{
			System.out.println(6*t);
		}
		
		System.out.println("-----------------------------");
		
//	6	Print Hello 10 times.
		
		for(int j=1;j<=10;j++)
		{
			System.out.println(j+ " Hello");
		}
		System.out.println("-----------------------------");
		
//	7	Print the sum of first 10 natural numbers.
		
	
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			 sum=sum+i;
			// System.out.println(i );
			 
		}
		System.out.println("The sum of 10 Natural Number "+ sum);
		System.out.println("-----------------------------");
		
//	8	Print the sum of even numbers from 1 to 100.
		
		int Sum=0;
		
		for(int k=1;k<=5;k++)
		{
			if(k%2==0)
			{
				Sum=Sum+k;	
			}
		}
		System.out.println("Even Number " +Sum);
		
		System.out.println("-----------------------------");
		
//	9	Print the sum of odd numbers from 1 to 100.
		
		int add=0;
		
		for(int k=1;k<=5;k++)
		{
			if(k%2!=0)
			{
				add=add+k;
			}
		}
		System.out.println("Odd Number " + add);

		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
		System.out.println("WHILE LOOPS PROGRAMS PRACTICE QUESTIONS");
		System.out.println("----------------------------------------");
		
		
//		Print numbers from 1 to 10 using a loop.
		
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("-----------------------------");
		
//		Print numbers from 10 to 1.
		
		int k=10;
		
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		
		System.out.println("------------------------------");
		
//		Print all even numbers between 1 and 50.
		
		int num=1;
		while(num<=50)
		{
			if(num%2==0)
			{
				System.out.println("Even Number " + num);
				
			}
			num++;
			
		}
//		Print all odd numbers between 1 and 50.
		
		int numb=1;
		while(numb<=50)
		{
			if(numb%2!=0)
			{
				System.out.println("Odd Number " + numb);
				
			}
			numb++;
			
		}
		
		System.out.println("--------------------------------------");
		
//		Print the table of 5 using a loop.
		
		
		int m=1;
		
		while (m<=10)
		{
			System.out.println(5*m);
			m++;
		}
		
		System.out.println("--------------------------------------");
		
		
//		Print the table of any number (e.g., n = 7).
		
		int l=1;
		
		while (l<=10)
		{
			System.out.println(7*l);
			l++;
		}
		
		System.out.println("--------------------------------------");
		
//		Print Hello 10 times.
		
		int c=1;
		
		while(c<=10)
		{
			System.out.println(c +" Hello...!");
			c++;
		}
		
		System.out.println("-------------------------");
		
//		Print the sum of first 10 natural numbers.
		
		int Number=1;
		int sum_No=0;
		
		while(Number<=10)
		{
			sum_No=sum_No+Number;
			//System.out.println("The Sum Of 10 Natural Number " +sum_No);
			Number++;
		}
		System.out.println("The Sum Of 10 Natural Number " +sum_No);
		
		System.out.println("----------------------------------------");
	
//		Print the sum of even numbers from 1 to 100.
		
		int numbr=1;
		
		while (numbr<=100)
		{
			if(numbr%2==0)
			{
				System.out.println(" Even Number "+ numbr);
			}
			numbr++;
		}
		System.out.println("----------------------------------------");
		
		
		
//		Print the sum of odd numbers from 1 to 100.
		
		int no_1=1;
		
		while (no_1<=100)
		{
			if(no_1%2!=0)
			{
				System.out.println(" Odd Number "+ no_1);
			}
			no_1++;
		}
		System.out.println("----------------------------------------");
		
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
		// System.out.println(" DO-WHILE LOOPS PROGRAMS PRACTICE QUESTIONS");

		
	}

}
