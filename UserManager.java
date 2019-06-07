package com.lti.training.day6.collections;


import java.util.List;
import java.util.ArrayList;

public class UserManager {

	private List<User> users;
	
	public UserManager() {
		users = new ArrayList<User>();
		users.add(new User("Shaik","1234",true));
		users.add(new User("Rafiq","5678",false));
		users.add(new User("Sai Priya","9012",true));
	}
	
	User u=new User();
	
	public boolean isValidUser(String userName,String passWord) {
		for(User user : users)
			if(user.getUserName().equals(userName))
				if(user.getPassWord().equals(passWord))
					if(user.isActive())
						return true;
			
			return false;	
}
	public static void main(String[] args) {
		UserManager mgr = new UserManager();
		boolean isValid = mgr.isValidUser("Shaik", "1234");
		System.out.println(isValid);
		
	}
}
