package com.logic;

import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		int che, math, sci, eng, mar;

		System.out.println("Enter Marks Of the Five Subjects :");
		Scanner sc = new Scanner(System.in);

		che = sc.nextInt();
		math = sc.nextInt();
		sci = sc.nextInt();
		eng = sc.nextInt();
		mar = sc.nextInt();

		int sum = che + math + sci + eng + mar;
		System.out.println("Total Sum of the Marks :" + sum);

		double avg = sum / 5.0;
		System.out.println("The Average Of Marks :" + avg);
	}

}
