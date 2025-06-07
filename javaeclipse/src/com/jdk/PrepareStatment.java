package com.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

public class PrepareStatment {

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter student record");
		System.out.println("enter the student ide");
		int ide=s1.nextInt();
		System.out.println("enter the student name");
		String name=s1.next();
		System.out.println("enter the student roll no");
		String roll=s1.next();
		System.out.println("enter the student email ide");
		String email=s1.next();
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
				 PreparedStatement ps=con.prepareStatement("insert into student(ide,name,roll,email)value(?,?,?,?)");
				 ps.setInt(1, ide);
				 ps.setString(2,name);
				 ps.setString(3, roll);
				 ps.setString(4,email);
				 ps.executeUpdate();
				  ResultSet rs=ps.executeQuery("select * from student");
				  while(rs.next())
				  {
					  System.out.println("+++++++++++++++++++++");
					  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
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

}
