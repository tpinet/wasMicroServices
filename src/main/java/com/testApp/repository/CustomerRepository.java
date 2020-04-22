package com.testApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.testApp.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
