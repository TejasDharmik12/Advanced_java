package pack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email1");
		String pass = req.getParameter("pass1");
		PrintWriter out = resp.getWriter();
		
		
		if(email.equals("tejas@gmail.com") && pass.equals("tejas")) {
			HttpSession session = req.getSession();
			session.setAttribute("name_key","Tejas Dharmik");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			out.print("Email and password doesnt match");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		
	}
}
