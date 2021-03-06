package com.lti.assessment;

import java.sql.*;

public class People {

	Connection con;
	Statement st;
	ResultSet res;
	PreparedStatement ps;
	 
	People()
	{
	con =null;
	}
	public Connection getConnection()
	{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
	}
	catch(Exception e)
	{
	System.out.println("Error in connection" +e);
	}
	return con;
	}
	public void insertPeople(String first_name, String last_name, Integer dob, String city) 
	{
	try {
	con=getConnection();
	ps=con.prepareStatement("insert into PeopleClub values" + "(p_seq.NEXTVAL,?,?,?,?)");
	ps.setString(1,first_name);
	ps.setString(2, last_name);
	ps.setInt(3, dob);
	ps.setString(4, city);
	int i=ps.executeUpdate();
	if(i!=0)
	{
	System.out.println("inserted");
	}
	else
	{
	System.out.println("not inserted");
	}
	con.close();
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}
	}
	public void getPeople() 
	{
	  try 
	  {
	  con=getConnection();
	  st= con.createStatement();
	  res=st.executeQuery("select * from Ppl1 order by pid");
	  System.out.println("pid\t first_name \t last_name \t dob \t\t City");
	  System.out.println("***********************************");
	  while(res.next())
	  {
	  System.out.print(res.getInt(1)+"\t");
	  System.out.print(res.getString(2)+"\t\t");
	  System.out.print(res.getString(3)+"\t\t");
	  System.out.println(res.getInt(4));
	  System.out.println(res.getString(5));
	  }
	  System.out.println("*************************************");
	  res.close();
	  con.close();
	  }
	  catch(Exception e)
	  {
	  System.out.println("error in fetching " + e);
	  
	  }
	}
	public void display() 
	{
	  try 
	  {
	  con=getConnection();
	  st= con.createStatement();
	  res=st.executeQuery("select city,count(pid) from Ppl1 group by city ");
	  System.out.println("city\t pid");
	  while(res.next())
	  {
	  System.out.print(res.getString(1)+"\t");
	System.out.print(res.getInt(2)+"\t");
	  }
	  res.close();
	  con.close();
	  }
	  catch(Exception e)
	  {
	  System.out.println("error in fetching " + e);
	  
	  }
	}


	public void updatePeople(int pid,String city) 
	{
	try {
	con = getConnection();
	    ps = con.prepareStatement("update Ppl1" + " set city=? where pid=?");
	    ps.setString(1, city);
	    ps.setInt(2,pid);
	    int i = ps.executeUpdate();
	    if (i != 0) {
	        System.out.println("City updated");
	    } else {
	        System.out.println("not updated");
	    }
	    con.close();
	} catch (Exception e){
	    e.printStackTrace();
	}
	}
	public void deletePeople(int pid) 
	{
	try {
	con = getConnection();
	    ps = con.prepareStatement("delete from ppl1 where pid=?");
	    ps.setInt(1, pid);
	    int i = ps.executeUpdate();
	    if (i != 0) {
	        System.out.println("People deleted");
	    } else {
	        System.out.println("People Doesn't Exist");
	    }
	    con.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	}

}
