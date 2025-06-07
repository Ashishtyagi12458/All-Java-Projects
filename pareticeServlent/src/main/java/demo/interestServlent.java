package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class interestServlent extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		double value1=Double.parseDouble(req.getParameter("Text1"));
		double value2=Double.parseDouble(req.getParameter("Text2"));
		double value3=Double.parseDouble(req.getParameter("Text3"));
		System.out.println(value1+ ""+value2+""+value3);
		double result=(value1*value2*value3)/100;
		
		out.println("<h1>interest is :"+result+"</h1>");
	}

}
