package com.lti.training.day6.collections;


import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class UserManager2 {

	public Map<String, String> users;
	
	
	public UserManager2() {
	
		users = new HashMap<String, String>();
		users.put("Shaik","1234");
		users.put("Rafiq","5678");
		users.put("Sai Priya","9012");
	}
	
	public boolean isValidUser(String userName,String passWord) {
	
		if(users.containsKey(userName)) {
				String pwd = users.get(userName);
				if(pwd.equals(passWord))
					return true;
		}
		return false;
}
	public static void main(String[] args) {
		
		UserManager2 mgr = new UserManager2();
		boolean isValid = mgr.isValidUser("Shaik", "2344");
		System.out.println(isValid);
		
	}
}
