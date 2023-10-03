package com.spring.repository;

import java.util.List;

import com.spring.model.Customer;

//Contains the business logic code
public interface CustomerRepository {

	List<Customer> findAll();

}