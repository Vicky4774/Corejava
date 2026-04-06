package com.jbk;

public class PrimeNumberSeries {
		
	public void primeSeries(int num)
	{
		
		
		for(int i=2;i<num;i++)
		{
			boolean flag=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println("The Prime Number : "+i);
			}
			else
			{
				System.out.println("Not Prime Number : "+i);
			}
		}
		

	}
	
}
