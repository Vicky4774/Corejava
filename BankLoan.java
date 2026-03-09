package com.jbk;

public class BankLoan 
{

	public static void main(String[] args) 
	{
		int age=41;
		float salary=400000;
		long aadharNumber=49497979797946l;
		
		if(age>=18)
		{
			System.out.println("You Can Move TO the Next Step..!");
			
			if(salary>=45000)
			{
				System.out.println("You can Apply For the Loan..!");
				
				if(aadharNumber==49497979797946l)
				{
					System.out.println("Loan Approved...!");
				}
			}
			
			else
			{
				System.out.println("Sorry....!");
				
			}
			
			
		}
		else
		{
			System.out.println("Sorry You Can't Apply For the Loan..!");
		}
		
	

	}

}
