package com.demo.DockerServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.DockerRepository.CustomerRepository;
import com.demo.DockerService.CustomerService;
import com.demo.Dockerbean.Customer;

@Service
public  class CustomerServiceImp implements CustomerService{

	//injecting repository to service
	@Autowired
	CustomerRepository customerRepository;
	
	//get all list
	public List<Customer>getAllListOfCustomer(){
		
	
	List<Customer> customer=customerRepository.findAll();
	return customer;
}
	
    //get by id

	public Customer getCustomerById(Long id) {
	Customer cu=customerRepository.findById(id).get();
		return cu;
	
	}


	
	}
	

