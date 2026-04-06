package com.abc;

public class DataType {

	public static void main(String[] args) 
	{
		
		System.out.println("Student Information ");
		System.out.println("-------------------------------------------------------------");
		byte age = 23;
		short seatNumber = 23346;
		int pinCode = 23456784;
		long adharNo = 232345678908634l;

		float height = 6.5f;
		double marks = 99.99;

		boolean checkPassed = true;

		char specialSymbol = '@';

		System.out.println("Student Age is =  " + age);
		System.out.println("Student Seat No is =  " + seatNumber);
		System.out.println("Student Pincode is =  " + pinCode);
		System.out.println("Student adharNo is =  " + adharNo);
		System.out.println("Student height is =  " + height);
		System.out.println("Student marks is =  " + marks);
		System.out.println("Student Pass/Fail is =  " + checkPassed);
		System.out.println("Student specialSymbol is =  " + specialSymbol);

		System.out.println("-------------------------------------------------------------");
		System.out.println("DATA TYPE SIZE IN BYTES ");
		System.out.println("-------------------------------------------------------------");

		System.out.println("Byte size is " + Byte.BYTES + " Byte ");
		System.out.println("Short size is " + Short.BYTES + " Byte ");
		System.out.println("Integer size is " + Integer.BYTES + " Byte ");
		System.out.println("Long size is " + Long.BYTES + " Byte ");
		System.out.println("Float size is " + Float.BYTES + " Byte ");
		System.out.println("Double size is " + Double.BYTES + " Byte ");
		System.out.println("Character size is " + Character.BYTES + " Byte ");
		System.out.println("Boolean is not Found ... !");
		

		System.out.println("-------------------------------------------------------------");
		System.out.println("DATA TYPE SIZE IN BITS  ");
		System.out.println("-------------------------------------------------------------");
		

		System.out.println("Byte size is " + Byte.SIZE);
		System.out.println("Short size is " +Short.SIZE);
		System.out.println("Integer size is " +Integer.SIZE);
		System.out.println("Long size is " +Long.SIZE);
		System.out.println("Float size is " +Float.SIZE);
		System.out.println("Double size is " +Double.SIZE);
		System.out.println("Character size is " +Character.SIZE);
		System.out.println("Boolean size is not found ");
		

		System.out.println("-------------------------------------------------------------");
		System.out.println("DATA TYPE RANGE ");
		System.out.println("-------------------------------------------------------------");
		

		System.out.println("Byte Range is " +Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("Short Range is " +Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("Integer Range is " +Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Long Range is " +Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println("Float Range is " +Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		System.out.println("Double Range is " +Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		System.out.println("Character Range is " +(int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
		System.out.println("Boolean Not Found");
	}

}
