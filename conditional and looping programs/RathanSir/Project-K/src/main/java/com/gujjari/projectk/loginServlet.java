package com.gujjari.projectk;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.RowSet;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			String uname = request.getParameter("uname");
	    	String upassword= request.getParameter("upassword");
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
	    	Statement statement=connection.createStatement();
	    	
	    	ResultSet set = statement.executeQuery("select * from projectk where name='"+uname+"'");
	    	String username=set.getString(1);
	    	String password=set.getString(2); 	
	    	if(uname.equalsIgnoreCase(username)&&upassword.equals(password))
	    	{
	    		writer.println("Project-K first Step done......");
	    	
	    	}
	    	else
	    	{
	    	

	    		writer.println("Wrong username or password....");
	    		writer.println(username);
	    	}
		}
		catch (Exception e) {
		e.printStackTrace();	
	 }
}
}