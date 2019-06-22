package com.burak.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burak.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// add a method to sort by firstname
	// spring data jpa will parse the method name and looks for specific format and pattern, creates appropriate query
	// findAllBy - orderByFirstNameAsc ("from Employee order by firstName asc")
	public List<Employee> findAllByOrderByFirstNameAsc();
}
