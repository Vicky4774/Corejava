package com.starPattern;

public class Character {

	public static void main(String[] args)
	{
//		 A 
//		 B B 
//		 C C C 
//		 D D D D 
//		 E E E E E 
//		 F F F F F F 
		
//		for(char c='A';c<='Z';c++)
//		{
//			for(char i='A';i<=c;i++)
//			{
//				System.out.print(" "+c);
//			}
//			
//			System.out.println(" ");
//		}
		
		
//		 A
//		 A B
//		 A B C
//		 A B C D
//		 A B C D E
//		 A B C D E F
	
		for(char i='A';i<='Z';i++)
		{
			for(char j='A';j<=i;j++)
				
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		

		
		
	}

}
