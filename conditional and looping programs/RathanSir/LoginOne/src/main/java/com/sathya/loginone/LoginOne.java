package com.sathya.loginone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginOne")
public class LoginOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
   public LoginOne() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//General Settings
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		//get request data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//processing logics
		if (username.equalsIgnoreCase("sathya")&&password.equals("Sathya@123")) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
			dispatcher.forward(request, response);
			
		} else {

			RequestDispatcher dispatcher=request.getRequestDispatcher("fail.html");
			dispatcher.forward(request, response);
		}
		
	}

}
