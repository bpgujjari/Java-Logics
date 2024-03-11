package com.main.registration.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConn {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","gujjari","bhavani");
		} catch ( ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
