package com.sathya.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessServlet
 */
@WebServlet("/SessServlet")
public class SessServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		 String username =request.getParameter("username");
		String age = request.getParameter("age");
		String location= request.getParameter("location");
		
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("age", age);
		session.setAttribute("location", location);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("professional.html");
		dispatcher.forward(request, response);
		
		
	}

}
