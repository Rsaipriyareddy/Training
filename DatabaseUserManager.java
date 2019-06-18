package com.lti.training.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUserManager{
	
	public boolean isValidUser(String username, String password) {
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs = null;
		try {
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   //Establish connection with database
	   String url="jdbc:oracle:thin:@localhost:1521:XE";
	   String user="hr";
	   String pass="hr";
	   conn= DriverManager.getConnection(url,user,pass);
	   String sql = "select count(*) from UserManager where username=? and password=? and active='true' ";
	   stmt = conn.prepareStatement(sql);
	   
	   stmt.setString(1, username);
	   stmt.setString(2, password);
	   
	   rs=stmt.executeQuery();
	  rs.next();
	  int rowcount = rs.getInt(1) ; 
	   if(rowcount==1)
		   return true;
	   else
		   return false;
			   
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("JDBC driver not found");
		}
		catch(SQLException e) {
			e.printStackTrace();
		
	}
	finally {
	try {conn.close(); } catch(Exception e) {}
	}
		return false;
		
	}
	
	
		
}
	
