package com.construc;

public class PersonalInfo 
{

	public PersonalInfo(int id,String fname,String lname,String city,String mail,int age,long mobileNumber)
	{
		System.out.println("Student Information \n");
		
		System.out.println("Student Id : "+id);
		System.out.println("Student First Name : "+fname);
		System.out.println("Student Last Name : "+lname);
		System.out.println("Student City : "+city);
		System.out.println("Student Email : "+mail);
		System.out.println("Student Age : "+age);
		System.out.println("Student  Mobile Number : "+mobileNumber);
	
	}
	
	public static void main(String[] args) {
		
		PersonalInfo pi=new PersonalInfo(1, "Vicky", "Latake", "Solapur", "latakevicky@gmail.com", 22, 7517374774l);
		
	}
	
}
