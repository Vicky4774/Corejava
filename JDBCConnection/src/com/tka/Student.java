package com.MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student 
{
	public void createTable()
	{
		try
		{
			String url="jdbc:mysql://localhost:3306/";
			String db="Teacher";
			String username="root";
			String password="Vicky@2004";
			Connection conn=DriverManager.getConnection(url+db,username,password);
			Statement stm=conn.createStatement();
			
			String query="create table student(s_id int,name varchar(200),s_email varchar(200))";
			stm.execute(query);
			System.out.println("Table created successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
	}
		
			
		
		
		
	}

	public void InsertData() 
	{
//		try
//		{
//			String url="jdbc:mysql://localhost:3306/";
//			String db="Teacher";
//			String username="root";
//			String password="Vicky@2004";
//			Connection conn=DriverManager.getConnection(url+db,username,password);
//			Statement stm=conn.createStatement();
//			
//			//String query="insert into student values(1,'Shivam','shivam@gmail.com')"; both can use 
//			//stm.execute(query);
//			
//			String query="insert into student(s_id,name,s_email) values(?,?,?)";
//			PreparedStatement pstm=conn.prepareStatement(query);
//			
//			pstm.setInt(1, 3);
//			pstm.setString(2, "Ganesh");
//			pstm.setString(3, "ganesh@gmail.com");
//			
//			pstm.executeUpdate();
//			System.out.println("Data Inserted Successfully");
//			
//			conn.close();
//		}
//		
//		
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}

		
}

	public void readData() 
	{
		try
		{
			String url="jdbc:mysql://localhost:3306/";
			String db="Teacher";
			String username="root";
			String password="Vicky@2004";
			Connection conn=DriverManager.getConnection(url+db,username,password);
			Statement stm=conn.createStatement();
			
			//String query="insert into student values(1,'Shivam','shivam@gmail.com')"; both can use 
			//stm.execute(query);
			
			String query="Select * from student";
			Statement stm1=conn.createStatement();
		
			
			
			ResultSet rs=stm1.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("s_id="+rs.getInt(1));
				System.out.println("name="+rs.getString(2));
				System.out.println("s_email="+rs.getString(3));
				System.out.println("---------------------");

			}
			
			
			System.out.println("Read Data Successfully");
			
			conn.close();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
	}

	public void updateData() 
	{
		try
		{
			String url="jdbc:mysql://localhost:3306/";
			String db="Teacher";
			String username="root";
			String password="Vicky@2004";
			Connection conn=DriverManager.getConnection(url+db,username,password);
			Statement stm=conn.createStatement();
			
			//String query="insert into student values(1,'Shivam','shivam@gmail.com')"; both can use 
			//stm.execute(query);
			
			String query="UPDATE student set s_id=? where name=?";
			PreparedStatement pstm=conn.prepareStatement(query);
			
			pstm.setInt(1, 4);
			pstm.setString(2, "Ganesh");
			
			
			pstm.executeUpdate();
			System.out.println("Data Updated Successfully");
			
			conn.close();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
	}
		
		
	}







