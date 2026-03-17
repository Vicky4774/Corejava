package com.loops;

public class BreakContinueStmt {

	public static void main(String[] args) {

//		Print numbers from 1 to 50 but stop when number becomes 25.
		
		for (int i = 1; i <= 50; i++) {
			if (i == 25) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("------------------------------------------------");

//		Print even numbers from 1 to 100 but stop when you get first odd number.
		
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				break;
			}
			System.out.println(num);

		}
		System.out.println("------------------------------------------------");
		
//		Print table of 9 but stop when product becomes more than 50.

		for (int t = 1; t <= 10; t++) {
			if (t * 9 > 50) {
				break;
			}
			System.out.println(t * 9);
		}

		System.out.println("------------------------------------------------");
//		Print numbers from 1 to 50 but skip numbers divisible by 7.
		
		for (int number = 1; number <= 50; number++) {
			if (number % 7 == 0) {
				continue;
			}
			System.out.println(number);
		}

		System.out.println("------------------------------------------------");
		
//		Print numbers from 1 to 100 but skip numbers ending with digit 5.
//		for(int no=1;no<=100;no++)
//		{
//			if(no==5)
//			{
//				continue;
//			
//			}
//			System.out.println(no);
//		}
		System.out.println("------------------------------------------------");


//		Print characters from ‘A’ to ‘Z’ but skip vowels.
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			}
			System.out.print(" " + ch);
		}
		
		
	}
	

}
