package com.burak.springboot.thymeleafdemo.service;

import java.util.List;

import com.burak.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee thEmployee);
	public void deleteById(int theId);
}
