package com.jbk;

public class ControlStmtPractice {

	public static void main(String[] args) 
	{
	//1.	Write a program that checks if a person’s age is greater than 18, then print "Adult".
		
	
	  int age1=13;
	 
	  if(age1>=18) 
	  { 
		  System.out.println("The Person Is Adult"); 
	  }
	  else
	  {
		   System.out.println("The Person Is Not Adult ");
	  }
	
	  System.out.println("------------------------------------------------------");
		

		//2. Write a program to check whether a number is divisible by 10.
		
		int number=89;
		
		if(number%10==0)
		{
			System.out.println("The number divisible by 10");
		}
		else
		{
			System.out.println("The number not divisible by 10");
		}
		System.out.println("------------------------------------------------------");
		
	//	Write a program to check whether a temperature is above 30°C, then print "Hot Day".

		int temperature=55;
		
		if(temperature>=30)
		{
			System.out.println("Hot Day");
		}
		else
		{
			System.out.println("Cool Day");
		}
		System.out.println("------------------------------------------------------");
		
		// Write a program to check whether a number is even or odd.
		
		int no=89;
		
		if(no%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		System.out.println("------------------------------------------------------");
		
	//3.	Write a program to check whether a given year is leap year or not.
		
		int year=2020;
		
		if(year%4==0 && year%100!=0 ||year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
		System.out.println("------------------------------------------------------");
		
	//4.	Write a program to check whether a number is positive or negative.
		
		int num=-29;
		
		if(num>=0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Negative Number");

		}
		
		System.out.println("------------------------------------------------------");
//5.	Write a program to find grade of a student based  on marks:
//			90–100 → Grade A
//			75–89 → Grade B
//			50–74 → Grade C
//			35–49 → Grade D
//			Below 35 → Fail

		int marks=30;
		
		
		if(marks >=90 && marks <= 100)
		{
			System.out.println("Grade is A ");
		}
		else if (marks >=75 && marks <=89)
		{
			System.out.println("Grade is B ");
		}
		else if (marks >=50 && marks <=74)
		{
			System.out.println("Grade is C ");
		}

		else if (marks >=35 && marks <=49)
		{
			System.out.println("Grade is D ");
		}
		else
		{
			System.out.println("Fail....!");
			System.out.println("Better For Next Luck....!");
		}
		System.out.println("------------------------------------------------------");
		// 6. Write a program to print the day of the week based on day number (1–7).
		
		int day=7;
		
		if(day==1)
		{
			System.out.println("Sunday");
		}
		else if(day==2)
		{
			System.out.println("Monday");
		}
		else if(day==3)
		{
			System.out.println("Tuesday");
		}
		else if(day==4)
		{
			System.out.println("Wensday");
		}
		else if(day==5)
		{
			System.out.println("Thrusday");
		}
		else if(day==6)
		{
			System.out.println("Friday");
		}
		else if(day==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid Input....!");
		}
		System.out.println("------------------------------------------------------");
		
//	7.	Write a program to print a message based on age group:
//
//			0–12 → Child
//			13–19 → Teenager
//			20–59 → Adult
//			60+ → Senior Citizen
		
		int age=50;
		
		if(age>=0 && age<=12)
		{
			System.out.println("Child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age>=20 && age<=59)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior Citizen");
		}
		System.out.println("------------------------------------------------------");
		
	//8.	Write a program to classify a temperature as Hot, Warm, Cool, or Cold.

		int temp=5;
		
		if(temp>=30)
		{
			System.out.println("Hot Day");
		}
		else if(temp>=20 && temp<=29)
		{
			System.out.println("Warm Day");
		}
		else
		{
			System.out.println("Cool Day");
		}
		System.out.println("------------------------------------------------------");
		
		//9.	Write a program to check whether a number is positive, negative, or zero.
		
		int numbe=-58;
		
		if(numbe>0)
		{
			System.out.println("Positive Number");
		}
		else if(numbe<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero Number");
		}
		System.out.println("------------------------------------------------------");
	//10.	Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
		
		
		int voter_age=29;
		
		if(voter_age>=18)
		{
			System.out.println("Eligible For Vote...!");
			
			if(voter_age>=25)
			{
				System.out.println("The Voter Can Contest in Election");
			}
			else
			{
				System.out.println("The Voter Can't Contest in Election");
			}
			
		}
		else
		{
			System.out.println("Not Eligible For Vote...!");
		}
		
		System.out.println("------------------------------------------------------");
		
	//11.	Write a program to check whether a number is even, and if even, check whether it’s greater than 50.
		
		int numb=5;
		
		if(numb%2==0)
		{
			System.out.println("Even Number");
			
			if(numb>=50)
			{
				System.out.println("Number is Greater than 50");
			}
			else
			{
				System.out.println("Number is Not Greater than 50");
			}
			
		}
		else
		{
			System.out.println("Odd Number");
		}
		System.out.println("------------------------------------------------------");
	}

}
