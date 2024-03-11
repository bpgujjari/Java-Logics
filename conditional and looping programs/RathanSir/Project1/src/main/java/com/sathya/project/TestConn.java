package com.sathya.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConn {
	
 static Connection connection=null;
public static Connection conn() {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
}
	catch (Exception e) {
	e.printStackTrace();
	}
	return connection;
}
}

