package com.sathya.loginapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginApp")
public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   public LoginApp() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//General Settings
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		//Reading from Clinet/Request object
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//processing logics
		if(username.equalsIgnoreCase("Sathya")&&password.equals("Sathya@123-"))
		{
			writer.println("login Successfull..."+username);
		}
		else
		{
			writer.println("login failed..."+username);
	
		}
	}
}
