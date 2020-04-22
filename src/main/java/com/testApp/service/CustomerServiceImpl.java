package com.testApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testApp.api.Customer;
import com.testApp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;


	public void saveCustomer(Customer customer) {
		repo.save(customer);
	}


	public Iterable<Customer> findAllCustomers() {
		return repo.findAll();
	}


	public Optional<Customer> findCustomerById(int id) {
		return repo.findById(id);
	}

}
