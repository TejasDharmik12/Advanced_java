package pack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class show extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		String name = req.getParameter("name1");
		String email = req.getParameter("email1");
		PrintWriter out = res.getWriter();
		out.println("Welcome "+name);
		out.println("your mail id is: "+email);
		System.out.println("Perfectly fetched");
	}
}
