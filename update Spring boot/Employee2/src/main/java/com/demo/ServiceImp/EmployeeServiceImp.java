package com.demo.ServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.EmployeeBean.Employee;
import com.demo.EmployeeService.EmployeeService;
import com.demo.ServiceRepository.EmployeeRepository;

@Service
public class EmployeeServiceImp  implements  EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	public void update(Employee employee, Long id)
	{
		
		employeeRepository.save(employee);
	}
	@Override
	public void save(Employee id) {
	
		
	}
}

