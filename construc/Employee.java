package com.construc;

public class Employee
{
	public Employee(int id,String fname,String lname,float salary,int pincode,String companyName,String city,int experience)
	{
		System.out.println("Employee Details \n");
		System.out.println("The Employee Id : " +id);
		System.out.println("The Employee First Name : " +fname);
		System.out.println("The Employee Last Name : " +lname);
		System.out.println("The Employee Salary : " +salary);
		System.out.println("The Employee Pincode : " +pincode);
		System.out.println("The Employee Company Name : " +companyName);
		System.out.println("The Employee City : " +city);
		System.out.println("The Employee Experience : " +experience);
	}
	
	public void salary(double salary)
	{
		double bonus;
		if(salary>=100000)
		{
			 bonus=salary+10000;
			 System.out.println(bonus);
		}
		else if(salary>=50000)
		{
			bonus=salary+5000;
			System.out.println("The Employee Salary Is : " +salary);
			System.out.println("After adding bonus into the salary : " + (bonus));
		}
		else
		{
			System.out.println("No Bonus...!");
		}
		
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee(101, "Vicky", "latake", 50000f, 758462, "TCS", "Pune", 2);
		emp.salary(50000);
	}
	
}
