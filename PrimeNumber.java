package com.jbk;

public class PrimeNumber {

//	public static void main(String[] args) 
//	{
//		int num=11;
//		
//		boolean flag=true;
//		
//	
//			for(int i=2;i<num;i++)
//			{
//				if(num%i==0)
//				{
//					flag=false;
//					break;
//				}
//			}
//		
//		if(flag==true)
//		{
//			System.out.println("Prime Number : "+num);
//			System.out.println(num*num);
//		}
//		else
//		{
//			System.out.println("Not Prime Number : "+num);
//		}
//		

	// }

	public void primeNo(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("Prime Number : " + num);
			System.out.println("The Square Of Prime Number : " + num * num);
		} else {
			System.out.println("Not Prime Number : " + num);
		}

	}

	public static void main(String[] args) {

		PrimeNumber pm = new PrimeNumber();
		pm.primeNo(9);
	}

}
