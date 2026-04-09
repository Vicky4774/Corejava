package com.abstra;

import com.xyz.Bank;

public class Main {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		sa.calculateInterest();
		sa.displayBalance();
		
		System.out.println("---------------------------");
		
		Bank  ca=new CurrentAccount();
		ca.calculateInterest();
		ca.displayBalance();
		
		System.out.println("---------------------------");
		
		
			
			Vehicle b=new Bike();
			b.start();
			b.stop();
			b.speed();
			System.out.println("---------------------");
			Vehicle c=new Car();
			c.start();
			c.stop();
			
		
		
		
	}

}
