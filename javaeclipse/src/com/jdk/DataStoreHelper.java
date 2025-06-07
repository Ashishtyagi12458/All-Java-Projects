
package com.jdk;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class DataStoreHelper
{
	public void addEmployee(Employee e1)throws ClassNotFoundException,SQLException,IOException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
		java.sql.Statement st=con.createStatement();
		st.executeUpdate("INSERT INTO EMPLOYEE VALUE('"+Employee.empid+"','"+Employee.Fname+"','"+Employee.lname+"','"+Employee.mob+"','"+Employee.designation+"','"+Employee.salary+"','"+Employee.city+"')");
		System.out.println("\nValue Inserted Successfully");
	}
	public void viewEmployee(String empid)throws ClassNotFoundException,IOException
	{
		System.out.println("________________________");
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPID='"+empid+"'");
			rs.next();
			System.out.println(rs.getString(2)+"'s Information");
			System.out.println("______________________________");
			System.out.println("EMPID:"+rs.getString(1)+"\nFirst name:"+rs.getString(2)+"\nLast Name:"+rs.getString(3)+"\nMobile no.:"+rs.getString(4)+"\nDesignation:"+rs.getString(5)+"\nCurrent Salary:"+rs.getDouble(6)+"\nCity:"+rs.getString(7));
		}
		catch(SQLException e)
		{
			System.out.println("Record NOt Found");
		}
		  System.out.println("_______________________");
	}
	public void viewAllEmployee(String Empid) throws ClassNotFoundException,IOException
	{
		int cout=0;
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			 System.out.println("________________________");
			 while(rs.next())
			 {
				 System.out.println("EMPLID:"+rs.getString(1)+"\nFirst name:"+rs.getString(2)+"\nlast name:"+rs.getString(3)+"\nMobile no.:"+rs.getString(4)+"\nDesignation:"+rs.getString(5)+"\nCurrent salary:"+rs.getDouble(6)+"\nCity:"+rs.getString(7));
				 System.out.println("_____________________");
				 cout++;
			 }
			 System.out.println("Total Number of records "+cout);
		}
		catch(SQLException e)
		{
			System.out.println("Database is  Empty");
		}
	}
	public void removeEmployee(String Empid)throws ClassNotFoundException,SQLException,IOException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
		java.sql.Statement st=con.createStatement();
		st.executeUpdate("delete from employee where empid='"+Empid+"'");
		System.out.println("employee removed Successfully");
	}
	public void updateEmployee(String empid) throws ClassNotFoundException,SQLException,IOException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
		java.sql.Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		int ch;
		try
		{
			System.out.println("________________________");
			System.out.println("update your Information");
			System.out.println("_________________________");
			System.out.println("1.Mobile Number\n2.Designation\n3.city");
			System.out.println("__________________________");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				String mob=Employee.mobile();
				st.executeUpdate("UPDATE EMPLOYEE SET MOB='"+mob+"'WHERE EMPID='"+empid+"'");
				break;
			case 2:
				String designation=Employee.select_desig();
				st.executeUpdate("UPDATE EMPLOYEE SET DESIGNATION='"+designation+"'WHERE EMPID='"+empid+"'");
				break;
			case 3:
				String city=Employee.city();
				st.executeUpdate("UPDATE EMPLOYEE SET CITY='"+city+"'WHERE EMPID='"+empid+"'");
				break;
				default:
					System.out.println("\nWrong Choice Entered...PleAse Try Again");
			}
		}
		catch(InputMismatchException ime)
		{
			System.out.println("\nWrong choice Entered...Please Try Again");
			Employee.select_desig();
		}
		System.out.println("RECORD UPDATED SUCCESSFULLY");
		
	}
     public void updateEmployeeDesig(String empid,String designation) throws ClassNotFoundException,SQLException,IOException
     {
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
		 con.createStatement();
		 System.out.println("Record update Successfully");
     }
     public void  dropAllEmployee() throws SQLException
     {
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
			java.sql.Statement st=con.createStatement();
			st.executeUpdate("DROP TABLE EMPLOYEE");
			System.out.println("ALL EMPLOYEE ROMOVED SUCCESSFULLY");
     }

}
