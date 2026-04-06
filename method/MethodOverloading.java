package com.method;

public class MethodOverloading 
{

	// Method Overloading same name method but different parameter.Also we can change the return type. 
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int add(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
	
	public float div(float a,float b)
	{
		float c=a/b;
		return c;
	}
	
	public static void main(String[] args)
	{
		MethodOverloading me=new MethodOverloading();
		System.out.println("The Addition of Two Number is : "+me.add(10, 20));
		System.out.println("The Addition of Three Number is : "+me.add(10,20,40));
		System.out.println("The Division of Two Number is : "+me.div(100, 20));
	}

}
