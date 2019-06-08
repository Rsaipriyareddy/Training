package com.lti.training.day7.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;	
import java.sql.SQLException;


public class Conne {

	public static void main(String[] args) {
		
		Connection conn=null;
		
		try {
			
				//Loading the Class
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Creating or Establishing the Connection
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				
				System.out.println("Connection Created Successfully");
				
		}
		
		catch(ClassNotFoundException e) {
			System.out.println("JDBC Driver not found");
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally{
			try {
				conn.close();
			}
			
			catch(Exception e) {
			}
		}
	}
}
