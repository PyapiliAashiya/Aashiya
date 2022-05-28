package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Employee;
import com.demo.service.EmpoyeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmpoyeeService EmployeeService;

	@PostMapping(value="/createid")
	Employee addEmployee(@RequestBody Employee id) {

		Employee addid = EmployeeService.createEmployee(id);
		return addid;

	}

}
