package com.logic;

public class CapitalLetterString {

	public static void main(String[] args) 
	{
		String str="I LoVe Pune";
		String str2=" ";
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)-'A') < 26)
				{		
					str2 += str.charAt(i);
					
				}

		}
		System.out.println("The Capital letters of the string is : " +str2);

	}

}
