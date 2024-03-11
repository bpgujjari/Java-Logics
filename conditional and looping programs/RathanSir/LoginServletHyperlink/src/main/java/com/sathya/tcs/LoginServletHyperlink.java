package com.sathya.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServletHyperlink")
public class LoginServletHyperlink extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServletHyperlink() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");
		if(username.equalsIgnoreCase("sathya")&&password.equals("Sathya@123"))
		{
			writer.print("Login Successful...<a href='http://www.google.com'>click here to sathya</a>");
		}
		else
		{
			writer.print("Login fail...<a href='login.html'>click here to  retry</a>");

		}
	}

}
