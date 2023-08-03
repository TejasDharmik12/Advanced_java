package pack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		String mysearch = req.getParameter("search");
//		res.sendRedirect("https://www.google.com/search?q="+mysearch);
		String  myemail = (String) req.getParameter("email1");
		String mypass = (String) req.getParameter("pass1");
		PrintWriter out = res.getWriter();
		if(myemail.equals("tejas@gmail.com") && mypass.equals("tejas")) {
			
//			to set the name under the profile page use this 
			req.setAttribute("name_key", "Tejas Dharmik");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
		else {
//			therefore use setcontent
			res.setContentType("text/html");
			out.print("Please enter correct credentials");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
//			include will include both the above two stuffs.
//			but it will render the html content if we use this direct 
			rd.include(req, res);
		}
//		PrintWriter out = res.getWriter();
//		out.println("email: " + myemail);
//		out.print("pass:"+mypass);
		
	}
}
