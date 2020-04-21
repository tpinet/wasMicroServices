package com.testApp.api;

import java.util.Date;

public class Event {

	private int id;
	private String name;
	private Date date;
	private String description;
	private String location;
	private int registrationLimit;

	public Event (int id, String name, Date date, String description, String location, int registrationLimit) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.description = description;
		this.location = location;
		this.registrationLimit = registrationLimit;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRegistrationLimit() {
		return registrationLimit;
	}

	public void setRegistrationLimit(int registrationLimit) {
		this.registrationLimit = registrationLimit;
	}

}
