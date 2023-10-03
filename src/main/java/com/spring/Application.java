package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;

public class Application {
	public static void main(String[] args) {

		// CustomerService service = new CustomerServiceImpl();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
		// getBean(beanName, interface)

		System.out.println("Object of service1 -> " + service1);

		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println("Object of service1 -> " + service2);

//    	System.out.println(service.findAll().get(0).getFirstName());
//    	System.out.println(service.findAll().get(0).getLastName());
//    	
		// System.out.println(service.findAll().get(1).getLastName());

	}
}