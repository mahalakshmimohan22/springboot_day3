package com.day3.springbootday3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day3.springbootday3.models.*;
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
