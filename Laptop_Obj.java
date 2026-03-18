package com.oops;

//import com.loops.ForLoop;

public class Laptop_Obj {

	public static void main(String[] args) 
	{
	//ForLoop fr=new ForLoop();  we are access the data member of the another package but we are import the package.	System.out.println(fr.no=11);
	
		Laptop lp=new Laptop();
		System.out.println("The Laptop Brand Name = " + (lp.brand="HP"));
		System.out.println("The Laptop Ram Size = " + (lp.ram=16));	

	}

}
