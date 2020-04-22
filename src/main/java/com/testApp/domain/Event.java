package com.testApp.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="EVENTS")
public class Event {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date date;
	private String description;
	private String location;
	private int registrationlimit;
	
	@ManyToMany
	@OrderColumn(name = "PK")
	@IndexColumn(name = "PK")
	private Customer[] customers;

	public Event () {
		super();
	}
	
	public Event (int id, String name, Date date, String description, String location, int registrationlimit) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.description = description;
		this.location = location;
		this.registrationlimit = registrationlimit;
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

	public int getRegistrationlimit() {
		return registrationlimit;
	}

	public void setRegistrationlimit(int registrationlimit) {
		this.registrationlimit = registrationlimit;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

}
