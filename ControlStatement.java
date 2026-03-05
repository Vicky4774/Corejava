package com.jbk;

public class ControlStatement
{

	public static void main(String[] args)
	{
		int a=70;	//1
		
		if(a>50)
		{
			System.out.println("A Is Greater ");
		}
		System.out.println("-----------------------------------------");
		
		int age=18;		//2
		
		if(age>=18)
		{
			System.out.println("User Can Vote "+age);
		}
		else
		{
			System.out.println("User Can't Vote "+age);
		}
		System.out.println("-----------------------------------------");
		
		String color="Yellow";		//3
		
		if(color=="Yellow")
		{
			System.out.println("Ready to Go");
		}
		else if(color=="Green")
		{
			System.out.println("Go.....!");
		}
		else if(color=="Red")
		{
			System.out.println("Stop....!");
		}
		else
		{
			System.out.println("Invalid Choice...!");
		}
		
		System.out.println("-----------------------------------------");
		
		int number=76;
		
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		
		System.out.println("--------------------------");
		
		int num=79;		//4
		
		if(num%2==1)
		{
			System.out.println("Odd Number");
		}
		else
		{
			System.out.println("Even Number");
		}
		System.out.println("-------------------------------");
		
		int no=-582;			//5
		
		if(no>=0)
		{
			System.out.println("Positive Number");
		}
		else if(no<=0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Invalid Number");
		}
		
		System.out.println("----------------------------------------");
		
		int z=20;			//6
		
		if(z%2!=0)
		{
			System.out.println("Odd Number ");
		}
		else
		{
			System.out.println("Even Number");
		}
			
		
	}

}
