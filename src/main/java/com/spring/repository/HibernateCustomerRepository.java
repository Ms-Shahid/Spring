package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.Customer;

public class HibernateCustomerRepository implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();

		customer.setFirstName("Mohammed");
		customer.setLastName("Shahid");

		customers.add(customer);

		return customers;
	}
}
