package com.abstra;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("The car is start..");
		
	}

	@Override
	public void stop() {
		System.out.println("The car is stop..");
		
	}
	public void speed()
	{
		 System.out.println("The Car speed is 240..!");
	}
	public void average()
	{
		System.out.println("The Car Mileage is 25...!");
	}
}
