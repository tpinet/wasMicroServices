package com.testApp.api;

public class Customer {
	
	private int id;
	private String name;
	private String userID;
	private String password;

	public Customer (int id, String name, String userID, String password) {
		super();
		this.id = id;
		this.name = name;
		this.userID = userID;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

}
