package com.tka;

public class MultipleBlock {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hiii");
			System.out.println(10/0);
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Can't divide by zero");
		}
		catch(Exception e)
		
		{
			System.out.println("file not found ");
		}
		finally
		{
			System.out.println("Always Executed");
		}
		
		
	}

}
