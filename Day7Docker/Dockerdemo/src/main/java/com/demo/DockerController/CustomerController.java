package com.demo.DockerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.DockerService.CustomerService;
import com.demo.Dockerbean.Customer;

@RestController
public class CustomerController {
	
	//injecting service class
	@Autowired
	CustomerService customerService;
	
	// get list of customer from the db
		@GetMapping(value = "/viewalllofcustomer")
		List<Customer> viewAllListOfCustomer() {

			return customerService.getAllListOfCustomer();
		}	
		//get id
		
		@GetMapping(value="/id")
		public Customer getCustomer(@PathVariable Long id) {
			Customer c=customerService.getCustomerById(id);
			return c;
		}
		
}