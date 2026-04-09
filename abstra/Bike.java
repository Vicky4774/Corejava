package com.abstra;

public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("The Bike is start..");
		
	}

	@Override
	public void stop() {
		System.out.println("The Bike is stop..");
		
	}
	
//	public void average()
//	{
//		System.out.println("The Bike Mileage is 55...!");
//	}
}
