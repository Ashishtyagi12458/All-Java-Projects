package com.jdk;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Employee
{
	static String empid;
	static int ch;
	static String Fname="";
	static String lname="";
	static String mob="";
	static String designation="";
	static double salary=0;
	static String city="";
	static Scanner sc=new Scanner(System.in);
	static DataStoreHelper dsh=new DataStoreHelper();

	public Employee(String empid,int ch,String Fname,String lname,String mob,String designation,double salary,String city) 
	{
		this.empid=empid;
		this.ch=ch;
		this. Fname=Fname;
		this.lname=lname;
		this.mob=mob;
		this.designation=designation;
		this.salary=salary;
		this.city=city;
		
	}
	 public static String empid()
	 {
		 String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String digits="0123456789";
		 Random r= new Random();
		 String genrate="";
		 while(genrate.length()!=7)
		 {
			 int rPick=r.nextInt(4);
			 if(rPick==1)
			 {
				 genrate+=alphabets.charAt(r.nextInt(25));
			 }
			 else if (rPick==3)
			 {
				 genrate+=digits.charAt(r.nextInt(9));
				 
			 }
		 }
		 empid="KW_"+genrate;
		 System.out.println("\n generated employee id"+ empid);
		 return empid;
		 
	 }
	 static String mobile()
	 {
		 System.out.println("\n enter the mobile number");
		 mob=sc.next();
		 if(mob.matches("\\d{10}"))
		 {
			 System.out.println("mobile number is accepted");
		 }
		 else
		 {
			 System.out.println("mubile number is not valid(must bi 10 digit)");
			 
		 }
		 return mob;
	 }
	 static String select_desig()
	 {
		 do
		 {
			 try
			 {
				 System.out.println("______________________");
				 System.out.println("Select your Designation");
				 System.out.println("1.Software Engineer\n2.consultant\n3.manager\n4.other");
				 System.out.println("_______________________");
				 System.out.println("enter your choice");
				 ch=sc.nextInt();
			 }
			 catch(InputMismatchException ime)
			 {
				 System.out.println("\nWrong choice entered.....please try again");
				 select_desig();
			 }
			 switch(ch)
			 {
			   case 1:
				  designation="software engineer";
			      salary=20000;
			      break;
			   case 2:
				   designation="Consultant";
				   salary=30000;
				   break;
			   case 3:
				   designation="Manager";
				   salary=15000;
				   break;
			   case 4:
				   designation="other";
				   salary=12000;
				   break;
				default:
					System.out.println("\nwrong choice......Please try again");
			 }
		 }while(ch!=1&ch!=2&ch!=3&ch!=4);
		 return designation;
	 }
	 static String city()
	 {
		 String regex="^[a-zA-Z]+$";
		 System.out.println("\n enter the city");
		 city=sc.next();
		 if(city.matches(regex)&&city.length()>=3)
		 {
			 System.out.println("city name is accepted");
		 }
		 else
		 {
			 System.out.println("Invailed city\n(contains only alphabets and length should be greater than 2)");
			 city();
		 }
		 return city;
	 }
 static String firstname()
 {
	 String regex="^[a-zA-Z]+$";
	 System.out.println("\n enter first name ");
	 Fname=sc.next();
	 
	 if(Fname.matches(regex)&&Fname.length()>=2)
	 {
		 System.out.println("first name is accepted");
	 }
	 else
	 {
		 System.out.println("\ninvalid firstname\n(Contains only alphabets and length should be greater than 2");
		 firstname();
	 }
	 return Fname;
	 }
 
  static String lastname()
  {
	  String regex="^[a-zA-Z]+$";
	  System.out.println("\n enter the last name");
	  lname=sc.next();
	  
	  if(lname.matches(regex)&&lname.length()>=2)
	  {
		  System.out.println("last name is accepted");
	  }
	  else
	  {
		  System.out.println("invalid last name\n(contains only alphabath and length should be greater then 2)");
		  firstname();
	  }
	  return lname;
  }
   public static void mainMenu() throws ClassNotFoundException,SQLException,IOException
   {
	   do
	   {
		   try
		   {
			 System.out.println("__________________");
			 System.out.println("Welcom to kodingWindow Partal");
			 System.out.println("___________________");
			 System.out.println("1.Admin login\n2. Sign In\n3.Sign Up\n4.Exit");
			 System.out.println("____________________");
			 System.out.println("enter your choice");
			 ch=sc.nextInt();
		   }
		   catch(InputMismatchException ime)
		   {
			   System.out.println("\nWrong choice entered...Please try again");
			   mainMenu();
		   }  
		   switch(ch)
		   {
		   case 1:
			   System.out.println("\nEnter user name");
			   String uname=sc.next();
			   System.out.println("\n entter the password");
			   String password=sc.next();
			   
			   if(uname.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin"))
			   {
				   do
				   {
					   System.out.println("____________________");
					   System.out.println("1.Display All Employee\n2.Update Info\n3.Delete All Account\n4.Go To MainMenu");
					   System.out.println("______________________");
					   System.out.println("Enter your Choice");
					   try
					   {
						   ch=sc.nextInt();
						   
					   }
					   catch(InputMismatchException ime)
					   {
						   System.out.println("\nwrong choice entered...Please try again");
					   }
					   switch(ch)
					   {
					   case 1:
						   try
						   {
							   dsh.viewAllEmployee(empid);
						   }
						   catch(Exception e)
						   {
							   System.out.println(e);
						   }
						   break;
					   case 2:
						   break;
					   case 3:
						   try
						   {
							   dsh.dropAllEmployee();
						   }
						   catch(Exception e)
						   {
							   System.out.println(e);
						   }
						 break;
					   case 4:
						   mainMenu();
						   default:
							   System.out.println("\nWrong choice entered...Please try Again");
					   }
				   }while(ch!=4);
			   }
			   else
			   {
				   System.out.println("\nWrong username and Password");
				   mainMenu();
			   }
			   break;
		   case 2:
			   System.out.println("\nEnter Employee Id");
			   String emp=sc.next();
			   
			   if(emp.equals(empid))
			   {
				   do
				   {
					   System.out.println("____________________");
					   System.out.println("1.Display Info\n2.Update Info\3.Remove Account\n4.Go TO mainMenu");
					   System.out.println("______________________");
					   System.out.println("enter your Choice");
					   try
					   {
						   ch=sc.nextInt();
					   }
					   catch(InputMismatchException ime)
					   {
						System.out.println("\nWrong choice entered...Please Try again");   
					   }
					   switch(ch)
					   {
					   case 1:
						   try
						   {
							   dsh.viewEmployee(empid);
						   }
						   catch(Exception e)
						   {
							   System.out.println(e);
						   }
						   break;
					   case 2:
						   dsh.updateEmployee(empid);
						   break;
					   case 3:
						   mainMenu();
						   default:
							   System.out.println("\nWrong choice entered...please Try Again");
					   }
				   }while(ch!=4);
			   }
			   else
			   {
				   mainMenu();
			   }
			   System.out.println(empid);
			   break;
		   case 3:
			   empid();
			   firstname();
			   lastname();
			   mobile();
			   select_desig();
			   city();
			   Employee e=new Employee(empid,ch, Fname,lname,mob,designation,salary,city);
			   try
			   {
				 dsh.addEmployee(e);  
			   }
			   catch(Exception ex)
			   {
				   System.out.println(ex);
			   }
			   break;
		   case 4:
			   System.exit(0);
			   default:
				   System.out.println("\nWrong choice enter...please try again");
			   }
	   }while(ch!=4);
	   }
	public static void main(String[] args) throws ClassNotFoundException,IOException,SQLException
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
		catch(ClassNotFoundException e)
		{
			System.out.println("Please load mysql jdbc driver");
			e.printStackTrace();
			return;
		}
		Connection con;
        try
        {
        	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","root");
        	System.out.println("Connection established");
        }
        catch(SQLException e)
        {
        	System.out.println("Connection failed");
        	e.printStackTrace();
        	return;
        }
        Statement st=con.createStatement();
        st.executeUpdate("Drop Table Employee");
        st.executeUpdate("Create table employee(EMPID VARCHAR(11)PRIMARY KEY,FNAME VARCHAR(20),LNAME VARCHAR(20),MOB INT(10),DESIGNATION VARCHAR(20),SALARY INT(20),CITY VARCHAR(15))");
        System.out.println("Employee table created succesfuly");
        mainMenu();
}
}