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

/**
 * Servlet implementation class successServlet
 */
@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		Cookie[] cookies =request.getCookies();
		
		String name = cookies[0].getValue();
		String age = cookies[1].getValue();
		String location = cookies[2].getValue();
		String email = cookies[3].getValue();
		String qualification = cookies[4].getValue();
		String designation = cookies[5].getValue();
		
		writer.println("<html><body>");
		writer.println(name);
		writer.println("<br>");
		writer.println(age);
		writer.println("<br>");
		writer.println(location);
		writer.println("<br>");
		writer.println(email);
		writer.println("<br>");
		writer.println(qualification);
		writer.println("<br>");
		writer.println(designation);
		writer.println("</body></html>");	}
}