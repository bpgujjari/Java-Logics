package com.sathya.dbcon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printServlet")
public class printServlet extends HttpServlet {
    public printServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
        	try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
        	Statement statement=connection.createStatement();
        	ResultSet set= statement.executeQuery("select * from stu");
        	while(set.next()) {
        		writer.println(set.getString(3)+" "+set.getString(2));
        	}
        		
        	}
        	catch (Exception e) {
        		e.printStackTrace();
        	}
	}
}
        	