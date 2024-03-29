package com.gujjari.projectk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
    public RegServlet() {
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		String mobile=(request.getParameter("number"));
		String email = request.getParameter("email");
		
			try{			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
			PreparedStatement p=connection.prepareStatement("insert into projectk values(?,?,?,?)");
			
			p.setString(1, name);
			p.setString(2, password);
			p.setString(3, mobile);
			p.setString(4, email);
			int st= p.executeUpdate();
			
			if(st==1)
			{
			RequestDispatcher dispatcher=request.getRequestDispatcher("regSuccess.html");
			dispatcher.forward(request, response);
			}
			else
				writer.println("Project-K is loading");
			
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
}
