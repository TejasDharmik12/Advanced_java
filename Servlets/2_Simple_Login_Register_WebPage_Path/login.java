package pack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// Add if we dont want to add web.xml
//@WebServlet("/mylogin");
public class login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		PrintWriter out = res.getWriter();
		out.print("Hello Login");
		System.out.println("I am in service login method");
		
	}
}
