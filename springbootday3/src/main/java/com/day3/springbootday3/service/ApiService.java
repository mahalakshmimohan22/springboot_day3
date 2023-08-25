package com.day3.springbootday3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day3.springbootday3.models.*;
import com.day3.springbootday3.repository.*;

@Service
public class ApiService {
	@Autowired
	EmployeeRepo er;
	
	public Employee setValues(Employee e) {
		return er.save(e);
	}
	
	public List<Employee> showValues() {
		return er.findAll();
	}
	
	public Optional<Employee> showEmployee(int id) {
		return er.findById(id);
	}

}
