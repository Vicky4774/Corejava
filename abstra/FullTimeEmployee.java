package com.abstra;

public class FullTimeEmployee extends Employee{

	@Override
	public void calculatesalary() {
		int salary=40000;
		int balance=50000;
		float bal=salary+balance;
		System.out.println("The Full Time Salary And Account Balance : "  +bal);
		
		
	}

}
