package com.rsy.practice.createlogService;

import java.lang.reflect.Proxy;

import com.rsy.practice.createlogService.proxy.MyInvocationHandler;
import com.rsy.practice.createlogService.seivice.EmployeeService;
import com.rsy.practice.createlogService.seivice.EmployeeServiceImplement;

public class TestProxy {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImplement();
		
		MyInvocationHandler<EmployeeService> mih = new MyInvocationHandler<EmployeeService>(employeeService);
		
		EmployeeService proxy = (EmployeeService) Proxy.newProxyInstance(employeeService.getClass().getClassLoader(),
				  		new Class[]{EmployeeService.class}, mih);
		
		System.out.println(proxy.find(7788));
	}
}
