package com.app.elasticsearch.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.elasticsearch.model.Customer;
import com.app.elasticsearch.repository.CustomerRepository;
import com.app.elasticsearch.services.CustomersService;

@Service
public class CustomerServiceImpl implements CustomersService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).orElse(null);
	}

	@Override
	public Customer getCustomerByFirstName(String customerFirstName) {
		// TODO Auto-generated method stub
		return customerRepository.findByFirstName(customerFirstName).orElse(null);
	}

	@Override
	public Customer getCustomerByLastName(String customerLastName) {
		// TODO Auto-generated method stub
		return customerRepository.findByLastName(customerLastName).orElse(null);
	}

	@Override
	public Iterable<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerId);
	}

}
