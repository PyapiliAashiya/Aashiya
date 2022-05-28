package com.demo.ServiceRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.EmployeeBean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
