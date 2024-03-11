package com.sathya.yakoobSir;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAO {
	
public  static int insert(int id,String iname, double icost, int iquan,double total,double disc,double famt)
{	int i=0;
	

	try(Connection connection=TestConn.conn())
	{
		PreparedStatement ps=connection.prepareStatement("insert  into items values(?,?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, iname);
		ps.setDouble(3, icost);
		ps.setInt(4, iquan);
		ps.setDouble(5,total);
		ps.setDouble(6, disc);
		ps.setDouble(7, famt);
		i=ps.executeUpdate();	
	}
	
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return i;

}

}
