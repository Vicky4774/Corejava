package com.abstra;

public interface Vehicle
{
	public void start();
	public void stop();
	
	public default  void speed()
	{
		 System.out.println("The Bike speed is 140..!");
	}

}
