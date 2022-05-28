package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Employee;
import com.demo.repository.EmployeeRepository;
import com.demo.service.EmpoyeeService;

@Service
public class EmployeeServiceImp implements EmpoyeeService {

	@Autowired
	EmployeeRepository  employeeRepository;

	@Override
	public Employee createEmployee(Employee id) {
		Employee emp=employeeRepository.save(id);
		return emp;
	}

}
