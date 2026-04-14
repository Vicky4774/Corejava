package com.arr;

public class SumArray {

	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50,60};
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum=arr[i]+sum;
				//System.out.println(sum);	//it will display the one by on addition of the array element
				
			}
			System.out.println("The total addition of the all element from the array : " +sum); //It will Display the total addition of the array
		}
	}

}
