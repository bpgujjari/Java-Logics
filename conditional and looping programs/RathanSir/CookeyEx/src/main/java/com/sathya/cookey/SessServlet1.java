package com.sathya.cookey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

		Cookie cookie1= new Cookie("email", email);
		Cookie cookie2= new Cookie("skill", skill);
		Cookie cookie3= new Cookie("desg", desg);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		
		writer.println("Regestration successful....<a href='successServlet'>click here to print the details</a>");

	}

}
