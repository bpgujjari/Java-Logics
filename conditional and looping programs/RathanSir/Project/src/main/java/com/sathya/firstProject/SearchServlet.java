package com.sathya.firstProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SearchServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
        String mobileNo = request.getParameter("number");
        String password = request.getParameter("password");

		
		String[] data = UserDAO.search(mobileNo,password);
        System.out.println("Your Details....");
		
		for(String d:data)
		{	writer.println(d);
			writer.println("<br><br>");
			writer.println("<h1>");
			//writer.println("<p style=\"color:DodgerBlue;>");
		}
		
		writer.print("<a href='login.html'>Click here to goto login page</a>");
		
	}

}