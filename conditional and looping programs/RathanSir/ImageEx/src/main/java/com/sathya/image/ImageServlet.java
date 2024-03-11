package com.sathya.image;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/ImageServlet")
public class ImageServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id=Integer.parseInt(request.getParameter("id"));
		 Part fiPart=request.getPart("image");
		 InputStream is=null;
		 is=fiPart.getInputStream();
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
				PreparedStatement p=connection.prepareStatement("insert into image values(?,?)");
				p.setInt(1, id);
				p.setBlob(2,is,is.available());
				int i=p.executeUpdate();
				if(i==1)
				{
					System.out.println("hai...");
				}
				else
				{
					System.out.println("pora.....");
				}			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
