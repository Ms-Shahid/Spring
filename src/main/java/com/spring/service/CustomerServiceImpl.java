package com.spring.service;

import java.util.List;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;


public class CustomerServiceImpl implements CustomerService {
	
//	private CustomerRepository customerRepository = new HibernateCustomerRepository();
	private CustomerRepository customerRepository; //setter injection
	
	public CustomerServiceImpl() {
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository; //constructor injection
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
