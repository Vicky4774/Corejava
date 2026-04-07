package com.logic;

import java.util.Scanner;

public class CharPrint {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter the Character :");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0); // we are write the because of the print only one character.
		System.out.println(ch); // next it is the scanner class method.charAt() Stream class method.

//when we are give the position is 2 then only one character will be print at the index of the 2 only.

	}

}
