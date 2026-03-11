package com.switchcase;

public class SwitchCase {

	public static void main(String[] args) 
	{
	
		// 1. Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)
		int days = 2;

		switch (days) {
		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wensday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
			default:
				System.out.println("Invalid Input....!");
		}
		
		System.out.println("-------------------------------------------");
		
	//	2. Accept a number (1–12) from the user and print the name of the month using a switch case.
		
		int months = 2;

		switch (days) {
		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
			
		case 8:
			System.out.println("August");
			break;
			
		case 9:
			System.out.println("September");
			break;
			
		case 10:
			System.out.println("Octomber");
			break;
			
		case 11:
			System.out.println("November");
			break;
			
		case 12:
			System.out.println("December");
			break;
			
			default:
				System.out.println("Invalid Input....!");
		}
		System.out.println("-------------------------------------------");
		
		
		//	3. Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.
		
		int num1=20;
		int num2=10;
		char ope='+';
		
		switch (ope) {
		case '+':
			System.out.println(num1+num2);
			break;

		case '-':
			System.out.println(num1-num2);
			break;

		case '*':
			System.out.println(num1*num2);
			break;

		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
			
			default:
				System.out.println("Enter valid Operator....!");
		}
		System.out.println("-------------------------------------------");
		
//		4. Take a grade character (A, B, C, D, F) as input and print a message:
//
//			A → Excellent
//			B → Good
//			C → Average
//			D → Poor
//			F → Fail
		
		char grade='A';
		
		switch (days) {
		case 'A':
			System.out.println("Excellent");
			break;

		case 'B':
			System.out.println("Good");
			break;

		case 'C':
			System.out.println("Average");
			break;

		case 'D':
			System.out.println("Poor");
			break;
		case 'E':
			System.out.println("Fail");
			break;
		case 'F':
			System.out.println("Fail...! Better For Next Luck");
			break;
			default:
				System.out.println("Invalid Input....!");
		}
		
		System.out.println("-------------------------------------------");
		
		
//		5. Input color name (Red, Yellow, or Green) and print the appropriate action:
//
//			Red → Stop
//			Yellow → Ready
//			Green → Go

		String color="Red";
		
		switch (color) 
		
		{
		case "Red":
			System.out.println("Stop.....!");
			break;

		case "Green":
			System.out.println("Go....!");
			break;

		case "Yellow":
			System.out.println("Ready To Go...!");
			break;
			
		default:
			System.out.println("Invalid Input....!");
		}
		System.out.println("-------------------------------------------");
		
	//	6. Take a single character input and check whether it is a vowel or consonant using a switch statement.
		
		char alphabet='i';
		
		switch (alphabet) 
		{
		
		case 'a','e','i','o','u':
			System.out.println("It Is Vowel...!");
			break;
			
		case 'A','E','I','O','U':
			System.out.println("It Is Vowel...!");
			break;

			default:
				System.out.println("It Is Consonant");
		}
		
		System.out.println("-------------------------------------------");
		
		
		//	7.Use a switch statement to check if a number is even or odd (hint: use number % 2 as the expression)
		
		int num=20;
		
		switch (num % 2)	// % -----> 20 % 2 =10 Quotient / ---->  0 = Remainder   0 Case is matched then print the Even Number
		{
		case 0:
			System.out.println("Even Number");
			break;
			
		case 1:
			System.out.println("Odd Number");
			break;
		}
		System.out.println("-------------------------------------------");
		
		
//		9. Take month number (1–12) and print the corresponding season:
//
//			Dec–Feb → Winter
//			Mar–May → Summer
//			Jun–Aug → Monsoon
//			Sep–Nov → Autumn
		
		
		String month="sep";

		switch (month) {
		case "dec","jan","feb":
			System.out.println("Winter");
			break;
			
		case "mar","apr","may":
			System.out.println("Summer");
			break;
		case "june","july","aug":
			System.out.println("Monsoon");
			break;
		case "sep","oct","nov":
			System.out.println("Autumn");
			break;
			default:
				System.out.println("Invalid Input....!");
		}
		System.out.println("-------------------------------------------");
		

	
	}

	}
