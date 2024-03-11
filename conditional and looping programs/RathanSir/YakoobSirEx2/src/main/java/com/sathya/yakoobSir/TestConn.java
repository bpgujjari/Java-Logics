package com.sathya.yakoobSir;

import java.sql.*;

public class TestConn {

public static Connection conn() {
  Connection con = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	return con;	
}
	
}
