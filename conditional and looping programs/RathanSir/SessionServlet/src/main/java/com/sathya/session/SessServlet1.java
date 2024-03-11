package com.sathya.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.jdi.Location;

/**
 * Servlet implementation class SessServlet1
 */
@WebServlet("/SessServlet1")
public class SessServlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String email = request.getParameter("email");
		String skill = request.getParameter("skill");
		String desg = request.getParameter("desg");

		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		session.setAttribute("skill", skill);
		session.setAttribute("desg", desg);
		
		writer.println("Regestration successful....<a href='successServlet'>click here to print the details</a>");

		// getting the data from the session object....
		/*
		 * String name1=(String)session.getAttribute("username"); String
		 * age1=(String)session.getAttribute("age"); String
		 * loc1=(String)session.getAttribute("location"); String
		 * email1=(String)session.getAttribute("email"); String skill1 =
		 * (String)session.getAttribute("skill"); String
		 * desg1=(String)session.getAttribute("desg");
		 * 
		 */
		/*
		 * writer.println("username..." + name1); writer.println("<br><br>");
		 * writer.println("age..." + age1); writer.println("<br><br>");
		 * 
		 * writer.println("Location...." + loc1); writer.println("<br><br>");
		 * 
		 * writer.println("email..." + email1); writer.println("<br><br>");
		 * 
		 * writer.println("skill...." + skill1); writer.println("<br><br>");
		 * 
		 * writer.println("desg....." + desg1);
		 */
	}

}