package com.method;

public class Main extends MethodOverriding 
{
	public void show()
	{
		System.out.println("The Parent Method...!");
	}
	
	public static void main(String[] args) {
		
		Main m=new Main();
		m.show();
		
	}
	
	
}
