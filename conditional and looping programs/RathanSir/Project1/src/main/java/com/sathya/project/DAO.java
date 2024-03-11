package com.sathya.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	static Connection connection= TestConn.conn();
public static int submit(int id,String name,String password,String email,long mobile,long sal) throws SQLException
{
	PreparedStatement p=connection.prepareStatement("insert into projectc values(?,?,?,?,?,?)");
	
	p.setInt(1, id);
	p.setString(2, name);
	p.setString(3, password);
	p.setString(4, email);
	p.setLong(5, mobile);
	p.setLong(6, sal);
	int res=p.executeUpdate();
	
	if(res==1)
		return res;
	else
		return 0;
}


public static int resetPassword(String name,String password,long mobile,String newPassword){
	int i=0;
	try {
		Statement st=connection.createStatement();
	 i=st.executeUpdate("update projectc set password='"+newPassword+"' where name='"+name+"' and password='"+password+"' and mobile="+mobile);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return i;
}


  public static boolean delete(String username, long mobile) { 
	  int count=0;
  try {
	 Statement statement=connection.createStatement();
	 count=statement.executeUpdate("delete from projectc where name='"+username+"' and mobile='"+mobile+"'");
  
  if(count!=0) { 
	  return true; 
	  }
  }
  catch (Exception e) 
  { e.printStackTrace(); }
 return false; }





public static boolean loginCheck(String name, String password) throws SQLException {
	Statement statement=connection.createStatement();
	ResultSet set=statement.executeQuery("select * from projectc");
	while (set.next()) {
		String uname = set.getString(2);
		String pword = set.getString(3);
		
		if (uname.equals(name) && pword.equals(password)) {
				return true;
			}
	}
	return false;
	}
}
