package com.abc;

public class AssignmentOperator2 {

	public static void main(String[] args) 

	{
	
		int k=10;
		
		k++;	//10	11
		--k; // 10
		
		System.out.println(k*=2); //10*2 20
		k/=5;			//20/5		4
		System.out.println(k);		//4
		k++;						//	5
		System.out.println(k+10);	//	10+5	15
		
		int a;
		
		System.out.println(a=k+4);	//	k=5 5+4=9
		++k;	//		5 	6
		k--;		//5
		System.out.println("--------------------------");
		System.out.println(k);		//5
		

	}

}
