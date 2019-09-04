package com.app.elasticsearch.repository;

import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.app.elasticsearch.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{

	Optional<Customer> findByFirstName(String customerFirstName);

	Optional<Customer> findByLastName(String customerLastName);

}
