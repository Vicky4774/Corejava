package com.method;

public class FibonassiSeries {

	public void fibonassi()
	{
		int num=10;
		int a=0,b=1,c;
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(a +", ");
			c=a+b;
			a=b;
			b=c;	
		}
		
	}
	public static void main(String[] args)
	{
		FibonassiSeries fs=new FibonassiSeries();
		
		 fs.fibonassi();
		
	}

}
