package com.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class InsertData
{

	public static void main(String[] args) 
	{
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
		   java.sql.Statement stmt=con.createStatement();
		   
		  int i=stmt.executeUpdate("insert into student value(103,'sagar','93','sagar@gmail.com')");
		  if(i==1)
		  {
			  System.out.println("record insert seccufully");
			  
		  }else
		  {
			  System.out.println("record insert an succufully");
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
