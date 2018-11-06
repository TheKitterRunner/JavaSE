package com.rsy.practice.createlogService.dao;

import java.util.List;

import com.rsy.practice.createlog.Entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> list() throws Exception;
	
	public Employee find(int id) throws Exception;

	public boolean insert (Employee employee) throws Exception;
	
	public boolean update(Employee employee) throws Exception;
	
	public boolean delete( int id) throws Exception;
}
