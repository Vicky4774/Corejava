package com.abstra;

public class PartTimeEmployee extends Employee {

	@Override
	public void calculatesalary() {
		int salary=10000;
		int balance=5000;
		float bal=salary+balance;
		System.out.println("The Part Time Salary And Account Balance : "  +bal);
		
	}

}
