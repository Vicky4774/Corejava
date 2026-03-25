package com.method;

public class ReverseNumber {
	int num = 1895;

	public int reverseNum() {
		int rev = 0;

		while (num != 0) 
		{
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		return rev;

		//System.out.println("Reverse Number =  " + rev);
	}

	public static void main(String[] args) {

		ReverseNumber rs = new ReverseNumber();
		int res=rs.reverseNum();
		System.out.println(res);
	}
}
