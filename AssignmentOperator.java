package com.abc;

public class AssignmentOperator {

	public static void main(String[] args) 
	{
		int i = 5;
		--i; 
		System.out.println(i++); //4
		++i; 
		System.out.println(i % 6); //0
		i++; 
		System.out.println(i+=2); //9
		i++; 
		int b = i +8;
		System.out.println(i++); //10
		i++;
		i /= 4;//3
		System.out.println(i++); //3
		--i;
		System.out.println(i + 4);//7

		System.out.println("______________________________");
		System.out.println(i);	//3
		
		

	}

}
