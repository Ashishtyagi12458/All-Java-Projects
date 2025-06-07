package com.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class FetchData {

	public static void main(String[] args) 
	{
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root" ,"root");
			  java.sql.Statement stmt=con.createStatement();
			   ResultSet rs=stmt.executeQuery("select * from student");
			   while(rs.next())
			   {
				System.out.println("+++++++++++-------------------");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				System.out.println("+++++++++++++++++++++++++++++++");
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

}
