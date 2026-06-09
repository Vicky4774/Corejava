package com.MyPackage;



public class Main 
{
	//1 load class
	//2 conn establish
	//3 statement create
	//4 execute query
	//5 conn close

	public static void main(String[] args) 
	{
		System.out.println("Student CRUD Operation");
		Student st=new Student();
		
		//st.createTable();  //create table
		//st.InsertData();	//insert data into a table
		st.readData();	//select the data from the table
		//st.updateData();	//update the data from the table
	}
}

