package com.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class CreatTable
{

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
				java.sql.Statement stmt=con.createStatement();
				stmt.execute("create table student(ide int primary key,name varchar(200) not null,roll varchar(200) not null unique,email varchar(200) not null)");
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
