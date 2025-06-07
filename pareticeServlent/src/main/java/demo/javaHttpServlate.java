package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class javaHttpServlate
 */
public class javaHttpServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		
		 String firstName=req.getParameter("firstName");
		 String lastName=req.getParameter("lastName");
		 String email=req.getParameter("email");
		 String password=req.getParameter("password");
		 String confirmPassword=req.getParameter("confirmPassword");
		 String phoneNumber=req.getParameter("phoneNumber");
		 String dateOfBirth=req.getParameter("dateOfBirth");
		 String gender=req.getParameter("gender");
		 
		 out.println("<h1>first name:"+firstName+"<br> last name:"+lastName+"<br>email:"+email+"<br>password:"+confirmPassword+"<br>conferm password:"
				 +confirmPassword+"<br>phoneNumber:"+phoneNumber+"<br>d.o.b:"+dateOfBirth+"<br>gender:"+gender+"</h1>");
		 


	}

}
