package com.sathya.filterEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter1
 */
@WebFilter("/RegServlet")
public class MyFilter1 implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		int age=Integer.parseInt(request.getParameter("age"));
		
		if(age>5)		
	    chain.doFilter(request, response);

	else
	{
		writer.println("you are child....");
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);		
	}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
