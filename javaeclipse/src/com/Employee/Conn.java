package com.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn 
{
	Connection c;
	Statement st;
	

	public Conn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagmentsystem","root", "root");
			st=c.createStatement();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new Conn();
	}

}
