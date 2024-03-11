package com.sathya.firstProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DeleteServlet() {
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
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String mobileNo=request.getParameter("number");

		
		boolean status=UserDAO.delete(username,password,mobileNo);
		if(status) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("del.html");
	 	      dispatcher.include(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("delete.html");
	 	      dispatcher.include(request, response);
	 	      
		}
	}

}