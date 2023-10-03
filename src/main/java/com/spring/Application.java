package com.spring;

import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;

public class Application {
	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getLastName());

		System.out.println(service.findAll().get(0).getFirstName());

	}
}