package com.Sathya.secApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class SecondApp extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    public SecondApp() {
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		writer.write("<h1>This is second Approach</h1>");
		writer.write("<h2 style='color:red'>Gujjari BhavaniPrasad </h2>");
		writer.write("</body></html>");
	}

}
