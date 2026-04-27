package com.thread;

public class Main {

	public static void main(String[] args)
	{
		//Demo d=new Demo();
		Demo d1=new Demo("welcome to Multhreading");
		Test t=new Test();
		
		Thread th=new Thread(d1);  
		//Thread th1=new Thread(t);
		th.start();
		//th1.start();
		
		
		
	}

}
