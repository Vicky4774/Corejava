package com.scanner;

import java.util.Scanner;

public class CalculatorUserInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second Number : ");
		double num2 = sc.nextDouble();

		System.out.println(" Press 1 for Addition \n Press 2 for Subtraction \n Press 3 for Multilpication \n Press 4 for Division \n Press 5 for Modulo");

		int choice = sc.nextInt();

		switch (choice) 
		{
		case 1:
			System.out.println("The Addition of two number is : " + (num1 + num2));
			break;
			
		case 2:
			System.out.println("The Subtraction of two number is : " + (num1 - num2));
			break;
			
		case 3:
			System.out.println("The Multilpication of two number is : " + (num1 * num2));
			break;

		case 4:
			System.out.println("The Division of two number is : " + (num1 / num2));
			break;

		case 5:
			System.out.println("The Modulo of two number is : " + (num1 % num2));
			break;

		default:
			System.out.println("Invalid Choice ");
		}

	}

}
