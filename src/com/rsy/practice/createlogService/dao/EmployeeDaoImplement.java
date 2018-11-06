package com.rsy.practice.createlogService.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.rsy.practice.createlog.Entity.Employee;
/**
 * Dao层只进行数据的访问，不进行逻辑处理
 * @author Nico
 * @CreateDate 2018年8月21日 下午7:51:31
 */
public class EmployeeDaoImplement implements EmployeeDao{

	@Override
	public List<Employee> list() throws Exception {
		System.out.println("开始访问Excel");
		List<Employee> list = new ArrayList<>();
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		    FileInputStream fi = new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fi);
			XSSFSheet sheet = workbook.getSheetAt(0);
			for( int i = 1; i <= sheet.getLastRowNum(); i ++){
				XSSFRow row = sheet.getRow(i);
				int id = (int)row.getCell(0).getNumericCellValue();
				//获取name
				String name = row.getCell(1).getStringCellValue();
				//获取job
				String job = row.getCell(2).getStringCellValue();
				//获取hireDate
				Date hiredate = row.getCell(3).getDateCellValue();
				//获取salary
				double salary = row.getCell(4).getNumericCellValue();
				//获取bonus
				double bonus = row.getCell(5).getNumericCellValue();
				Employee e = new Employee(id, name, job, hiredate, salary, bonus);
				list.add(e);
			}
		return list;
	}

	@Override
	public Employee find(int id) throws Exception {
		List<Employee> list = this.list();
		for( Employee e : list){
			if ( e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public boolean insert(Employee employee) throws Exception {
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int row_number = sheet.getLastRowNum();
		XSSFRow row = sheet.createRow(row_number + 1);
		
		row.createCell(0).setCellValue(employee.getId());
		row.createCell(1).setCellValue(employee.getName());
		row.createCell(2).setCellValue(employee.getJob());
		row.createCell(3).setCellValue(employee.getHiredate());
		row.createCell(4).setCellValue(employee.getSalary());
		row.createCell(5).setCellValue(employee.getBonus());
		
		workbook.write(new FileOutputStream(file));
		return true;
	}

	@SuppressWarnings("resource")
	@Override
	public boolean update(Employee employee) throws Exception {
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for( int i = 1;i <= sheet.getLastRowNum(); i ++ ){
			XSSFRow row = sheet.getRow(i);
			if (row.getCell(0).getNumericCellValue()  == employee.getId()) {
				row.getCell(1).setCellValue(employee.getName());
				row.getCell(2).setCellValue(employee.getJob());
				row.getCell(3).setCellValue(employee.getHiredate());
				row.getCell(4).setCellValue(employee.getSalary());
				row.getCell(5).setCellValue(employee.getBonus());
				workbook.write(new FileOutputStream(file));
				System.out.println("已经成功修改");
				return true;
			}
		}
		System.out.println("么有修改");
		return false;
	}

	@Override
	public boolean delete(int id) throws Exception {
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for(int i = 1; i <= sheet.getLastRowNum(); i ++){
			XSSFRow row = sheet.getRow(i);
			if (row.getCell(0).getNumericCellValue() == id) {
				sheet.removeRow(row);
				workbook.write(new FileOutputStream(file));
				System.out.println("已经成功删除");
				return true;
			}
		}
		System.out.println("未能成功删除");
		return false;
	}

}
