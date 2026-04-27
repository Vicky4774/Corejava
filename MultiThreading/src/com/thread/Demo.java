package com.thread;

public class Demo implements Runnable
{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Welcome to thread 1..." +i);
		}
		
	}
	
		

}


