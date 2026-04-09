package com.abstra;

public class Company 
{
	
	public static void main(String[] args) 
	{
		Employee e=new PartTimeEmployee();
		e.calculatesalary();
		System.out.println("-------------------------------------------------");
		Employee e1=new FullTimeEmployee();
		e1.calculatesalary();

	}

}
