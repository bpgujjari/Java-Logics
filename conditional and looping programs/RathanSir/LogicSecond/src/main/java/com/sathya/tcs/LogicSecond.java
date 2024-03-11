package com.sathya.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LogicSecond")
public class LogicSecond extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LogicSecond() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");
		if(username.equalsIgnoreCase("Rathansir")&&password.equals("Rathan123"))
		{
		RequestDispatcher dispatcher =request.getRequestDispatcher("success.html");
		dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher =request.getRequestDispatcher("failed.html");
			dispatcher.forward(request, response);
		}
	}

}
