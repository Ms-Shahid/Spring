package com.spring.service;

import java.util.List;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import com.spring.repository.HibernateCustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepository();
	
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll(); //already same method in customerRespository
	}

}
