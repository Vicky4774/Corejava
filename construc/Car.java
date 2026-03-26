package com.construc;

public class Car
{
	public Car(String model,String color,int year,int engine_cc,String ownerName,int price)
	{
		System.out.println("Car Information \n");
		System.out.println("The Car Model Name : " +model);
		System.out.println("The Car Color : " +color);
		System.out.println("The Car Year : " +model);
		System.out.println("The Car Engine CC : " +engine_cc);
		System.out.println("The Car Owner Name : " +ownerName);
		System.out.println("The Car Price : " +price);
		
	}
	
	public void display()
	{
		System.out.println("Welcome To Swift Showroom..!");
	}
	
	public static void main(String[] args)
	{
		Car c=new Car("Swift","White",2026,3500,"Vicky",500000);
		System.out.println("---------");
		c.display();
		
		
	}

}
