package com.sathya.yakoobSir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ItemsServlet")
public class ItemsServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter writer=response.getWriter();
	
	
	int id= Integer.parseInt(request.getParameter("id"));
	String iname=request.getParameter("iname");
	double icost= Double.parseDouble(request.getParameter("icost"));
	int iquan=Integer.parseInt(request.getParameter("iquan"));
	
	
	
	
	double total=Calculations.total(icost, iquan);
	double disc=Calculations.discount(total);
	double famt=Calculations.famt(total, disc);
	
	int i=DAO.insert(id, iname, icost, iquan, total, disc, famt);
	if(i==1)
	{
		writer.print("Avarra manam......");
	}
	else
	{
		writer.print("chala kastam nana...");
	}
	
	
		
	}
}
