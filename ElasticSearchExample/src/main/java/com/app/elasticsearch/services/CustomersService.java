package com.app.elasticsearch.services;

import java.util.List;

import com.app.elasticsearch.model.Customer;

public interface CustomersService {
	
	Customer addCustomer(Customer customer);
	
	Customer getCustomerById(String customerId);
	
	Customer getCustomerByFirstName(String customerFirstName);
	
	Customer getCustomerByLastName(String customerLastName);
	
	Iterable<Customer> getAllCustomers();
	
	void deleteCustomer(String customerId);

}
