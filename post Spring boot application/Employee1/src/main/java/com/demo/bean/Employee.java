package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private double salary;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setOrderamount(String name) {
		this.name = name;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}

}
