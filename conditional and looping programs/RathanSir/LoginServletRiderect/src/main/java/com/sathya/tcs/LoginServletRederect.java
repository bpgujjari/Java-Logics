package com.sathya.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServletRederect")
public class LoginServletRederect extends HttpServlet {
	private static final long serialVersionUID = 1L;
public LoginServletRederect() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");
		if(username.equalsIgnoreCase("Sathya")&&password.equals("Sathya@123")){
			response.sendRedirect("http://www.tcs.com");
		}
		else {
			response.sendError(808, "Enter a valid data");
		}
		
		
	}
}

