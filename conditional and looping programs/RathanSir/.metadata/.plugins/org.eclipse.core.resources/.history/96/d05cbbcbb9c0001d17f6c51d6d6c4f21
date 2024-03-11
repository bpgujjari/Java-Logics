package com.sathya.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBc {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
			,"gujjari","bhavani");
	PreparedStatement preparedStatement =connection.prepareStatement("insert into OP values(?,?,?)"); 
				int id=id;
				String name=name;
				long number=number;
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, number);
		preparedStatement.executeUpdate();
 }	
}
