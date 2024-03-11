package com.Sathya.ThirdApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ThirdServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.write("This is third approach..");
		writer.write("<br>");
		writer.write("This is doGet() method...");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.write("This is third approach..");
		writer.write("<br>");
		writer.write("This is doPost() method...");
	
	}

}
