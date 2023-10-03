package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.spring.model.Customer;

public class HibernateCustomerRepository implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername; //xml-app properties
	
//	public void setDbUsername(String dbUsername) {
//		this.dbUsername = dbUsername;
//	}
	@Override
	public List<Customer> findAll(){
		System.out.println("dbUsername -> " + dbUsername);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstName("Mohammed");
		customer.setLastName("Shahid");
		
		
		
		customers.add(customer);
		
		return customers;
	}
}
