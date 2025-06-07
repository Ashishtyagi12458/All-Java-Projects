package hotal.managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class conn 
{
	Connection con;
	Statement st;
conn()
	{
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmenagementsystem","root", "root");
		   st= con.createStatement();
		  
		   }
	    catch(Exception e){
	    	e.printStackTrace();
	    }
 
	
	}
}
