package com.sathya.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegestrationServlet")
public class RegestrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
	String password= request.getParameter("password");
	String email= request.getParameter("email");
	String address= request.getParameter("address");
	
	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
					,"gujjari","bhavani");
			PreparedStatement ps =connection.prepareStatement("insert into users values(?,?,?,?)"); 
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, address);
			ps.executeUpdate();		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}

}
