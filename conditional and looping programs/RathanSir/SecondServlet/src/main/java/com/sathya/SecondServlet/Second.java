package com.sathya.SecondServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Second extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
  public Second() {
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html><body>");
		writer.println("Hi this is <h1>Second Approach...</h1>");
		writer.println("<br>");
		writer.println("<h2 style='color:gold'>Rathan Sir is hero l<h2>");
		writer.println("</body></html>");
				
	}

}
