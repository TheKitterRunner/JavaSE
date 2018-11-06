package com.rsy.practice.createlogService.seivice;

import java.util.List;

import com.rsy.practice.createlog.Entity.Employee;

public interface EmployeeService {
	public List<Employee> list() ;
	
	public Employee find(int id) ;

	public boolean insert (Employee employee) ;
	
	public boolean update(Employee employee) ;
	
	public boolean delete( int id)  ;
}
