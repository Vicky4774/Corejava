package com.method;

public class ParameteriseMethod 
{
	public int addition(int a,int b)
	{
		int res=a+b;
		return res;
	}

	public int subtraction(int a,int b)
	{
		int res=a-b;
		return res;
	}

	public int multiplication(int a,int b)
	{
		int res=a*b;
		return res;
	}

	public float division(int a,int b)
	{
		int res=a/b;
		return res;
	}
	public float modulo(int a,int b)
	{
		int res=a%b;
		return res;
	}

	public static void main(String[] args) {
		
		ParameteriseMethod pm=new ParameteriseMethod();
		// int res=pm.addition(10, 20);	//store the data in the result
		// System.out.println("The Addition Of Two Number Is : " +res);
		System.out.println("The Addition Of Two Number Is : " + pm.addition(10, 20)); 	//call the directly method without storing the data.
		System.out.println("The Subtraction Of Two Number Is : " + pm.subtraction(40, 20)); 	//call the directly method without storing the data.
		System.out.println("The Multiplication Of Two Number Is : " + pm.multiplication(20, 20)); 	//call the directly method without storing the data.
		System.out.println("The Division Of Two Number Is : " + pm.division(100, 20)); 	//call the directly method without storing the data.
		System.out.println("The module Of Two Number Is : " + pm.modulo(9, 4)); 	//call the directly method without storing the data.
	}
}
