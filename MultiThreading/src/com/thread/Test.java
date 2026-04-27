package com.thread;

public class Test implements Runnable {

	@Override
	public void run() {
		
		for(int i=10;i>=1;i--)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Descending order " +i);
		}
		
	}

}
