package com.app.elasticsearch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.elasticsearch.model.Customer;
import com.app.elasticsearch.servicesImpl.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		
		try {
			customerService.addCustomer(customer);
			return "Customer successfully saved";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "Failed to save customer";
		}
		
	}
	
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomerByID(@PathVariable String customerId) {
		
		return customerService.getCustomerById(customerId);
		
	}
	
	@GetMapping("/customers/customerFirstName")
	public Customer getCustomerByFirstName(@PathVariable String customerFirstName) {
		
		return customerService.getCustomerByFirstName(customerFirstName);
		
	}
	
	@GetMapping("/customers/customerLastName")
	public Customer getCustomerByLastName(@PathVariable String customerLastName) {
		
		return customerService.getCustomerByLastName(customerLastName);
		
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@DeleteMapping("/customers/{customerId}")
	public void deleteCustomerByID(@PathVariable String customerId) {
		
		customerService.deleteCustomer(customerId);
	}

}
