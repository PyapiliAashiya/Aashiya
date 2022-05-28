package com.demo.EmployeeController;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EmployeeBean.Employee;
import com.demo.EmployeeService.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	// update id 
	EmployeeService employeeService;
	@PutMapping(value="/id")
     private Employee Update(@RequestBody Employee id){
		employeeService.save(id);
		return id;
		
	}
}
