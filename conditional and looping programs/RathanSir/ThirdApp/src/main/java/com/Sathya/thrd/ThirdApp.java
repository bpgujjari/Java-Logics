package com.Sathya.thrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ThirdApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   public ThirdApp() {
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.write("Bhavani Prasad ....King");
			writer.write("<br>");
		}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.write("Bhavani Prasad ....Gujjari");
		writer.write("<br>");
	}

}
