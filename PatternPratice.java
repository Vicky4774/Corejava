package com.starPattern;

public class PatternPratice {

	public static void main(String[] args) {

//		 * * * * *
//		 * * * * *
//		 * * * * *
//		 * * * * *
//		 * * * * *

		for (int i = 1; i <= 5; i++) // outer loop rows
		{
			for (int j = 1; j <= 5; j++) // inner loop column
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------------");

//		*
//		* *
//		* * *
//		* * * * 
//		* * * * *

		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= k; l++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------------");

//		
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*

		for (int a = 1; a <= 5; a++) {
			for (int b = 5; b >= a; b--) {
				System.out.print(" *");
			}
			System.out.println("");
		}

		System.out.println("--------------------------------------------");
//	    *
//	   * *							
//	  * * *
//	 * * * *
//	* * * * *

		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= 5 - i; j++) { // space
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) { // Column
				System.out.print("* ");
			}

			System.out.println();
		}
		
		System.out.println("-----------------------");
		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

//			*
//		   * *
//		  * * *
//		   * *
//		    *

	}

}
