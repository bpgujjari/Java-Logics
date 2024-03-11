package com.sathya.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResetServlet
 */
@WebServlet("/ResetServlet")
public class ResetServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		String newPassword=request.getParameter("npassword");
		
		int i=DAO.resetPassword(name, password, mobile, newPassword);
		if(i==1)
		{	 RequestDispatcher dispatcher=request.getRequestDispatcher("projectHome1.html");
			 dispatcher.forward(request, response);
		 }
		else
			 {	 	writer.println("your data not updated...");
				 RequestDispatcher dispatcher=request.getRequestDispatcher("projectHome1.html");
				 dispatcher.forward(request, response);
			 }			
	}

}