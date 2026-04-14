package com.logic;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) 
	{
		System.out.println("Enter a String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String str1=str.replaceAll("[aeiouAEIOU]", " ");
		System.out.println("Remove the Vowel"+str1);
			

	}

}
