package com.rsy.practice.createlogService.seivice;

import java.util.List;
import com.rsy.practice.createlog.Entity.Employee;
import com.rsy.practice.createlogService.dao.EmployeeDao;
import com.rsy.practice.createlogService.dao.EmployeeDaoImplement;
/**
 * 在业务层的实现类里进行逻辑判断
 * @author Nico
 * @CreateDate 2018年8月21日 下午9:27:55
 */
public class EmployeeServiceImplement implements EmployeeService{
	
	private EmployeeDao employeeDao = new EmployeeDaoImplement(); 
	
	@Override
	public List<Employee> list() {
		List<Employee> employees = null;
		try {
			employees = employeeDao.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee find(int id) {
		Employee e = null;
		try {
			e = employeeDao.find(id);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public boolean insert(Employee employee) {
		Employee e = this.find(employee.getId());
		if (e != null) {
			System.out.println("要添加的员工已存在 ,无法添加 ");
			return false;
		}
		try {
			employeeDao.insert(employee);
			return true;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		Employee e = this.find(employee.getId());
		if (e == null) {
			System.out.println("要刷新信息的员工信息不存在，请仔细核对信息");
			return false;
		}
		try {
			employeeDao.update(employee);
			return true;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Employee e = this.find(id);
		if (e == null) {
			System.out.println("要删除的对象不存在,不能删除...");
			return false;
		}
		try {
			employeeDao.delete(id);
			return true;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return false;
	}

}
