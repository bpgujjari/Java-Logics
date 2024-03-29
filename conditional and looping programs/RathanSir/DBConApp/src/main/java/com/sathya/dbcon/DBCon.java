package com.sathya.dbcon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBCon")
public class DBCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DBCon() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		int id= Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("name");
		String number=request.getParameter("number");
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
			PreparedStatement p=connection.prepareStatement("insert into stu values(?,?,?)");
			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, number);
			int i=p.executeUpdate();
			if(i==1)
			{
				writer.println("your data inserted successfully.......");
				writer.println("<a href='printServlet'>click here to view<a/>");

			}
			else
			{
				writer.println("keep work on it ...");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
