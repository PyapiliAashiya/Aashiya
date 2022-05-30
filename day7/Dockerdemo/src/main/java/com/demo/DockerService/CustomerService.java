package com.demo.DockerService;

import java.util.List;

import com.demo.Dockerbean.Customer;

public interface CustomerService {

	List<Customer> getAllListOfCustomer();
	
  

	Customer getCustomerById(Long id);

}
