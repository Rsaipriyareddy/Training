package com.lti.training.day6.collections;

public class User {

	private String userName;
	private String passWord;
	private boolean active;
	
	
	public User() {	//Default Constructor
	}
	public User(String userName, String passWord, boolean active) {
		this.userName = userName;
		this.passWord = passWord;
		this.active = active;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
