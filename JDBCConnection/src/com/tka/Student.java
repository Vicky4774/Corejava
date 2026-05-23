package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 2 Register & Load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 3 get Connection
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher", "root", "Vicky@2004");
		
		// 4 step we have two option(Statement(Static) & PreapredSatatemt(Dynamic))
		
		Statement s = c.createStatement();
		
		// 5  execute query and then get result
		
		int checked = s.executeUpdate("insert into student(s_id,name,s_email)values(125,'om','om@gmail.com')");

		if (checked > 0) 
		{
			System.out.println("Inserted ...!");
		} 
		else
		{
			System.out.println("NOT inserted...!");
		}

	}
}