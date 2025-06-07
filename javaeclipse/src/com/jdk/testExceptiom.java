package com.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testExceptiom
{

	public static void main(String[] args)
	{
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}	

	}

}
