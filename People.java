package com.lti.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class People {

	public void add(PeoplesClub people) {
		Connection conn = null; //manages the connection between the app and database
		PreparedStatement stmt = null; //helps us to execute SQL statements
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
																																								
			
			String sql = "insert into People_Club values(?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,people.getStr() );
			stmt.setString(2,people.getFname());
			stmt.setString(3,people.getLname());
			stmt.setString(4,people.getDob());
			stmt.setString(5, people.getCity());
			stmt.executeUpdate(); 
			
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

	public Collection<PeoplesClub>  fetchAll() {
		Connection conn = null; //manages the connection between the app and database
		PreparedStatement stmt = null;//helps us to execute SQL statements
		ResultSet rs =  null;//helps us to fetch the result of a select query 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//Load the Driver(Strp-I)
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");//Creating Connection
																																								
			
			String sql = "Select * from People_Club";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			/*String sql = "Select * from People_Club where City =?";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(); */
			
			List<PeoplesClub> peoplesclub = new ArrayList<PeoplesClub>();
			
			while(rs.next()) {//for each row
				PeoplesClub p = new PeoplesClub();
				p.setStr(rs.getString(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setDob(rs.getString(4));
				p.setCity(rs.getString(5));
				peoplesclub.add(p);
			}
			return peoplesclub;
			
	}
	catch(ClassNotFoundException e) {
		System.out.println("JDBC Driver not found");
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
		
	finally{
			try {conn.close();}
			catch(Exception e) { }
			return null; //bad 
		}
	}	
	}
		
