package com.testApp.api;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {

	@GetMapping("/get-test-customer")
	public Customer getTestCustomer() {
		return new Customer(0, "Han Solo", "falcon", "chewbacca");
	}
	
	@GetMapping("/get-all-customers")
	public List<Customer> getAllCustomers() {
		//TODO
		return null;
	}
	
}
