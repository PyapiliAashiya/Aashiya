package com.demo.DockerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Dockerbean.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
