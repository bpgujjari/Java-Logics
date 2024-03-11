package com.Sathya.Thrdaprch;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ThirdApproach extends HttpServlet 
{
   public ThirdApproach() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("Gujjari Bhavani Prasad");
		writer.write("<br>");
		writer.write("Telangana");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
