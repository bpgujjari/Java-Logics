package com.Sathya.FirstServlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class FirsrServlet implements Servlet {
   public FirsrServlet() {
    }
	public void init(ServletConfig config) throws ServletException {
		}
	public void destroy() {
		}
	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null; 
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	response.setContentType("text/plian");
	PrintWriter A=response.getWriter();
	A.print("Rathan Sir Is More than a Hero...");
	int a=100;
	int b=200;
	A.println("ratan sir is hero..");
	A.println(a*b);
	}
	
	}

