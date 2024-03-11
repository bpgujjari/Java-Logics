package com.sathya.vote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoteCheckServlet
 */
@WebServlet("/VoteCheckServlet")
public class VoteCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteCheckServlet() {
        super();
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
		String name = request.getParameter("name");
		int age= Integer.parseInt(request.getParameter("age"));
		String location = request.getParameter("loc");
		if (age>=18 && location.equals("hyderabad")) {
			writer.print("you are eligible for vote....<a href='http://eci.gob.in/voter/voter-registration/'>click here to get voter card</a> ");
			
		}
		else {
			writer.println("You are not eligible for vote....<a href='http://eci.gob.in/voter/voter-registration/'>Click here to apply vote</a>");
		}
	}

}
