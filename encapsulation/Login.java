package com.encapsulation;

public class Login 
{
	private String userName;
	private String password;
	
	
	public void setuserName(String userName)
	{
		this.userName=userName;
	}
	
	public String getuserName()
	{
		return userName;
	}
	
	public void setpassword(String password)
	{
		this.password=password;
	}
	public String getpassword()
	{
		return password;
	}
	
	public static void main(String[] args) {
		Login lg=new Login();
		lg.setuserName("Vicky");
		lg.setpassword("pass@1432");
		
		System.out.println("The Employee User Name : "+lg.getuserName());
		System.out.println("The Employee Password : " +lg.getpassword());
		
		// System.out.println(lg.getClass());	//  class com.encapsulation.Login  ---> It will display the path of the Class.
		
	}
}
