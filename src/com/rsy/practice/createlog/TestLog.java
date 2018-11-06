package com.rsy.practice.createlog;

import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.List;
import com.rsy.practice.createlog.Dao.EmployeeDao;
import com.rsy.practice.createlog.Dao.EmployeeDaoImplement;
import com.rsy.practice.createlog.Entity.Employee;
import com.rsy.practice.createlog.proxy.MyInnocationHandler;

public class TestLog {
	public static void main(String[] args) throws Exception {
		EmployeeDao eDao = new EmployeeDaoImplement();
		
		MyInnocationHandler<EmployeeDao> mih = new MyInnocationHandler<EmployeeDao>(eDao);
		
		EmployeeDao proxy = (EmployeeDao) Proxy.newProxyInstance(EmployeeDao.class.getClassLoader(), 
							new Class[]{EmployeeDao.class}, mih);
		
		List<Employee> list = proxy.list();
		for(Employee e : list){
			System.out.println(e);
		}
		
		Employee newEmployee = new Employee(8888, "Jay", "MANAGER", new Date(), 5000, 20);
		System.out.println(proxy.insert(newEmployee));
		
		Employee updatedEmployee = new Employee(8888,"Nico", "MANAGER", new Date(), 2000, 1000);
		System.out.println(proxy.update(updatedEmployee));
		
		System.out.println(proxy.delete(8888));
	}
}
