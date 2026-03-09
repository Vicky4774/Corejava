package com.jbk;

public class GradingSystem {

	public static void main(String[] args) 
	{
		int marks=44;
		
		
		if(marks >=90 && marks <= 100)
		{
			System.out.println("Grade is A ");
		}
		else if (marks >=80 && marks <=89)
		{
			System.out.println("Grade is B ");
		}
		else if (marks >=70 && marks <=79)
		{
			System.out.println("Grade is C ");
		}

		else if (marks >=60 && marks <=69)
		{
			System.out.println("Grade is D ");
		}
		else if (marks >= 50 && marks < 60)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Fail....!");
			System.out.println("Better For Next Luck....!");
		}


	}

}
