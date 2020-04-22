package com.testApp.service;

import java.util.Optional;

import com.testApp.api.Customer;

public interface CustomerService {
	public void saveCustomer(Customer customer);
	public Iterable<Customer> findAllCustomers();
	public Optional<Customer> findCustomerById(int id);
}
