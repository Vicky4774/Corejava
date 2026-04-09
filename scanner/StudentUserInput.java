package com.scanner;

import java.util.Scanner;

public class StudentUserInput {

	public static void main(String[] args) 
	{
	
		System.out.println("Enter Name Here : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		System.out.println("Enter Age Here : ");
		int age=sc.nextInt();
		
		System.out.println("Enter City Here : ");
		String city=sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Enter Mobile Number Here : ");
		long mobNu=sc.nextLong();
		
		System.out.println("Enter Marks Here : ");
		double marks=sc.nextDouble();
		
		System.out.println("Enter Student 18 + or not : ");
		boolean check=sc.nextBoolean();
		
		System.out.println("--------------------------------------------");
		System.out.println(name +" \n" +age  +" \n" +city +" \n" +mobNu +" \n" +marks+" \n" +check);
		
		
	}

}
