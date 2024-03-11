package com.sathya.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
    public Register() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter writer = response.getWriter();
	String username= request.getParameter("username");
	String password=request.getParameter("password");
	String gender= request.getParameter("gender");
	String[] tech= request.getParameterValues("tech");
	String Tech= String.join(",", tech);
	String[] qual= request.getParameterValues("qual");
	String fqual=String.join(",", qual);
	String type= request.getParameter("usertype");
	String[] addr=request.getParameterValues("address");
	String faddr=String.join(",", addr);
	String commnets=request.getParameter("comments");
	
	
	
	writer.println("<html><body bgcolor='pink' style='text-align:center;'>");
	writer.println("username--"+username);
	writer.println("<br>");
	writer.println("password--"+password);
	writer.println("<br>");
	writer.println("gender--"+gender);
	writer.println("<br>");
	writer.println("technologies--"+Tech);
	writer.println("<br>");
	writer.println("<br>");
	writer.println("Address is--"+faddr);
	writer.println("<br>");
	writer.println("qualifications are--"+fqual);
	writer.println("<br>");
	writer.println("user type--"+type);
	writer.println("<br>");
	writer.println("Students openion on Rathan sir is--"+commnets);
	writer.println("<br>");
	
	writer.println("</body></html>");
	
	}
}
