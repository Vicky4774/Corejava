package com.loops;

public class Factorial {

	public static void main(String[] args)
	
	{
		int fact = 1;
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;				//1*1  1	1*2=2	1*2*3=6		1*2*3*4=24.........1*2*3*4......*10=3628800	
			System.out.println(fact);
			
			
		}
		
		
//		for(int k=1;k<=5;k++)
//		{
//			// System.out.println(k*k);	//Square of the 1 to 10 Number
//			System.out.println(k*k*k);	// Cube of the 1 to 10 Number
//		}
//		
//		int sum=0;
//		for(int num=1;num<=10;num++)	//	2+4+6+8+10
//		{
//			if(num%2==0)
//			{
//				sum=sum+num;
//				
//			}
//			//System.out.println("Even No Sum" +sum);
//			
//		}
//		System.out.println("Even No Sum" +sum);
//		
//		
	}

}
