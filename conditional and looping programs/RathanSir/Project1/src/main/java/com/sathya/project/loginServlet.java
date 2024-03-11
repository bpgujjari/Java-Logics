package com.sathya.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String username=request.getParameter("name");
		String password =request.getParameter("password");
		
		boolean status=true;
		try {
			status = DAO.loginCheck(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(status) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("reg2.html");
	 	      dispatcher.include(request, response);
		}
		else {
			writer.println("<h3 style='color:red;'>login failed....try with valid data</h3>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
	 	      dispatcher.include(request, response);
		}	
	}
}