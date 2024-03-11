package com.sathya.firstProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class UserDAO {
	private static final String SELECT_ALL_USERS = null;
	static Connection connection=TestConn.createConnection();		
	public static int save(String email, String username, String password, String mobileNo, String totalQual,
			String gender, String totalTech, String country, String totalAddrs, String review) {
	         int rowCount = 0;
		try {
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into login values(?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, mobileNo);
			preparedStatement.setString(5, totalQual);
			preparedStatement.setString(6, gender);
			preparedStatement.setString(7, totalTech);
			preparedStatement.setString(8, country);
			preparedStatement.setString(9, totalAddrs);
			preparedStatement.setString(10, review);
			rowCount=preparedStatement.executeUpdate();
            
			
		} catch (Exception e) {
           e.printStackTrace();
		}
		return rowCount;
	}
	
	public static List<User> selectAllUsers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String email = rs.getString("email");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String mobileNo = rs.getString("mobileNo");
				String totalQual = rs.getString("totalQual");
				String gender = rs.getString("gender");
				String totalTech = rs.getString("totalTech");
				String country = rs.getString("country");
				String totalAddrs = rs.getString("totalAddrs");
				String review = rs.getString("review");
				users.add(new User(email,username,password,mobileNo,totalQual,gender,totalTech,country,totalAddrs,review));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return users;
	}

	private static void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}

	private static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean loginCheck(String username, String password)
	{

		try {
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select * from login");

			while (set.next()) {
				String uname = set.getString(2);
				String pword = set.getString(3);
				
				if (uname.equals(username) && pword.equals(password)) {
					
					return true;
				} 
			}
		

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	}

	public static String[] search(String mobileNo, String password) {
		String[] data = null; 
		try {			
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select * from login where number='"+mobileNo+"'and password='"+password+"'");
						
			set.next();
			
			data = new String[set.getMetaData().getColumnCount()];
			
			for(int i=1;i<=data.length;i++)
			{	data[i-1] = set.getString(i);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}		
		return data;		
	}

	public static boolean delete(String username, String password, String mobileNo) {
		int count=0;
		try {
			Statement statement=connection.createStatement();
			 count=statement.executeUpdate("delete from login where username='"+username+"'and password='"+password+"'and number='"+mobileNo+"'");
			
			 if(count!=0) {
				 return true;
			 }
		} catch (Exception e) {
           e.printStackTrace();
		}
		return false;
	}

	public static boolean resetPassword(String email, String password) {
		int count=0;
		try {
		Statement statement=connection.createStatement();
		 count=statement.executeUpdate("update  login set password='"+password+"' where email='"+email+"'");		 
		 if(count!=0) {
			 return true;
				
			}
		}
		
		catch (Exception e) {
            e.printStackTrace();
		}
		return false;
	}

	public static String[] view1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String[] view11() {
		// TODO Auto-generated method stub
		return null;
	}
	}
