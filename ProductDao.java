package com.lti.training.day7.jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//Data Access Object
/*
 * TODO:
 * create table TBL_PRODUCT(
 * id number(5) primary key,
 * name varchar2(50),
 * price number(12,2),
 * quantity number(5));no
 */
public class ProductDao {

	//public void add(int id, String name, double price, int quantity ) {
	
	public void add(Product product) {
		Connection conn = null; //manages the connection between the app and database
		PreparedStatement stmt = null; //helps us to execute SQL statements
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");	//Load the Driver(Strp-I)
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");//Creating Connection
																																								
			
			String sql = "insert into TBL_PRODUCT values(?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,product.getId());
			stmt.setString(2, product.getName());
			stmt.setDouble(3,product.getPrice());
			stmt.setInt(4,product.getQuantity());
			stmt.executeUpdate(); //any DML statement
			
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


public List<Product>  fetchAll() {
	Connection conn = null; //manages the connection between the app and database
	PreparedStatement stmt = null;//helps us to execute SQL statements
	ResultSet rs =  null;//helps us to fetch the result of a select query 
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");	//Load the Driver(Strp-I)
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");//Creating Connection
																																							
		
		String sql = "Select * from TBL_PRODUCT where quantity >= ?";
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, 10);
		rs = stmt.executeQuery();
		
		List<Product> product = new ArrayList<Product>();
		
		while(rs.next()) {//for each row
			Product p = new Product();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setQuantity(rs.getInt(4));
			product.add(p);
		}
		return product;
		
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
	